package com.demo.zuulgateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component

public class MyZuulRequestInterCeptor extends ZuulFilter {

    //@Autowired
   // HttpServletRequest req;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx= RequestContext.getCurrentContext();
        HttpServletRequest req=ctx.getRequest();
    req.setAttribute("name","Shantanu");
    ctx.setRequest(req);

        System.out.println("The filter working.."+req.getRequestURI());
        return "Request Data intercepted..";
    }
}
