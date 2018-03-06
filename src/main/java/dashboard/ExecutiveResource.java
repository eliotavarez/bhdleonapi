package dashboard;

import javax.ws.rs.GET;
import javax.ws.rs.core.Response;

public class ExecutiveResource {

	@GET
	public Response index() {
		return Response.ok().entity("Executive").build();
	}
}
