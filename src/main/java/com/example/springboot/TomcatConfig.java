// package com.example.springboot;

// import org.apache.catalina.connector.Connector;
// import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
// import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
// import org.springframework.boot.web.server.WebServerFactoryCustomizer;
// import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// /*
//  * Tomcat Server Config
//  */
// @Configuration
// public class TomcatConfig implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

// 	@Bean
// 	public ServletWebServerFactory servletContainer() {
// 		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
// 		tomcat.addAdditionalTomcatConnectors(createAjpConnector());
// 		return tomcat;
// 	}

// 	private Connector createAjpConnector() {
// 		Connector ajpConnector = new Connector("AJP/1.3");
// 		ajpConnector.setPort(9999);	// ajp Port
// 		ajpConnector.setSecure(false);
// 		ajpConnector.setAllowTrace(false);
// 		ajpConnector.setScheme("http");
// 		ajpConnector.setRedirectPort(8080);	// http or https port
// 		return ajpConnector;
// 	}

// 	@Override
// 	public void customize(TomcatServletWebServerFactory factory) {
// 		factory.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> connector.setAttribute("relaxedQueryChars", "|"));	
// 	}
// }
