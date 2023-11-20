/**
* Superclasse anima.
*
* @author Vinicius Fontes da Penha
*/
package ReinoAnimal;

public class Animal {
	/**
	* Atributos da classe.
	*/
	private String especie;
	private String sexo;
	private String dtNascimento;
	private static int contador = 0;
	
	/**
	* Construtor da classe.
	*/
	public Animal(String especie, String sexo, String dtNascimento) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.dtNascimento = dtNascimento;
		incrementoCont();
	}
	/**
	* Retorna uma string dizendo que o animal está comendo.
	*/
	public String comer() {
		return "O animal está comendo";
	}
	/**
	* Retorna uma string com as informações dos atributos.
	*/
	public String perfil() {
		return toString();
	}
	/**
	* Método que incrementa o contador.
	*/
	private void incrementoCont() {
		this.setContador(this.getContador() + 1);
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Animal.contador = contador;
	}
	@Override
	public String toString() {
		return "Perfil do Animal: [especie= "+especie+", sexo= "+sexo 
				+", data de nascimento="+dtNascimento+"]";
	}
	
}
