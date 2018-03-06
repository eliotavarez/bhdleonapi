package dashboard;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import filters.Authorized;
import filters.Logged;

@Authorized
@Logged
@Path("dashboard")
public class DashboardResource {
	
	@GET
	public Response index() {
		return Response.ok().entity("Dashboard").build();
	}

	@Path("calendar")
	public CalendarResource getCalendarResource() {
		return new CalendarResource();
	}
	
	@Path("executive")
	public ExecutiveResource getExecutiveResource() {
		return new ExecutiveResource();
	}
	
	@Path("foreign-exchange")
	public ForeignExchangeResource getForeignExchangeResource() {
		return new ForeignExchangeResource();
	}
	
	@Path("graphics")
	public GraphicsResource getGraphicsResource() {
		return new GraphicsResource();
	}
}
