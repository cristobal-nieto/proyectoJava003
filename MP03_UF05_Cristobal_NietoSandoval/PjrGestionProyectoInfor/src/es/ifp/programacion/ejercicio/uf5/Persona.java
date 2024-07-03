package es.ifp.programacion.ejercicio.uf5;



public abstract class Persona  {

	//Definicion de atributos de la clase Persona
	private String nombre;
	private String apellidos;
	private String dni;
	private int numEmpleado;
	private String idCliente;	
	
	//Constructores
   /**
   * @param nombre
   * @param apellidos
   * @param dni
   * @param idCliente
   * @param numEmpleado
   */	
	//Constructor de Cliente
	public Persona(String nombre,String apellidos,String dni,String idCliente) {              	
	this.nombre=nombre;
	this.apellidos=apellidos;
	this.dni=dni;
	this.idCliente=idCliente;
	}
	//Constructor de jefe de proyecto	
	public Persona(String nombre,String apellidos,String dni,int numEmpleado) {      
		
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.numEmpleado=numEmpleado;		
	}
	
	//Metodos
		
    /**
	* Metodo get que retorna el nombre de la persona correspondiente
	* @return
	*/
	private String getNombre() {
		 
		return this.nombre;
	}
	/**
	 * Metodo get que retorna los apellidos de la persona correspondiente
	 * @return
	 */
	private String getApellidos() {
		 
		 return this.apellidos;
	 }
	/**
	 * Metodo get que retorna el dni de la persona correspondiente 
	 * @return
	 */
	private String getDni() {
		
		return this.dni;
	}
	/**
	 * Metodo get que retorna el Id del cliente
	 * @return
	 */
	public String getIdCliente() {
		
		return this.idCliente;
	}
	/**
	 * Metodo set que establece el Id del cliente
	 * @param idCliente
	 */
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * Metodo get que retorna el numero de empleado del jefe de proyectos
	 * @return
	 */
	public int getNumEmpleado() {
		
		return this.numEmpleado;
	}
	/**
	 * Metodo set que establece el numero de empleado del jefe de proyectos
	 * @param numEmpleado
	 */
	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	/*
	 * Metodo abstracto que retorna el rol de clientes y jefes de proyecto
	 */
	  public abstract String mostrarRol();
		public String  toString() {
				
			
			return "Nombre:"+getNombre()+"\n"+
	               "Apellidos:"+this.getApellidos()+"\n"+
		           "DNI:"+this.getDni()+"\n"+
		            mostrarRol();			
	
			}	
	
	
	
	
	
}
	
	

	

	
	

	
	
	
	
	
	
	
	
	
	

