package projetjava;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author Thibaut Bourguignon
 */
public class Vue_Principale extends javax.swing.JFrame {

    private GestionBD gs;

    /**
     * Creates new form JFrameTest
     */
    public Vue_Principale(GestionBD Ungs) {
        initComponents();
        this.gs = Ungs;
        this.setTitle("Laboratoire GSB");
        this.setSize(600, 500);
        this.setAlwaysOnTop(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//Permet que la JFrame s'ouvre directement en plein écran
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Vue_Principale() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Categorie = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel_afficheProduit = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel_afficheContact = new javax.swing.JPanel();
        jTextArea_contact = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenu_bar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_contact = new javax.swing.JMenu();
        jMenu_ajoutContact = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CategorieLayout = new javax.swing.GroupLayout(jPanel_Categorie);
        jPanel_Categorie.setLayout(jPanel_CategorieLayout);
        jPanel_CategorieLayout.setHorizontalGroup(
            jPanel_CategorieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel_CategorieLayout.setVerticalGroup(
            jPanel_CategorieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel_afficheProduit.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_afficheProduit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_afficheProduit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_afficheProduit.setMaximumSize(new java.awt.Dimension(1000, 32767));
        jPanel_afficheProduit.setPreferredSize(new java.awt.Dimension(1600, 250));
        jScrollPane2.setViewportView(jPanel_afficheProduit);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 1013));

        jPanel_afficheContact.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_afficheContact.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea_contact.setColumns(20);
        jTextArea_contact.setRows(5);
        jTextArea_contact.setText("\n\n\n\nPRÉSENTATION DE L'ENTREPRISE GSB :\n\nLa plateforme GSB  de biologie des médicaments regroupe l’ensemble des activités liées au médicaments :\nbiologie du médicament à visée de soins et de recherche : plus de 120 molécules pouvant être analysées, pharmacogénétique, biomarqueurs.\npharmacocinétique et biomathématiques avec le développement de méthodologies innovantes (méthodologie bayesienne) utilisées la aussi pour le soin et la recherche\npharmacovigilance\npharmacologie clinique\nCette plate forme mutualise l’activité de 12 hospitalo-universitaires des facultés de médecine et de pharmacie de l’Université Paris Descartes et travaille en étroite collaboration avec les structures de recherche Inserm ainsi que le CIC P0901 du site.\nCette plateforme est sous la responsabilité des Pr Xavier Declèves, Jean-Marc Tréluyer et Michel Vidal.");
        jTextArea_contact.setCaretPosition(0);
        jTextArea_contact.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea_contact.setMargin(new java.awt.Insets(2, 20, 2, 2));
        jTextArea_contact.setPreferredSize(new java.awt.Dimension(1000, 1300));
        jTextArea_contact.setSelectionStart(0);

        javax.swing.GroupLayout jPanel_afficheContactLayout = new javax.swing.GroupLayout(jPanel_afficheContact);
        jPanel_afficheContact.setLayout(jPanel_afficheContactLayout);
        jPanel_afficheContactLayout.setHorizontalGroup(
            jPanel_afficheContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_afficheContactLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextArea_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel_afficheContactLayout.setVerticalGroup(
            jPanel_afficheContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_afficheContactLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextArea_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(659, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel_afficheContact);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("LABORATOIRE GALAXY SWISS BOURDIN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("NOS PRODUITS");

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu_bar.add(jMenu1);

        jMenu_contact.setText("Contact");
        jMenu_contact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu_ajoutContact.setText("Ajouter Contact");
        jMenu_contact.add(jMenu_ajoutContact);

        jMenu_bar.add(jMenu_contact);

        setJMenuBar(jMenu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Categorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
                    .addComponent(jPanel_Categorie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
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
                    displayInfo(cat);
                }
            });

            this.jPanel_Categorie.add(bouttons);
            bouttons.setBounds(x, y, 150, 100);
           
            y += 100;
        }
        ArrayList<ContactClient> lesCli = gs.chargerLesClients();
        jMenu_contact.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                jTextArea_contact.setText(""); //permet de vider le TextArrea puis ensuite de mettre 
                JSeparator separateur = new JSeparator();
                System.out.println("ttttt");
                int nbClient =0;
                for (ContactClient clients : lesCli) {
                    nbClient++;
                    
                    jTextArea_contact.append("\n----------------------\nNom:" + clients.getNomClient() + "\nPrenom : " + clients.getPrenomClient() + "\nTel:" + clients.getFix() + "\nPortable: " + clients.getPortableClient()
                            + "\nE-mail: " + clients.getEmail());
                    jPanel_afficheContact.add(jTextArea_contact);
                    jPanel_afficheContact.add(separateur);
                    jTextArea_contact.setEnabled(false);
                    

                }
                jPanel_afficheContact.setPreferredSize(new Dimension(1000,1000));
                jTextArea_contact.setPreferredSize(new Dimension(1920,1300));              
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                jTextArea_contact.setPreferredSize(new Dimension(1920,500));
            }

            @Override
            public void menuCanceled(MenuEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

    }//GEN-LAST:event_formWindowOpened

    private void displayInfo(int cat) {
        System.out.println("cat : " + cat);
        int nbProduit = 0;

        jPanel_afficheProduit.removeAll();
        jScrollPane2.scrollRectToVisible(new Rectangle(0, 0, 1, 1));
        for (Produit produits : gs.getProductById(cat)) {
            nbProduit++;
            
            try {
                System.out.println("produit :" + produits.getNomProduit());
                Blob blob = produits.getImage();
                ImageIcon icon = new ImageIcon(blob.getBytes(1L, (int) blob.length()));//1L a position 1
                JLabel jLabel_img = new JLabel();
                jLabel_img.setIcon(icon);
                jLabel_img.setPreferredSize(new Dimension(1300, 200));
                jLabel_img.setOpaque(true);
                jLabel_img.setBackground(Color.white);
                
                JTextArea nomProduit = new JTextArea(produits.getNomProduit());
               
                JTextArea description = new JTextArea(produits.getDescription());
                JTextArea date = new  JTextArea(produits.getDateExpiration());
                JTextArea prix = new  JTextArea(produits.getPrix());
                JSeparator separateur = new JSeparator();
                nomProduit.setPreferredSize(new Dimension(jPanel_afficheProduit.getWidth() - 250, 30));
                description.setPreferredSize(new Dimension(jPanel_afficheProduit.getWidth() - 250, 150));
                date.setPreferredSize(new Dimension(jPanel_afficheProduit.getWidth() - 250, 30));
                prix.setPreferredSize(new Dimension(jPanel_afficheProduit.getWidth() - 250, 30));
                separateur.setPreferredSize(new Dimension(jPanel_afficheProduit.getWidth(),40));
                
                jPanel_afficheProduit.add(jLabel_img);
                jPanel_afficheProduit.add(nomProduit);
                jPanel_afficheProduit.add(description);
                jPanel_afficheProduit.add(date);
                jPanel_afficheProduit.add(prix);
                jPanel_afficheProduit.add(separateur);
                jPanel_afficheProduit.setBackground(Color.white);
                
            } catch (SQLException ex) {
                System.out.println("Erreur :" + ex);
            }
        }
        jPanel_afficheProduit.setPreferredSize(new Dimension(1600, nbProduit * 500 + 10));

        this.invalidate();
        this.validate();
        this.repaint();
    }

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
            java.util.logging.Logger.getLogger(Vue_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vue_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vue_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vue_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vue_Principale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu_ajoutContact;
    private javax.swing.JMenuBar jMenu_bar;
    private javax.swing.JMenu jMenu_contact;
    private javax.swing.JPanel jPanel_Categorie;
    private javax.swing.JPanel jPanel_afficheContact;
    private javax.swing.JPanel jPanel_afficheProduit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_contact;
    // End of variables declaration//GEN-END:variables
}
