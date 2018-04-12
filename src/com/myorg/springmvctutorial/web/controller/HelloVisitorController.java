package com.myorg.springmvctutorial.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.myorg.springmvctutorial.web.command.Visitor;

public class HelloVisitorController extends SimpleFormController {

	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
	}

	protected ModelAndView disallowDuplicateFormSubmission(
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		BindException errors = getErrorsForNewForm(request);
		errors.reject("duplicateFormSubmission", "Duplicate form submission");
		return showForm(request, response, errors);
	}

	protected final ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object commandObject,
			BindException errors) throws Exception {
		try {
			Visitor visitor = (Visitor) commandObject;
			logger.trace("First Name" + visitor.getFirstName() + "Last Name:"
					+ visitor.getLastName());
			visitor.setCompleteName(visitor.getFirstName() + " "
					+ visitor.getLastName());
			Map dataMap = new HashMap();
			dataMap.put("visitor", visitor);
			return new ModelAndView("hellovisitor.jsp", dataMap);
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
			throw e;
		}
	}

}