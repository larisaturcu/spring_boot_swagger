# spring-boot-swagger
Spring Boot Swagger Integration Sample Project

Set up steps:
1. Generate sample SpringBoot app with https://spring.io/guides/gs/spring-boot/
2. Add custom config for server port: with spring-boot-starter-undertow
3. Start server and check the reponse from: http://localhost:8083
4. Add custom controller for /api/hello/{user} + lombok dependency and test http://localhost:8083/api/hello/titi
5. Add custom controller for admin: /admin/hello/{user}
http://localhost:8083/admin/hello/titi
6. Add unit test to check the results with MockMvc
7. Add Swagger annotation to generate doc: https://www.javacodegeeks.com/2017/09/integrating-swagger-spring-boot-rest-api.html
8. Integrate OAuth for admin: https://blog.napagoda.com/2017/10/secure-spring-boot-rest-api-using-basic.html
Issue with password encoding: https://stackoverflow.com/questions/46999940/spring-boot-passwordencoder-error


# swagger docs
http://localhost:8083/v2/api-docs
http://localhost:8083/swagger-ui.html

