/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author Thibaut Bourguignon
 */
public class ContactClient {
    private int idClient;
    private String nomClient;
    private String prenomClient;
    private String Fix;
    private String portableClient;
    private String Email;
    private int idOfficine;

    public ContactClient(int unIdClient, String unNomClient,String unPrenomClient, String unFix, String unPortableClient, String unEmail, int unIdOfficine) {
        
        this.idClient = unIdClient;
        this.nomClient = unNomClient;
        this.prenomClient=unPrenomClient;
        this.Fix=unFix;
        this.portableClient=unPortableClient;
        this.Email=unEmail;
        this.idOfficine=unIdOfficine;
    }
    
    /**
     * @return the idClient
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * @param idClient the idClient to set
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    /**
     * @return the nomClient
     */
    public String getNomClient() {
        return nomClient;
    }

    /**
     * @param nomClient the nomClient to set
     */
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    /**
     * @return the prenomClient
     */
    public String getPrenomClient() {
        return prenomClient;
    }

    /**
     * @param prenomClient the prenomClient to set
     */
    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    /**
     * @return the Fix
     */
    public String getFix() {
        return Fix;
    }

    /**
     * @param Fix the Fix to set
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * @return the portableClient
     */
    public String getPortableClient() {
        return portableClient;
    }

    /**
     * @param portableClient the portableClient to set
     */
    public void setPortableClient(String portableClient) {
        this.portableClient = portableClient;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the idOfficine
     */
    public int getIdOfficine() {
        return idOfficine;
    }

    /**
     * @param idOfficine the idOfficine to set
     */
    public void setIdOfficine(int idOfficine) {
        this.idOfficine = idOfficine;
    }
}
