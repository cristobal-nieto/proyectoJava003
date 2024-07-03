package es.ifp.programacion.ejercicio.uf5;

import java.util.ArrayList;
import java.util.Date;
	

public class Proyecto  {	
	

	//Definicion de atributos de la clase Proyecto
		private String ideProyec;
		private String nomProyec;
		private String descProyec;
		private Date   fechaIni;	
	  	
		private ArrayList<Clientes>Clientes;
		private ArrayList<JefesDeProyecto>Jefes;
  
		
	//Constructor de Proyecto
		   public Proyecto(String ideProyec,String nomProyec,String descProyec,Date fechaIni) {
			   this.ideProyec=ideProyec;
			   this.nomProyec=nomProyec;
			   this.descProyec=descProyec;
			   this.fechaIni=fechaIni;
			   this.Clientes= new ArrayList<>();
			   this.Jefes= new ArrayList<>();
		   }
   
		//Metodos
				
	    /**
		* Metodo get que retorna el identificador del proyecto
		* @return
		*/
		public String getIdeProyec() {
			 
			return this.ideProyec;
		}
		 /**
	     * Metodo set que modifica el identificador del proyecto
	     * 
	     * @param ideProyec 
	     */
	    public void setIdeProyec(String ideProyec) {
	        this.ideProyec = ideProyec;
	    }
	    
		/**
		 * Metodo get que retorna el nombre del proyecto
		 * @return
		 */
		 public String getNomProyec() {
			 
			 return this.nomProyec;
		 }
		  /**
		     * Metodo set que modifica el nombre del proyecto
		     *
		     * @param nomProyec
		     */
		    public void setNomProyec(String nomProyec) {
		        this.nomProyec = nomProyec;
		    }
		/**
		 * Metodo get que retorna la descripcion del proyecto 
		 * @return
		 */
		public String getDescProyec() {
			
			return this.descProyec;
		}
		/**
	     * Metodo set que modifica la descripcion del proyecto
	     *
	     * @param descProyec
	     */
	    public void setDescProyec(String descProyec) {
	        this.descProyec = descProyec;
	    }

		/**
		 * Metodo get que retorna la fecha de inicio
		 * @return
		 */
		public Date getFechaIni() {
			
			return this.fechaIni;
		}
		/**
	     * Metodo set que modifica la fecha de inicio
	     *
	     * @param fechaIni 
	     */
	    public void setFechaIni(Date fechaIni) {
	        this.fechaIni = fechaIni;
	    }
		/**
		 * Metodo add que añade clientes a la lista de clientes
		 * @param cliente
		 */
	    public void addCliente(Clientes cliente) {
	        this.Clientes.add(cliente);
	    }
	    
	    /**
	     * Metodo get que retorna la lista de clientes
	     *  @param cliente
	     */
	    public void mostrarClientes() {
	         for (int i = 0; i < Clientes.size(); i++) {
	           System.out.println(this.Clientes.get(i).toString());
	           System.out.println("_____________________________________________");
	           }   
	        
	  
	    
	    
	    }
	    /*
	     * Metodo add que añade jefes a la lista de jefes de proyecto
	     *  @param jefes
	     */
	    public void addJefes(JefesDeProyecto Jefes) {
	    	 this.Jefes.add(Jefes); 
	            	            
	    } 
	    /*
	     * Metodo get que retorna la lista de jefes de proyecto
	     *  @param jefes
	     */
	    public void mostrarJefes() {
		     for (int i = 0; i < Jefes.size(); i++) {
		        System.out.println(this.Jefes.get(i).toString());
		        System.out.println("_____________________________________________");  
		        } 
	   	            
	    }			        	        	        	      				
		/*
		 * Metodo toString que retorna los datos del proyecto
		 */	
		public String toString() {
			
		return "Nombre de proyecto:"+this.getNomProyec()+"\n"+
               "Id. proyecto:"+this.getIdeProyec()+"\n"+
	           "Descripción:"+this.getDescProyec()+"\n"+
	           "Fecha de inicio:"+this.getFechaIni();
		       
		}	    			
		
		
		

 
		  
					}	
		   
		   
		   
	   
	
	
	
	

	
	
	
		  
	
	
	
	
	
	
	
	
	
	
	
	
	
	

