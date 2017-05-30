node {
	echo("building pipeline-as-code project ...");
	
	stage('clean') {
		sh "./mvnw clean"
	}
	
	stage('tests') {
		try {
			sh "./mvnw test"
		} catch(err) {
			throw err 
		} finally {
			step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
		} 
	}
	
	stage('packaging') {
		sh "./mvnw package -Pprod -DskipTests"
	}
}
