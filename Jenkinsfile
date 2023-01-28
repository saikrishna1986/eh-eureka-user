pipeline{

   agent any
   
   stages{
      stage("build"){
        steps { 
           checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'Github', url: 'https://github.com/saikrishna1986/eh-eureka-user.git']]])
          echo 'executing gradle ...'
        }
      }
      
      stage("test"){
         steps{
         echo 'testing the application'
         }
      }
      
      stage("deploy"){
         steps{
         echo 'deploying the application'
         }
      }
   }

}
