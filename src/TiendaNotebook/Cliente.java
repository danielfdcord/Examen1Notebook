
package TiendaNotebook;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
        private String nombre;
	private int dni;
        
	private List<Orden>ordenes=new ArrayList<>();
	
	public Cliente(String nombre, int dni){
	this.nombre=nombre;
	this.dni=dni;
	}
	
	public void addOrden(Orden obj){
		ordenes.add(obj);
	}
	public String getNombre(){
		return this.nombre;
	}
	public int getDni(){
		return this.dni;
	}
	
}
