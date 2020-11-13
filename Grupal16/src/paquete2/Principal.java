package paquete2;

import paquete1.Administrativo;
import paquete1.Cliente;
import paquete1.Profesional;
import paquete1.Usuario;
import paquete3.Listado;

public class Principal {
	
	public static void main(String[] args) {
		
		Listado listado = new Listado();
		
	
   		Usuario u = new Usuario();
		
		u.setNombre("Paola");
        u.setApellido("Urra");
        u.setRun("12560488-5");
        u.setFechaNacimiento("18/05/1977");
        
        Cliente c = new Cliente();
        
        c.setDireccion("Alejandro Flemming 1577");
        c.setComuna("Las Condes");
        c.setTelefono("956525432");
        c.setEdad(43);
        c.setAfp("Cuprum");
        c.setSistemaDeSalud(2);
        
        Profesional p = new Profesional();
        
        p.setTitulo("Ingeniero Comercial");
        p.setFechaDeIngreso("15/09/2016");
        
        Administrativo a = new Administrativo();
        
        a.setArea("Centro Medico");
        a.setExperienciaPrevia("10 años");
        
     
	listado.addinterface(u);
	listado.addinterface(c);
	listado.addinterface(p);
	listado.addinterface(a);
		
	listado.analizausua();
       
	} 
		}
	
	


