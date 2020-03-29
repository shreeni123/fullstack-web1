pipeline {
  agent any
  stages {
    stage('Comile') {
      steps {
        sh 'sh \'mvn compile\''
      }
    }

  }
  environment {
    buildType = 'DevOps'
  }
}