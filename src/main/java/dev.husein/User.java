package dev.husein;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Path("user")
public class User {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {
        Map<String, String> response = new HashMap<>();
        response.put("Name", "Husein");
        response.put("Age", "25");
        response.put("Weight", "100");
        return Response.ok(response).build();
    }
}
