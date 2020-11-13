package paquete1;

public class Profesional extends Usuario {
	
	private String titulo;
	private String fechaDeIngreso;
	
	public Profesional() {
		super();
	}
		
	public Profesional(String nombre, String apellido, String run, String fechaNacimiento, String titulo,
			String fechaDeIngreso) {
			super(nombre,apellido,run,fechaNacimiento);
		
		this.titulo = titulo;
		this.fechaDeIngreso = fechaDeIngreso;
	}
	
		public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
		
	@Override
	public void analizarUsuario() {
    super.analizarUsuario();
    
    System.out.println("Titulo: " + this.titulo);
    System.out.println("Fecha Ingreso: " + this.fechaDeIngreso);
}
}