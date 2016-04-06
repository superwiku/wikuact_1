package org.meruvian.yama.webapi.service.news;

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

import org.meruvian.yama.tot.news.Category;

@Path("/api/category")
@Produces(MediaType.APPLICATION_JSON)
public interface CategoryService {
	@GET
	@Path("/{id}")
	
	Category getCategoryById(@PathParam("id")  long id);
	
	@GET
	List<Category> findCategoryByKategori(@QueryParam("kategori") @DefaultValue("") String kategori);
	
	@POST
	@OPTIONS
	Category saveCategory(Category kategori);
	
	@PUT
	@Path("/{id}")
	Category updateCategory(@PathParam("id")  long id, Category kategori);
	
	@DELETE
	@Path("/{id}")
	void deleteCategory(@PathParam("id")  long id);
}
