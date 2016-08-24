/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elcaro;

import java.awt.Color;

/**
 *
 * @author Walther
 */
public class guiElcaro extends javax.swing.JFrame {

    /**
     * Creates new form guiElcaro
     */
    public guiElcaro() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdCrearArchivo = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btChooseFolder = new javax.swing.JButton();
        jlCarpetaCrearArchivo = new javax.swing.JLabel();
        btCreateFolder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btNuevoDB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btAbrirDB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btNuevoDB1 = new javax.swing.JButton();
        btNuevoDB2 = new javax.swing.JButton();
        btNuevoDB3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elcaro/663px-Oracle_logo_opt.png"))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("database.pitydb");

        jLabel8.setText("Nombre del archivo:");

        btChooseFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elcaro/folder.png"))); // NOI18N

        jlCarpetaCrearArchivo.setText("jLabel9");

        btCreateFolder.setBackground(new java.awt.Color(255, 255, 255));
        btCreateFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crearFolder.png"))); // NOI18N
        btCreateFolder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jdCrearArchivoLayout = new javax.swing.GroupLayout(jdCrearArchivo.getContentPane());
        jdCrearArchivo.getContentPane().setLayout(jdCrearArchivoLayout);
        jdCrearArchivoLayout.setHorizontalGroup(
            jdCrearArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdCrearArchivoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jdCrearArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jlCarpetaCrearArchivo)
                    .addGroup(jdCrearArchivoLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btChooseFolder))
                    .addComponent(btCreateFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jdCrearArchivoLayout.setVerticalGroup(
            jdCrearArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdCrearArchivoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGroup(jdCrearArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdCrearArchivoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdCrearArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btChooseFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCarpetaCrearArchivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCreateFolder)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdCrearArchivoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(54, 54, 54))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/663px-Oracle_logo.svg.png"))); // NOI18N

        btNuevoDB.setBackground(new java.awt.Color(255, 255, 255));
        btNuevoDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dbNew.png"))); // NOI18N
        btNuevoDB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btNuevoDB.setBorderPainted(false);
        btNuevoDB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNuevoDB.setName(""); // NOI18N
        btNuevoDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNuevoDBMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Create New DB");

        btAbrirDB.setBackground(new java.awt.Color(255, 255, 255));
        btAbrirDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dbOpen.png"))); // NOI18N
        btAbrirDB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btAbrirDB.setBorderPainted(false);
        btAbrirDB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAbrirDB.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Open DB");

        btNuevoDB1.setBackground(new java.awt.Color(255, 255, 255));
        btNuevoDB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dbErase.png"))); // NOI18N
        btNuevoDB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btNuevoDB1.setBorderPainted(false);
        btNuevoDB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNuevoDB1.setName(""); // NOI18N

        btNuevoDB2.setBackground(new java.awt.Color(255, 255, 255));
        btNuevoDB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dbLock.png"))); // NOI18N
        btNuevoDB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btNuevoDB2.setBorderPainted(false);
        btNuevoDB2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNuevoDB2.setName(""); // NOI18N

        btNuevoDB3.setBackground(new java.awt.Color(255, 255, 255));
        btNuevoDB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dbInfo.png"))); // NOI18N
        btNuevoDB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btNuevoDB3.setBorderPainted(false);
        btNuevoDB3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNuevoDB3.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Erase DB");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Lock DB");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("HELP!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(171, 171, 171))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNuevoDB1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btNuevoDB2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNuevoDB, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAbrirDB, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btNuevoDB3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel6)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61)
                        .addComponent(btNuevoDB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btAbrirDB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNuevoDB1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNuevoDB2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addComponent(btNuevoDB3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //BT Crear DB Menu Principal
    private void btNuevoDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevoDBMouseClicked
        jdCrearArchivo.getContentPane().setBackground(Color.WHITE);
        jdCrearArchivo.setModal(true);
        jdCrearArchivo.pack();
        jdCrearArchivo.setVisible(true);
    }//GEN-LAST:event_btNuevoDBMouseClicked

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
            java.util.logging.Logger.getLogger(guiElcaro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiElcaro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiElcaro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiElcaro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiElcaro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrirDB;
    private javax.swing.JButton btChooseFolder;
    private javax.swing.JButton btCreateFolder;
    private javax.swing.JButton btNuevoDB;
    private javax.swing.JButton btNuevoDB1;
    private javax.swing.JButton btNuevoDB2;
    private javax.swing.JButton btNuevoDB3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDialog jdCrearArchivo;
    private javax.swing.JLabel jlCarpetaCrearArchivo;
    // End of variables declaration//GEN-END:variables
}
