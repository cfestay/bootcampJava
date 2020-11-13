package paquete1;

public class Usuario implements IAsesoria {

	
	private String nombre;
	private String apellido;
	private String run;
	private String fechaNacimiento;
	
	public Usuario(){
	
	}
	
    public Usuario(String nombre, String apellido, String run, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.run = run;
		this.fechaNacimiento = fechaNacimiento;
	}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getRun() {
	return run;
}

public void setRun(String run) {
	this.run = run;
}

public String getFechaNacimiento() {
	return fechaNacimiento;
}

public void setFechaNacimiento(String fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}

	@Override
	public void analizarUsuario() {
		
	System.out.println("nombre Usuario " + this.nombre);
	System.out.println("apellido Usuario " + this.apellido);
	System.out.println("run Usuario " + this.run);
	System.out.println("fechaNacimiento " + this.fechaNacimiento);
	
	
		
   }
	
	
}