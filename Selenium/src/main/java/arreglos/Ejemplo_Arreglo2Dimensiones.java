package arreglos;

public class Ejemplo_Arreglo2Dimensiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arreglo una dimension
		int [] intArray = new int[] {1,2,3,4,5};
		
		//declarando e inicializand arreglo en 2d
		int arr[][] = { {2,5,7}, 
						{4,8,7},
						{8,3,4}};
		
		//System.out.println(arr[2][1]);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		}

}
