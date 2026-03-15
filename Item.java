package entornos;

public class Item {

	/**
	 * Clase que representa un producto individual.
	 */
	
	    private String nombre;
	    private double precio;
	    private static final double PRECIO_MAXIMO = 5000.0; // Punto 7 (Constante)

	    public Item(String nombre, double precio) {
	        if (precio < 0 || precio > PRECIO_MAXIMO) {
	            throw new IllegalArgumentException("Precio no permitido"); // Punto 4 y 6
	        }
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    // Getters y Setters (Punto 4)
	    public String getNombre() { return nombre; }
	    public double getPrecio() { return precio; }

	    @Override
	    public String toString() { // Punto 8
	        return nombre + " - " + precio + "€";
	    }
	}

