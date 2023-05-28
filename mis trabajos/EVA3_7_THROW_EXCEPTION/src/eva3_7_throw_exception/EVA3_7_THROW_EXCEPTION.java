/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_throw_exception;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class EVA3_7_THROW_EXCEPTION {

	public EVA3_7_THROW_EXCEPTION() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prueba P = new Prueba();//Si P estuviese declarado dentro de try no podira imprimirlo en el while,
		do {
		try {
			Scanner input = new Scanner(System.in); 
			System.out.println("Introduzca un valor: ");
			int valor = input.nextInt();
			P.setValor(valor);
			break;
		} catch (Exception e) {// esl asuperclase de todas las excepciones, por tanto, captura todas as excepciones
								//Complica detectar el tipo de excepcion, y dar la solucion correcta
			System.out.println(e.getMessage());
		}
		}while(true);
			System.out.println("El valor es: " + P.getValor());
	}

}


class Prueba{
	private int valor;

	public int getValor() {
		return valor;
	}
	//checked exception: 

	//unchecked exceptions: errores de lógica
	 //Fallos del programador
	
	public void setValor(int valor) throws Exception {
		if (valor < 0)
			throw new Exception("El valor " + " es inávildo. Debe ser mayor o igual a cero");
		else
		this.valor = valor;
	}
	
	
}