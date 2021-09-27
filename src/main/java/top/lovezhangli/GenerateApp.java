package top.lovezhangli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author tanglusheng
 * @Description
 * @date 2021/2/18
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GenerateApp {
    public static void main(String[] args) {
        SpringApplication.run(GenerateApp.class, args);
    }
}
