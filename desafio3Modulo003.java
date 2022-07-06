import java.util.Scanner;

public class desafio3Modulo003 {

	public static void main(String[] args) {
		
		String usuario="Pepito", contraseña="1234";
		
		Scanner teclado = new Scanner(System.in);
		
		   if(usuario.equals("Pepito") & contraseña.equals("1234")) 
		  { System.out.println("Bienvenido Pepe!!"); }
		   if(!(usuario.equals("Pepe")) & contraseña.equals("1234")) 
		  { System.out.println("usuario incorrecto"); }
		   if(usuario.equals("Pepito") & !(contraseña.equals("6534"))) 
		  { System.out.println("Contraseña incorrecta"); }


	}

}
