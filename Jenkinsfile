node {

    stage('Initialize'){
        def dockerHome = tool 'myDocker'
        def mavenHome  = tool 'myMaven'
        env.PATH = "${dockerHome}/bin:${mavenHome}/bin:${env.PATH}"
    }
stage('Checkout') {
        checkout scm
    }

stage('Build'){
        sh "mvn package"
    }
stage('SonarTest'){
        sh "mvn test"
    }
}
