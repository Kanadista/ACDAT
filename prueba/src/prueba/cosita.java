package prueba;

import java.util.Scanner;

public class cosita {

	public static void main(String[] args) {


Scanner teclado = new Scanner(System.in);
int numero = 0;
int numero2 = 0;
int i = 0;
int j = 0;
int k = 0;

	
	do{
		System.out.print("Introduce el primer numero: ");
		numero = teclado.nextInt();
		if(numero < 0){
			System.out.print("No es un numero valido");
		}
	}while(numero < 0);
		
	do{
		System.out.print("Introduce el segundo numero: ");
		numero2 = teclado.nextInt();
		if(numero2 < 0){
			System.out.print("No es un numero valido");
		}
		
	}while(numero2 < 0);
	
	for(i = 1; i < numero; i++){
		if(numero % i == 0){
			System.out.println("Los divisores de "+numero+" son: "+i);
		}
	 }
	
	for(j = 1; j < numero2; j++){
		if(numero2 % j == 0){
			System.out.println("Los divisores de "+numero2+" son: "+j);
		}
	 }
	if(numero < numero2){
	for(k = 1; k < numero; k++){
		if((numero % k == 0) && (numero2 % k == 0)){
			System.out.println("Los divisores comunes son:"+k);
		}
		
	 }
	}else{
	for(k = 1; k < numero2; k++){
		if((numero % k == 0) && (numero2 % k == 0)){
			System.out.println("Los divisores comunes son:"+k);
		}
	  }		
	}
  }
	}

