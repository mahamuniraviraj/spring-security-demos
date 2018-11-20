

package com.reva.web.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.reva.web.security.config.SpringSecurityConfig;


/**
 * Bootstraps Spring MVC Web Application. This class provides the similar
 * functionality provided in web.xml. This class is automatically detected and
 * Spring loads web application context by catching servlet context load listner
 * event.
 *
 * @author Raviraj S Mahamuni
 * @date 17-Nov-2018
 * @since 1.0
 */
public class WebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.web.servlet.support.
     * AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses
     * ()
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class[] { SpringSecurityConfig.class, RootConfig.class };
    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.web.servlet.support.
     * AbstractAnnotationConfigDispatcherServletInitializer#
     * getServletConfigClasses()
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class };
    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.web.servlet.support.
     * AbstractDispatcherServletInitializer#getServletMappings()
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
