pipeline {
    agent any

    environment {
         PATH = "${env.PATH};C:\\Windows\\System32"
    }
    tools {
                     maven 'MAVEN_HOME' // Use the configured Maven installation named 'Maven'
                 }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Use a cleaner syntax for Git checkout
                    git branch: 'master', credentialsId: 'wondomen', url: 'https://github.com/wondomen/FarToCel.git'
                }
            }
        }

        stage('Build') {
            steps {
                // Use 'bat' directly without the need for a script block
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Use 'bat' directly without the need for a script block
                bat 'mvn test'
                bat 'mvn jacoco:prepare-agent install jacoco:report'
            }
            
            post {
                success {
                    // Publish JUnit test results
                    junit '**/target/surefire-reports/TEST-*.xml'
                    // Generate JaCoCo code coverage report
                    jacoco(execPattern: '**/target/jacoco.exec')
                }
            }
        }
    }
}
