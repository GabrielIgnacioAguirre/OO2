# 6.1 Juego
```java
public class EmpleadoTemporario {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    
public double sueldo() {
return this.sueldoBasico
(this.horasTrabajadas * 500) 
(this.cantidadHijos * 1000) 
(this.sueldoBasico * 0.13);
}
}


public class EmpleadoPlanta {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico 
+ (this.cantidadHijos * 2000)
- (this.sueldoBasico * 0.13);
    }
}

public class EmpleadoPasante {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}
```
## Paso 1
### 1. Bad smell : Public Field
```java
public String apellido;
public double sueldoBasico = 0;
public double horasTrabajadas = 0;
public int cantidadHijos = 0;
```
### 2.indique el refactoring
```
encapsulate field
```
### 3.aplicando refactoring
```java
private String nombre;
private String apellido;
private double sueldoBasico = 0;
private double horasTrabajadas = 0;
private int cantidadHijos = 0
```
## Paso 2
### 1. Bad smell: Duplicate code
Las tres comparten atributos en comun(nombre, apellido,
sueldoBasico, cantidadHijos)
### 2.indique el refactoring
´´´
Extract Superclass y Pull Up Field
´´´
### 3. Aplicacion
```java
public class Empleado {
	private String nombre;
	private String apellido;
	protected double sueldoBasico = 0;

	public Empleado() {
		super();
	}
}
public class EmpleadoTemporario extends Empleado {
    private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
    	return this.sueldoBasico
    			+(this.horasTrabajadas * 500) 
    			+(this.cantidadHijos * 1000) 
    			-(this.sueldoBasico * 0.13);
    	}
}
public class EmpleadoPlanta extends Empleado {
	private int cantidadHijos = 0;
	// ......
	
	public double sueldo() {
		return this.sueldoBasico 
				+ (this.cantidadHijos * 2000)
				- (this.sueldoBasico * 0.13);
	}
}
public class EmpleadoPasante extends Empleado {
	
	public double sueldo() {
		return this.sueldoBasico - (this.sueldoBasico * 0.13);
	}
}
```
## Paso 3
### Bad smell: Duplicate code, feature envy
El metodo suedo() se repite en las tres clases hijas.
### refactoring
???? subir comportamiento a la clase padre.
### aplicacion
```java
public class Empleado {
	private String nombre;
	private String apellido;
	protected double sueldoBasico = 0;

	public Empleado() {
		super();
	}
	
	public double sueldo() {
		return this.descuento();
	}
	
	public double descuento() {
		return this.sueldoBasico * 0.13;
	}

}

public class EmpleadoPasante extends Empleado {
}

public class EmpleadoPlanta extends Empleado {
	private int cantidadHijos = 0;
	// ......
	
	public double sueldo() {
		return + super.sueldo() + (this.cantidadHijos * 2000);
	}
}

public class EmpleadoTemporario extends Empleado {
    private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
    	return  super.sueldoBasico + (this.horasTrabajadas * 500) 
    			+(this.cantidadHijos * 1000); 
    	}
}
```
## Paso 4
### Bad smell: Magic numbers
```java
#Los siguientes atributos se usan explicitamente y no se sabe el proposito
this.horasTrabajadas * 500
this.cantidadHijos * 1000
this.cantidadHijos * 2000
```
### Refactoring
replace magic numbers

### Aplicacion
```java
public class Empleado {
	private static final double descuento_sueldo = 0.13;
	private String nombre;
	private String apellido;
	protected double sueldoBasico = 0;

	public Empleado() {
		super();
	}
	
	public double sueldo() {
		return this.descuento();
	}
	
	public double descuento() {
		return this.sueldoBasico * descuento_sueldo;
	}
}
public class EmpleadoPlanta extends Empleado {
	private static final int monto_hijos = 2000;
	private int cantidadHijos = 0;
	// ......
	
	public double sueldo() {
		return + super.sueldo() + (this.cantidadHijos * monto_hijos);
	}
}
public class EmpleadoTemporario extends Empleado {
    private static final int monto_hijos = 1000;
	private static final int monto_horas = 500;
	private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
    	return  super.sueldoBasico + (this.horasTrabajadas * monto_horas) 
    			+(this.cantidadHijos * monto_hijos); 
    	}
}
```