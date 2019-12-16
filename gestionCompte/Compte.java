package gestionCompte;
	public class Compte
	{
		//Variable d'instance
private int sommeDepots;
private int sommeRetraits;
//Contructeur
public Compte()
{
// But du constructeur : initialiser les variables
sommeDepots = 0;
sommeRetraits = 0;
}
//Autres méthodes
// Déposer un montant
public void depotDe(int mt)
{
// On récupère le montant passé en paramètre pour l'ajouter sommeDepots = sommeDepots + mt;
}
// retirer un montant
public void retraitDe(int mt){
//on récupère le montant passé en paramètre pour l'ajouter
sommeRetraits = sommeRetraits + mt;
}
public int getSommeDepots() {
return sommeDepots;
}
public int getSommeRetraits() {
return sommeRetraits;
}
//on retourne le montant du solde
public int getSolde() {
return getSommeDepots() - getSommeRetraits();
}
}
samarchplus
