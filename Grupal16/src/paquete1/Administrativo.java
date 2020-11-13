package paquete1;



public class Administrativo extends Usuario {
	
	private String area;
	private String experienciaPrevia;
	
	public Administrativo() {
		super();
	}
		
	public Administrativo(String nombre, String apellido, String run, String fechaNacimiento, String area,
			String experienciaPrevia) {
		super(nombre,apellido,run,fechaNacimiento);
				
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
		
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		
		System.out.println("Area: " + this.area);
		System.out.println("Experiencia Previa " + this.experienciaPrevia);
		
			
    }
	
}