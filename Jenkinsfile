node {

    stage('check tools') {
        sh "mvn -version"
        sh "java -version"
    }
    
    stage('checkout scm') {
    	git 'https://github.com/ismailbay/pipeline-as-code.git'
    }

    stage('clean') {
        sh "mvn clean"
    }   

    stage('tests') {
        try {
            sh "mvn test"
        } catch(err) {
            throw err 
        } finally {
            step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
        }   
    }   

    stage('packaging') {
        sh "mvn package -DskipTests"
    }   
}
