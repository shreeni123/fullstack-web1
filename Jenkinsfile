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
    stage('Install Maven') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    stage('Compile') {
      steps {
        sh 'sh \'mvn compile\''
      }
    }

  }
  environment {
    buildType = 'DevOps'
  }
}
