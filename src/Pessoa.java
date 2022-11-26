
public class Pessoa {

	private String nome;
	private double altura;
	private double peso;
	private double imc;
	private double pesoIdeal;

	// Método construtor

	public Pessoa(String nome, double altura, double peso) {
		this.setNome(nome);
		this.setAltura(altura);
		this.setPeso(peso);
	}

	// Métodos Espéciais

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {		
		this.imc = imc;		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Métodos públicos

	public void resultado() {
		imc = peso/(altura*altura);
	
		System.out.println("----------------Seu Resultado-----------------");
		System.out.println("Nome: " + this.getNome());
		System.out.printf("Seu IMC: %.2f %n", this.getImc());
		
		if (imc < 18.5) {			
			System.out.println("Abaixo do peso ideal. \n");
		} else if (imc >= 18.5 && imc < 24.9) {
			System.out.println("Parabéns, você está no peso ideal. \n");
		} else {
			System.out.println("Cuidado você está sobrepeso! \n");			
		}
		
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Altura: " + this.getAltura());

	}
	
	public void pesoIdeal() {
		pesoIdeal = imc*(altura*altura);
		//System.out.println("Seu peso ideal é: " + pesoIdeal);
	}

}
