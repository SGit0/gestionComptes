package gestionCompte;
public class TestCompte {
public static void main(String[] args) {
//Déclaration d'une variable cpt ayant un type Compte
Compte cpt;
/* Affectation d'une valeur à la variable cpt CAD
Instanciation, mécanisme qui consiste à créer 1 objet en
appelant le constructeur */
cpt = new Compte();
// en utilisant la méthode
System.out.println("Version somme depot/retrait" );
// manip de la variable cpt : on dépose 100
cpt.depotDe(100);
System.out.println("somme déposée 1" + cpt.getSommeDepots());
//en utilisant la méthode
System.out.println("Le solde contient " + cpt.getSolde());
// on recommence manip du Compte et affichage
cpt.depotDe(200);
System.out.println("somme déposée 2: " + cpt.getSommeDepots());
System.out.println("solde " + cpt.getSolde());
cpt.retraitDe(40);
System.out.println("Somme retirée 1 :" + cpt.getSommeRetraits());
cpt.retraitDe(60);
System.out.println("Somme retirée 2 :" + cpt.getSommeRetraits());
System.out.println("solde " + cpt.getSolde());
}
}