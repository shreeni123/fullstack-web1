pipeline {
    agent none
    options {
        skipStagesAfterUnstable()
    }
    stages{
        stage('Compile') {
            agent {
                    docker {
                        image 'maven:3-alpine'
                        args '-v /root/.m2:/root/.m2'
                        }
                }
            steps {
                sh 'mvn -B -DskipTests compile'
            }
        }
        stage('Sonar-Analysis') {
            agent any
            steps {
                echo 'Sonar Scanner'
                withSonarQubeEnv('sonar65') {
                    sh "mvn sonar:sonar"
                }
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
    }
    environment {
        buildType = 'DevOps'
    }
}