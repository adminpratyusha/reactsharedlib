def sonarscananalysis(String project_key, String project_name){
       sh """$scannerHome/bin/sonar-scanner \
                    -Dsonar.projectKey=${project_key}\
                    -Dsonar.projectName=${project_name} \
                    -Dsonar.sources=src/ \
                    -Dsonar.java.binaries=target/classes/ \
                    -Dsonar.exclusions=src/test/java/****/*.java \
                    -Dsonar.java.libraries=/var/lib/jenkins/.m2/**/*.jar \
                    -Dsonar.projectVersion=${BUILD_NUMBER}-${env.GIT_COMMIT_SHORT}"""
}
