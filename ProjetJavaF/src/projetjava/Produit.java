package projetjava;
import java.sql.Blob;
/**
 *
 * @author Thibaut Bourguignon
 */
public class Produit {

    private int idProduit;
    private String nomProduit;
    private boolean TopProduit;
    private String Prix;
    private String Description;
    private String DateExpiration;
    private int idCategorie;
    private Blob Image;
    private String nomCategorie;

    public Produit(int unIdProduit, String unNomProduit, boolean unTopProduit, String unPrix, String uneDescription, 
            String uneDate, int unIdCategorie, Blob uneImage,String unNomCategorie) {
        this.idProduit = unIdProduit;
        this.nomProduit = unNomProduit;
        this.TopProduit = unTopProduit;
        this.Prix = unPrix;
        this.Description = uneDescription;
        this.DateExpiration = uneDate;
        this.idCategorie = unIdCategorie;
        this.Image = uneImage;
        this.nomCategorie = unNomCategorie;
    }
    
    /**
     * @return the idProduit
     */
    public int getIdProduit() {
        return idProduit;
    }
    /**
     * @param idProduit the idProduit to set
     */
    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }
    /**
     * @return the nomProduit
     */
    public String getNomProduit() {
        return nomProduit;
    }
    /**
     * @param nomProduit the nomProduit to set
     */
    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }
    /**
     * @return the TopProduit
     */
    public boolean isTopProduit() {
        return TopProduit;
    }
    /**
     * @param TopProduit the TopProduit to set
     */
    public void setTopProduit(boolean TopProduit) {
        this.TopProduit = TopProduit;
    }
    /**
     * @return the Prix
     */
    public String getPrix() {
        return Prix;
    }
    /**
     * @param Prix the Prix to set
     */
    public void setPrix(String Prix) {
        this.Prix = Prix;
    }
    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }
    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }
    /**
     * @return the DateExpiration
     */
    public String getDateExpiration() {
        return DateExpiration;
    }

    /**
     * @param DateExpiration the DateExpiration to set
     */
    public void setDateExpiration(String DateExpiration) {
        this.DateExpiration = DateExpiration;
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
     * @return the Image
     */
    public Blob getImage() {
        return Image;
    }

    /**
     * @param Image the Image to set
     */
    public void setImage(Blob Image) {
        this.Image = Image;
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
