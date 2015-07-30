package com.yan.hellosecurity.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

	private static final Logger logger = LoggerFactory
			.getLogger(DefaultController.class);

	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	private ModelAndView welcome() {

		logger.debug("welcome");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("title", "Spring Security Hello World");
		modelAndView.addObject("message", "This is welcome page!");
		modelAndView.setViewName("hello");
		return modelAndView;
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	private ModelAndView admin() {

		logger.debug("admin");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("title", "Spring Security Hello World");
		modelAndView.addObject("message", "This is protected admin page!");
		modelAndView.setViewName("admin");
		return modelAndView;
	}

	@RequestMapping(value = "/db", method = RequestMethod.GET)
	private ModelAndView db() {

		logger.debug("db");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("title", "Spring Security Hello World");
		modelAndView.addObject("message", "This is protected DBA page!");
		modelAndView.setViewName("admin");
		return modelAndView;
	}

}
