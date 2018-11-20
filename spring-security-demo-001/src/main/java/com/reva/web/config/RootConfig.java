

package com.reva.web.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author Raviraj S Mahamuni
 * @date 17-Nov-2018
 * @since 1.0
 */
@Configuration
@ComponentScan("com.reva.service")
public class RootConfig {

    // Declare @Bean here which are not part of web layer or can be used with
    // multiple dispatcher servlets if they exists.

}
