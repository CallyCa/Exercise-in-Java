import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int i,soma=0;
		
		System.out.println("Informe um numero: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num >= 5) {
			System.out.println("Numero eh verdadeiro.\n" + num);
		}else{
			System.out.println(num +" eh um numero eh menor que 5.\n");
			for(i=num; i <= 5;i++){
				System.out.println("Contador "+i);
			}
		}
	}

}
