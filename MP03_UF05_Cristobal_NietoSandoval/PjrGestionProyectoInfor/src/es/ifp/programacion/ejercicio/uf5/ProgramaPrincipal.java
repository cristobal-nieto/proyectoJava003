package es.ifp.programacion.ejercicio.uf5;

import java.util.ArrayList;
import java.util.Date;
/**
 * ACTIVIDAD EVALUABLE UF4
 * Implementación de una gestion para un proyecto informático
 * Almacena informacion de proyecto,cliente y jefe de proyecto.
 * Se ha creado una Java Class para Persona,almacenando en ella la clase,atributos,constructores y metodos.
 * Tanto cliente como jefe de proyecto pertenecen a la clase persona pero con distintos contructores.
 * Se ha creado una Java Class para Proyecto,almacenando en ella la clase,atributos,constructores y metodos.
 * En la clase Proyecto también se establecen:
 * Una ArrayList que almacena clientes y un metodo que muestra la lista de clientes.
 * Una ArrayList que almacena jefes de proyecto  y un metodo que muestra la lista de jefes de proyecto.
 * En segundo lugar se establecen los objetos y su salida de informacion correspondiente.
 *  */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 

		
		//aqui mostramos los datos del proyecto
		System.out.println("=============================================");
		System.out.println("              DATOS PROYECTO                  ");
		System.out.println("=============================================");
		
        Proyecto proyecto1 = new Proyecto("RD3730","COOPER","3D DESIGN",new Date());
                
    	System.out.println(proyecto1.toString());


    	
        //aqui recorremos la arraylist de clientes para ver clientes

		System.out.println("=============================================");
		System.out.println("              DATOS CLIENTE                  ");
		System.out.println("=============================================");
    						
		Clientes cliente1 = new Clientes("Jesús","Quesada","1234567H","ID007");
		proyecto1.addCliente(cliente1);
		
	    Clientes cliente2 = new Clientes("Arturo","Cañas","343455J","ID009");
		proyecto1.addCliente(cliente2);
		
		proyecto1.mostrarClientes();
			

		 
		//aqui recorremos la arraylist de jefes para ver jefes
		
		System.out.println("=============================================");
		System.out.println("                 DATOS JP                    ");
		System.out.println("=============================================");
				
		JefesDeProyecto jefeProyecto1 = new JefesDeProyecto("Julián","Palacios","7653421B",23);
		proyecto1.addJefes(jefeProyecto1); 
		
		JefesDeProyecto jefeProyecto2 = new JefesDeProyecto("Gregorio","Antúnez","623920V",31);
		proyecto1.addJefes(jefeProyecto2);
		
		proyecto1.mostrarJefes();
		
		   
		
		
		
		
	}

}
