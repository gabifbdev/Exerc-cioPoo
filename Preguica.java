package Familia51;

public class Preguica extends Animal {
	
	
	public String sobeArvores;

	public Preguica(String nome, int idade, String som, String correr, String sobeArvores) {
		super(nome, idade, som, correr);
		this.sobeArvores = sobeArvores;
	}

	public String getsobeArvores() {
		return sobeArvores;
	}

	public void setsobeArvores(String sobeArvores) {
		this.sobeArvores = sobeArvores;
	}
	
	public void imprimirPreguica() {
		
		System.out.println ("\nNome: "+getNome()+"Idade:"+getIdade()+"Som: "+getSom()+sobeArvores);

	}

}
