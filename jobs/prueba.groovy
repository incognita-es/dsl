String proyecto = "Jenkins-dsl"
String repositorio = "https://github.com/incognita-es/Hola.git"
String nombre_repo = "repositorio Hola"


pipelineJob(proyecto) {
	definition {
		triggers {
			scm('H/2 * * * *')
		}
		
		cpsScm {
			scm {
				git {
					remote {
						name(nombre_repo)
						url(repositorio)
					}
				}
				scriptPath("Jenkinsfile")
			}
		}
	}
}

