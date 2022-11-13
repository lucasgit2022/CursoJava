import java.util.Scanner;
import java.util.Locale;

public class main {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System .in);
	
	System.out.print("Digite um nome:");
	String name = sc.nextLine();
	
	System.out.println("Name: " + name);
	
	System.out.print("Digite o primeiro numero: ");
	double number1 = sc.nextDouble();
	
	System.out.print("Digite o segundo numero: ");
	double number2 = sc.nextDouble();
	double sum = number1 + number2;
	
	System.out.printf("Sum = %.2f%n ", sum);

	}

}
