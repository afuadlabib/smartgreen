package com.smartgreen.course.auth;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/auth")
@RequestScoped
public class AuthController {
    @Inject
    private AuthService authService;

    @Path("/login")
    @GET
    @Consumes(value = MediaType.APPLICATION_JSON)
    public String doLogin() {
        System.out.println("ok");
        return "Login";
    }

    @Path("/register")
    @POST
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response doRegister( User user) {
        return Response.ok().entity(authService.createUser(user)).build();
    }
}
