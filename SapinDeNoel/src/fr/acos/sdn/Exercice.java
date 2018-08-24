package fr.acos.sdn;

/**
 * Le but de cet exercice est de travailler sur les boucles afin de dessiner dans
 * un terminal un sapin de No�l avec ses boules (figure a). Il prendra en argument la hauteur du sapin 
 * qui est une variable du probl�me. Ce param�tre doit �tre fourni par l'utilisateur lors de l'ex�cution du
 * programme. Les boules doivent �tre positionn�es tout les 6 di�ses comme expliqu� dans la figure a.
 * 
 * 
 * a) Hauteur 10
 *
			#
		   ### 
		  #O###
		 ##O####
		#O#####O# 
	   ####O#####O 
	  #####O#####O# 
	 ####O#####O####
 *  #O#####O#####O###
 * ##O#####O#####O####
 * 
 * @author acosson
 *
 */
public class Exercice 
{
	/**
	 * Variable servant de compteur afin de mettre une boule tout les six �l�ments.
	 */
	private static int compteurBoule = 0;
	
	/**
	 * Point d'entr�e
	 * 
	 * @param args Pas utilis�.
	 */
	public static void main(String[] args) 
	{
		//Appel de la fonction permettant de cr�er le sapin.
		createSapinDeNoel(60);
	}
	
	/**
	 * Cette fonction cr�er le sapin.
	 * 
	 * @param hauteur Hauteur de sapin d�sir�e.
	 */
	private static void createSapinDeNoel(int hauteur)
	{
		// Cette variable permet de g�rer le nombre d'�l�ment sur une ligne.
		int nombreElement = 1;
		//Boucle qui s'ex�cute autant de fois que la hauteur d�sir�e.
		for(int i = 1; i <= hauteur;i++)
		{
			//Fonction permettant d'afficher des espaces
			//On enleve un espace � chaque echelon de sapin.
			espace(80-i);
			//Fonction permettant d'afficher des dieses.
			diese(nombreElement);
			//La ligne suivant aura 2 �l�ments suppl�mentaires.
			nombreElement += 2;
			//Retour � la ligne
			System.out.print("\n");
		}
	}
	
	/**
	 *Cette fonction permet d'afficher des espaces sur une ligne.
	 * 
	 * @param nombre Nombre d'espaces d�sir�.
	 */
	private static void espace(int nombre)
	{
		//Boucle faisant autant d'it�rations que d'espace d�sir�.
		for(int i = 1; i <= nombre;i++)
		{
			//Affichage d'un espace.
			System.out.print(" ");
		}
	}
	
	/**
	 *Cette fonction permet d'afficher des dieses sur une ligne.
	 * 
	 * @param nombre Nombre de dieses d�sir�.
	 */
	private static void diese(int nombre)
	{
		//Boucle faisant autant d'it�rations que de dieses d�sir�.
		for(int i = 1; i <= nombre;i++)
		{
			//Si on a d�ja affich� 5 dieses
			if(compteurBoule == 5)
			{
				//Alors on affiche une boule
				System.out.print("O");
				//Et on remet le compteur des dieses � 0.
				compteurBoule = 0;
			}
			else
			{
				//Sinon on affiche un diese
				System.out.print("#");
				//Et on incr�mente le compteur des dieses.
				compteurBoule++;
			}
		}
	}
}
