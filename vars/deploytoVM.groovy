def deploy(String SSHCONFIGNAME){
    sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME ,
                        transfers: [sshTransfer(flatten: false, sourceFiles: "build/**")])
                                       
                    ])              
}
