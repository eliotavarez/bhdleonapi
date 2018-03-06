package dashboard;

import javax.ws.rs.GET;
import javax.ws.rs.core.Response;

public class ForeignExchangeResource {
	
	@GET
	public Response index() {
		return Response.ok().entity("Foreign Exchange").build();
	}
}
