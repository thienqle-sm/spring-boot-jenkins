pipeline {
  agent any
  
  stages {
    stage("build"){
      steps {
        echo 'buiding the application ....'
        bat """
            cmd /c "mvn install -DskipTests"
        """
      }
    }
    stage("test"){
      steps {
        echo 'testing the application ....'
        bat """
          cmd /c "mvnw test -Punit"
        """
      }
    }
    stage("deploy"){
      steps {
        echo 'deploying the application ....'
        bat """
          whoami
          copy spring-boot-mvc-demo.war "C:\\Tomcat 8.5\\webapps"
        """
      }
    }
  }
}
