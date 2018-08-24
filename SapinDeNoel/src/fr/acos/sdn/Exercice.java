package fr.acos.sdn;

/**
 * Le but de cet exercice est de travailler sur les boucles afin de dessiner dans
 * un terminal un sapin de Noël avec ses boules (figure a). Il prendra en argument la hauteur du sapin 
 * qui est une variable du problème. Ce paramètre doit être fourni par l'utilisateur lors de l'exécution du
 * programme. Les boules doivent être positionnées tout les 6 dièses comme expliqué dans la figure a.
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
	 * Variable servant de compteur afin de mettre une boule tout les six éléments.
	 */
	private static int compteurBoule = 0;
	
	/**
	 * Point d'entrée
	 * 
	 * @param args Pas utilisé.
	 */
	public static void main(String[] args) 
	{
		//Appel de la fonction permettant de créer le sapin.
		createSapinDeNoel(60);
	}
	
	/**
	 * Cette fonction créer le sapin.
	 * 
	 * @param hauteur Hauteur de sapin désirée.
	 */
	private static void createSapinDeNoel(int hauteur)
	{
		// Cette variable permet de gérer le nombre d'élément sur une ligne.
		int nombreElement = 1;
		//Boucle qui s'exécute autant de fois que la hauteur désirée.
		for(int i = 1; i <= hauteur;i++)
		{
			//Fonction permettant d'afficher des espaces
			//On enleve un espace à chaque echelon de sapin.
			espace(80-i);
			//Fonction permettant d'afficher des dieses.
			diese(nombreElement);
			//La ligne suivant aura 2 éléments supplémentaires.
			nombreElement += 2;
			//Retour à la ligne
			System.out.print("\n");
		}
	}
	
	/**
	 *Cette fonction permet d'afficher des espaces sur une ligne.
	 * 
	 * @param nombre Nombre d'espaces désiré.
	 */
	private static void espace(int nombre)
	{
		//Boucle faisant autant d'itérations que d'espace désiré.
		for(int i = 1; i <= nombre;i++)
		{
			//Affichage d'un espace.
			System.out.print(" ");
		}
	}
	
	/**
	 *Cette fonction permet d'afficher des dieses sur une ligne.
	 * 
	 * @param nombre Nombre de dieses désiré.
	 */
	private static void diese(int nombre)
	{
		//Boucle faisant autant d'itérations que de dieses désiré.
		for(int i = 1; i <= nombre;i++)
		{
			//Si on a déja affiché 5 dieses
			if(compteurBoule == 5)
			{
				//Alors on affiche une boule
				System.out.print("O");
				//Et on remet le compteur des dieses à 0.
				compteurBoule = 0;
			}
			else
			{
				//Sinon on affiche un diese
				System.out.print("#");
				//Et on incrémente le compteur des dieses.
				compteurBoule++;
			}
		}
	}
}
