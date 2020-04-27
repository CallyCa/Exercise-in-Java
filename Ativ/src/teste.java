import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		
		int i,count=0;
		float soma=0;
		float media,mediaF;
		
		System.out.println("Informe um numero: ");
		Scanner in = new Scanner(System.in);
		int nume = in.nextInt();
		for(i=1;i < nume;i++) {
			System.out.printf("Informe nota %d:\n ",i);
			Scanner in1 = new Scanner(System.in);
			float num = in.nextFloat();
			float[] nums = new float[i];
			soma+=num;
			count+=1;
			
		}media = soma / count;
		
		if(media >= 7) {
			System.out.printf("Media = %5.0f\n",media);
		}if(media < 5) {
			System.out.println("Informe a nota de A.F: ");
			Scanner in2 = new Scanner(System.in);
			float n3 = in.nextFloat();
			mediaF = (n3 + media) / 2;
			if(mediaF >= 5) {
				System.out.printf("Aprovado\n");
				System.out.printf("Media:%5.2f\n",mediaF);
			}else {
				System.out.printf("Reprovado\n");
				System.out.printf("Media:%5.2f\n",mediaF);
			}
		}
	}
}
