# Ejercicio 6.2
## Iteracion 1
### Bad smell: feature envy, public field
La clase Jugador tiene sus atributos como public.
### Refactoring
Aplicamos Encapsulate Field
### Aplicacion
```java
public class Jugador {
    private String apellido;
    private int puntuacion = 0;
    private String nombre;
}
```

## Iteracion 2
### Bad smell: feature envy
La clase Juego utiliza atributos de Jugador como si fueran propios.
### Refactoring
Aplicamos move method
### Aplicacion

```java
public class Juego {
	// comportamiento
	public void incrementar(Jugador j) {
		j.incrementar();
	}
	
	public void decrementar(Jugador j) {
		j.decrementar();
	}
}

public class Jugador {
    private String apellido;
    private int puntuacion = 0;
    private String nombre;
    
	public void incrementar() {
	    setPuntuacion(getPuntuacion() + 100);
	}
	public void decrementar() {
	    setPuntuacion(getPuntuacion() - 50);
	}
}
```

## Iteracion 3
### Bad smell: magic numbers
La clase utiliza valores ....
### Refactoring
Aplicamos replace magic numbers
### Aplicacion
````java
public class Jugador {
    private static final int restar_puntuacion = 50;
	private static final int sumar_puntuacion = 100;
	private String apellido;
    private int puntuacion = 0;
    private String nombre;
    
	public void incrementar() {
	    setPuntuacion(getPuntuacion() + sumar_puntuacion);
	}
	public void decrementar() {
	    setPuntuacion(getPuntuacion() - restar_puntuacion);
	}
}
//Juego lazy class??
```