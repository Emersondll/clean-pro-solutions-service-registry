package br.com.cleanprosolutions.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main entry point for the Eureka Service Registry.
 *
 * <p>Provides service discovery and registration for the
 * entire Clean Pro Solutions microservices ecosystem.</p>
 *
 * @author Clean Pro Solutions Team
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ServiceRegistryApplication.class, args);
    }
}
