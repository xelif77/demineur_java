/**
* @version 28/04/2022
* @author Felix Brinet
*/
/**
 * inclusion des bibliothèques
 */
import javax.swing.*;
import java.awt.*;

public class Menu2 {
	/**
     * Un objet pour servir de fenetre1
     */
    private JFrame fenetre2 = new JFrame();
	private JTextField newLigne = new JTextField("10");
	private JTextField newColonne = new JTextField("10");
	private JTextField newnbrMines = new JTextField("10");
	private JButton btJouer = new JButton();
    public void Menu21() {
        /**
		 * On configure la fenetre2
		 */
        /**
         * On définit la taille et la position de la fenêtre2
         */
		int longueur = 750;
		int hauteur = 520;
        fenetre2.setSize(+longueur,+hauteur);
		/**
		 * On empèche de réduire ou agrandir la fenêtre2
		 */
		fenetre2.setResizable(false);
        fenetre2.setMinimumSize(new Dimension(+longueur,+hauteur));
        fenetre2.setLocation(100,100);
        fenetre2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre2.setTitle("*** Réglages ***");
		/**
         * Ajout du fond de la fenêtre1
         */
	    fenetre2.setContentPane(new JLabel(new ImageIcon("./Images/demineur_fond.jpg")));
	    fenetre2.setLayout(new FlowLayout());
		/**
		 * Configuration nombres de lignes entre 10 et 30
		 */					
		JLabel txtLigne = new JLabel("Combien de lignes voulez vous ?");
		
		/**
		 * Configuration nombres de colonnes entre 10 et 30
		 */			
		JLabel txtColonne = new JLabel("Combien de colonnes voulez vous ?");
		
		/**
		 * Configuration nombres de mines entre (ligne*colonne)-1
		 */							
		JLabel txtMines = new JLabel("Combien de mines voulez vous ?");
		
		/**
		 * Configuration bouton Jouer nombre de : "lignes, colonnes, mines " à la fenetre
		 */								
		
		btJouer.setText("Jouer");	

		/**
		 * Ajout actionlistener pour récupérer actions boutons et JtextField
		 */
		ActionMenu2 amenu = new ActionMenu2(newLigne,newColonne,newnbrMines,btJouer,fenetre2);
		
		btJouer.addActionListener(amenu);
		
		/**
		 * Créer un JPanel et une grille dedans pour positionner les élements
		 */
		JPanel panneau = new JPanel();	
		GridLayout grille = new GridLayout(7, 1);
		panneau.setLayout(grille);
		panneau.add(txtLigne);
		panneau.add(newLigne);
		panneau.add(txtColonne);
		panneau.add(newColonne);
		panneau.add(txtMines);
		panneau.add(newnbrMines);
		panneau.add(btJouer);
        panneau.setPreferredSize(new Dimension(375,260));
		/**
		 * Centre les éléments dans la grille
		 */
		txtLigne.setHorizontalAlignment(JLabel.CENTER);
		txtColonne.setHorizontalAlignment(JLabel.CENTER);
		txtMines.setHorizontalAlignment(JLabel.CENTER);
		newLigne.setHorizontalAlignment(JTextField.CENTER);
		newColonne.setHorizontalAlignment(JTextField.CENTER);
		newnbrMines.setHorizontalAlignment(JTextField.CENTER);
		fenetre2.add(panneau);
		/**
		 * Afficher menu2
		 */
        fenetre2.setVisible(true); 
}
}