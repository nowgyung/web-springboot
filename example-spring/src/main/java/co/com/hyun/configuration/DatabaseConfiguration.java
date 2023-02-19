package co.com.hyun.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {
	
	@Bean
	@ConfigurationProperties(prefix="spring.datasource") // 스프링부트에서 자동으로 configuration 파일을 불러올수 있음, property를 괄호안 경로에서 찾겠다는 의미
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	

}
