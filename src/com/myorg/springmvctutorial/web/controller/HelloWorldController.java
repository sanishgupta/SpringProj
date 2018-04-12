package com.myorg.springmvctutorial.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.myorg.springmvctutorial.web.command.Visitor;

public class HelloWorldController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());

	
	// OLD Method commented for the change to show visitor count
	/*public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		logger.info("Return View");
		return new ModelAndView("helloworld.jsp");
	}*/
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		logger.info("Return View");
		Map dataMap = new HashMap();
		Visitor visitor = new Visitor();
		dataMap.put("visitor", visitor);
		return new ModelAndView("helloworld.jsp", dataMap);
	}
}