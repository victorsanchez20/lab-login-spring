# Login Lab — Spring Boot

Maqueta visual de autenticación para prácticas académicas. Usa identidad ficticia y no transmite ni almacena credenciales.

## Requisitos
- Java 21
- Maven 3.9+ (o usar el wrapper Maven si lo agregas desde tu IDE)

## Ejecutar localmente
Desde la carpeta del proyecto:

```bash
mvn spring-boot:run
```

Abrir: http://localhost:8080

También puedes generar el JAR:

```bash
mvn clean package
java -jar target/login-lab-0.0.1-SNAPSHOT.jar
```

## Despliegue
Para una demostración privada, despliega en una VM o servidor de laboratorio y limita el acceso mediante firewall/VPN. No publiques una aplicación vulnerable en Internet ni la conectes a datos reales.

Puedes crear una imagen Docker después de generar el JAR:

```dockerfile
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/login-lab-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
```

```bash
docker build -t login-lab .
docker run --rm -p 127.0.0.1:8080:8080 login-lab
```

El enlace `127.0.0.1` limita el servicio al equipo local.

## Sobre Metasploit
Esta maqueta no contiene una vulnerabilidad explotable y no integra una puerta trasera. Metasploit no es una herramienta genérica para convertir un formulario de login en RCE. Para practicar explotación con Metasploit, usa una máquina deliberadamente vulnerable independiente (por ejemplo, Metasploitable 2/3) en una red host-only/aislada, y documenta el servicio, la versión, el módulo y la corrección. No escanees ni ataques el dominio o la IP de la empresa sin autorización explícita.
