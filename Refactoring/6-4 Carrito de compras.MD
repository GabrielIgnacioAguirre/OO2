# ejercicio 6-4
## Bad smell: message chain y features envy
## refactoring
Replace Temp With Query y move method ??
## Aplicacion
```java
public class Carrito {
    private List<ItemCarrito> items;
    
    public double total() {
    	return this.items.stream()
    			.mapToDouble(item -> item.calcularTotal()).sum();
    }
}
public class ItemCarrito {
    private Producto producto;
    private int cantidad;
       
    
    public double calcularTotal() {
    	return this.producto.getPrecio() * getCantidad();
    }
``` 
dudas: Middle Man no va??