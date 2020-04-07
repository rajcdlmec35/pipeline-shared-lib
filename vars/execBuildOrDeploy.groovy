

def call(String command) {
	if(!(env.BRANCH_NAME =~ /^v([0-9]+\.[0-9]+\.[0-9]+)/)) {
        buildTag = "${env.BRANCH_NAME}-${env.BUILD_NUMBER}"
        branchNamePlaceholder = "-${env.BRANCH_NAME}"
		echo env.BRANCH_NAME
    }
	if (command == "build") 
	{
		pipeline {
			agent any
			stages 
			{
				stage("Build") 
				{
					steps 
					{
						echo "Build is executed"
					}
				}	
			}
		}
	}
	else if(command == "deploy")
	{
		pipeline {
			agent any
			stages 
			{
				stage("Deploy") 
				{
					steps 
					{
						echo "Deploy is executed"
					}
				}	
			}
		}	
	}
	else
	{
		pipeline {
			agent any
			stages 
			{
				stage("Do Nothing") 
				{
					steps 
					{
						echo "Doing nothing"
					}
				}	
			}
		}		
	}
}
