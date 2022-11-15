# Arquitectura sin Servidor: FaaS con Spring Boot y Spring Cloud



```bash
mkdir java-springboot-faas 
cd java-springboot-faas
mkdir -p src/{main,test}/{java,resources}


mvn spring-boot:run

curl http://localhost:8080/function/SpringCloud
# Responde "Hola SpringCloud"

curl http://localhost:8080/consume/SpringCloud

```

