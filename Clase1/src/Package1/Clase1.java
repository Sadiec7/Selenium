package Package1;

public class Clase1 {
	
	public static void main(String[] args) {
		
		//Variables
		//Letras String y char
		//int doubles long short float
		//boleanos solamente pueden ser verdaderos o falsis
		/*String nombre = "Mario"; //comillas dobles para string
		char letra = 'a';
		
		System.out.println(nombre);
		
		int numero = 4;
		char numer2 = '4';
		
		System.out.println(numero);
		System.out.println(numer2);
		
		int suma = numero + 1;
		System.out.println(suma);
		
		String suma2 = numer2 + "b";
		System.out.println(suma2);
		
		/*if (suma >= 5) {
			System.out.println("El numero es mayor o igual a 5");
			
		}
		else {
			System.out.println("El numero es menor que 5");
		}*/
		/*
		for(int i = 0; i <= 100; i = i+1 ) {
			
			if(i%2 == 0) {
				System.out.print(i + " ");
				System.out.println("Es par");
			} else {
				System.out.print(i);
				System.out.print("Es impar");
			}
		
		}
			*/
		/*
		String nombre1 = "Mario";
		char nombreCaracteres[] = new char[5];
	
		nombreCaracteres[0] = 'M';
		nombreCaracteres[1] = 'a';
		nombreCaracteres[2] = 'r';
		nombreCaracteres[3] = 'i';
		nombreCaracteres[4] = 'o';

		System.out.println(nombre1);
		//System.out.println(nombreCaracteres);
		
		System.out.println(nombreCaracteres[0]);
		System.out.println(nombreCaracteres[1]);
		System.out.println(nombreCaracteres[2]);
		System.out.println(nombreCaracteres[3]);
		System.out.println(nombreCaracteres[4]);
		/*
		for(int i = 0;i <nombreCaracteres.length;i++) {
			//System.out.print(i+ "=");
			System.out.println(nombreCaracteres[i]);
		}
		*/
		
		int arreglo[] = {45,5,7,4,19,78};
		int auxiliar = 0;
		
		for(int a = 0; a<arreglo.length ;a++) {
			System.out.print(arreglo[a] + ", ");
		}
		System.out.println("   ");
		for(int i = 0; i<arreglo.length ;i++) {
			for(int j = 0; j<arreglo.length ; j++) {
				if (arreglo[j] > arreglo[j+1] ) {
					auxiliar = arreglo [j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = auxiliar;
				} 
				for(int a = 0; a<arreglo.length ;a++) {
					System.out.print(arreglo[a]+ ", "); 
				}
				System.out.println("   ");
			}
		}
		
		
	}
}
