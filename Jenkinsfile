pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages{
        
        stage('Lint Dockerfile') {
            steps {
                sh 'sudo docker run --rm -i hadolint/hadolint < Dockerfile'
                }
        }
        
        stage('Build Docker image') {
            steps {
                sh 'docker image build -t shreeni123/mvnshree .'
                }
        }

        stage('Compile') {
            agent any
            steps {
                sh 'docker container run -idt --name mvnshree mvnshree bash'
                sh 'mvn -B -DskipTests compile'

            }
        }
        
        stage('Test') {
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
            steps {
                sh 'mvn package' 
            }
        }
        stage('Destroy container') {
            steps {
                sh 'docker container rm -f mvnshree' 
            }
        }
    }
}       
