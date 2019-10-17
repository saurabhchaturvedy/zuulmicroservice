package com.test.saurabh.zuul.filter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class ErrorFilter extends ZuulFilter {

	private static Logger logger = LoggerFactory.getLogger(ErrorFilter.class);

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
		logger.info("Error filter : " + String.format("response type is %s", response.getStatus()));

		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "error";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
