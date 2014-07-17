package org.irishhombre.ws;

import javax.ws.rs.*;

@Path("adproxy")
public class AdProxyAPI {
    @GET
    @Produces("text/html")
    public String getMessage() {
        return "Rest Never Sleeps";
    }
}

