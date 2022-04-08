package Familia51;

public class Cavalo extends Animal{

	public String cor;

	public Cavalo(String nome, int idade, String som, String correr, String cor) {
		super(nome, idade, som, correr);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public void imprimirCavalo() {
		
	System.out.println ("\nNome: "+getNome()+"Idade:"+getIdade()+"Som: "+getSom()+"Correr: "+getCorrer()+"Cor: "+cor);
		
	}
	
	
}	

