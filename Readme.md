### Execution instructions
- Start eureka service
- Start zuul gateway
- Start hello-world api


Visit http://localhost:8090 to make sure zuul gateway and hello-world api have register to eureka

Visit http://localhost:8092/example/hello to make sure hell-world api works

Visit http://localhost:8091/example/hello to verify zuul gateway routes the request properly

### Extra stuff
Zipkin(sleuth) URL: http://localhost:9411
> Note: `docker run -d -p 9411:9411 openzipkin/zipkin` to start a local zipkin server

Sentry URL: http://localhost:9000
- download self-hosted sentry (@their github page)
- run ./install.sh in downloaded directory and follow instructions
- docker-compose up -d
> Note: `docker-compose run --rm web createuser`   if you forgot to create sentry credentials

Zipkin and Sentry should work automatically for every submodule in this project
> Note: You still have to add sentry configs in the application's app.yml