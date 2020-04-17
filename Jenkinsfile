pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    options {
        skipStagesAfterUnstable()
    }
  stages {
    stage('Compile') { 
            steps {
                sh 'mvn -B -DskipTests compile' 
            }
        }

  }
  environment {
    buildType = 'DevOps'
  }
}
