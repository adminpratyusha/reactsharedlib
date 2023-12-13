def deploy(String SSHCONFIG){
    sshPublisher(publishers: [sshPublisherDesc(configName: SSHCONFIGNAME ,
                        transfers: [sshTransfer(flatten: false, sourceFiles: "build/**")])
                                       
                    ])              
}
