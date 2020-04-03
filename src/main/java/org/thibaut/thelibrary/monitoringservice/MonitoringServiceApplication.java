package org.thibaut.thelibrary.monitoringservice;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class MonitoringServiceApplication {

	public static void main( String[] args ) {
		SpringApplication.run( MonitoringServiceApplication.class, args );
	}



//	@Configuration
//	public static class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
//		@Override
//		protected void configure( HttpSecurity http) throws Exception {
//			http.authorizeRequests().anyRequest().permitAll()
//					.and().csrf().disable();
//		}
//	}

}
