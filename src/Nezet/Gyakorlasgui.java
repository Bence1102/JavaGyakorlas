
package Nezet;

import Modell.Gyakorlas;
import java.awt.List;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Gyakorlasgui extends javax.swing.JFrame {

    private java.util.List<Gyakorlas> gyakorlas1;
    public Gyakorlasgui() {
        initComponents();
        gyakorlas1 = new ArrayList<>();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IDcombobx = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        etelCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fizetestxfield = new javax.swing.JTextField();
        tavtxfield = new javax.swing.JTextField();
        osszegtxfield = new javax.swing.JTextField();
        borravalotxfield = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btlsmenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        FTRfeladatmenu = new javax.swing.JMenuItem();
        fizetesmodokMenu = new javax.swing.JMenuItem();
        tavmenu = new javax.swing.JMenuItem();
        kivittetelelmenu = new javax.swing.JMenuItem();
        idpontmenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ID/Dátum"));

        IDcombobx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDcombobxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IDcombobx, 0, 392, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IDcombobx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("adatok"));

        etelCheckBox.setText("Vitt e étel?");

        jLabel1.setText("Fizetési mód:");

        jLabel2.setText("Megtett táv:");

        jLabel3.setText("Összeg:");

        jLabel4.setText("Borravaló:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fizetestxfield)
                            .addComponent(borravalotxfield, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(osszegtxfield)
                            .addComponent(tavtxfield)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(etelCheckBox)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(fizetestxfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tavtxfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(osszegtxfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borravalotxfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etelCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Program");

        btlsmenu.setText("betoltes");
        btlsmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlsmenuActionPerformed(evt);
            }
        });
        jMenu1.add(btlsmenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Feladatok");

        FTRfeladatmenu.setText("Mennyi volt a teljes bevétel egy adott futárkódra (pl. FTR-001)?");
        FTRfeladatmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTRfeladatmenuActionPerformed(evt);
            }
        });
        jMenu2.add(FTRfeladatmenu);

        fizetesmodokMenu.setText("Milyen fizetési módokat használtak, és hányszor?  ");
        fizetesmodokMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fizetesmodokMenuActionPerformed(evt);
            }
        });
        jMenu2.add(fizetesmodokMenu);

        tavmenu.setText("Kinek volt a leghosszab fuvarja?");
        tavmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tavmenuActionPerformed(evt);
            }
        });
        jMenu2.add(tavmenu);

        kivittetelelmenu.setText("Hány kiszállítás történt étellel?");
        kivittetelelmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kivittetelelmenuActionPerformed(evt);
            }
        });
        jMenu2.add(kivittetelelmenu);

        idpontmenu.setText("Volt-e szállítás 2023.12.24-én?");
        idpontmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpontmenuActionPerformed(evt);
            }
        });
        jMenu2.add(idpontmenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btlsmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlsmenuActionPerformed
        try {
            java.util.List<String> sorok = Files.readAllLines(Path.of("futarok.txt"));
            for (int i = 2; i < sorok.size(); i++) {
                String sor= sorok.get(i);
                Gyakorlas gyak1 = new Gyakorlas(sor);
                gyakorlas1.add(gyak1);
                IDcombobx.addItem(gyak1.getKod() + " / " + gyak1.getDatum());
            }
            megjelenit(gyakorlas1.getFirst());
            
        } catch (IOException ex) {
            Logger.getLogger(Gyakorlasgui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btlsmenuActionPerformed

    private void IDcombobxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDcombobxActionPerformed
        int i= IDcombobx.getSelectedIndex();
        Gyakorlas gyak1 = gyakorlas1.get(i);
        megjelenit(gyak1);
    }//GEN-LAST:event_IDcombobxActionPerformed

    private void FTRfeladatmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTRfeladatmenuActionPerformed
        String kod= "FTR-001";
        JOptionPane.showMessageDialog(rootPane, "Az %s kódú futár összbevétele: %d Ft.".formatted(kod,Osszeg(kod)));
        
    }//GEN-LAST:event_FTRfeladatmenuActionPerformed

    private void kivittetelelmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kivittetelelmenuActionPerformed
       JOptionPane.showMessageDialog(rootPane, etel() + " szállítás történt étellel.");

    }//GEN-LAST:event_kivittetelelmenuActionPerformed

    private void fizetesmodokMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fizetesmodokMenuActionPerformed
        JOptionPane.showMessageDialog(rootPane, fizetesmodok());
    }//GEN-LAST:event_fizetesmodokMenuActionPerformed

    private void tavmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tavmenuActionPerformed
        int leghosszabbut= leghosszabbFuvar();
        JOptionPane.showMessageDialog(rootPane,"A legtöbb kilométert az %s kódú futár tette meg (%.2f km)".formatted(gyakorlas1.get(leghosszabbut).getKod(),gyakorlas1.get(leghosszabbut).getMegtetttav()));
    }//GEN-LAST:event_tavmenuActionPerformed

    private void idpontmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpontmenuActionPerformed
        java.util.List<String> dolgoztak = dolgozok("2023.12.24.");
        String kod = "";

        for (int i = 0; i < dolgoztak.size(); i++) 
        {
            kod += dolgoztak.get(i) + " ";
        }
        
        JOptionPane.showMessageDialog(rootPane, "Aznap %s dolgozott.".formatted(kod));
    }//GEN-LAST:event_idpontmenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int kilepes = JOptionPane.showConfirmDialog(rootPane, "Biztos kiakarsz lépni?","Kilépés",JOptionPane.YES_NO_OPTION);
        if(kilepes==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    
    
    private int Osszeg(String kod){
        int osszbevetel = 0;
        for (int i = 0; i < gyakorlas1.size(); i++) {
            if(gyakorlas1.get(i).getKod().equals(kod)){
                osszbevetel += gyakorlas1.get(i).getOsszeg() + gyakorlas1.get(i).getBorravalo();
            }
        }
        return osszbevetel;
        
    }
    
    private java.util.List<String> dolgozok(String datum){
        java.util.List<String> dolgozott= new ArrayList<>();
        for (int i = 0; i < gyakorlas1.size(); i++) {
            if(gyakorlas1.get(i).getDatum().equals(datum) && !(dolgozott.contains(gyakorlas1.get(i).getKod()))){
                dolgozott.add(gyakorlas1.get(i).getKod());
            }
        }
        return dolgozott;
    }
    
    private int etel(){
        int db = 0;
        for(Gyakorlas i : gyakorlas1){
            if(i.isEtel()){
                db++;
            }
        }
        return db;
    }
    
    
    private int leghosszabbFuvar(){
        int  maxIndex = 0;
        for (int i = 0; i < gyakorlas1.size(); i++) {
            if (gyakorlas1.get(i).getMegtetttav()> gyakorlas1.get(maxIndex).getMegtetttav()){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    
    private String fizetesmodok(){
        java.util.List<String> modok = new ArrayList<>();
        java.util.List<Integer> dbok = new ArrayList<>();

            for (Gyakorlas g : gyakorlas1) {
                String mod = g.getFizetesmod();
                if (!mod.equals("---")) {
                    if (modok.contains(mod)) {
                        int index = modok.indexOf(mod);
                        dbok.set(index, dbok.get(index) + 1);
                    } else {
                        modok.add(mod);
                        dbok.add(1);
                    }
                }
            }
              String kiir = "";
                for (int i = 0; i < modok.size(); i++) {
                    kiir += modok.get(i) + ": " + dbok.get(i) + " alkalom\n";
                }
                return kiir;
    }
    
    private void megjelenit(Gyakorlas gyak1){
        fizetestxfield.setText(gyak1.getFizetesmod());
        tavtxfield.setText(gyak1.getMegtetttav() +"");
        osszegtxfield.setText(gyak1.getOsszeg() + "");
        borravalotxfield.setText(gyak1.getBorravalo() + "");
        etelCheckBox.setSelected(gyak1.isEtel());
        
        
    }
    
    
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
            java.util.logging.Logger.getLogger(Gyakorlasgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gyakorlasgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gyakorlasgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gyakorlasgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gyakorlasgui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem FTRfeladatmenu;
    private javax.swing.JComboBox<String> IDcombobx;
    private javax.swing.JTextField borravalotxfield;
    private javax.swing.JMenuItem btlsmenu;
    private javax.swing.JCheckBox etelCheckBox;
    private javax.swing.JMenuItem fizetesmodokMenu;
    private javax.swing.JTextField fizetestxfield;
    private javax.swing.JMenuItem idpontmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem kivittetelelmenu;
    private javax.swing.JTextField osszegtxfield;
    private javax.swing.JMenuItem tavmenu;
    private javax.swing.JTextField tavtxfield;
    // End of variables declaration//GEN-END:variables
}
