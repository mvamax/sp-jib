# JIB Example
An example project that uses JIB to create Docker containers for Spring Boot.

Check out my [Medium post](https://medium.com/@snewman/project-jib-quickstart-using-spring-boot-c7201166e36d) for more details.

 kubectl create deployment spring-jibv1 --image=docker.io/mvamax/spring-jib:v1
 kubectl expose deployment spring-jibv1 --port=8080 --target-port=8080 --type=LoadBalancer
  kubectl expose deployment spring-jibv1 --port=8080 --target-port=8080 --type=NodePort
  minikube -p mycluster service spring-jibv1 --url
  kubectl apply -f example-ingress.yaml