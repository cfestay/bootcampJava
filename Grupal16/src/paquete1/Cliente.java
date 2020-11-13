package paquete1;

public class Cliente extends Usuario {
	
		
	private String telefono;
	private String direccion;
	private String comuna;
	private int edad;
	private String afp;
	private int SistemaDeSalud;

    public Cliente() {
		
	}
	
	public Cliente(String nombre,String apellido,String run,String fechaNacimiento,String telefono, String direccion, String comuna, int edad, String afp, int sistemaDeSalud) {
		super(nombre,apellido,run,fechaNacimiento);
		
		this.telefono = telefono;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
		this.afp = afp;
		this.SistemaDeSalud = sistemaDeSalud;
	}

		public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public int getSistemaDeSalud() {
		return SistemaDeSalud;
	}
	public void setSistemaDeSalud(int sistemaDeSalud) {
		SistemaDeSalud = sistemaDeSalud;
	}
	
	
	@Override
	public void analizarUsuario() {
	
		super.analizarUsuario();
		
				
		System.out.println("Telefono: " + telefono);
		System.out.println("Direccion; " + direccion);
		System.out.println("Comuna: " + comuna);
		System.out.println("Edad: " + edad);
		System.out.println("AFP: " + afp);
		System.out.println("Sistema de Salud: " + SistemaDeSalud);
		
		
	}	

}
