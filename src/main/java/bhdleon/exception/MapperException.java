/**
 * 
 */
package bhdleon.exception;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author Michael Montero
 *
 */
@Provider
public class MapperException implements ExceptionMapper<ConstraintViolationException>{

	
	@Override
	public Response toResponse(ConstraintViolationException exception) {
		   return Response.status(Response.Status.BAD_REQUEST)
                   .entity(createResponse(exception))
                   .type("text/plain")
                   .build();
	}
	
	private String createResponse(ConstraintViolationException exception) {
	      String responseMessage = "";
	      for (ConstraintViolation<?> cv : exception.getConstraintViolations()) {
	    	  responseMessage+=cv.getPropertyPath()+" "+cv.getMessage()+"\n";
	      }
	      return responseMessage;
	  }

}
