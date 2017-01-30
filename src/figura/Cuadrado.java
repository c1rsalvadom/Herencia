package figura;

public class Cuadrado {
			
		private double 			lado;
		
		
		public Cuadrado(double b){
			
			lado   = 			b;
		
			
			//Atributo de Figura
			numeroDeLados 		=4;
			
			//Variable global
			numeroDeFiguras++;
		}
		
		public double area () {
			return lado*lado;
		}
		
		public String toString(){
			return "Valores del triangulo\n" +
					"----------------------- "+
					"Base= " + base + "\n" +
					"Altura= " + altura + "\n" +
					"Area= " + area + "\n" +
					"Numero de Lados= " + numeroDeLados + "\n" +
					"Figuras Totales= " + numeroDeFiguras;				
		}

	}

}
