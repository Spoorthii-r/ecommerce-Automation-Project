pipeline {
    agent any

    stages {

        stage('Checkout SCM') {
            steps {
                git 'https://github.com/Spoorthii-r/ecommerce-Automation-Project.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            publishHTML([
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'test-output',
                reportFiles: 'index.html',
                reportName: 'Automation Report'
            ])
        }
    }
}