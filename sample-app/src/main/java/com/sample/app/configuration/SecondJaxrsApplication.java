package com.sample.app.configuration;

import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Component
@ApplicationPath("/second-app/")
public class SecondJaxrsApplication extends Application {
}
