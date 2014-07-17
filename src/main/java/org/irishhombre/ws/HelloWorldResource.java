package org.irishhombre.ws;
import javax.ws.rs.*;

@Path("helloworld")
public class HelloWorldResource {
    @GET
    @Produces("text/plain")
    public String getMessage() {
        return "Rest Never Sleeps";
    }
}

