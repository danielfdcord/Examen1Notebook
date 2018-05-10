
package TiendaNotebook;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orden{
    
	private List<DetalleOrden> items = new ArrayList<>();
        
	private Date creacion;
	private Date envio;
	private int id;

	public Orden (int id, Date creacion){
            this.id=id;
            this.creacion=creacion;
	}
	public int getNroItems(){
            return items.size();
	}
	public void agregarItem(DetalleOrden detalle){
            items.add(detalle);
	}
	public void setEnvio(Date envio){
            this.envio=envio;
	}
        
        public float calculcarTotalOrden(){
            
            float precioTotal=0;
            
            for (int i=0;i<getNroItems();i++){
                
                precioTotal=precioTotal + items.get(i).getPrecioUnitario()*items.get(i).getCantidad();
                
            }
            return precioTotal;
        }
}
