

package com.reva.web.security.config;


import javax.servlet.ServletContext;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;


/**
 * @author Raviraj S Mahamuni
 * @date 17-Nov-2018
 * @since 1.0
 */
public class SecurityWebApplicationInitializer
        extends AbstractSecurityWebApplicationInitializer {

    // Autowire custom filter beans for adding before or after spring security
    // filter chain

    @Override
    protected void beforeSpringSecurityFilterChain(
            ServletContext servletContext) {
        // Autowired custom filter beans are registered before spring
        // security filter chain
    }

    @Override
    protected void afterSpringSecurityFilterChain(
            ServletContext servletContext) {
        // Autowired custom filter beans are registered after spring
        // security filter chain

    }

}
