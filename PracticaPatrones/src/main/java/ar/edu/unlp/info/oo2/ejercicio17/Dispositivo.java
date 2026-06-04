package ar.edu.unlp.info.oo2.ejercicio17;

public class Dispositivo {

    private EstrategiaCRC crcCalculator;
    private Ringer ringer;
    private Connection connection;
    private Display display;
    
	public Dispositivo(EstrategiaCRC crcCalculator, Ringer ringer, Display display, Connection connection) {
		this.crcCalculator = crcCalculator;
		this.ringer = ringer;
		this.display = display;
		this.connection = connection;
	}
    
	public String send(String data)
	{
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	public void connection(Connection conn) {
		this.connection = conn;
		this.display.showBanner(conn.pict());
	}
    public void setEstrategiaCRC(EstrategiaCRC estrategia) {
        this.crcCalculator = estrategia;
    }

	public EstrategiaCRC getCrcCalculator() {
		return crcCalculator;
	}

	public void setCrcCalculator(EstrategiaCRC crcCalculator) {
		this.crcCalculator = crcCalculator;
	}
    
    
    
}
