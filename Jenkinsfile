pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage("SCM Checkout"){
            steps{
            git 'https://github.com/enoch-aik/pa_2552_project.git'
            }
        }
        stage("Maven Build"){
            steps{
                bat 'mvn clean package'
            }
        }
        stage('Test') {
                    steps {
                        bat 'mvn test'
                    }
                    post {
                        always {
                            junit 'target/surefire-reports/*.xml'
                        }
                    }
        }
    }
}

