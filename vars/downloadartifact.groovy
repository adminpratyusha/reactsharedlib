def nexusartifact(String OUTPUTFILENAME,String Nexus_USERNAME,String Nexus_PASSWORD,String Nexus_URL,String Nexus_REPO_ID,String PACKAGE_NAME,String currentVersion){
  sh "curl -v -o  ${OUTPUTFILENAME} -u ${Nexus_USERNAME}:${Nexus_PASSWORD} ${Nexus_URL}/repository/${Nexus_REPO_ID}/${PACKAGE_NAME}/0.1.0/${PACKAGE_NAME}-${currentVersion}.tar.gz"
  
}
