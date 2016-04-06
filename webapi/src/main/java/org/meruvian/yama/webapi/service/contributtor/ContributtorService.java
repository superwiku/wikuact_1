package org.meruvian.yama.webapi.service.contributtor;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.meruvian.yama.tot.contributtor.Contributtor;

@Path("/api/news")
@Produces(MediaType.APPLICATION_JSON)
public interface ContributtorService {

	@GET
	@Path("/{id}")
	
	Contributtor getContributtorById(@PathParam("id")  long id);
	
	@GET
	List<Contributtor> findContributtorByName(@QueryParam("name") @DefaultValue("") String name);
	
	@POST
	@OPTIONS
	Contributtor saveContributtor(Contributtor contributtor);
	
	@PUT
	@Path("/{id}")
	Contributtor updateContributtor(@PathParam("id")  long id, Contributtor contributtor);
	
	@DELETE
	@Path("/{id}")
	void deleteContributtor(@PathParam("id")  long id);
	
}
