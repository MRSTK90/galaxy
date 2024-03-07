package kr.co.galaxy.apis.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Class Description 
 *
 *
 * @class UserApiApplication
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-14      SungTae Kim	    최초 작성		
 * </pre>
 */
@SpringBootApplication(scanBasePackages = {"kr.co.galaxy"})
@EnableDiscoveryClient
public class UserApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }
}
