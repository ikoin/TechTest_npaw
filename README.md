# Java TechTest NPAW

### Prerequisites
* Java 1.8
* YAML config file

### Running

To run the JAR file you need a yaml file to configure the server and which server configuration you want to use (defined inside yaml file).

```
java -jar TechTest.jar server example.yml
```

## Configuration File

###Logging:
To see the request of the server you can enable logging setting the level as on the example below,
for more information check dropwizard documentation [https://www.dropwizard.io/1.3.4/docs/manual/configuration.html#logging](https://www.dropwizard.io/1.3.4/docs/manual/configuration.html#logging)

###Server Parameters:
To configure on what port have to listen the server we need to configure it on the yaml file the default port is 8080,
to see more information check dropwizard documentation [https://www.dropwizard.io/1.3.4/docs/manual/configuration.html](https://www.dropwizard.io/1.3.4/docs/manual/configuration.html)

###Service Configuration:

The server reads the configuration from a yaml file (check below for an example) and it's loaded every time 
the services starts. 

```yaml
logging:
  level: OFF
server:
  applicationConnectors:
    - type: http
      port: 80
balancer:
  - accountCode: clienteA
    targetDevice: XBox
    pluginVersion: 3.3.1
    pingTime: 10
    hosts:
    - host: clusterA.com
      load: 70
    - host: clusterB.com
      load: 30
  - accountCode: clienteA
    targetDevice: Panasonic
    pluginVersion: 3.3.2
    pingTime: 5
    hosts:
    - host: clusterB.com
      load: 100
  - accountCode: clienteB
    targetDevice: osmf
    pluginVersion: 3.3.1
    pingTime: 5
    hosts:
    - host: clusterA.com
      load: 50
    - host: clusterB.com
      load: 50
```

## Generate Jar
If you want a compiled version of this project you can find it on the release page of the repo.

To compile the jar you have to run ``mvn package`` (you need to have maven installed).
You will find the generated jar in the target directory of this project. 

## Built With

* [Dropwizard](https://www.dropwizard.io/1.3.4/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Albert Martos Andújar**