// Universite de Versailles - IUT de Velizy
// POO de JAVA
// Affichage de composants dans une fenetre JFrame.
//

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Fenetre extends JFrame
{
	// definition d'une couleur
	Color couleur = new Color(190, 210, 250);
	// definition d'un label
	JLabel monLabel;

	// definition du constructeur
	public Fenetre()
    {
		// titre de la fenetre
		super("Fenêtre de composants");
		// couleur de l'arriere-plan
		getContentPane().setBackground(couleur);
		// taille de la fenetre
		setSize(350,250);
		// politique de placement
		setLayout(new FlowLayout());
		// creation et ajout du label
		monLabel = new JLabel("Mon composant :", SwingConstants.CENTER);
		monLabel.setFont(new Font("Arial", Font.BOLD, 20));
		add(monLabel);
    	// fermeture du programme avec le bouton de la fenetre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	// affichage de la fenetre
		setVisible(true);
}

	// fonction principale
	public static void main (String a[])
	{
		new Fenetre();
	}
}
