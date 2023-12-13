def owasp(){
           dependencyCheck additionalArguments: ''' 
                    -o './'
                    -s './'
                    -f 'ALL' 
                    --prettyPrint''', odcInstallation: 'OWASP Dependency-Check Vulnerabilities'
        dependencyCheckPublisher pattern: 'dependency-check-report.xml'
      
}
