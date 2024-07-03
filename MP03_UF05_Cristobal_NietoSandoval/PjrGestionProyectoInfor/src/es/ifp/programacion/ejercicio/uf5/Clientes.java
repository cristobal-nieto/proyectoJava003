package es.ifp.programacion.ejercicio.uf5;


public class  Clientes extends Persona  {
private String rol;
protected String idCliente;
	public Clientes(String nombre, String apellidos, String dni, String idCliente) {
		super(nombre, apellidos, dni, idCliente);
		this.idCliente = idCliente;
		this.rol=rol;
	
	}
	
	public String getIdCliente() {
        return   idCliente ;
	}
	
	public String toString() {
        return super.toString() + "\nIdentificador de cliente: " + idCliente;
	}
		public String  mostrarRol() {
	     return "ROL:CLI";
	
	
	}
	
	
	}


