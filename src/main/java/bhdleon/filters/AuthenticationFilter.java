package bhdleon.filters;

import java.io.IOException;

import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

import bhdleon.filters.Authorized;

@Authorized
@Priority(1)
@Provider
public class AuthenticationFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("-- req authentication info --");
		System.out.println("Basic Auth");
	}

}