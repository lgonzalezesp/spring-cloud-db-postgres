# Spring Boot Postgres Cloud

## Create database Postgres with Docker

    docker run -d -e POSTGRES_USER=user -e POSTGRES_PASSWORD=user.1234 -e POSTGRES_DB=docker -p 5436:5432 postgres:9.6
