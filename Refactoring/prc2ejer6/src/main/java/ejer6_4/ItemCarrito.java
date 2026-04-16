package ejer6_4;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;
       
    
    public double calcularTotal() {
    	return this.producto.getPrecio() * getCantidad();
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }

}
