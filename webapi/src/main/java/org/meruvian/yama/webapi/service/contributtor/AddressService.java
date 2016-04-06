package org.meruvian.yama.webapi.service.contributtor;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.meruvian.yama.tot.contributtor.Address;


@Path("/api/news")
@Produces(MediaType.APPLICATION_JSON)
public interface AddressService {

	@GET
	@Path("/{id}")
	
	Address getAddressByNation(@PathParam("nation")  String nation);
	
	@POST
	@OPTIONS
	Address saveAddress(Address address);
	
	@PUT
	@Path("/{id}")
	Address updateAddress(@PathParam("nation")  String nation, Address address);
	
	@DELETE
	@Path("/{id}")
	void deleteAddress(@PathParam("nation")  String nation);
}
