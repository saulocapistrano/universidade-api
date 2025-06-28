Seu arquivo `README.md` ainda contém os **marcadores de conflito**, o que impede o Git de continuar o rebase. Aqui está a versão limpa e resolvida que você pode colar no lugar:

---

### ✅ **Versão Resolvida do `README.md`**

````markdown
# universidade-api

API para gerenciamento de universidade usando Quarkus, o framework Java Supersônico Subatômico.

## Rodando a aplicação em modo dev

```bash
./mvnw quarkus:dev
````

> Acesse o Dev UI em: [http://localhost:8080/q/dev/](http://localhost:8080/q/dev/)

## Empacotamento e execução

```bash
./mvnw package
java -jar target/quarkus-app/quarkus-run.jar
```

### Über-jar

```bash
./mvnw package -Dquarkus.package.jar.type=uber-jar
java -jar target/*-runner.jar
```

### Executável nativo (com GraalVM ou container)

```bash
./mvnw package -Dnative
# ou
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

```bash
./target/universidade-api-1.0-SNAPSHOT-runner
```

## Guias úteis

* [OpenAPI/Swagger UI](https://quarkus.io/guides/openapi-swaggerui)
* [Hibernate ORM com Panache](https://quarkus.io/guides/hibernate-orm-panache)
* [Segurança com JPA](https://quarkus.io/guides/security-getting-started)
* [PostgreSQL JDBC](https://quarkus.io/guides/datasource)

