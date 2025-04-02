package controler;

import view.EntreeJeu;

/**
 * Contrôleur et point d'entrée de l'applicaton 
 */
public class Controle {
	
	private EntreeJeu frmEntreeJeu ;

	/**
	 * Méthode de démarrage
	 * @param args non utilisé
	 */
	public static void main(String[] args) {
		new Controle();
	}
	
	/**
	 * Constructeur
	 */
	private Controle() {
		this.frmEntreeJeu = new EntreeJeu() ;
		this.frmEntreeJeu.setVisible(true);
	}	

}