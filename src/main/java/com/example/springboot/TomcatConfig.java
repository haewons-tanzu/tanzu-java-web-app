package com.example.springboot;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Tomcat Server Config
 */
@Configuration
public class TomcatConfig implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

	@Bean
	public ServletWebServerFactory servletContainer() {
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
		tomcat.addAdditionalTomcatConnectors(createHttpConnector());
		return tomcat;
	}

	private Connector createHttpConnector() {
		Connector httpConnector = new Connector("HTTP/1.1");
		httpConnector.setPort(8443);	// HTTP Port
		httpConnector.setSecure(false);
		httpConnector.setAllowTrace(false);
		httpConnector.setScheme("http");
		httpConnector.setRedirectPort(8080);	// http or https port
		return httpConnector;
	}

	@Override
	public void customize(TomcatServletWebServerFactory factory) {
		factory.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> connector.setAttribute("relaxedQueryChars", "|"));	
	}
}
