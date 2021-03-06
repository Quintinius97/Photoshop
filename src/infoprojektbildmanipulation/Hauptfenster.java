/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoprojektbildmanipulation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author Nicolai Müller
 */
public class Hauptfenster extends javax.swing.JFrame {

    BufferedImage bi = null;
    BufferedImage bildoriginal = null;
    Effects picture = null;
    int x = 0, y = 0;
    int x1 = 0, y1 = 0;
    int r = 0;
    boolean v = false;

    /**
     * Creates new form Hauptfenster
     */
    public Hauptfenster() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jPanel1kl = new javax.swing.JPanel(){
            public void paintComponent(Graphics f){
                super.paintComponent(f);
                zeichneBildKlein(f);
            }
        };
        laden = new javax.swing.JButton();
        speichern = new javax.swing.JButton();
        jPanel2gr = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                zeichneBildGross(g);
            }
        };
        waehlen = new javax.swing.JButton();
        Verwirbeln = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1klLayout = new javax.swing.GroupLayout(jPanel1kl);
        jPanel1kl.setLayout(jPanel1klLayout);
        jPanel1klLayout.setHorizontalGroup(
            jPanel1klLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel1klLayout.setVerticalGroup(
            jPanel1klLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        laden.setText("laden");
        laden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladenActionPerformed(evt);
            }
        });

        speichern.setText("speichern");
        speichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speichernActionPerformed(evt);
            }
        });

        jPanel2gr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2grMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2grLayout = new javax.swing.GroupLayout(jPanel2gr);
        jPanel2gr.setLayout(jPanel2grLayout);
        jPanel2grLayout.setHorizontalGroup(
            jPanel2grLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2grLayout.setVerticalGroup(
            jPanel2grLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        waehlen.setText("wählen");
        waehlen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waehlenActionPerformed(evt);
            }
        });

        Verwirbeln.setText("Verwirbeln");
        Verwirbeln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerwirbelnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2gr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(waehlen, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(laden, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(speichern))
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1kl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Verwirbeln)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speichern)
                            .addComponent(laden)
                            .addComponent(waehlen)))
                    .addComponent(jPanel1kl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Verwirbeln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2gr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Auswählen des Bildes
    private void waehlenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waehlenActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("/"));
        int zahl = fc.showOpenDialog(this);
        File f = fc.getSelectedFile();
        jTextField1.setText(f.getAbsolutePath());
    }//GEN-LAST:event_waehlenActionPerformed

    // Laden des Bildes
    private void ladenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ladenActionPerformed
        String pfad = jTextField1.getText();
        if (pfad != null) {
            try {
                bi = ImageIO.read(new File(pfad));
                picture = new Effects(bi);
                bildoriginal = bi;

                Graphics g = jPanel1kl.getGraphics();
                int b = jPanel1kl.getWidth();
                int hneu1 = bildoriginal.getHeight() * b / bildoriginal.getWidth();
                g.drawImage(bildoriginal, 0, 0, b, hneu1, this);

                jPanel2gr.repaint();
            } catch (IOException ex) {
                System.out.println("Beim Laden der Datei ist ein Fehler aufgetreten!");
            }
        }
    }//GEN-LAST:event_ladenActionPerformed

    private void VerwirbelnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerwirbelnActionPerformed
        jLabel1.setText("<html>Bild Verwirbeln: <br> Bitte Wählen sie durch Klicken das Wirbelzentrum aus.</html>");
        v = true;
    }//GEN-LAST:event_VerwirbelnActionPerformed

    private void speichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speichernActionPerformed

        final JFileChooser fc = new JFileChooser();

        fc.setCurrentDirectory(new File("/"));
        int zahl = fc.showSaveDialog(this);
        File f = fc.getSelectedFile();
        System.out.println("Speichern als " + f.getAbsolutePath());

        try {
            ImageIO.write(bi, "png", f);
        } catch (IOException ex) {
            System.out.println("Beim Speichern der Datei ist ein Problem aufgetreten!");
        }
    }//GEN-LAST:event_speichernActionPerformed

    private void jPanel2grMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2grMouseClicked
        if (v == true) {
            if ((y == 0) && (x == 0)) {
                x = evt.getX();
                y = evt.getY();
                jLabel1.setText("<html>Bild Verwirbeln: <br> Wählen sie durch erneutes Klicken den Radius aus</html>");
                double piFaktor = bi.getWidth() * 1.0 / jPanel2gr.getWidth();
                x = (int) (x * piFaktor);
                y = (int) (y * piFaktor);
            } else {
                x1 = evt.getX();
                y1 = evt.getY();
                double piFaktor1 = bi.getWidth() * 1.0 / jPanel2gr.getWidth();
                x1 = (int) (x1 * piFaktor1);
                y1 = (int) (y1 * piFaktor1);

                r = (int) Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
                if ((picture != null)) {
                    bi = picture.Verwirbeln(x, y, 1, r);
                    x = 0;
                    y = 0;
                    x1 = 0;
                    y1 = 0;
                    r = 0;
                    v=false;
                    jPanel2gr.repaint();
                }
            }
        }
    }//GEN-LAST:event_jPanel2grMouseClicked

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
            java.util.logging.Logger.getLogger(Hauptfenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hauptfenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hauptfenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hauptfenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hauptfenster().setVisible(true);
            }
        });
    }

    public void zeichneBildKlein(Graphics h) {
        if (bi != null) {

            int w = jPanel1kl.getWidth();
            int hneu = bildoriginal.getHeight() * w / bildoriginal.getWidth();

            h.drawImage(bildoriginal, 0, 0, w, hneu, this);
        } else {
            h.setColor(new Color(255, 255, 255));
            h.fillRect(0, 0, jPanel1kl.getWidth(), jPanel1kl.getHeight());
        }
    }

    public void zeichneBildGross(Graphics g) {
        if (bi != null) {

            int w = jPanel2gr.getWidth();
            int hneu = bi.getHeight() * w / bi.getWidth();

            g.drawImage(bi, 0, 0, w, hneu, this);
        } else {
            g.setColor(new Color(255, 255, 255));
            g.fillRect(0, 0, jPanel2gr.getWidth(), jPanel2gr.getHeight());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Verwirbeln;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1kl;
    private javax.swing.JPanel jPanel2gr;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton laden;
    private javax.swing.JButton speichern;
    private javax.swing.JButton waehlen;
    // End of variables declaration//GEN-END:variables
}
