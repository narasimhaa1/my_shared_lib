package com.i27.builds

class Docker{
    def jenkins
    Docker(jenkins){
        this.jenkins=jenkins
    }

    // Application build
    def appBuild() {
         jenkins.sh """
         echo "Building the Ereka application"
         echo "mvn clean package -DskipTests=true" 
         """
    }
}