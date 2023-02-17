// Universite de Versailles - IUT de Velizy
// POO de JAVA
// Affichage de composants dans une fenetre JFrame.
//

import java.awt.*;
import java.awt.event.*;

class AfficheBouton extends Frame implements ActionListener {
// definition du bouton
Button bouton;
Label monLabel;

// definition du constructeur
public AfficheBouton () {
// titre de la fenetre
	super ("Affichage du bouton");
// parametres de la fenetre
	setBackground (Color.cyan);
	setSize (200, 200);
// politique de placement
	setLayout (new FlowLayout());
	// creation et ajout des composants
	monLabel = new Label ("Voici mon bouton :");
	add (monLabel);		
	bouton = new Button ("Appuyer");
	add (bouton);
	bouton.addActionListener (this);
		// controle de la fermeture de la fenetre
addWindowListener (new WindowAdapter () { 
          public void windowClosing (WindowEvent e) { System.exit (0); }} );
    	// affichage de la fenetre
setVisible (true);
}

// gestion des evenements
public void actionPerformed (ActionEvent e) {
if (e.getSource() == bouton) 
          System.out.println ("Clic sur le bouton.");
}	

// fonction principale
public static void main (String a[]) {
new AfficheBouton ();
}
}
