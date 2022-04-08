package Familia51;

public class Cachorro extends Animal {

	private String raca;

	public Cachorro(String nome, int idade, String som, String correr, String raca) {
		super(nome, idade, som, correr);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
public void imprimirCachorro(){
	
	System.out.println ("\nNome: "+getNome()+"Idade:"+getIdade()+"Som: "+getSom()+"Correr: "+getCorrer()+"Raça: "+raca);
	
	
	
	
	}


}	
		



