/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_richardpadgett;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        usuarios = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_mensaje = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        jb_enviarmensaje = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_contactos = new javax.swing.JTable();
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
        rb_hermano = new javax.swing.JRadioButton();
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
        jLabel34 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_instru = new javax.swing.JTextArea();
        jb_modificar = new javax.swing.JButton();
        tf_eliminar = new javax.swing.JButton();
        inicio = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tf_iniciodeusuario = new javax.swing.JTextField();
        tf_pass = new javax.swing.JTextField();
        jb_iniciarsesion = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel35.setText("bienvenido");

        ta_mensaje.setColumns(20);
        ta_mensaje.setRows(5);
        jScrollPane3.setViewportView(ta_mensaje);

        jLabel36.setText("Escriba su mensaje");

        jb_enviarmensaje.setText("Enviar mensaje");
        jb_enviarmensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_enviarmensajeMouseClicked(evt);
            }
        });

        jt_contactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jt_contactos);

        javax.swing.GroupLayout usuariosLayout = new javax.swing.GroupLayout(usuarios);
        usuarios.setLayout(usuariosLayout);
        usuariosLayout.setHorizontalGroup(
            usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosLayout.createSequentialGroup()
                .addGroup(usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuariosLayout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel35))
                    .addGroup(usuariosLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addGroup(usuariosLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jb_enviarmensaje))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        usuariosLayout.setVerticalGroup(
            usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel35)
                .addGap(29, 29, 29)
                .addComponent(jLabel36)
                .addGroup(usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuariosLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jb_enviarmensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(usuariosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
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
        jb_guardaruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardaruserActionPerformed(evt);
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

        rb_hermano.setText("hermano");

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
                                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_padre)
                                    .addComponent(rb_hermano))))
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
                                        .addGap(0, 130, Short.MAX_VALUE)))))
                        .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(creacionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_madre)
                    .addComponent(rb_padre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(creacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_hermana)
                    .addComponent(rb_hermano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_esposo)
                .addContainerGap(170, Short.MAX_VALUE))
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

        jLabel34.setText("Instrucciones");

        ta_instru.setColumns(20);
        ta_instru.setRows(5);
        jScrollPane2.setViewportView(ta_instru);

        jb_modificar.setText("Modificar");
        jb_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarMouseClicked(evt);
            }
        });

        tf_eliminar.setText("Eliminar");
        tf_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_eliminarMouseClicked(evt);
            }
        });

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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                                        .addComponent(tf_precio)))
                                .addGap(118, 118, 118)
                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb_modificar)
                                    .addComponent(tf_eliminar)))
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
                                    .addGroup(adminLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_tiempovida, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(adminLayout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_areacasa, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(adminLayout.createSequentialGroup()
                                            .addComponent(jLabel29)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dc_fechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminLayout.createSequentialGroup()
                                            .addComponent(jLabel34)
                                            .addGap(20, 20, 20)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(rb_objetoh))))
                        .addContainerGap(250, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rb_cobjeto)
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
                    .addComponent(tf_tamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_modificar))
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
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(adminLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(tf_eliminar)))))
                .addGap(9, 9, 9)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminLayout.createSequentialGroup()
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(tf_confort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)))
                            .addGroup(adminLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_paisel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(21, 21, 21)
                        .addComponent(rb_cobjeto))
                    .addComponent(dc_fechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        todo.addTab("Admin", admin);

        jLabel30.setText("LOG IN");

        jLabel31.setText("Nombre");

        jLabel32.setText("password");

        jb_iniciarsesion.setText("Iniciar sesion");
        jb_iniciarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_iniciarsesionMouseClicked(evt);
            }
        });

        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\richa\\Documents\\NetBeansProjects\\j5NOs7Dj_400x400.jpg")); // NOI18N
        jLabel37.setText("jLabel37");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(tf_iniciodeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel30))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31))
                        .addGap(102, 102, 102)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_iniciarsesion)
                            .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel30)
                .addGap(29, 29, 29)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tf_iniciodeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jb_iniciarsesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        todo.addTab("Inicio de sesion", inicio);

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
        int espo = 0;
        int padr = 0;
        int hermana = 0;
        int hermano = 0;
        int madre = 0;

        if (rb_fam.isSelected() && rb_esposo.isSelected()) {
            listaus.add(new Familiares(bg_tipodepersona.getSelection().toString(), tf_trabajo.getText(), tf_altura.getText(), tf_peso.getText(), tf_nombrecreacion.getText(), tf_passwordcreacion.getText(), tf_edadc.getText(), tf_ID.getText(), bg_sexo.getSelection().toString(), tf_ecivil.getText()));
            espo++;
            DefaultTableModel model = (DefaultTableModel) jt_contactos.getModel();
            Object[] n = {tf_nombrecreacion.getText()};
            model.addRow(n);
            jt_contactos.setModel(model);
            JOptionPane.showMessageDialog(this, "usuario guardado");

            if (espo > 1) {
                JOptionPane.showMessageDialog(this, "NO SE PUEDE");
            }
        }
        if (rb_fam.isSelected() && rb_padre.isSelected()) {
            listaus.add(new Familiares(bg_tipodepersona.getSelection().toString(), tf_trabajo.getText(), tf_altura.getText(), tf_peso.getText(), tf_nombrecreacion.getText(), tf_passwordcreacion.getText(), tf_edadc.getText(), tf_ID.getText(), bg_sexo.getSelection().toString(), tf_ecivil.getText()));
            padr++;
            DefaultTableModel model = (DefaultTableModel) jt_contactos.getModel();
            Object[] n = {tf_nombrecreacion.getText()};
            model.addRow(n);
            jt_contactos.setModel(model);
            JOptionPane.showMessageDialog(this, "usuario guardado");

            if (padr > 1) {
                JOptionPane.showMessageDialog(this, "NO SE PUEDE");
            }
        }
        if (rb_fam.isSelected() && rb_hermana.isSelected()) {
            listaus.add(new Familiares(bg_tipodepersona.getSelection().toString(), tf_trabajo.getText(), tf_altura.getText(), tf_peso.getText(), tf_nombrecreacion.getText(), tf_passwordcreacion.getText(), tf_edadc.getText(), tf_ID.getText(), bg_sexo.getSelection().toString(), tf_ecivil.getText()));
            hermana++;
            DefaultTableModel model = (DefaultTableModel) jt_contactos.getModel();
            Object[] n = {tf_nombrecreacion.getText()};
            model.addRow(n);
            jt_contactos.setModel(model);
            JOptionPane.showMessageDialog(this, "usuario guardado");

            if (hermana > 4) {
                JOptionPane.showMessageDialog(this, "NO SE PUEDE");
            }
        }
        
        
        
        if (rb_fam.isSelected() && rb_hermano.isSelected()) {
            listaus.add(new Familiares(bg_tipodepersona.getSelection().toString(), tf_trabajo.getText(), tf_altura.getText(), tf_peso.getText(), tf_nombrecreacion.getText(), tf_passwordcreacion.getText(), tf_edadc.getText(), tf_ID.getText(), bg_sexo.getSelection().toString(), tf_ecivil.getText()));
            hermano++;
            DefaultTableModel model = (DefaultTableModel) jt_contactos.getModel();
            Object[] n = {tf_nombrecreacion.getText()};
            model.addRow(n);
            jt_contactos.setModel(model);
            JOptionPane.showMessageDialog(this, "usuario guardado");

            if (hermano > 1) {
                JOptionPane.showMessageDialog(this, "NO SE PUEDE");
            }
        }
        if (rb_fam.isSelected() && rb_madre.isSelected()) {
            listaus.add(new Familiares(bg_tipodepersona.getSelection().toString(), tf_trabajo.getText(), tf_altura.getText(), tf_peso.getText(), tf_nombrecreacion.getText(), tf_passwordcreacion.getText(), tf_edadc.getText(), tf_ID.getText(), bg_sexo.getSelection().toString(), tf_ecivil.getText()));
            madre++;
            DefaultTableModel model = (DefaultTableModel) jt_contactos.getModel();
            Object[] n = {tf_nombrecreacion.getText()};
            model.addRow(n);
            jt_contactos.setModel(model);
            JOptionPane.showMessageDialog(this, "usuario guardado");

            if (madre > 1) {
                JOptionPane.showMessageDialog(this, "NO SE PUEDE");
            }
        }
        if (rb_pers.isSelected()) {
            listaus.add(new Personal(tf_ocu.getText(), tf_horario.getText(), tf_trabajado.getText(), tf_sueldo.getText(), tf_nombrecreacion.getText(), tf_passwordcreacion.getText(), tf_edadc.getText(), tf_ID.getText(), bg_sexo.getSelection().toString(), tf_ecivil.getText()));
            JOptionPane.showMessageDialog(this, "usuario guardado");
            DefaultTableModel model = (DefaultTableModel) jt_contactos.getModel();
            Object[] n = {tf_nombrecreacion.getText()};
            model.addRow(n);
            jt_contactos.setModel(model);
        }


    }//GEN-LAST:event_jb_guardaruserMouseClicked

    private void rb_cobjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_cobjetoMouseClicked
        /// guardar objetos
        if (rb_ropa.isSelected()) {
            objtotal.add(new Ropa(Integer.parseInt(tf_tallaR.getText()), tf_material.getText(), tf_paisel.getText(), tf_color.getText(), tf_desc.getText(), Integer.parseInt(tf_tamano.getText()), Integer.parseInt(tf_calidad.getText())));
        }
        if (rb_zapato.isSelected()) {
            objtotal.add(new zapatos(Integer.parseInt(tf_tallaz.getText()), tf_tiposuela.getText(), Integer.parseInt(tf_confort.getText()), tf_color.getText(), tf_desc.getText(), Integer.parseInt(tf_tamano.getText()), Integer.parseInt(tf_calidad.getText())));
        }
        if (rb_objetoh.isSelected()) {
            objtotal.add(new objetoshogar(Integer.parseInt(tf_tiempovida.getText()), tf_areacasa.getText(), ta_instru.getText(), dc_fechacompra.getDate(), tf_color.getText(), tf_desc.getText(), Integer.parseInt(tf_tamano.getText()), Integer.parseInt(tf_calidad.getText())));
        }
        String us = JOptionPane.showInputDialog(this, "ingrese quien es dueno de este objeto");
        for (int i = 0; i <= listaus.size(); i++) {
            if (listaus.get(i) instanceof Familiares) {

            }
        }

    }//GEN-LAST:event_rb_cobjetoMouseClicked

    private void jb_iniciarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_iniciarsesionMouseClicked
        for (Persona p : listaus) {
            if (p.getNombre().equals(tf_iniciodeusuario.getText()) && (p.getPass().equals(tf_pass.getText()))) {
                todo.setEnabledAt(1, true);

            }
        }
        if (tf_iniciodeusuario.getText().equals("KIMK4RDASHIAN") && (tf_pass.equals("elmejorprogramadelatele"))) {
            todo.setEnabledAt(1, true);
            todo.setEnabledAt(3, true);
        }
    }//GEN-LAST:event_jb_iniciarsesionMouseClicked

    private void tf_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_eliminarMouseClicked
        int el = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posicion del objeto que desea eliminar"));
        objtotal.remove(el);
        JOptionPane.showMessageDialog(this, "Objeto removido");


    }//GEN-LAST:event_tf_eliminarMouseClicked

    private void jb_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarMouseClicked
        int mod = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posicion del objeto que desea modificar"));
        if (objtotal.get(mod) instanceof Ropa) {
            String nc = JOptionPane.showInputDialog(this, "Ingrese el nuevo color");
            ((Ropa) objtotal.get(mod)).setColor(nc);
            String nd = JOptionPane.showInputDialog(this, "Ingrese la nueva descripcion");
            ((Ropa) objtotal.get(mod)).setDesc(nc);
            int ntam = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el nuevo tamano"));
            ((Ropa) objtotal.get(mod)).setTamano(ntam);
            int ncal = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la calidad"));
            ((Ropa) objtotal.get(mod)).setCalidad(ncal);
            int nt = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la nueva talla"));
            ((Ropa) objtotal.get(mod)).setTalla_r(nt);
            String nm = JOptionPane.showInputDialog(this, "ingrese el nuevo material");
            ((Ropa) objtotal.get(mod)).setMaterial(nm);
            String paisn = JOptionPane.showInputDialog(this, "ingrese el nuevo pais");
            ((Ropa) objtotal.get(mod)).setPais_e(paisn);

        }
        if (objtotal.get(mod) instanceof zapatos) {
            String nc = JOptionPane.showInputDialog(this, "Ingrese el nuevo color");
            ((zapatos) objtotal.get(mod)).setColor(nc);
            String nd = JOptionPane.showInputDialog(this, "Ingrese la nueva descripcion");
            ((zapatos) objtotal.get(mod)).setDesc(nc);
            int ntam = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el nuevo tamano"));
            ((zapatos) objtotal.get(mod)).setTamano(ntam);
            int ncal = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la calidad"));
            ((zapatos) objtotal.get(mod)).setCalidad(ncal);
            int nt = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la nueva talla"));
            ((zapatos) objtotal.get(mod)).setTalla(nt);
            String tn = JOptionPane.showInputDialog(this, "Ingrese el nuevo tipo de suela");
            ((zapatos) objtotal.get(mod)).setTiposuela(tn);
            int con = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el confort"));
            ((zapatos) objtotal.get(mod)).setConfort(con);
        }
        if (objtotal.get(mod) instanceof objetoshogar) {
            String nc = JOptionPane.showInputDialog(this, "Ingrese el nuevo color");
            ((objetoshogar) objtotal.get(mod)).setColor(nc);
            String nd = JOptionPane.showInputDialog(this, "Ingrese la nueva descripcion");
            ((objetoshogar) objtotal.get(mod)).setDesc(nc);
            int ntam = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el nuevo tamano"));
            ((objetoshogar) objtotal.get(mod)).setTamano(ntam);
            int ncal = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la calidad"));
            ((objetoshogar) objtotal.get(mod)).setCalidad(ncal);
            int nv = Integer.parseInt(JOptionPane.showInputDialog(this, "ingrese nueva vida"));
            ((objetoshogar) objtotal.get(mod)).setT_vida(nv);
            String nac = JOptionPane.showInputDialog(this, "Ingrese la nueva area de la casa");
            ((objetoshogar) objtotal.get(mod)).setA_casa(nac);
            String ninst = JOptionPane.showInputDialog(this, "Ingrese la nueva instruccion");
            String ndate = JOptionPane.showInputDialog(this, "Ingrese la nueva fecha");

        }
    }//GEN-LAST:event_jb_modificarMouseClicked

    private void jb_guardaruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardaruserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_guardaruserActionPerformed

    private void jb_enviarmensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_enviarmensajeMouseClicked
        int posm = Integer.parseInt(JOptionPane.showInputDialog(this, "ingrese la posicion de a la persona que desea enviar"));
        listaus.get(posm).getMensajes().add(ta_mensaje.getText());

    }//GEN-LAST:event_jb_enviarmensajeMouseClicked

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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jb_enviarmensaje;
    private javax.swing.JButton jb_guardaruser;
    private javax.swing.JButton jb_iniciarsesion;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JTable jt_contactos;
    private javax.swing.JButton rb_cobjeto;
    private javax.swing.JRadioButton rb_esposo;
    private javax.swing.JRadioButton rb_fam;
    private javax.swing.JRadioButton rb_femenino;
    private javax.swing.JRadioButton rb_hermana;
    private javax.swing.JRadioButton rb_hermano;
    private javax.swing.JRadioButton rb_madre;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JRadioButton rb_objetoh;
    private javax.swing.JRadioButton rb_padre;
    private javax.swing.JRadioButton rb_pers;
    private javax.swing.JRadioButton rb_ropa;
    private javax.swing.JRadioButton rb_zapato;
    private javax.swing.ButtonGroup rolesdefamilia;
    private javax.swing.JTextArea ta_instru;
    private javax.swing.JTextArea ta_mensaje;
    private javax.swing.JTextField tf_ID;
    private javax.swing.JTextField tf_altura;
    private javax.swing.JTextField tf_areacasa;
    private javax.swing.JTextField tf_calidad;
    private javax.swing.JTextField tf_color;
    private javax.swing.JTextField tf_confort;
    private javax.swing.JTextArea tf_desc;
    private javax.swing.JTextField tf_ecivil;
    private javax.swing.JTextField tf_edadc;
    private javax.swing.JButton tf_eliminar;
    private javax.swing.JTextField tf_horario;
    private javax.swing.JTextField tf_iniciodeusuario;
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
