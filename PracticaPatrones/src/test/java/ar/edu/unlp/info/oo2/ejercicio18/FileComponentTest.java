package ar.edu.unlp.info.oo2.ejercicio18;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio19.*;

class FileComponentTest {
	private File fileOO2;
	private FileDecorator nombreDecorator;
	private FileDecorator extensionDecorator;
	private FileDecorator tamDecorator;
	private FileDecorator fechaCreacionDecorator;
	private FileDecorator fechaModificacionrator;
	private FileDecorator permisosDecorator;
	private FileDecorator todosLosDecoradores;
	private FileDecorator todosLosDecoradores2;

	@BeforeEach
	void setUp() throws Exception {
		this.fileOO2 = new FileOO2("file",".exe","500",LocalDate.of(2025, 4, 29),LocalDate.of(2025, 4, 29),"user");
		this.extensionDecorator = new Extension(this.fileOO2);
		this.tamDecorator = new Tamaño(this.fileOO2);
		this.fechaCreacionDecorator = new FechaCreacion(this.fileOO2); 
		this.fechaModificacionrator = new FechaModificacion(this.fileOO2);
		this.permisosDecorator = new Permisos(this.fileOO2);
		this.todosLosDecoradores = new Permisos(new FechaModificacion(new FechaCreacion(new Tamaño(new Extension(new Nombre(fileOO2))))));
		this.todosLosDecoradores2 = new Nombre(new FechaModificacion(new FechaCreacion(new Tamaño(new Extension(new Permisos(fileOO2))))));
	}

	@Test
	void testPrettyPrintUnDecorador() {
		//nombre - extension
		assertEquals("file - .exe",this.extensionDecorator.prettyPrint());
		//nombre - tamaño 
		assertEquals("file - 500",this.tamDecorator.prettyPrint());
		//nombre - fecha creacion
		assertEquals("file - 2025-04-29",this.fechaCreacionDecorator.prettyPrint());
		//nombre - fecha modificacion
		assertEquals("file - 2025-04-29",this.fechaModificacionrator.prettyPrint());
		//nombre - permisos
		assertEquals("file - user",this.permisosDecorator.prettyPrint());
	}
	
	@Test
	void testPrettyPrintSinDecoraciones() {
		assertEquals("file",this.fileOO2.prettyPrint());
	}

	@Test
	void testPrettyPrintCompleto() {
		assertEquals("file - .exe - 500 - 2025-04-29 - 2025-04-29 - user", this.todosLosDecoradores.prettyPrint());
		assertEquals("file - user - .exe - 500 - 2025-04-29 - 2025-04-29", this.todosLosDecoradores2.prettyPrint());
	}
}