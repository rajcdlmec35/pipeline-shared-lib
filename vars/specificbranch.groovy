def call(Map config = [:]) {
    def repoName = config.repoName
    def testWithDocker = config.testWithDocker
    def skipUnitTests = config.skipUnitTests
    def runSonar = config.runSonar
    def emailRecipientsList = config.emailRecipients

    def gitSshCredentials = 'jenkadm-github-test'
    def cloneUrl = "https://github.com/rajcdlmec/test.git"
    def nexusRegistry = "slgramidlnexs60.infoftps.com/springio"
    def buildTag = env.BUILD_NUMBER
    def branchNamePlaceholder = ''

    if(env.BRANCH_NAME != 'master') {
        buildTag = "${env.BRANCH_NAME}-${env.BUILD_NUMBER}"
        branchNamePlaceholder = "-${env.BRANCH_NAME}"
	    echo "${env.BRANCH_NAME}"
    }

   
}
