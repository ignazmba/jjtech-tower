pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello war war ooo war World'
            }
        }
    }
}