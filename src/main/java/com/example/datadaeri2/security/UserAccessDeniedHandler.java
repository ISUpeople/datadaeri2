package com.example.datadaeri2.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import com.example.datadaeri2.controller.HomeController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserAccessDeniedHandler implements AccessDeniedHandler{

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		logger.error("Access Denied Handler");
		logger.error("Redirect....");
		
		response.sendRedirect("/datadaeri2/user/accessError");
	}
	
	
}