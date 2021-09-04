package herencia;

public class Triangulo extends Dosdimensiones{
	
	String estilo;
	
	double area() {
		return base*altura/2;// aqui se accede a las variables de la superclase (Dosdimaneiones)
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es:" + estilo);
	}

}
