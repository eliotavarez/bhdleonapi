package bhdleon.dashboard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bhdleon.dashboard.models.Executive;
import bhdleon.dashboard.services.ExecutiveService;
import bhdleon.dashboard.servicesImpl.ExecutiveServiceImpl;

@Produces(MediaType.APPLICATION_JSON)
public class ExecutiveResource {

	private ExecutiveService executiveService;

	public ExecutiveResource() {
		executiveService = new ExecutiveServiceImpl();
	}

	@GET
	public Response index() {
		Executive executive = executiveService.get("22300410218");
		return Response.ok().entity(executive).build();
	}
}
