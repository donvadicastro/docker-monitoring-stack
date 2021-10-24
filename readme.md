###Application monitoring stack includes:
* [Basic HTML application](http://localhost:4200) to render Grafana boards
* Basic SpringBoot application with exposing [Prometheus metrics](http://localhost:8080/actuator/prometheus)
* [Prometheus server](http://localhost:9090)
* [Grafana server](http://localhost:3000/) admin/admin

```cmd
docker compose --profile all up             # run all
docker compose --profile monitoring up      # run monitoring stack only (prometheus, grafana, node-exporter)
docker compose --profile app up             # run applications only (fronend, backend)
```