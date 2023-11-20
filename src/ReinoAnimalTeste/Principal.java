/**
* Classe Principal, que instancia as classes filhas e testa seus métodos
*
* @author Vinicius Fontes da Penha.
*/
package ReinoAnimalTeste;

import ReinoAnimal.Animal;
import ReinoAnimal.Aquatico;
import ReinoAnimal.Terrestre;
import ReinoAnimal.Aereo;

public class Principal {
	/**
	 * Método que instancia e testa as classes filhas
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Instancias das classes filhas.
		 */
		Aquatico aqua1 = new Aquatico("Carcharias Taurus",
				"fêmea", "7", "água salgada", false);
		Aquatico aqua2 = new Aquatico("Pygocentrus nattereri", "macho", "3", "água doce", true);
		
		Terrestre terre1 = new Terrestre("Felis catus", "femea", "2", "Asia", true);
		Terrestre terre2 = new Terrestre("Hydrochoerus hydrochaeris", "macho", "8", "América do Sul", true);
		
		Aereo aereo1 = new Aereo("Coragyps atratus", "macho", "3", "54.5");
		Aereo aereo2 = new Aereo("Amazona aestiva", "fêmea", "10", "37.9");
		
		/**
		 * Impressão de algumas infomrações setadas nas instancias anteriores para testar 
		 * os métodos criados nas classes.
		 */
		System.out.println("Carcharias Taurus: " + aqua1.nadar());
		System.out.println("Carcharias Taurus: " + aqua1.comer());
		System.out.println(aqua1.perfil());
		
		System.out.println("Felis catus: " + terre1.mover());
		System.out.println("Felis catus: " + terre1.comer());
		System.out.println(terre1.perfil());
		
		System.out.println("Coragyps atratus: " + aereo1.voar());
		System.out.println("Coragyps atratus: " + aereo1.comer());
		System.out.println(aereo1.perfil());
		
		/**
		 * Impressão da quantidade de animais instanciados.
		 */
		System.out.println("A quantidade de animais instanciados foi de: "
				+Animal.getContador());
	}

}
