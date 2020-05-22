package EEDD;

/**
 * 
 * @author Nayra Deniz
 *
 */

public class Libro {

	String titulo;
	String ISBN;
	String autor;
	String editorial;

	public Libro(String titulo, String ISBN, String autor, String editorial)

	{
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.autor = autor;
		this.editorial = editorial;
	}

	/**
	 * Check ISBN 10. Comprueba si un isbn es de 10 caracteres
	 *
	 * @return true si lo es
	 */
	public boolean checkISBN10() {
		boolean result = false;
		int calculo = 0;
		int dc = 0;
		if (this.ISBN.length() == 10) {
			for (int i = 0; i < 9; i++) {
				int pos = Integer.parseUnsignedInt(String.valueOf(this.ISBN.charAt(i)));
				calculo += pos * (i + 1);
			}

			if (this.ISBN.charAt(9) == 'X')
				dc = 10;
			else
				dc = Integer.parseUnsignedInt(String.valueOf(this.ISBN.charAt(9)));

			if (calculo % 11 == dc)
				result = true;
		}

		return result;
	}

	/**
	 * Check ISBN 13. Comprueba si un isbn es de 13 caracteres
	 *
	 * @return true si lo es
	 */
	public boolean checkISBN13() {
		boolean result = false;
		int pares = 0;
		int impares = 0;

		if (this.ISBN.length() == 13) {
			for (int i = 0; i < 13; i++) {
				int pos = Integer.parseUnsignedInt(String.valueOf(this.ISBN.charAt(i)));
				if ((i + 1) % 2 == 0)
					pares += pos;
				else
					impares += pos;

			}

			if ((impares + 3 * pares) % 10 == 0)
				result = true;
		}

		return result;
	}

}
