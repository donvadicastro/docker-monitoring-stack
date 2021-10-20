###Application monitoring stack includes:
* [Basic Angular application](http://localhost:4200) to render Grafana boards
* Basic SpringBoot application with exposing [Prometheus metrics](http://localhost:8080/actuator/prometheus)
* [Prometheus server](http://localhost:9090)
* [Grafana server](http://localhost:3000/) admin/admin

```cmd
docker compose up
```