/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author Thibaut Bourguignon
 */
public class Vue_ancien extends javax.swing.JFrame {

    private GestionBD gs;

    /**
     * Creates new form Vue_Principale
     *
     * @param unGs
     */
    public Vue_ancien(GestionBD unGs) {
        initComponents();
        this.gs = unGs;
        this.setTitle("Laboratoire GSB");
        this.setSize(600, 500);
        this.setAlwaysOnTop(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//Permet que la JFrame s'ouvre directement en plein écran
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Vue_ancien() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Categorie = new javax.swing.JPanel();
        jPanel_afficheProduit = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenu_bar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu_contact = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setSize(new java.awt.Dimension(1600, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_Categorie.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Categorie.setPreferredSize(new java.awt.Dimension(150, 900));

        javax.swing.GroupLayout jPanel_CategorieLayout = new javax.swing.GroupLayout(jPanel_Categorie);
        jPanel_Categorie.setLayout(jPanel_CategorieLayout);
        jPanel_CategorieLayout.setHorizontalGroup(
            jPanel_CategorieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );
        jPanel_CategorieLayout.setVerticalGroup(
            jPanel_CategorieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel_afficheProduit.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_afficheProduit.setAutoscrolls(true);
        jPanel_afficheProduit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_afficheProduit.setPreferredSize(new java.awt.Dimension(1400, 900));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea1.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jTextArea1.setPreferredSize(new java.awt.Dimension(1400, 900));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel_afficheProduitLayout = new javax.swing.GroupLayout(jPanel_afficheProduit);
        jPanel_afficheProduit.setLayout(jPanel_afficheProduitLayout);
        jPanel_afficheProduitLayout.setHorizontalGroup(
            jPanel_afficheProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_afficheProduitLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_afficheProduitLayout.setVerticalGroup(
            jPanel_afficheProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        jMenu1.setText("Fichier");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu3.setText("Ajouter Produit");
        jMenu1.add(jMenu3);

        jMenu4.setText("Modifier Produit");
        jMenu1.add(jMenu4);

        jMenu5.setText("Supprimer Produit");
        jMenu1.add(jMenu5);

        jMenu_bar.add(jMenu1);

        jMenu_contact.setText("Contact");
        jMenu_contact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_contactActionPerformed(evt);
            }
        });
        jMenu_bar.add(jMenu_contact);

        setJMenuBar(jMenu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Categorie, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_afficheProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_afficheProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Categorie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*-------------------Pour une seule catégorie-----------------------*/
        //Categorie uneCat = gs.chargerUneCategorie(1);
        //jLabel1.setText(uneCat.getNomCategorie()); //mettre un Jlabel pour que cela fonctionne        

        /*---------------------Pour plusieurs catégories--------------------*/
        ArrayList<Categorie> lesCat = gs.chargerLesCategories();
        ArrayList<Produit> lesProds = gs.chargerLesProduits();

        int x = 0, y = 0;
        int w = 0, v = 0;

        for (Categorie categorie : lesCat) {

            JButton bouttons = new JButton(categorie.getNomCategorie());
            int cat = categorie.getIdCategorie();
            System.out.println("categorie id : " + cat);

            bouttons.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jTextArea1.setText(""); //permet de vider le TextArrea puis ensuite de mettre

                    for (Produit produits : lesProds) {
                        if (produits.getIdCategorie() == cat) {
                            try {
                                // System.out.println("category numero " + cat);
                                //System.out.println("produits " + produits.getNomProduit());
                                Blob blob = produits.getImage();
                                ImageIcon icon = new ImageIcon(blob.getBytes(1L,(int)blob.length()));//1L a position 1
                                JLabel label = new JLabel();
                                label.setIcon(icon);
                                jTextArea1.append("\n ----------------\n" + produits.getImage() + "\n"  +produits.getNomProduit()+ "\n" + produits.getDescription()
                                        + "\nDate d'expiration : " + produits.getDateExpiration() + "\nPrix :" + produits.getPrix());
                                jPanel_afficheProduit.add(jTextArea1);// append pour ajouter a la suite les produits
                                
                            } catch (SQLException ex) {
                                Logger.getLogger(Vue_ancien.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            });
            this.jPanel_Categorie.add(bouttons);
            bouttons.setBounds(x, y, 150, 100);
            bouttons.setBackground(Color.LIGHT_GRAY);
            bouttons.setBorder(BorderFactory.createLineBorder(Color.black));
            y += 100;
        }

        ArrayList<ContactClient> lesCli = gs.chargerLesClients();
        jMenu_contact.addMenuListener(new MenuListener() {

            public void menuSelected(MenuEvent e) {
                jTextArea1.setText(""); //permet de vider le TextArrea puis ensuite de mettre 
                System.out.println("ttttt");

                for (ContactClient clients : lesCli) {
                    jTextArea1.append("\n-------------------------------\nNom : " + clients.getNomClient() + "\nPrenom : " + clients.getPrenomClient() + "\nTel:" + clients.getFix() + "\nPortable: " + clients.getPortableClient()
                            + "\nE-mail: " + clients.getEmail());
                    jPanel_afficheProduit.add(jTextArea1);
                }
            }

            @Override
            public void menuDeselected(MenuEvent e) {
               // System.out.println("frfrf");
                jTextArea1.setText("");
            }

            
            @Override
            public void menuCanceled(MenuEvent e) {
                //System.out.println("vgbhj,kl");
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }//GEN-LAST:event_formWindowOpened

    private void jMenu_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_contactActionPerformed
        System.out.println("tttttttt");        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_contactActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vue_ancien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vue_ancien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vue_ancien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vue_ancien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Vue_ancien().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenu_bar;
    private javax.swing.JMenu jMenu_contact;
    private javax.swing.JPanel jPanel_Categorie;
    private javax.swing.JPanel jPanel_afficheProduit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
