package com.jpgarcia.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jpgarcia.command.CiudadCommand;
import com.jpgarcia.command.DireccionCommand;
import com.jpgarcia.command.DomicilioCommand;
import com.jpgarcia.command.PersonaCommand;
import com.jpgarcia.dao.PersonaDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	PersonaCommand personaCommand;
	@Autowired
	DomicilioCommand domicilioCommand;
	@Autowired
	DireccionCommand direccionCommand;
	@Autowired
	CiudadCommand ciudadCommand;

   private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

   /**
    * Simply selects the home view to render by returning its name.
    */
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String home(Locale locale, Model model) {
      logger.info("Welcome home! The client locale is {}.", locale);
     
      Date date = new Date();
      DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
     
      String formattedDate = dateFormat.format(date);

      model.addAttribute("serverTime", formattedDate );
      
      return "home";
   }
	
   @RequestMapping(value = "/persona", method = RequestMethod.GET)
   public @ResponseBody Persona ObtenerPersona(@RequestParam (value="persona", required=true)Persona persona){
      // Lógica para obtener los datos de la persona
      return personaCommand.consultarPersona(persona);
   }
   
   
   @RequestMapping(value = "/persona", method = RequestMethod.POST)
   public @ResponseBody void CrearPersona(@RequestParam (value="persona", required=true)Persona persona){
      // Lógica para crear los datos de la persona
	   personaCommand.crearPersona(persona);
        
   }
   
   
   
   @RequestMapping(value = "/persona", method = RequestMethod.PUT)
   public @ResponseBody void actualizarpersona(@RequestParam (value="persona", required=true)Persona persona){
      // Lógica para actualizar los datos de la persona
	   personaCommand.actualizarPersona(persona);
        
   }
   
   
   @RequestMapping(value = "/persona", method = RequestMethod.DELETE)
   public @ResponseBody void BorrarPersona(@RequestParam (value="persona", required=true)Persona persona){
      // Lógica para borrar los datos de la persona
	   personaCommand.borrarPersona(persona);
        
   }
   
   
   @RequestMapping(value = "/persona/listar", method = RequestMethod.POST)
   public @ResponseBody List<Persona> ListarPersonas(){
      // Lógica para listar los datos de la persona
	   return  personaCommand.listarpersona();
        
   }
   
   @RequestMapping(value = "/pedido", method = RequestMethod.POST)
   public @ResponseBody void CrearPedido(@RequestParam (value="domicilio", required=true)Domicilios domicilio){
      // Lógica para obtener los datos el pedido
	   domicilioCommand.crearDomiciliio(domicilio);        
   }
   
   @RequestMapping(value = "/pedido", method = RequestMethod.PUT)
   public @ResponseBody void actualizarPedido(@RequestParam (value="domicilio", required=true)Domicilios domicilio){
      // Lógica para obtener los datos de el pedido
	   domicilioCommand.actualizarDomicilio(domicilio);        
   }
   
   
   @RequestMapping(value = "/pedido", method = RequestMethod.GET)
   public @ResponseBody void ConsultarPedido(@RequestParam (value="domicilio", required=true)Domicilios domicilio){
      // Lógica para obtener los datos de el pedido
	   domicilioCommand.consultarDomicilio(domicilio);        
   }
   
   @RequestMapping(value = "/pedido", method = RequestMethod.DELETE)
   public @ResponseBody void BorrarPedido(@RequestParam (value="domicilio", required=true)Domicilios domicilio){
      // Lógica para obtener los datos de el pedido
	   domicilioCommand.borrarDomicilio(domicilio);        
   }
   
   
   @RequestMapping(value = "/pedido/listar", method = RequestMethod.POST)
   public @ResponseBody List<Domicilios> ListarPedidos(){
      // Lógica para obtener los datos de el pedido
	   return  domicilioCommand.listarDomicilios();
        
   }
   
   @RequestMapping(value = "/direcciones", method = RequestMethod.GET)
   public @ResponseBody Direcciones ObtenerDireccion(@RequestParam (value="direcciones", required=true)Direcciones direcciones){
      // Lógica para obtener los datos de la direccion
      return direccionCommand.ConsultarDireccion(direcciones);
   }
   
   
   @RequestMapping(value = "/direcciones", method = RequestMethod.POST)
   public @ResponseBody void CrearDireccion(@RequestParam (value="direcciones", required=true)Direcciones direcciones){
      // Lógica para crear los datos de la direccion
      direccionCommand.guardarDireccion(direcciones);
        
   }
   
   
   
   @RequestMapping(value = "/direcciones", method = RequestMethod.PUT)
   public @ResponseBody void actualizarDireccion(@RequestParam (value="direcciones", required=true)Direcciones direcciones){
      // Lógica para actualizar los datos de la direccion
      direccionCommand.actualizarDireccion(direcciones);
        
   }
   
   
   @RequestMapping(value = "/direcciones", method = RequestMethod.DELETE)
   public @ResponseBody void BorrarDireccion(@RequestParam (value="direcciones", required=true)Direcciones direcciones){
      // Lógica para borrar los datos de la direccion
      direccionCommand.borrarDireccion(direcciones);
        
   }
   
   
   @RequestMapping(value = "/direcciones/listar", method = RequestMethod.POST)
   public @ResponseBody List<Direcciones> ListarDirecciones(){
      // Lógica para listar los datos de la direccion
      return  direccionCommand.listarDirecciones();
        
   }
   
   @RequestMapping(value = "/ciudad", method = RequestMethod.GET)
   public @ResponseBody Ciudad ObtenerCiudad(@RequestParam (value="ciudad", required=true)Ciudad ciudad){
      // Lógica para obtener los datos de la ciudad
      return ciudadCommand.ConsultarCiudad(ciudad);
   }
   
   
   @RequestMapping(value = "/ciudad", method = RequestMethod.POST)
   public @ResponseBody void CrearCiudad(@RequestParam (value="ciudad", required=true)Ciudad ciudad){
      // Lógica para crear los datos de la ciudad
      ciudadCommand.crearCiudad(ciudad);
        
   }
   
   
   
   @RequestMapping(value = "/ciudad", method = RequestMethod.PUT)
   public @ResponseBody void actualizarCiudad(@RequestParam (value="ciudad", required=true)Ciudad ciudad){
      // Lógica para actualizar los datos de la ciudad
      ciudadCommand.actualizarCiudad(ciudad);
        
   }
   
   
   @RequestMapping(value = "/ciudad", method = RequestMethod.DELETE)
   public @ResponseBody void BorrarCiudad(@RequestParam (value="ciudad", required=true)Ciudad ciudad){
      // Lógica para borrar los datos de la ciudad
      ciudadCommand.borrarCiudad(ciudad);
        
   }
   
   
   @RequestMapping(value = "/ciudad/listar", method = RequestMethod.POST)
   public @ResponseBody List<Ciudad> ListarCiudad(){
      // Lógica para listar los datos de la ciudad
      return  ciudadCommand.listarCiudades();
        
   }
   
}
