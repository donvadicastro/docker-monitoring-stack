### Application monitoring stack includes:
* [Basic HTML application](http://localhost:4200) to render Grafana boards
* Basic SpringBoot application with exposing [Prometheus metrics](http://localhost:8080/actuator/prometheus)
* [Prometheus server](http://localhost:9090)
* [Grafana server](http://localhost:3000/) admin/admin

### Use specific profile to run
```cmd
docker compose --profile all up             # run all
docker compose --profile monitoring up      # run monitoring stack only (prometheus, grafana, node-exporter)
docker compose --profile testing up         # run testing stack only (sonarqube and db for it)
docker compose --profile app up             # run applications only (fronend, backend)
```

### Steps to activate metrics in HTML page
* run monitoring stack
```cmd
docker compose --profile monitoring up
```
* create Grafana API user
  * login to [Grafana](http://localhost:3000/) ("admin/admin" if default password used)
  * navigate to "Configuration" -> "API Keys" on left menu
  * create new key and copy it
* store created API_KEY in ".env" configuration file
* run applications stack
```cmd
docker compose --profile app up
```
* navigate to [client app](http://localhost:4200)

### Testing stack
* Before run docker, execute in powershell:
```shell
wsl -d docker-desktop
sysctl -w vm.max_map_count=262144
```
* Run docker: `docker compose --profile testing up`
* Navigate to [SonarQube portal](http://localhost:9000/) (`admin` / `admin`)
* Create new project with key "monitoring-stack"
* Register new key and store it in `gradle.properties`
* Run scan: `./gradlew sonarqube`