# Ejercicio 6.5
## Iteracion 1
### Bad smaell:
features envy
### Refactorings:
move method
### Aplicacion:
```java
public class Direccion {
	private String localidad;
	private String calle;
	private String numero;
	private String departamento;
	
	public String getDireccionFormateada(Cliente cliente) {
		return 
			getLocalidad() + ", " +
			getCalle() + ", " +
			getNumero() + ", " +
			getDepartamento();
    }
}
public class Cliente {
	Direccion direccion;  
}
```
## Iteracion 2
### Bad smell:
lazy class
### Refactoring
inline class??
### Aplicacion
```java
public class Direccion {
	private String localidad;
	private String calle;
	private String numero;
	private String departamento;
	
	public String getDireccionFormateada() {
		return 
			getLocalidad() + ", " +
			getCalle() + ", " +
			getNumero() + ", " +
			getDepartamento();
    }
}

public class Supermercado {

    public void notificarPedido(long nroPedido, Direccion direccion) {

        String notificacion = MessageFormat.format(
            "Estimado cliente, se le informa que hemos recibido su pedido con número {0}, " +
            "el cual será enviado a la dirección {1}",
            new Object[] { nroPedido, direccion.getDireccionFormateada() }
        );

        // lo imprimimos en pantalla, podría ser un mail, SMS, etc..
        System.out.println(notificacion);
    }
}
```