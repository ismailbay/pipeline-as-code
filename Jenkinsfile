pipeline {
	echo("building pipeline-as-code project ...");
	
	stages {
		stage('tests') {
			steps {
				try {
					sh "./mvnw test"
				} catch(err) {
					throw err 
				} finally {
					step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
				} 
			}
		}
	}
}
