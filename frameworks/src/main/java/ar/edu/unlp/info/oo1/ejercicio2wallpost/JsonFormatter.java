package ar.edu.unlp.info.oo1.ejercicio2wallpost;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JsonFormatter extends Formatter {
	
	public JsonFormatter() {
	}

	@Override
	public String format(LogRecord record) {
	    return "{ \"message\": \"" + record.getMessage() + "\", \"level\": \"" + record.getLevel().toString().toLowerCase() + "\" }";
	}
}
