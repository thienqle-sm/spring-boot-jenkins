pipeline {

  agent any
  stages {
    stage("build") {
      steps {
        echo 'building the application ....'
        bat """
          cmd /c "mvn install -DskipTests"
        """
      }
    }
    stage("test") {
           steps {
              echo 'testing the application ....'
             bat """
                cmd /c "mvn test"
              """
           }
    }
    
    stage("deploy") {
           steps {
              echo 'deploying the application ....'
             bat """
                copy target\\sping-boot-mvc-demo.war "c:\\Tomcat 8.5\\webapps"
              """
           }
    }
  }
  
}
