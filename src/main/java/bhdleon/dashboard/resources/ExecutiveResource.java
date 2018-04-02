package bhdleon.dashboard.resources;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bhdleon.dashboard.models.Executive;
import bhdleon.dashboard.services.ExecutiveService;
import bhdleon.dashboard.servicesImpl.ExecutiveServiceImpl;

@Produces(MediaType.APPLICATION_JSON)
@Path("dashboard/executive")
public class ExecutiveResource {

	private ExecutiveService executiveService;

	public ExecutiveResource() {
		executiveService = new ExecutiveServiceImpl();
	}

	@GET
	@Path("get/")
	public Response index() {
		Executive executive = executiveService.get("22300410218");
		return Response.ok(executive).build();
	}
	
	@POST
	@Path("add/")
	public Response add(@Valid Executive executive) {
		Executive executiveCreated = executiveService.add(executive);
		return Response.ok(executiveCreated).build();
	}
}
