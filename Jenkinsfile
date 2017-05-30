node {

    stage('check tools') {
        sh "mvn -version"
        sh "java -version"
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
