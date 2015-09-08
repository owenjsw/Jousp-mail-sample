package com.owen.context;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.Resource;

/**
 * Created by owen on 9/7/15.
 */

@Configuration
@ComponentScan("owen.www")
@EnableWebMvc
@PropertySource("classpath:application.properties")
public class WebCacheInitializer {
    private static final String PROPERTY_NAME_SMTP_HOST = "smtp.host";
    private static final String PROPERTY_NAME_SMTP_PORT = "smtp.port";
    private static final String PROPERTY_NAME_SMTP_USERNAME = "smtp.username";
    private static final String PROPERTY_NAME_SMTP_PWD = "smtp.pwd";

    @Resource
    private Environment environment;
}
