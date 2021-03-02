# BootPostgresDockerKubernetes
Spring boot, Postgres, docker with kubernetes


-> clone master branch.
-> build docker image: mvn spring-boot:build-image -DskipTests
    (since there are no test cases are written,just to speed up te build using the arg -DskipTests)
-> Note: use the right java version in pom xml, I'm using 11
-> docker-compose will look something like this. (to run it locally use the below file and run it)
-> docker-compose up in the directory where docker-compose exists
-> this should run as expected. hit the post and get methods using postman


now: 
- setup cluster in your favourite Kubernetes provider(AWS, GKE, Azure)
- Setup kubectl and run it locally.
- kubectl apply -f <refer the docker image>

IP you get in services should, replaced localhost with the IP. All your services must be up and runnning 

<HAPPY CODING>.
note: new to writing tech stuff, pardon me if any mistakes. Always welcome for progressive feedback 

docker-compose.yaml will look something like this to run locally.     
version: '3.7'

services:
  qrcodemapper:
    image: preethamru/mmv2-qrcodemapper:0.0.1-SNAPSHOT
    mem_limit: 700m
    ports:
      - 5400:5400
    depends_on:
      - postgres
    networks:
      - currency-network
  
  
  postgres:
    image: postgres
    ports:
      - "5432:5432"
    environment:
      - POSTGRES_PASSWORD=admin
      - POSTGRES_USER=postgres
      - POSTGRES_DB=qrdb
        
    networks:
      - currency-network
networks:
  currency-network:
   
