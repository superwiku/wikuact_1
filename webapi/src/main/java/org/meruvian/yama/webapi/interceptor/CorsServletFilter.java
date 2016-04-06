package org.meruvian.yama.webapi.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

@Provider
@Component
public class CorsServletFilter implements Filter{
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;
		HttpServletRequest request = (HttpServletRequest) req;
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Allow-Method", "GET, POST, PUT, DELETE, OPTION, HEAD");
		response.setHeader("Access-Control-Allow-Headers", "accept, origin, authorization, content-type,"
				+ "x-request-with, cache-control, dnt, if-modified-since, keep-alive, "
				+ "user-agent, x-mx-reqtoken");
		if(!request.getMethod().equals("OPTIONS"))
			chain.doFilter(req, res);			
	}
	
	@Override
	public void destroy(){
		
	}
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
	
	
		

}
