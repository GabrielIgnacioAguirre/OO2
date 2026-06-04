package ar.edu.unlp.info.oo1.ejercicio2wallpost;

import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FilterHandler extends Handler{
	private Handler handler;
    private List<String> palabrasProhibidas;
    
    public FilterHandler(Handler handler, List<String> palabrasProhibidas) {
        this.handler = handler;
        this.palabrasProhibidas = palabrasProhibidas;
    }
    
	@Override
	public void publish(LogRecord record) {
	    String mensaje = record.getMessage();
	    
	    for (String palabra : palabrasProhibidas) {
	        mensaje = mensaje.replace(palabra, "***");
	    }
	    
	    record.setMessage(mensaje);
	    this.handler.publish(record);
	}

	@Override
	public void flush() {
		this.handler.flush();
	}

	@Override
	public void close() throws SecurityException {
		this.handler.close();
	}

}