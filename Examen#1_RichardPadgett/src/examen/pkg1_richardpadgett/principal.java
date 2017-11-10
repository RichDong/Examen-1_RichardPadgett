/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_richardpadgett;

/**
 *
 * @author richa
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        /////////trabajar aqui////////////////
        
        
        
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_sexo = new javax.swing.ButtonGroup();
        bg_tipodepersona = new javax.swing.ButtonGroup();
        todo = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        usuarios = new javax.swing.JPanel();
        admin = new javax.swing.JPanel();
        creacion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_nombrecreacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_passwordcreacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        td_edadc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_ID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rb_femenino = new javax.swing.JRadioButton();
        rb_masculino = new javax.swing.JRadioButton();
        rb_fam = new javax.swing.JRadioButton();
        rb_pers = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        tf_rol = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_trabajo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_peso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_altura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_ocu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_horario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_sueldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        todo.addTab("Inicio de sesion", inicio);

        javax.swing.GroupLayout usuariosLayout = new javax.swing.GroupLayout(usuarios);
        usuarios.setLayout(usuariosLayout);
        usuariosLayout.setHorizontalGroup(
            usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        usuariosLayout.setVerticalGroup(
            usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        todo.addTab("-usuarios-", usuarios);

        javax.swing.GroupLayout adminLayout = new javax.swing.GroupLayout(admin);
        admin.setLayout(adminLayout);
        adminLayout.setHorizontalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        adminLayout.setVerticalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        todo.addTab("Admin", admin);

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Contrasena");

        jLabel3.setText("edad");

        jLabel4.setText("ID");

        jLabel5.setText("sexo");

        bg_sexo.add(rb_femenino);
        rb_femenino.setText("F");

        bg_sexo.add(rb_masculino);
        rb_masculino.setText("M");

        bg_tipodepersona.add(rb_fam);
        rb_fam.setText("Familiar");
        rb_fam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_famActionPerformed(evt);
            }
        });

        bg_tipodepersona.add(rb_pers);
        rb_pers.setText("Personal");

        jLabel6.setText("Rol");

        jLabel7.setText("trabajo");

        jLabel9.setText("peso");

        jLabel10.setText("altura");

        jLabel11.setText("ocupacion");

        jLabel8.setText("horario");

        jLabel12.setText("sueldo");

        javax.swing.GroupLayout creacionLayout = new javax.swing.GroupLayout(creacion);
        creacion.setLayout(creacionLayout);
        creacionLayout.setHorizontalGroup(
            creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creacionLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creacionLayout.createSequentialGroup()
                        .addComponent(rb_fam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb_pers)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creacionLayout.createSequentialGroup()
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(creacionLayout.createSequentialGroup()
                                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(creacionLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(29, 29, 29)
                                        .addComponent(rb_femenino)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb_masculino))
                                    .addComponent(jLabel6)
                                    .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(creacionLayout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tf_nombrecreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(creacionLayout.createSequentialGroup()
                                            .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tf_passwordcreacion)
                                                .addGroup(creacionLayout.createSequentialGroup()
                                                    .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(td_edadc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(0, 81, Short.MAX_VALUE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18))
                            .addGroup(creacionLayout.createSequentialGroup()
                                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(creacionLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(creacionLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(creacionLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12))
                                .addGap(26, 26, 26)))
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_ocu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_horario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addComponent(tf_sueldo, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(48, 48, 48))))
        );
        creacionLayout.setVerticalGroup(
            creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creacionLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombrecreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_passwordcreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(td_edadc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb_femenino)
                    .addComponent(rb_masculino))
                .addGap(18, 18, 18)
                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_fam)
                    .addComponent(rb_pers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creacionLayout.createSequentialGroup()
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(creacionLayout.createSequentialGroup()
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tf_ocu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf_horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tf_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        todo.addTab("Crear usuarios", creacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(todo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(todo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_famActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_famActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_famActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admin;
    private javax.swing.ButtonGroup bg_sexo;
    private javax.swing.ButtonGroup bg_tipodepersona;
    private javax.swing.JPanel creacion;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rb_fam;
    private javax.swing.JRadioButton rb_femenino;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JRadioButton rb_pers;
    private javax.swing.JTextField td_edadc;
    private javax.swing.JTextField tf_ID;
    private javax.swing.JTextField tf_altura;
    private javax.swing.JTextField tf_horario;
    private javax.swing.JTextField tf_nombrecreacion;
    private javax.swing.JTextField tf_ocu;
    private javax.swing.JTextField tf_passwordcreacion;
    private javax.swing.JTextField tf_peso;
    private javax.swing.JTextField tf_rol;
    private javax.swing.JTextField tf_sueldo;
    private javax.swing.JTextField tf_trabajo;
    private javax.swing.JTabbedPane todo;
    private javax.swing.JPanel usuarios;
    // End of variables declaration//GEN-END:variables
}
