package bhdleon.dashboard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.core.Response;

public class CalendarResource {

	@GET
	public Response index() {
		return Response.ok("Calendar").build();
	}
}
