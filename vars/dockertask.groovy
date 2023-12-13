def pushtodocker(String IMAGE_NAME,String DOCKER_CREDENTIALS_ID){
           def dockerImage = docker.build("${IMAGE_NAME}:${BUILD_ID}")

                
                    docker.withRegistry('https://registry.hub.docker.com', DOCKER_CREDENTIALS_ID) {
                        dockerImage.push()
                    }
}
