package br.com.exemplorest.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

	@Path("/imprimebemvindo")


public class RecursoImprimeBemVindo {

	@GET
	@Produces("text/plain")
	
	public String exibir(){
		return "BEM VINDO AO MUNDO REST...";
	}
}
