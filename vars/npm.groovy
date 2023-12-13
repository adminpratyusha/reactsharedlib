def install(){
             sh 'npm install'

      }
def build(){
                sh 'npm run build'
      }
def test(){
                 sh 'npm test'
}
