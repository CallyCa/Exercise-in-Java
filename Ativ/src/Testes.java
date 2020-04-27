
public class Aula04 {
	public static void main(String[] args) {
		Caneta2 c1 = new Caneta2();
		//c1.modelo = "BIC"; << metodo normal irá dar erro caso seja private.
		c1.setModelo("BIC"); // metodo setter ou modificador.
		//c1.ponta = 0.5f; 
		c1.setPonta(0.5f);
		System.out.println("Tenho uma caneta "+ c1.getModelo() + " de Ponta "
		+ c1.getPonta());
		
	}
}
 