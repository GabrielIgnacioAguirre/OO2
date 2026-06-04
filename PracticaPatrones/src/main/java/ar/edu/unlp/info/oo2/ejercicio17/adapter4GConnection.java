package ar.edu.unlp.info.oo2.ejercicio17;

public class adapter4GConnection implements Connection{
	
	private Connection4G conn;
	
	@Override
	public String sendData(String data, long crc) {
		return conn.transmit(data, crc);
	}

	@Override
	public String pict() {
		return conn.getSymb();
	}
}
