package entornos;

import java.util.ArrayList;
import java.util.List;

public class CarritosDeCompra {


	
	    private List<Item> items;
	    private static final String CABECERA = "Detalles del carrito:"; 

	    public void CarritoDeCompras() {
	        this.items = new ArrayList<>();
	    }

	    public void agregarItem(Item item) {
	        items.add(item);
	    }

	    public void removerItem(Item item) { 
	        if (!items.contains(item)) {
	            System.out.println("Error: El item no existe en el carrito.");
	        } else {
	            items.remove(item);
	        }
	    }

	    public double calcularTotal() { 
	        double total = 0;
	        for (Item item : items) {
	            total += item.getPrecio();
	        }
	        return total;
	    }

	    public void imprimirDetalle() {
	        System.out.println(CABECERA);
	        for (Item item : items) {
	            System.out.println(item.toString()); 
	        }
	        System.out.println("Total: " + calcularTotal() + "€");
	    
	}
}

