stage('Checkout') {
        checkout scm
    }

stage('Build'){
        sh "mvn package"
    }
stage('Test Maven'){
        sh "mvn test"
    }
