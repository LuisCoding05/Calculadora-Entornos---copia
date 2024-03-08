import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
		 OperacionesCalculadora funcion = new OperacionesCalculadora();
	        int opcion, num1, num2;
            double a,b,resultado=0;

	        do {
                System.out.println("---------------------------------------------");
	            System.out.println("Esto es una calculadora");
	            System.out.println("Elige una opción");
                System.out.println("---------------------------------------------");
	            System.out.println("1. Sumar");
	            System.out.println("2. Restar");
	            System.out.println("3. Multiplicar");
	            System.out.println("4. Dividir");
	            System.out.println("5. Elevar números");
                System.out.println("6. ");
	            System.out.println("0. Salir");
                System.out.println("---------------------------------------------");
	            opcion = scanner.nextInt();
	            
	            if(opcion > 0 && opcion < 7) {

	                System.out.println("Vamos a operar solamente con dos números sea cual sea la opción.");
                    System.out.println("A continuación introduzca los números.");
                    System.out.println("---------------------------------------------");

	            	System.out.println("Dame el primer número:");
	    	        a = scanner.nextInt();
                    System.out.println("Dame el segundo número:");
	    	        b = scanner.nextInt();

                    num1 = (int) a;
                    num2 = (int) b;

	            	switch (opcion) {
	            	case 1:
	            		resultado = funcion.sumar(a,b);
	            		System.out.println("El resultado de " + a + " + " + b + " = " +  resultado);
	            		break;
	            		
	            	case 2:
	            		resultado = funcion.restar(a,b);
	            		System.out.println("El resultado de " + a + " - " + b + " = " +  resultado );
	            		break;
	            		
	            	case 3:
	            		resultado = funcion.multiplicar(a,b);
	            		System.out.println("El resultado de " + a + " * " + b + " = " +  resultado );
	            		break;
	            		
	            	case 4:
	            		resultado = funcion.dividir(num1,num2);
	            		System.out.println("El resultado de " + num1 + " / " + num2 + " = " + resultado );
	            		break;
                    case 5:
					resultado = funcion.elevar(a,b);
					System.out.println("El resultado de " + num1 + " ^ " + num2 + " = " + resultado );
                    break;
	            	
                    case 6:
                    resultado = a % b;
                    System.out.println("El resto de " + a + " % " + b + " = " + resultado);

	            	}

	            } else if (opcion != 0){
	            	System.out.println("Pon otro número válido");
	            }	else {
	            	System.out.println("Saliendo del programa");
	            }
	        
	        System.out.println("         ");

	        } while (opcion != 0);
	        scanner.close();
    }

}
