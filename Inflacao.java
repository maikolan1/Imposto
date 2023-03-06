package curso_progamacao;

import java.util.Scanner;
import java.util.Locale;

public class Inflacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		double r, i;
		
		System.out.println("Digite sua renda: ");
		r= sc.nextDouble();
		
		if(r>0&&r<=2000) {
			System.out.println("ISENTO");
		}
		else if(r>2000.01&&r<=3000) {
			i= r-2000;
			System.out.printf("R$%.2f", i*0.08);
		}
		else if(r>3000.01&&r<=4500) {
			i=r-3000;
			System.out.printf("R$%.2f", i*0.18+1000*0.08);
		}
		else if(r>4500) {
			i= r-4500;
			System.out.printf("R$%.2f", (i*0.28) + (1500 * 0.18) + (1000 * 0.08));
		}
		sc.close();
	}

}
