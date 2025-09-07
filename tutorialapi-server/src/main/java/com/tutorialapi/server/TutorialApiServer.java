package com.tutorialapi.server;

import org.eclipse.jetty.http.HttpScheme;
import org.eclipse.jetty.server.HttpConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialApiServer {

    private  static  final Logger LOGGER = LoggerFactory.getLogger("Server");

    public static void main(String[] args) {

        // Test Logger Here
        LOGGER.error("Hello World");
        HttpConfiguration httpConfiguration = new  HttpConfiguration();
        httpConfiguration.setSecureScheme(HttpScheme.HTTPS.asString());// Turns Http Connector into  a Secure Connector
    }
}
