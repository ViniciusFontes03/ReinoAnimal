/**
* Classe aquatico, que herda da superclasse Animal.
*
* @author Vinicius Fontes da Penha
*/
package ReinoAnimal;

public class Aquatico extends Animal {
	/**
	* Atributos da classe.
	*/
	private String tpAgua;
	private boolean escama;

	/**
	* Construtor da classe.
	*/
	public Aquatico(String especie, String sexo, String dtNascimento, 
			String tpAgua, boolean escama) {
		super(especie, sexo, dtNascimento);
		// TODO Auto-generated constructor stub
		this.tpAgua = tpAgua;
		this.escama = escama;
	}
	/**
	 * 
	 * Retorna uma string dizendo que o animal está nadando.
	 */
	public String nadar() {
		return "O animal está nadando";
	}
	/**
	* Retorna uma string, sobrescrita, dizendo que o animal está comendo.
	*/
	@Override
	public String comer(){
		return "O está aquático comendo";
	}
	/**
	* Retorna uma string, sobrescrita, com as informações dos atributos.
	*/
	@Override
	public String perfil() {
		return toString();
	}

	public String getTpAgua() {
		return tpAgua;
	}

	public void setTpAgua(String tpAgua) {
		this.tpAgua = tpAgua;
	}

	public boolean isEscama() {
		return escama;
	}

	public void setEscama(boolean escama) {
		this.escama = escama;
	}

	@Override
	public String toString() {
		return "Perfil do animal aquático: [especie= "+getEspecie()+", sexo= "+getSexo()
			+", data de nascimento= "+getDtNascimento()+", tipo de água= "
				+tpAgua+", escama= "+escama+"]";
	}
}
