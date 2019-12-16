pipeline {

    agent any

    stages {
        stage ('Stage 1') {
            echo "THIS IS THE STAGE 1"
        }
    
        stage ('Stage 2') {
            echo "THIS IS THE STAGE 2"
        }
        stage ('Stage 3') {
            echo "THIS IS THE STAGE 3"
        }
    }
    stages {
        stage('Download') {
            steps {
                sh 'echo "artifact file" > generatedFile.txt'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'generatedFile.txt', onlyIfSuccessful: true
        }
    }

}