package pe.edu.cibertec.mibodeguitaeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MibodeguitaEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MibodeguitaEurekaServerApplication.class, args);
    }

}
