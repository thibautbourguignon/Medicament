package projetjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Thibaut Bourguignon
 */
public class GestionBD {

    public Connection cnx;

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String info = "jdbc:mysql://localhost:3306/ficheproduit?user=root";
            cnx = (Connection) DriverManager.getConnection(info);
            Statement requete = cnx.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GestionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void close() {
        try {
            cnx.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*--------------------------------Charger UNE CATEGORIE-------------------------------------*/
    public Categorie chargerUneCategorie(int idCategorie) {
        Statement requete;
        Categorie uneCategorie = null;
        try {
            requete = cnx.createStatement();
            ResultSet rs = requete.executeQuery("SELECT * FROM categorie WHERE idCategorie=" + idCategorie);

            if (rs.next()) {
                uneCategorie = new Categorie(rs.getInt("idCategorie"), rs.getString("nomCategorie"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uneCategorie;
    }

    /*-------------------------------CHARGER LES CATÉGORIE----------------------------------*/
    public ArrayList<Categorie> chargerLesCategories() {
        Statement requete;
        ArrayList<Categorie> lesCategories = null;
        try {
            requete = cnx.createStatement();
            ResultSet rs = requete.executeQuery("SELECT * FROM categorie");
            lesCategories = new ArrayList<Categorie>();
            while (rs.next()) {
                lesCategories.add(new Categorie(rs.getInt("idCategorie"), rs.getString("nomCategorie")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesCategories;
    }

    /*---------------------------------CHARGER TOUT LES PRODUITS-----------------------------*/
    public ArrayList<Produit> chargerLesProduits() {
        Statement requete;
        ArrayList<Produit> lesProduits = null;
        try {
            requete = cnx.createStatement();
            ResultSet rs = requete.executeQuery("SELECT * FROM produit");
            lesProduits = new ArrayList<Produit>();
            while (rs.next()) {
                lesProduits.add(new Produit(rs.getInt("idProduit"), rs.getString("nomProduit"), rs.getBoolean("TopProduit"), 
                rs.getString("Prix"), rs.getString("Description"),rs.getString("DateExpiration"), rs.getInt("idCategorie"), rs.getBlob("Image")
                , rs.getString("nomCategorie")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesProduits;
    }

    /*-----------------------------CHARGER TOUT LES PRODUITS PAR RAPPORTS A UN IDCATEGORIE------------------------------*/
    public ArrayList<Produit> getProductById(int idcat) {
        Statement requete;
        ArrayList<Produit> lesProduits = null;
        try {
            requete = cnx.createStatement();
            ResultSet rs = requete.executeQuery("SELECT * FROM produit WHERE idCategorie=" + idcat);
            lesProduits = new ArrayList<Produit>();
            while (rs.next()) {
                lesProduits.add(new Produit(rs.getInt("idProduit"), rs.getString("nomProduit"), rs.getBoolean("TopProduit"), 
                        rs.getString("Prix"), rs.getString("Description"),rs.getString("DateExpiration"), rs.getInt("idCategorie"), 
                        rs.getBlob("Image"), rs.getString("nomCategorie")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesProduits;
    }
    /*------------------------------------RETOURNE TOUTES LES INFOS CLIENTS----------------------------------------*/
    public ArrayList<ContactClient> chargerLesClients() {
        Statement requete;
        ArrayList<ContactClient> lesClients = null;
        try {
            requete = cnx.createStatement();
            ResultSet rs = requete.executeQuery("SELECT * FROM client");
            lesClients = new ArrayList<ContactClient>();
            while (rs.next()) {
                lesClients.add(new ContactClient(rs.getInt("idClient"), rs.getString("nomClient"), rs.getString("prenomClient"), rs.getString("Fix"), rs.getString("portableClient"),
                        rs.getString("Email"), rs.getInt("idOfficine")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesClients;
    }
    /*-------------------------AJOUTER UN PRODUIT-------------------------*/
    public void AjouterP(int idProduit, String nomProduit ,boolean TopProduit, String Prix , String Description , String DateExpiration , int idCategorie , String Image , String nomCategorie){
        
    }
    public ArrayList<ContactClient> AjouterContact(){ 
        //AjouterContact(String nomClient ,String prenomClient, String Fix , String portableClient , String Email){
        Statement requete;
        ArrayList<ContactClient> AjoutContact = null;
        try {
            AjoutContact = new ArrayList<ContactClient>();
            //requete = cnx.createStatement();
            //preparedStatement = cnx.prepareStatement("INSERT INTO client (nomClient, prenomClient, Fix, PortableClient , Email)" + "VALUES('"+nomClient+"','"+prenomClient+"','"+Fix+"','"+portableClient+"','"+Email+"');");
            /* Création de l'objet gérant les requêtes préparées */
            PreparedStatement preparedStatement = cnx.prepareStatement("INSERT INTO client (nomClient, prenomClient, Fix, PortableClient , Email) VALUES(?,?,?,?,?);");        
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AjoutContact;
    }       
}
