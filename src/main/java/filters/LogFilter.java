package filters;

import java.io.IOException;
import java.util.Map.Entry;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

import filters.Logged;

@Logged
@Provider
public class LogFilter implements ContainerRequestFilter, ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext reqContext) throws IOException {
		System.out.println("-- request info --");
		log(reqContext.getUriInfo(), reqContext.getHeaders());
	}

	@Override
	public void filter(ContainerRequestContext reqContext, ContainerResponseContext resContext) throws IOException {
		System.out.println("-- response info --");
		log(reqContext.getUriInfo(), resContext.getHeaders());
	}

	private void log(UriInfo uriInfo, MultivaluedMap<String, ?> headers) {
		System.out.println("Path: " + uriInfo.getPath());
		for (Entry<String, ?> option : headers.entrySet()) {
			System.out.println(option.getKey() + ": " + option.getValue());
		}
	}
}
