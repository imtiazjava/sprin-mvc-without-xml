package com.cgi.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyApplicationIntializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		 //1. create dispatcher servlet here
		//2. register dispatcher servlet with servlet context object
	 
		/*XmlWebApplicationContext webApplicationContext
		= new XmlWebApplicationContext();
		webApplicationContext.setConfigLocation("classpath:application-config.xml");
		*/
		AnnotationConfigWebApplicationContext webApplicationContext=
				new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(MyConfiguration.class);
		DispatcherServlet ds=new DispatcherServlet(webApplicationContext);
		ServletRegistration.Dynamic myd=servletContext.addServlet("dispatch", ds);
		myd.setLoadOnStartup(1);
		myd.addMapping("/");

	}

}
