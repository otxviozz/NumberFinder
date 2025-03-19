package NumberFinder;

import java.util.Scanner;
public class NumberFinder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		boolean aparecer = false;
		
		for(int i=0; i<9;i++) {
			int numero = (int) (Math.random() * 100) + 1;
			numeros[i] = numero;
		}
		System.out.println("\nSEQUÊNCIA DE NÚMEROS:");
		for(int i=0; i<numeros.length;i++) {
			System.out.print(" | "+ numeros[i]);
				}
		System.out.println("\nDigite um número a ser encontrado na Array: ");
		int numeroencontrado = scan.nextInt();
		System.out.println("\nINICIANDO BUSCA...");
		
		for(int i = 0; i<numeros.length; i++){
			if(numeros[i] == numeroencontrado){
				System.out.println("O número " + numeroencontrado + " foi encontrado na "
						+"posição "+(i+1)+".");
				aparecer = true;
				break;
			}
			}
		if (aparecer == false) {
		System.out.println("Número não encontrado.");	
		}
		scan.close();
	}
}

