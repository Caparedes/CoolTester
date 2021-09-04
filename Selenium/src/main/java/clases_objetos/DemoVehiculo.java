package clases_objetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo minivan = new Vehiculo();
		int rango;
		// Asignando valores
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//calculo de rango asumiendo un tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " +  minivan.pasajeros + " pasajeron con rango de " + rango  + " Kilometros");
		
		Vehiculo carro = new Vehiculo();
		carro.pasajeros = 4;
		
		System.out.println("Numeros en pasjeros en carro es : " + carro.pasajeros);
		
		
	}

}
