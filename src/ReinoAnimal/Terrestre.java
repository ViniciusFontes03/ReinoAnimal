/**
* Classe Terrestre, que herda da superclasse Animal
*
* @author Vinicius Fontes da Penha
*/
package ReinoAnimal;

public class Terrestre extends Animal {
	/**
	 * Atributos da classe
	 */
	private String regiao;
	private boolean pelagem;
	/**
	 * Construtor da classe
	 */
	public Terrestre(String especie, String sexo, String dtNascimento, String regiao, boolean palegem) {
		super(especie, sexo, dtNascimento);
		// TODO Auto-generated constructor stub
		this.regiao = regiao;
		this.pelagem = pelagem;
	}
	/**
	 * Método que retorna uma string dizendo que o animal está se movendo
	 */
	public String mover() {
		return "O animal está se movendo";
	}
	/**
	* Retorna uma string, sobrescrita, dizendo que o animal está comendo.
	*/
	@Override
	public String comer() {
		return "O animal terrestre está comendo";
	}
	/**
	* Retorna uma string, sobrescrita, com as informações dos atributos.
	*/
	@Override
	public String perfil() {
		return toString();
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public boolean isPelagem() {
		return pelagem;
	}
	public void setPelagem(boolean pelagem) {
		this.pelagem = pelagem;
	}
	@Override
	public String toString() {
		return "Perfil do animal terrestre: [especie= "+getEspecie()+", sexo= "+getSexo() 
				+", data de nascimento= "+getDtNascimento()+", regiao= " 
				+regiao+", pelagem= "+pelagem+"]";
	}
	
	
}
