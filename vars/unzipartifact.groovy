def dowloadedartifact(String OUTPUTFILENAME){
                     sh 'ls'
                    sh "tar -xvf ${OUTPUTFILENAME} build"
                     sh 'ls'
}
