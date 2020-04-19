1. Run maven and jenkins in separate docker containers bridged together (Steps 1 to 6 from https://jenkins.io/doc/tutorials/build-a-java-app-with-maven/#setup-wizard)
2. Compile, build and test a java app within the above environment using Jenkinsfile scripted pipeline (See Jenkinsfile in this project)
3. Run Sonarqube in another docker container and link this container and Jenkins - https://funnelgarden.com/sonarqube-jenkins-docker/ 
4. Once Jenkins and SonarQube are configured in step 3 above, update the pipline to include SonarQube (currently failing ????)

Refer to previous commits of Jenkinsfile for the file with SonarQube
