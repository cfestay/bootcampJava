package paquete3;

import java.util.ArrayList;

import paquete1.IAsesoria;

public class Listado {
	
	private ArrayList<IAsesoria> usuario = new ArrayList<IAsesoria>();
	
	public void addinterface(IAsesoria us) {
       usuario.add(us);	
}
	
	public void analizausua() {
		
		
		for (IAsesoria iaf : usuario) {
			 iaf.analizarUsuario();
			 
			
		}
	}
	
	
}