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
    stage('Sonar Analysis') {
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
