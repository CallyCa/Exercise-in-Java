import java.util.Scanner;
public class Ex1 {
	
	public String modelo;
	public String cor;
	private float preco;
	
	public Ex1(String m, String c, float p) {
		System.out.println("Informe o modelo do carro: ");
		Scanner in = new Scanner(System.in);
		m = in.nextLine();
		this.modelo = m;
		System.out.println("Informe a cor do carro: ");
		Scanner in1 = new Scanner(System.in);
		c = in.nextLine();
		this.cor = c;
		System.out.printf("Informe o preco do carro: ");
		Scanner in2 = new Scanner(System.in);
		p = in.nextFloat();
		this.preco = p;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public String setModelo(String m) {
		return this.modelo = m;
	}
	public String getCor() {
		return this.cor;
	}
	public String setCor(String c) {
		return this.cor = c;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public float setPreco(float p) {
		return this.preco = p;
	}
	
	public void status() {
		System.out.println("Tipo do carro\n");
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Cor: "+ this.cor);
		System.out.println("Preco: " + this.preco);
	}
	
	

}
