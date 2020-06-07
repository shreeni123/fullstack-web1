pipeline {
    agent none
    options {
        skipStagesAfterUnstable()
    }
    stages{
        stage('Build Docker image') {
            agent any
            steps {
                sh 'docker image build -t mvnshree .'
                
            }
        }

        stage('Compile') {
            agent any
            steps {
                sh 'docker container run -idt --name mvnshree mvnshree mvn -B -DskipTests compile'

            }
        }
        
        stage('Test') {
            agent {
                docker {
                        image 'maven:3-alpine'
                        args '-v /root/.m2:/root/.m2'
                        }
            }
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Package') {
            agent {
                docker {
                        image 'maven:3-alpine'
                        args '-v /root/.m2:/root/.m2'
                        }
            }
            steps {
                sh 'mvn package' 
            }
        }
    }
}       