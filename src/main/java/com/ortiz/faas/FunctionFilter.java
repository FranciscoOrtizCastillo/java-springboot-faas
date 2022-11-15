package com.ortiz.faas;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class FunctionFilter implements Filter {   

    @Override
    public void doFilter( ServletRequest request, ServletResponse response, 
      FilterChain chain) throws IOException, ServletException {
 
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        if ( req.getHeader("nonsecure") != null ) {
          res.getOutputStream().write( "{ \"error\": \"ERROR DE SEGURIDAD!\" }".getBytes() );
          return;
        }

        chain.doFilter(request, response);

    }

}
