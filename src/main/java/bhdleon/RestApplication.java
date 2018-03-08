package bhdleon;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import bhdleon.dashboard.resources.CalendarResource;
import bhdleon.dashboard.resources.DashboardResource;
import bhdleon.dashboard.resources.ExecutiveResource;
import bhdleon.dashboard.resources.ForeignExchangeResource;
import bhdleon.dashboard.resources.GraphicsResource;
import bhdleon.filters.AuthenticationFilter;
import bhdleon.filters.LogFilter;

@ApplicationPath("api")
public class RestApplication extends Application {
    
	@Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        
        classes.add(HelloWorldResource.class);
        
        classes.add(DashboardResource.class);
        classes.add(CalendarResource.class);
        classes.add(ExecutiveResource.class);
        classes.add(ForeignExchangeResource.class);
        classes.add(GraphicsResource.class);
        
        classes.add(LogFilter.class);
        classes.add(AuthenticationFilter.class);
        
        return classes;
    }
}
