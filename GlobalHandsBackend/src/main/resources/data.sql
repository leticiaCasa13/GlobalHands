spring:
  application:
    name: globalhands

  datasource:
    url: jdbc:mysql://localhost:3306/globalhands
    username: root
    password: VUESTRA_CONTRASEÑA
    driver-class-name: com.mysql.cj.jdbc.Driver

  jpa:
    hibernate:
      ddl-auto: validate
    show-sql: true
    properties:
      hibernate:
        format_sql: true