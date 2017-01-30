package figura;
import miLibreria.Entrada;

public class EjemploHerencia {

		public static void main(String[] args){
			// TODO Auto-generated method stub
			Entrada entrada = new Entrada();
			Cuadrado cuadrado;
			Triangulo triangulo;
			
			System.out.println("Introduccióin de los datos de la figura:");
			triangulo = new Triangulo(entrada.obtenerFloat("Dame la altura:"),entrada.obtenerFloat("Dame la base"),entrada.obtenerFloat("Dame la altura"));
			
			System.out.println(triangulo.toString());
			
			System.out.println("Introduccióin de los datos de la figura:");
			triangulo = new cuadrado(entrada.obtenerFloat("Dame la altura:"),entrada.obtenerFloat("Dame la base"),entrada.obtenerFloat("Dame la altura"));
			
			System.out.println(cuadrado.toString());
		}
}
