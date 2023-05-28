/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_read_text_files;

/**
 *
 * @author Usuario
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EVA3_9_READ_TEXT_FILES {

	public EVA3_9_READ_TEXT_FILES() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "c:\\archivos\\Prueba.txt";
		try {
			readUsingFiles(ruta);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//Imprimir la excepción
		}
		
	}
	/*
	 * Files --> lee todo el archivo u lo carga en la memoria
	 * Principal (RAM). POr tanto, solo sirev con los archivos pequeños.
	 */

	public static void readUsingFiles(String ruta) throws IOException {
		Path path = Paths.get(ruta);
		
		//readAllLines me regresa una lista de tipo String
	/*	List <String> contenidoArch = Files.readAllLines(path);
		//System.out.println(contenidoArch.toString());
		for (int i = 0; i < contenidoArch.size(); i++) {
			System.out.println(contenidoArch.get(i));
		}*/
		byte[] arregloBytes = Files.readAllBytes(path);
		System.out.println(new String (arregloBytes));
		
	}
}

