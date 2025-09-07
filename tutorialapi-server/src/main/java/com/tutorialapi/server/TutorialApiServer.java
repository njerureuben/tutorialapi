package com.tutorialapi.server;

import org.eclipse.jetty.http.HttpScheme;
import org.eclipse.jetty.server.HttpConfiguration;

public class TutorialApiServer {

    public static void main(String[] args) {

        HttpConfiguration httpConfiguration = new  HttpConfiguration();
        httpConfiguration.setSecureScheme(HttpScheme.HTTPS.asString());// Turns Http Connector into  a Secure Connector
    }
}
