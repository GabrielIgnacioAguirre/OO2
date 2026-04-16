package ejer6_4;

import java.util.List;

public class Carrito {
    private List<ItemCarrito> items;
    
    public double total() {
    	return this.items.stream()
    			.mapToDouble(item -> item.calcularTotal()).sum();
    }
}
