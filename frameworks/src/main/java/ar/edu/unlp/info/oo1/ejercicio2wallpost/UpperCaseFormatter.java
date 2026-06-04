package ar.edu.unlp.info.oo1.ejercicio2wallpost;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class UpperCaseFormatter extends Formatter{

	@Override
    public String format(LogRecord record) {
        return record.getMessage().toUpperCase() + "\n";
    }
	
}
