package metodos;

public class Ejemplo_Metodos {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int resultado = suma(5,9);
		System.out.println(resultado);
		
		int resultado2 = suma(10,9);
		System.out.println(resultado2);
		
		int resultado3 = suma(5,8);
		System.out.println(resultado3);
		
		String carros = carro(3);
		System.out.println(carros);
		*/
		int resultadoSuma = suma(5,9,60);
		System.out.println(resultadoSuma);

	}//Overloading Metodos con el mismo nombre pero diferente parametros 
	
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
		
	}
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static String carro(int a ) {
		String[] cars= {"Volvo", "BMW", "Ford", "Mazda"};
		return cars[a];
	}

}
