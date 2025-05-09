package ar.edu.unlp.info.oo2.ejercicio_14_AccesoALaBaseDeDatos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyTest {
	
	
    private DatabaseAccess database;
	private DatabaseProxy proxy;

	
	@BeforeEach
	public void setUp() throws Exception {
		this.database = new DatabaseRealAccess();
		this.proxy = new DatabaseProxy( database ,"1234" );
	}

	
	@Test
	public void testGetSearchResults() {
		Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.proxy.getSearchResults("select * from comics where id=1");});
		assertEquals("access denied",exceptionPending.getMessage());

		this.proxy.logIn( "1234" );
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
        
        this.proxy.closeSession();
        Exception exceptionPending2 = assertThrows(RuntimeException.class, () -> {this.proxy.getSearchResults("select * from comics where id=10");});
		assertEquals("access denied",exceptionPending2.getMessage());
	}
	
	
    @Test
    public void testInsertNewRow() {
    	Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
		assertEquals("access denied",exceptionPending.getMessage());
		
		this.proxy.logIn( "1234" );
		assertEquals( 3 , this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")) );
        assertEquals( Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3") );
        
        this.proxy.closeSession();
        Exception exceptionPending2 = assertThrows(RuntimeException.class, () -> {this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));} );
		assertEquals( "access denied",exceptionPending2.getMessage());
       
    }


}
