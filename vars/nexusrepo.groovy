def pushtonexus(String NEXUS_USERNAME,String NEXUS_PASSWORD,String NEXUS_URL,String NEXUS_REPO_ID,String PACKAGE_NAME){
     // Construct and execute the curl command
                        def currentVersion = sh(script: 'node -pe "require(\'./package.json\').version"', returnStdout: true).trim()
                        // def artifactPath = "${PACKAGE_NAME}/${currentVersion}/${PACKAGE_NAME}-${currentVersion}.${env.BUILD_ID}"
                        def curlCommand = """
                          curl -v -u ${NEXUS_USERNAME}:${NEXUS_PASSWORD} --upload-file build.tar.gz ${NEXUS_URL}/repository/${NEXUS_REPO_ID}/${PACKAGE_NAME}/${currentVersion}/${PACKAGE_NAME}-${currentVersion}.${env.BUILD_ID}.tar.gz
                        """
                        sh curlCommand

                        // Print deployment information
                        echo "Artifact deployed to Nexus with version ${currentVersion}"
                        return curlcommand


  
}
