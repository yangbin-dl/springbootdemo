package mallfe.demo.config;

import lombok.Data;

/**
 * 描述
 *
 * @author Yangbin
 * @since 2019/06/04
 */
//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
    String url;
    String driverClassName;
    String username;
    String password;
}
