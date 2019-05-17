package com.example.JibTest;

import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    register(JacksonJaxbJsonProvider.class);
    register(MultiPartFeature.class);
    register(TestResource.class);
  }

}