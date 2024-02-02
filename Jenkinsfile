pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Шаг клонирования репозитория
                    checkout scm
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    // Шаг сборки проекта
                    sh 'mvn clean install' // Пример для проекта на Maven
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Шаг деплоя в указанную папку на компьютере
                    sh 'cp -r target/* /path'
                }
            }
        }
    }

    post {
        success {
            echo 'Build and deploy successful!'
        }
        failure {
            echo 'Build or deploy failed!'
        }
    }
}
