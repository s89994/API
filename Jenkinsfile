pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven.3.6.2') {
                    bat 'mvn clean compile surefire-report:report -Daggregate=true'
                }
            }
        }
    }
}