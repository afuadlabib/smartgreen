package com.smartgreen.course.auth;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("/auth")
@RequestScoped
public class AuthController {
    @GET
    @Consumes(value = MediaType.TEXT_HTML)
    public String authRegister(){
        return "Auth register";
    }
}
