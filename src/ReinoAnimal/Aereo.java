/**
* Classe Aereo, que herda da superclasse Animal
*
* @author Vinicius Fontes da Penha
*/
package ReinoAnimal;

public class Aereo extends Animal {
	
	/**
	 * Atributos da classe
	 */
	private String altitude;
	
	/**
	 * Construtor da classe
	 */
	public Aereo(String especie, String sexo, String dtNascimento, String altitude) {
		super(especie, sexo, dtNascimento);
		// TODO Auto-generated constructor stub
		this.altitude = altitude;
	}
	
	/**
	 * Método que retorna uma string dizendo que o animal está voando
	 */
	public String voar() {
		return "O animal está voando";
	}
	
	/**
	* Retorna uma string, sobrescrita, dizendo que o animal está comendo.
	*/
	@Override
	public String comer() {
		return "O animal aéreo está comendo";
	}
	
	/**
	* Retorna uma string, sobrescrita, com as informações dos atributos.
	*/
	@Override
	public String perfil() {
		return toString();
	}
	public String getAltitude() {
		return altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	@Override
	public String toString() {
		return "Perfil do Animal aéreo: [especie= "+getEspecie()+", sexo= "+getSexo() 
				+", data de nascimento= "+getDtNascimento()+", altitude= "+altitude+"]";
	}
	
}
