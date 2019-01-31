package cl.lge.nube.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("default")
public class LocalDataSourceConfiguration {

    @Bean
    public DataSource dataSource() {
        return createDataSource("jdbc:postgresql://localhost:5436/docker", "org.postgresql.Driver", "user",
                "user.1234");
    }

    /**
     * crea el datasource
     *
     * @param jdbcUrl
     * @param driverClass
     * @param userName
     * @param password
     * @return
     */
    DataSource createDataSource(String jdbcUrl, String driverClass, String userName, String password) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(jdbcUrl);
        dataSource.setDriverClassName(driverClass);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }

}
