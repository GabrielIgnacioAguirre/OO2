package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess{
	private DatabaseRealAccess db;
	private boolean autenticado;
	
	public DatabaseAccessProxy(DatabaseRealAccess db, boolean a) {
		this.db = db;
		this.autenticado = a;
	}
	
	public void estaAutenticado() {
		if (!this.autenticado) {
			throw new RuntimeException("No estas autenticado");
		}
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		this.estaAutenticado();
		return db.getSearchResults(queryString);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		this.estaAutenticado();
		return db.insertNewRow(rowData);
	}

}
