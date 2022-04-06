package ejerciciosBasicos;

public class BasicJava {

	public static void main(String[] args) {
		
		//Imprimir 1 - 255 - Ejercicio 1
//		for (int i = 1; i <= 255; i++) {
//
//			System.out.println(i);
//
//		}
		
       //Imprimir los Números Impares Entre 1 - 255 - Ejercicio 2
//		for (int x = 1; x <= 255; x++) {
//			if (x % 2 != 0) {
//				System.out.println(x);
//			}
//
//		}
		
       //Imprimir la Suma - Ejercicio 3
//		int suma = 0;
//		for (int j = 0; j <= 255; j++) {
//			suma = suma + j;
//			System.out.println("Nuevo numero: " + j + " Suma: " + suma);
//		}
		
       //Recorrer un Arreglo - Ejercicio 4
//		int Arreglo[] = { 1, 3, 5, 7, 9, 13 };
//		for (int a = 0; a < Arreglo.length; a++) {
//			System.out.println(Arreglo[a]);
//		}
		
	   //Encontrar el Máximo - Ejercicio 5
//		Scanner valor = new Scanner(System.in);
//
//		System.out.print("Ingresar el tamaño del arreglo: ");
//		int n = valor.nextInt();
//		int arr[] = new int[n];
//
//		for (int b = 0; b < arr.length; b++) {
//			System.out.print("Ingresar dato " + (b + 1) + ": ");
//			arr[b] = valor.nextInt();
//		}
//
//		int mayor;
//		mayor = arr[0];
//
//		for (int c = 0; c < arr.length; c++) {
//			if (arr[c] > mayor) {
//				mayor = arr[c];
//			}
//		}
//		System.out.println("El mayor valor es: " + mayor);
		
	   //Obtener el Promedio - Ejercicio 6
//		int arreglo[] = { 2,10,3 };
//		int sum = 0;
//		
//		for (int x = 0; x < arreglo.length; x++) {
//			  sum = sum + arreglo[x];
//			}
//		float promedio = sum / arreglo.length;
//		System.out.printf("El promedio es: %f", promedio);
		
	   //Arreglo con Números Impares - Ejercicio 7
//		int[] Arregl = new int[255];
//		for (int y = 1; y <= Arregl.length; y++) {
//			if (y % 2 != 0) {
//			System.out.println(y);
//			}
//		}
  
	   //Mayor que Y - Ejercicio 8
//		int Arreg[] = { 1 , 3 , 5 ,7 };
//        for (int y = 0; y < Arreg.length; y++) {
//        	System.out.println(y);
//        	//System.out.println(Arreg[y]);
//        }
		
	   //Valores al Cuadrado - Ejercicio 9
//		int a[] = { 1 };
//		int b[] = { 5 };
//		int c[] = { 10 };
//		int d[] = { -2 };
//
//		int resultado = 0;
//		for (int i = 0, len = a.length; i < len; i++) {
//			resultado = (a[i] * a[i]);
//		}
//		System.out.print(resultado + ",");
//
//		for (int i = 0, len = b.length; i < len; i++) {
//			resultado = (b[i] * b[i]);
//		}
//		System.out.print(resultado + ",");
//
//		for (int i = 0, len = c.length; i < len; i++) {
//			resultado = (c[i] * c[i]);
//		}
//		System.out.print(resultado + ",");
//
//		for (int i = 0, len = d.length; i < len; i++) {
//			resultado = (d[i] * d[i]);
//		}
//		System.out.print(resultado);
		
	   //Mínimo, Máximo y Promedio  - Ejercicio 11
		int arreglo[] = { 1,5,10,-2 };
		int mayor;
		int menor;
		int sum = 0;
		
		mayor = arreglo[0];
		menor = arreglo[0];
		
		for (int c = 0; c < arreglo.length; c++) {
			if (arreglo[c] > mayor) {
				mayor = arreglo[c];
			}
		}
		System.out.println("El mayor valor es: " + mayor);
		
		for (int o = 0; o < arreglo.length; o++) {
			if (arreglo[o] < menor) {
				menor = arreglo[o];
			}
		}
		System.out.println("El menor valor es: " + menor);
		
		for (int x = 0; x < arreglo.length; x++) {
			  sum = sum + arreglo[x];
			}
		float promedio = sum / arreglo.length;
		System.out.printf("El promedio es: %f", promedio);
		
	}
	

}
