pipeline {
    agent none
    options {
        skipStagesAfterUnstable()
    }
    stages{
        stage('Compile') {
            agent {
                docker { image 'maven:3-alpine'
                args '-v /root/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn -B -DskipTests compile'
            }
        }
        stage('Sonar-Analysis') {
            withDockerContainer(args: '-d --name sonar65 -p 9000:9000', image: 'sonarqube') {
                sh "mvn sonar:sonar"
            }
        }
    }
}