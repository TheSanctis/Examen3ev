package EEDD;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LibroTest {

	@Test
	void testLibro() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName(value = "Titulo: Manual Arduino ISBN:9788868953409")
	void testCheckISBN13true() {
		Libro libro = new Libro("Manual Arduino", "9788868953409", "Paolo  Aliverti", "LSWR");
		assertTrue(libro.checkISBN13());
	}

	@Test
	@DisplayName(value = "Titulo: Manual Arduino ISBN:978886894564553409")
	void testCheckISBN13false() {
		Libro libro = new Libro("Manual Arduino", "978886894564553409", "Paolo  Aliverti", "LSWR");
		assertFalse(libro.checkISBN13());
	}

}
