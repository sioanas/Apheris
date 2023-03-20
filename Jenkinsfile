pipeline {
    agent {
        docker {
            image 'maven:3.9.0-eclipse-temurin-11'
            args '-v /root/.m2:/root/.m2'
        }
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Dev Linting and Formating Check') {
            steps {
                echo "This is linting step"
            }
        }

        stage('Dev Unit Tests') {
            steps {
                echo "This is UT"
            }
        }

        stage('QA Cleanup') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
         stage('QA Linting and formating') {
            steps {
                sh 'echo "mvn checkstyle:check"'
            }
        }



	stage('Run Test'){
		parallel{
		
			stage('Chrome') {
				 stage('QA Integration Test') {
            			steps {
                				echo "Integration tests"
            				}
        				}
				}
				stage('QA Integration Test') {
           				 steps {
                				echo "Integration tests"
           					 }
      				  }
				}
 				stage('QA Functional Test') {
  					 steps {
                				echo "Functional tests"
            				}
       				 }
				}
        			stage('QA E2E Tests') {
           				 steps {
              				  sh 'mvn test'
            				}
           				 post {
               				 always {
                    			junit 'target/surefire-reports/*.xml'
               				
						 }
            				}
        			}

        			stage('QA Security Tests') {
            			steps {
               				 echo "Security Tests"
          					  }
       			
				 }


        			stage('Deliver') {
          				  steps {
              				  sh './jenkins/scripts/deliver.sh'
           					 }
       			 }
			}

			stage('Internet Explorer') {
			agent {
                        label "IE"
                    }
                    steps {
                        echo "Test on Internet Explorer"
                    }
			
    }
}



