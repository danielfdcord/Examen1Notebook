
package TiendaNotebook;

import java.util.Date;

public class Principal {
    
    public static void main(String[] args) {
        Notebook notebook1=new Notebook ("Toshiba", "Satellite 500", "Intel core i3", 500);
        Notebook notebook2=new Notebook ("HP", "CL32-41","AMD",500);
        Notebook notebook3=new Notebook ("MAC","IO41","IOS",1000);
        
        Date newDate=new Date(2018, 5, 10);
        
        Cliente daniel=new Cliente("Daniel",95276756);
        
        Orden ordenDaniel=new Orden (01,newDate);
        
        DetalleOrden pedido1=new DetalleOrden(notebook1, 20000 , 2);
        DetalleOrden pedido2=new DetalleOrden(notebook2,10000,1);
        
        ordenDaniel.agregarItem(pedido1);
        ordenDaniel.agregarItem(pedido2);
        
        daniel.addOrden(ordenDaniel);
        
        System.out.println("El cliente: "+daniel.getNombre()+"\nDebe pagar: "+ordenDaniel.calculcarTotalOrden());
        
    }
}
