import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MedianaDaListaAleatoria {
	
	static int numeros[];
	static int numElementos;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserir número ímpar para gerar números aleatórios: ");
		int inserirElementos = sc.nextInt();
		sc.close();
		numeros = new int[inserirElementos];
		numElementos = numeros.length;
		inicializar();
	//	visualizar();
		Arrays.sort(numeros);
		visualizar();
		System.out.printf("%n%nO elemento central (mediana) entre os "
				+ "números aleatórios é o número (%.0f)", 
				calcularMediana());
	}
	
	private static double calcularMediana() {
		double mediana;
		if(numElementos % 2 == 0) {
			int somaMedios = numeros[numElementos / 2] +
					numeros[numElementos / 2 - 1];
			mediana = (double)somaMedios / 2;
		}else {
			mediana = numeros[numElementos / 2];
		}
		return mediana;
	}
		
	private static void visualizar() {
		System.out.println();
		for (int i=0; i < numElementos; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
	
	private static void inicializar() {
		Random r = new Random();
		for (int i = 0; i < numElementos; i++) {
			numeros[i] = r.nextInt(100) + 1;
		}
	}
}

