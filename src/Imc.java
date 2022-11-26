
public class Imc {
	
	public static void main(String[] args) {
		 Pessoa[] p = new Pessoa[2];
		
		p[0] = new Pessoa("Misael Rodrigues dos anjos", 1.68, 79);		
		p[1] = new Pessoa("Juliana Lima de Sousa dos Anjos", 1.48, 54);
		
		p[0].resultado();
		p[1].resultado();
		
	}
}
