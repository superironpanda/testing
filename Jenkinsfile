def utils
node {
   stage('Checkout Code') { 
      git 'https://github.com/superironpanda/testing.git'
   }
   stage('Run a test file'){
    utils = load 'utils.testUserInput'
   }
}

