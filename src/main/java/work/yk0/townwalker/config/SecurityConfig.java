package work.yk0.townwalker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.HttpSecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author ykonno.
 * @since 2019/09/10.
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        // TODO:とりあえずの全許可
        http.authorizeRequests().mvcMatchers("/**")
                .permitAll();
    }

}
