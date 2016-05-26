package projetjava;

/**
 *
 * @author Thibaut Bourguignon
 */
public class Categorie {

    private int idCategorie;
    private String nomCategorie;

    //collection
    public Categorie(int unIdCat, String unNomCat) {
        this.idCategorie = unIdCat;
        this.nomCategorie = unNomCat;
    }

    /**
     * @return the idCategorie
     */
    public int getIdCategorie() {
        return idCategorie;
    }

    /**
     * @param idCategorie the idCategorie to set
     */
    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    /**
     * @return the nomCategorie
     */
    public String getNomCategorie() {
        return nomCategorie;
    }

    /**
     * @param nomCategorie the nomCategorie to set
     */
    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
}
