package es.ifp.programacion.ejercicio.uf5;


public class JefesDeProyecto extends Persona {
	private String rol;
	protected int numEmpleado;
	public JefesDeProyecto(String nombre, String apellidos, String dni, int numEmpleado) {
		super(nombre, apellidos,dni, numEmpleado);
		this.numEmpleado=numEmpleado;
		this.rol=rol;		
		
	}

public int getNumEmpleado() {
    return   numEmpleado ;
}

public String toString() {
    return super.toString() +"\nNúmero de empleado: " + numEmpleado;

}	
	
	public String  mostrarRol() {
	     return "ROL:JP";
}
}