def utils
node {
   stage('Checkout Code') { 
      git 'https://github.com/superironpanda/testing.git'
      sh 'git clean -fdx; sleep 4;'
   }
   stage('Run a test file'){
    utils = load 'utils.testUserInput'
       sh "${mvnHome}/bin/mvn versions:set -DnewVersion=${env.BUILD_NUMBER}"
   sh "${mvnHome}/bin/mvn package"
   }
   

}

