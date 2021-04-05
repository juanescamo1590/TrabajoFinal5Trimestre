
package servicios;
import clases.*;
import gestiones.*;
import java.util.List;
import java.util.ArrayList;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
@Path("habitacion")
public class rsHabitacion {
    public static List<cliente> listadeclientes= new ArrayList<>();
    public gestionhabitacion gh= new gestionhabitacion();
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<cliente> consultar(){
    gh.setListacliente(listadeclientes);
    return gh.consultar();
    }
    
    @GET
    @Path("{parametroconsulta}")
    @Produces({MediaType.APPLICATION_JSON})
    public cliente conultarIndividual(@PathParam("parametroconsulta") String param){
        gh.setListacliente(listadeclientes);
        return gh.consultarIndividual(param);
        
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void insertar(cliente c){
        gh.setListacliente(listadeclientes);
        gh.insertar(c);
    }
    
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    public void modificar(cliente cl){
        gh.setListacliente(listadeclientes);
        gh.modificar(cl);
    }
    
    @DELETE
    @Path("{parmetroeliminar}")
    public void eliminar(@PathParam ("parmetroeliminar") String eliminar){
        cliente auxiliar= new cliente(eliminar, null, null, null, null);
        gh.setListacliente(listadeclientes);
        gh.eliminar(auxiliar);
               
        
    }
}
