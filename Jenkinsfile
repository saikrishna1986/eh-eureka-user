pipeline{

   agent any
   
   stages{
      stage("build"){
        steps { 
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
