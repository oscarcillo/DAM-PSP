/**
 * Process & ProcessBuilder
 * Ejecutar una aplicación del S.O.
 */
package creacion;

/**
 * @author franlu
 *
 */

import java.io.IOException;

public class ejecutarApp {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		final String orden[] = {"ls", "/"};
		Process proceso = new ProcessBuilder(orden).start();

		// WINDOWS
		//Process proceso = new ProcessBuilder("NOTEPAD").start();
	}

}