package herencia;

public class Lados3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1 = new Triangulo();
		
		t1.base = 4.0;
		t1.altura = 4.0;
		t1.estilo = "Estilo 1";
		
		System.out.println("Informacion para t1 ");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es : " + t1.area());
		
		System.out.println();
		
		Triangulo t2 = new Triangulo();
		
		t2.base = 8.0;
		t2.altura = 12.0;
		t2.estilo = "Estilo 2";
		
		System.out.println("Informacion para t2 ");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es : " + t2.area());

	}

}
