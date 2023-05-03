pipeline {
    agent any
    
    stages {
        stage("setup") {
            steps {
                echo 'buolding environemnt'
                bat """
                    cmd /c "mvn install -DskipTests"
                """
            }
        }
        stage("test") {
            steps {
                echo 'test application'
                bat """
                    cmd /c "mvn test"
                """
            }
        }
        stage("deploy") {
            steps {
                echo 'deploy application'
                bat """
                    copy target\\spring-boot-mvc-demo.war "c:\\Tomcat 8.5\\webapps"
                """
            }
        }
    }
    
    
}
