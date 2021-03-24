package com.controller.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns= "*.do")
public class LoginRequiredFilter implements Filter 
{
    public LoginRequiredFilter(){}
    @Override
	public void destroy(){}
    @Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException 
	{
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		if(request.getSession().getAttribute("name")!=null)
		{
			chain.doFilter(request, response);
			//System.out.println(request.getRequestURI());
		}
		else
		{
			request.getRequestDispatcher(request.getContextPath()+"/login.do").forward(servletRequest,servletResponse);
		}
	}
    @Override
	public void init(FilterConfig fConfig) throws ServletException{}
}
