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
    stage('Slack Notification') {
        slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#shree-test, color: 'good', message: "Build Started: ${env.JOB_NAME} ${env.BUILD_NUMBER}", teamDomain: 'pragraconsulting2020', tokenCredentialId: 'slack'
    }
    stage('Compile') { 
      steps {
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
   
  }
  environment {
    buildType = 'DevOps'
  }
}
