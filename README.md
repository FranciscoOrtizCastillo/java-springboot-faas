# Arquitectura sin Servidor: FaaS con Spring Boot y Spring Cloud



```bash
mkdir java-springboot-faas 
cd java-springboot-faas
mkdir -p src/{main,test}/{java,resources}


mvn spring-boot:run

curl http://localhost:8080/function/SpringCloud
# Responde "Hola SpringCloud"

curl http://localhost:8080/consume/SpringCloud
curl http://localhost:8080/supply

curl -X POST -d '{ "a" : "Pepe", "b" : [1,2,3,4] }' -H "Content-Type: application/json" http://localhost:8080/mapjson

curl -X POST -d '{ "nombre" : "Pepe", "lista" : [1,2,3,4] }' -H "Content-Type: application/json" http://localhost:8080/mapobject

curl -X POST -d '{ "nombre" : "Pepe", "lista" : [1,2,3,4] }' -H "Content-Type: application/json" http://localhost:8080/mapmessage

curl -X POST -d '{ "nombre" : "Pepe", "lista" : [1,2,3,4] }' -H "Content-Type: application/json" http://localhost:8080/faaSFunction


#Con filtros
curl -X POST -d '{ "nombre" : "Pepe", "lista" : [1,2,3,4] }' -H "Content-Type: application/json" http://localhost:8080/mapmessage

curl -X POST -d '{ "nombre" : "Pepe", "lista" : [1,2,3,4] }' -H "Content-Type: application/json" -H "nonsecure: 1" http://localhost:8080/mapmessage
```

## Creando contenedor Docker

```bash

docker build -t springboot-faas .

docker images

docker run -it -d -p 8080:8080 --name springboot-faas springboot-faas

docker ps

curl http://localhost:8080/function/SpringCloud

docker logs ID -f

docker kill ID
```