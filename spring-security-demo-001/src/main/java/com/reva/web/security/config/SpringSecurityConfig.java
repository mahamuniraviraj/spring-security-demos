

package com.reva.web.security.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * @author Raviraj S Mahamuni
 * @date 17-Nov-2018
 * @since 1.0
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthenticationProvider myAuthenticationProvider;

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {

        // We can provide multiple providers to manager
        auth.authenticationProvider(myAuthenticationProvider);
        // auth.authenticationProvider(anotherProvider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.

                authorizeRequests().anyRequest().authenticated().and()
                .formLogin().defaultSuccessUrl("/home", true)
                .failureUrl("/login?error=true").and().logout()
                .logoutUrl("/logout").deleteCookies("JSESSIONID");

    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);

        web.ignoring().antMatchers("/myApi");
    }

}
