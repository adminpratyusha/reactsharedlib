def dowloadedartifact(){
                     sh 'ls'
                    sh "tar -xvf ${OUTPUTFILENAME} build"
                     sh 'ls'
}
