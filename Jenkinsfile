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
					      stage("stream1") {
					        stages {
					          stage("JUnit") {
					            steps {
					              echo "Executing JUnit"
					            }
					          }
					          stage("Firefox") {
					            steps {
					              echo "Executing Firefox"
					            }
					          }
					        }
					      }
					      stage("stream2") {
					        stages {
					          stage("DBUnit") {
					            steps {
					              echo "Executing DBUnit"
					            }
					          }
					          stage("Edge") {
					            steps {
					              echo "Executing Edge"
					            }
					          }
					        }
					      }
					      stage("stream3") {
					        stages {
					          stage("Jasmine") {
					            steps {
					              echo "Executing Jasmine"
					            }
					          }
					          stage("Safari") {
					            steps {
					              echo "Executing Safari"
					            }
					          }
					        }
					      }
					    }
					  }
					  stage("Dev") {
					    steps {
					      echo "Executing Dev"
					    }
					  }
					  }
					  
}     
