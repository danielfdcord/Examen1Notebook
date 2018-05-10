
package TiendaNotebook;

public class Notebook {
    
        private String marca;
	private String modelo;
	private String procesador;
	private float tamanioDisco;
        
	public Notebook(String marca, String modelo, String procesador, float tamanioDisco){
	this.marca= marca;
	this.modelo=modelo;
	this.procesador=procesador;
	this.tamanioDisco=tamanioDisco;
}
	public String getMarca(){
		return this.marca;
	}
	public String getModelo(){
		return this.modelo;
	}
	public String getProcesador(){
		return this.procesador;
	}
	public float getTamanioDisco(){
		return this.tamanioDisco;
	}
}
