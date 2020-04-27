import java.util.Scanner;

public class Aula02{
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC cristal";
		c1.cor = "Preto";
		c1.carga = 80;
		c1.destampar();
		c1.status();
		c1.rabiscar();
	}
	
	
}