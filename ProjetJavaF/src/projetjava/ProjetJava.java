package projetjava;
import java.util.ArrayList;
/**
 *
 * @author Thibaut Bourguignon
 */
public class ProjetJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionBD gs = new GestionBD();
        gs.connect();
        //Une catégorie
        Categorie uneCat = gs.chargerUneCategorie(2);
        //System.out.println(uneCat.getIdCategorie() + " " + uneCat.getNomCategorie());
        //Toutes les catégories
        ArrayList<Categorie> lesCat = gs.chargerLesCategories();
        for (Categorie categorie : lesCat) {
            //System.out.println(categorie.getIdCategorie() + " " + categorie.getNomCategorie());
        }
        //Tous les produits
        ArrayList<Produit> lesProds = gs.chargerLesProduits();
        for (Produit lesProduits : lesProds) {
            //System.out.println(lesProduits.getNomCategorie() + "\n\t" + lesProduits.getNomProduit() + "\n \t" 
            // + lesProduits.isTopProduit() + "\n \t" + lesProduits.getPrix()
            //+ "\n \t" + lesProduits.getDescription() + "\n \t" + lesProduits.getDateExpiration() + "\n \t" 
            //+ lesProduits.getIdCategorie() + "\n \t" + lesProduits.getImage());
        }
        ArrayList<ContactClient> lesCli = gs.chargerLesClients();
        for (ContactClient lesClients : lesCli) {
            // System.out.println(lesClients.getNomClient()+"\n\t"+ lesClients.getPrenomClient()+"\n\t"+ lesClients.getFix()+"\n\t"
            // + lesClients.getPortableClient()+"\n\t"+lesClients.getEmail()
            //      +"\n\t"+lesClients.getIdOfficine());
        }
        Vue_Principale jftest = new Vue_Principale(gs);
        jftest.setVisible(true);
        /* Vue_Principale vp = new Vue_Principale(gs);
        vp.setVisible(true);*/
        //gs.close();    
        
    }
}
