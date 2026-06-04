package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseAccessProxyTest {
    private DatabaseRealAccess database;
    private DatabaseAccess dbAutenticado;
    private DatabaseAccess dbNoAutenticado;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.dbAutenticado = new DatabaseAccessProxy(this.database, true);
        this.dbNoAutenticado = new DatabaseAccessProxy(this.database, false);
    }

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"),
        		this.dbAutenticado.getSearchResults("select * from comics where id=1"));
        
        assertEquals(Collections.emptyList(),
        		this.dbAutenticado.getSearchResults("select * from comics where id=10"));
        
        assertThrows(RuntimeException.class, () -> {
            dbNoAutenticado.getSearchResults("");
        });

    }

    @Test
    void testInsertNewRow() {
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
}