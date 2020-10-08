package org.acme.commandmode;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/persoon")
public class PersonResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPerson() {
        return List.of(
                new Person("Jan", "Visser"),
                new Person("Henkie", "Bakker")
        );
    }
}
