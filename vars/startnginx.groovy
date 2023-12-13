def start(String OUTPUTFILENAME,String SSHCONFIGNAME){
   sh "tar -xf ${OUTPUTFILENAME} build"
                        sshPublisher(publishers: [sshPublisherDesc(configName:SSHCONFIGNAME, transfers: [
                                    sshTransfer(
                                        execCommand: "sudo cp -rf /home/ubuntu/build/* /var/www/html/ && rm -rf /home/ubuntu/build && sudo systemctl restart nginx",
                                        execTimeout: 120000
                                    )
                                ])
                    ])               
}
