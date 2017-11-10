/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_richardpadgett;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class principal extends javax.swing.JFrame {

    ArrayList<objetos> objtotal = new ArrayList();
    ArrayList<Persona> listaus = new ArrayList();

    public principal() {
        initComponents();
        /////////trabajar aqui////////////////
        todo.setEnabledAt(1, false);
        todo.setEnabledAt(3, false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_sexo = new javax.swing.ButtonGroup();
        bg_tipodepersona = new javax.swing.ButtonGroup();
        bg_tipodeobjeto = new javax.swing.ButtonGroup();
        rolesdefamilia = new javax.swing.ButtonGroup();
        todo = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tf_inicious = new javax.swing.JTextField();
        tf_pass = new javax.swing.JTextField();
        usuarios = new javax.swing.JPanel();
        creacion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_nombrecreacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_passwordcreacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_edadc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_ID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rb_femenino = new javax.swing.JRadioButton();
        rb_masculino = new javax.swing.JRadioButton();
        rb_fam = new javax.swing.JRadioButton();
        rb_pers = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
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
        jb_guardaruser = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tf_trabajado = new javax.swing.JTextField();
        rb_madre = new javax.swing.JRadioButton();
        rb_hermana = new javax.swing.JRadioButton();
        rb_esposo = new javax.swing.JRadioButton();
        rb_padre = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        tf_ecivil = new javax.swing.JTextField();
        admin = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        rb_zapato = new javax.swing.JRadioButton();
        rb_ropa = new javax.swing.JRadioButton();
        rb_objetoh = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_color = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_desc = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        tf_tamano = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tf_calidad = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tf_precio = new javax.swing.JTextField();
        rb_cobjeto = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        tf_tallaz = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tf_tiposuela = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tf_confort = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tf_tallaR = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tf_material = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tf_paisel = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tf_tiempovida = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tf_areacasa = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        dc_fechacompra = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel30.setText("LOG IN");

        jLabel31.setText("Nombre");

        jLabel32.setText("password");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel30))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addGap(35, 35, 35)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_inicious)
                            .addComponent(tf_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel30)
                .addGap(26, 26, 26)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tf_inicious, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        todo.addTab("Inicio de sesion", inicio);

        javax.swing.GroupLayout usuariosLayout = new javax.swing.GroupLayout(usuarios);
        usuarios.setLayout(usuariosLayout);
        usuariosLayout.setHorizontalGroup(
            usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        usuariosLayout.setVerticalGroup(
            usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        todo.addTab("-usuarios-", usuarios);

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

        jb_guardaruser.setText("Guardar usuario");
        jb_guardaruser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardaruserMouseClicked(evt);
            }
        });

        jLabel13.setText("Tiempo trabajado");

        rolesdefamilia.add(rb_madre);
        rb_madre.setText("madre");

        rolesdefamilia.add(rb_hermana);
        rb_hermana.setText("hermana");

        rolesdefamilia.add(rb_esposo);
        rb_esposo.setText("esposo");

        rolesdefamilia.add(rb_padre);
        rb_padre.setText("padre");

        jLabel33.setText("estado civil");

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
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(rb_femenino)
                                .addGap(18, 18, 18)
                                .addComponent(rb_masculino))
                            .addGroup(creacionLayout.createSequentialGroup()
                                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(creacionLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(creacionLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(creacionLayout.createSequentialGroup()
                                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(193, 193, 193)
                                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)))
                            .addGroup(creacionLayout.createSequentialGroup()
                                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_madre)
                                    .addComponent(rb_hermana)
                                    .addComponent(rb_esposo))
                                .addGap(18, 18, 18)
                                .addComponent(rb_padre)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_ocu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_trabajado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addComponent(tf_horario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_sueldo, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(48, 48, 48))
                    .addGroup(creacionLayout.createSequentialGroup()
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                            .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(creacionLayout.createSequentialGroup()
                                                .addComponent(tf_edadc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel33)))
                                        .addGap(0, 4, Short.MAX_VALUE)))))
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(creacionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addComponent(jb_guardaruser)
                                .addGap(87, 87, 87))
                            .addGroup(creacionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_ecivil, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
                    .addComponent(tf_passwordcreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_guardaruser))
                .addGap(18, 18, 18)
                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_edadc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(tf_ecivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jLabel11)
                            .addComponent(tf_ocu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf_horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tf_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tf_trabajado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(creacionLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_madre)
                    .addComponent(rb_padre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_hermana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_esposo)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        todo.addTab("Crear usuarios", creacion);

        jLabel14.setText("crear objetos");

        bg_tipodeobjeto.add(rb_zapato);
        rb_zapato.setText("Zapatos");

        bg_tipodeobjeto.add(rb_ropa);
        rb_ropa.setText("Ropa");

        bg_tipodeobjeto.add(rb_objetoh);
        rb_objetoh.setText("Objeto de hogar");

        jLabel15.setText("tipo de objeto");

        jLabel16.setText("Color");

        jLabel17.setText("Descripcion");

        tf_desc.setColumns(20);
        tf_desc.setRows(5);
        jScrollPane1.setViewportView(tf_desc);

        jLabel18.setText("Tamano");

        jLabel19.setText("Calidad");

        jLabel20.setText("Precio");

        rb_cobjeto.setText("Crear Objeto");
        rb_cobjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_cobjetoMouseClicked(evt);
            }
        });

        jLabel21.setText("talla");

        jLabel22.setText("suela");

        jLabel23.setText("confort");

        jLabel24.setText("talla");

        jLabel25.setText("Material");

        jLabel26.setText("Pais de elaboracion");

        jLabel27.setText("tiempo de vida");

        jLabel28.setText("Area de la casa");

        jLabel29.setText("fecha de compra");

        javax.swing.GroupLayout adminLayout = new javax.swing.GroupLayout(admin);
        admin.setLayout(adminLayout);
        adminLayout.setHorizontalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminLayout.createSequentialGroup()
                        .addComponent(rb_zapato)
                        .addGap(100, 100, 100)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(tf_tallaR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(adminLayout.createSequentialGroup()
                                .addComponent(rb_ropa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rb_objetoh)
                                .addGap(104, 104, 104))))
                    .addGroup(adminLayout.createSequentialGroup()
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addGroup(adminLayout.createSequentialGroup()
                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(adminLayout.createSequentialGroup()
                                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLayout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(adminLayout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addGap(13, 13, 13)))
                                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tf_calidad, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                            .addComponent(tf_tamano)))
                                    .addGroup(adminLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_precio))))
                            .addGroup(adminLayout.createSequentialGroup()
                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(adminLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_confort))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminLayout.createSequentialGroup()
                                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLayout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addGap(18, 18, 18))
                                            .addGroup(adminLayout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addGap(13, 13, 13)))
                                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_tallaz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_tiposuela, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(44, 44, 44)
                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addGroup(adminLayout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_material, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tf_paisel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(114, 114, 114)
                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addGroup(adminLayout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_areacasa, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(adminLayout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dc_fechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(42, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_cobjeto)
                    .addComponent(tf_tiempovida, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        adminLayout.setVerticalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(tf_tamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(adminLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(tf_calidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(adminLayout.createSequentialGroup()
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_zapato)
                            .addComponent(rb_ropa)
                            .addComponent(rb_objetoh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(tf_tallaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(tf_tallaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(tf_tiempovida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(tf_tiposuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(tf_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(tf_areacasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(tf_confort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel29)))
                    .addComponent(dc_fechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_paisel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rb_cobjeto)
                .addGap(28, 28, 28))
        );

        todo.addTab("Admin", admin);

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

    private void jb_guardaruserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardaruserMouseClicked
        ///// guardar usuarios
        if (rb_fam.isSelected()) {
            listaus.add(new Familiares(bg_tipodepersona.getSelection().toString(), tf_trabajo.getText(), tf_altura.getText(), tf_peso.getText(), tf_nombrecreacion.getText(), tf_passwordcreacion.getText(), tf_edadc.getText(), tf_ID.getText(), bg_sexo.getSelection().toString(), tf_ecivil.getText()));
        }
        if (rb_pers.isSelected()) {
            listaus.add(new Personal(tf_ocu.getText(), tf_horario.getText(), tf_trabajado.getText(), tf_sueldo.getText(), tf_nombrecreacion.getText(), tf_passwordcreacion.getText(), tf_edadc.getText(), tf_ID.getText(), bg_sexo.getSelection().toString(), tf_ecivil.getText()));
        }

    }//GEN-LAST:event_jb_guardaruserMouseClicked

    private void rb_cobjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_cobjetoMouseClicked
        /// guardar objetos
        if (rb_ropa.isSelected()) {
            objtotal.add(new Ropa(Integer.parseInt(tf_tallaR.getText()), tf_material.getText(), tf_paisel.getText(), tf_color.getText(), tf_desc.getText(), Integer.parseInt(tf_tamano.getText()), Integer.parseInt(tf_calidad.getText())));
        }
        if (rb_zapato.isSelected()) {
            objtotal.add(new zapatos(Integer.parseInt(tf_tallaz.getText()),tf_tiposuela.getText(),Integer.parseInt(tf_confort.getText()),tf_color.getText(),tf_desc.getText(),Integer.parseInt(tf_tamano.getText()),Integer.parseInt(tf_calidad.getText())));
        }
        if (rb_objetoh.isSelected()) {

        }
        String us = JOptionPane.showInputDialog(this, "ingrese quien es dueno de este objeto");
    }//GEN-LAST:event_rb_cobjetoMouseClicked

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
    private javax.swing.ButtonGroup bg_tipodeobjeto;
    private javax.swing.ButtonGroup bg_tipodepersona;
    private javax.swing.JPanel creacion;
    private com.toedter.calendar.JDateChooser dc_fechacompra;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_guardaruser;
    private javax.swing.JButton rb_cobjeto;
    private javax.swing.JRadioButton rb_esposo;
    private javax.swing.JRadioButton rb_fam;
    private javax.swing.JRadioButton rb_femenino;
    private javax.swing.JRadioButton rb_hermana;
    private javax.swing.JRadioButton rb_madre;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JRadioButton rb_objetoh;
    private javax.swing.JRadioButton rb_padre;
    private javax.swing.JRadioButton rb_pers;
    private javax.swing.JRadioButton rb_ropa;
    private javax.swing.JRadioButton rb_zapato;
    private javax.swing.ButtonGroup rolesdefamilia;
    private javax.swing.JTextField tf_ID;
    private javax.swing.JTextField tf_altura;
    private javax.swing.JTextField tf_areacasa;
    private javax.swing.JTextField tf_calidad;
    private javax.swing.JTextField tf_color;
    private javax.swing.JTextField tf_confort;
    private javax.swing.JTextArea tf_desc;
    private javax.swing.JTextField tf_ecivil;
    private javax.swing.JTextField tf_edadc;
    private javax.swing.JTextField tf_horario;
    private javax.swing.JTextField tf_inicious;
    private javax.swing.JTextField tf_material;
    private javax.swing.JTextField tf_nombrecreacion;
    private javax.swing.JTextField tf_ocu;
    private javax.swing.JTextField tf_paisel;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_passwordcreacion;
    private javax.swing.JTextField tf_peso;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_sueldo;
    private javax.swing.JTextField tf_tallaR;
    private javax.swing.JTextField tf_tallaz;
    private javax.swing.JTextField tf_tamano;
    private javax.swing.JTextField tf_tiempovida;
    private javax.swing.JTextField tf_tiposuela;
    private javax.swing.JTextField tf_trabajado;
    private javax.swing.JTextField tf_trabajo;
    private javax.swing.JTabbedPane todo;
    private javax.swing.JPanel usuarios;
    // End of variables declaration//GEN-END:variables
}
