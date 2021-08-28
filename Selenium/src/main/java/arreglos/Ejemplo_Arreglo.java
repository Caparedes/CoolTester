package arreglos;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
		// declaraciones validas TODO Auto-generated method stub
		
		int intArray[];
		int[] intArray2;
		
		//Declarar un arrray de strings
		String[] arr;
		// asignar memoria para 5 enteros
		arr= new String[5];
		
		//inicializa el primer elemento del array
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		//System.out.println("Elemnto en el indice 2: " + arr[1]);
		
		for (int i= 0; i < arr.length; i++ ) {
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		}
		
		
	}

}
