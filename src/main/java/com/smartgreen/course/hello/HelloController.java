package com.smartgreen.course.hello;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@RequestScoped
@Path("/hello")
public class HelloController {
    @GET
    public String doHello(){
        return "Hello";
    }

}
