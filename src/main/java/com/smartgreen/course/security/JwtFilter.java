package com.smartgreen.course.security;

import java.io.IOException;

import org.jboss.logging.Logger;

import jakarta.inject.Inject;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.PreMatching;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.ext.Provider;


@Provider 
@PreMatching
public class JwtFilter implements ContainerRequestFilter{
    @Inject
    private static final Logger logger = Logger.getLogger(JwtFilter.class);

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        UriInfo uriInfo = requestContext.getUriInfo();
        if(uriInfo.getPath().contains("/auth")){
            logger.infof("Auth without filter");
            return;
        }
        logger.infof("Do Filter JwtToken");
        return;
    }

    
}
