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
	        	parallel {
					      stage("Chrome") {
					        stages {
					          stage("Integration Tests") {
					            steps {
					              echo "Integration Tests"
					            }
					          }
					          stage("End to End Tests") {
					            steps {
					              echo "End to end Tests"
					            }
					          }
					        }
					      }
					      stage("Internet Explorer") {
					        stages {
					          stage("Integration Tests") {
					            steps {
					              echo "Integration Tests"
					            }
					          }
					          stage("End to End Tests") {
					            steps {
					              echo "End to End Tests"
					            }
					          }
					        }
					      }
					      stage("Safari") {
					        stages {
					          stage("Integration Tests") {
					            steps {
					              echo "Integration Tests"
					            }
					          }
					          stage("End to End Tests") {
					            steps {
					              echo "End to End Tests"
					            }
					          }
					        }
					      }
					    }
					  }
					  stage("Deploy") {
					    steps {
					      echo "Executing Dev"
					    }
					  }
					  stage("Smoke Test on Production") {
					    steps {
					      echo "Executing Dev"
					    }
					  }
					  }
					  
}     
