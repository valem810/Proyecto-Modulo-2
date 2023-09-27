
package com.mycompany.archivos_secuenciales;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class main extends javax.swing.JFrame {
    Files f;
    contacto cto;
    contacto admin;
    //boolean band=false;
    boolean ban=false;
    //int contID=1;

    public main() {
        initComponents();
        f=new Files();
      
        admin=new contacto();
        admin.setId(0);
        admin.setNombre("Vale");
        admin.setPaterno("Miranda");
        admin.setMaterno("Mercado");
        admin.setUsername("valem");
        admin.setTelefono("3322241466");
        admin.setDireccion("plata");
        admin.setPassword("123");
        admin.setPerfil("Admin");
        try {
            if(f.BuscarContacto(admin)==null){
                 f.Guardar(admin);
            }
        } catch (FileNotFoundException ex) {
            
        }
            tpane.setEnabledAt(1, false);
            tpane.setEnabledAt(2, false);
            tpane.setEnabledAt(3, false);
            tpane.setEnabledAt(4, false);
            tpane.setEnabledAt(5, false);
        
 
    }
     public void Habilitar(){
        txtNombre.setEditable(true);
        txtPaterno.setEditable(true);
        txtMaterno.setEditable(true);
        txtTelefono.setEditable(true);
        txtUsername.setEditable(true);
        cbPerfil.setEditable(true);
        txtDireccion.setEditable(true);
        txtPsw.setEditable(true);
    }
     public void Deshabilitar(){
        txtNombre.setEditable(false);
        txtPaterno.setEditable(false);
        txtMaterno.setEditable(false);
        txtTelefono.setEditable(false);
        txtUsername.setEditable(false);
        cbPerfil.setEditable(false);
        txtDireccion.setEditable(false);
        txtPsw.setEditable(false);
        
        txtNombre.setText("");
        txtTelefono.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtUsername.setText("");
        cbPerfil.setSelectedItem("");
        txtDireccion.setText("");
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpane = new javax.swing.JTabbedPane();
        pnlLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnAutentificar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        pnlUsuarios = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        labelBuscarid = new java.awt.Label();
        labelID = new java.awt.Label();
        labelNombre = new java.awt.Label();
        label4 = new java.awt.Label();
        txtBuscar = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        cbPerfil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtPsw = new javax.swing.JTextField();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlClientes = new javax.swing.JPanel();
        pnlVehiculos = new javax.swing.JPanel();
        pnlReparaciones = new javax.swing.JPanel();
        pnlPiezas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Password:");

        btnAutentificar.setText("Autentificar");
        btnAutentificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutentificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnAutentificar)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnAutentificar)
                .addGap(138, 138, 138))
        );

        tpane.addTab("Login", pnlLogin);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labelBuscarid.setText("Ingrese ID:");

        labelID.setText("ID:");

        labelNombre.setText("Nombre:");

        label4.setText("Telefono:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido Paterno:");

        jLabel4.setText("Apellido Materno:");

        jLabel5.setText("Username:");

        txtPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaternoActionPerformed(evt);
            }
        });

        txtMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaternoActionPerformed(evt);
            }
        });

        cbPerfil.setEditable(true);
        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Gerente", "Secretaria", "Mecánico" }));

        jLabel6.setText("Perfil:");

        jLabel7.setText("Dirección:");

        lblPassword.setText("Password:");

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUsuariosLayout = new javax.swing.GroupLayout(pnlUsuarios);
        pnlUsuarios.setLayout(pnlUsuariosLayout);
        pnlUsuariosLayout.setHorizontalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsuariosLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemover)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar))
                            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                                .addComponent(lblPassword)
                                .addGap(18, 18, 18)
                                .addComponent(txtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsuariosLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlUsuariosLayout.createSequentialGroup()
                                        .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addGroup(pnlUsuariosLayout.createSequentialGroup()
                                        .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtMaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                            .addComponent(txtPaterno, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion)
                                    .addComponent(cbPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsuariosLayout.createSequentialGroup()
                                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlUsuariosLayout.createSequentialGroup()
                                        .addComponent(labelBuscarid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBuscar))
                                    .addGroup(pnlUsuariosLayout.createSequentialGroup()
                                        .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSalir)
                                    .addComponent(btnBuscar))
                                .addGap(33, 33, 33)))))
                .addGap(46, 46, 46))
        );
        pnlUsuariosLayout.setVerticalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlUsuariosLayout.createSequentialGroup()
                        .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBuscarid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBuscar)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalir)))
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUsuariosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsuariosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUsuariosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(pnlUsuariosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 25, Short.MAX_VALUE)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword)
                    .addComponent(txtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(btnRemover)
                    .addComponent(btnCancelar))
                .addGap(61, 61, 61))
        );

        tpane.addTab("Usuarios", pnlUsuarios);

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        tpane.addTab("Clientes", pnlClientes);

        javax.swing.GroupLayout pnlVehiculosLayout = new javax.swing.GroupLayout(pnlVehiculos);
        pnlVehiculos.setLayout(pnlVehiculosLayout);
        pnlVehiculosLayout.setHorizontalGroup(
            pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );
        pnlVehiculosLayout.setVerticalGroup(
            pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        tpane.addTab("Vehículos", pnlVehiculos);

        javax.swing.GroupLayout pnlReparacionesLayout = new javax.swing.GroupLayout(pnlReparaciones);
        pnlReparaciones.setLayout(pnlReparacionesLayout);
        pnlReparacionesLayout.setHorizontalGroup(
            pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );
        pnlReparacionesLayout.setVerticalGroup(
            pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        tpane.addTab("Reparaciones", pnlReparaciones);

        javax.swing.GroupLayout pnlPiezasLayout = new javax.swing.GroupLayout(pnlPiezas);
        pnlPiezas.setLayout(pnlPiezasLayout);
        pnlPiezasLayout.setHorizontalGroup(
            pnlPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );
        pnlPiezasLayout.setVerticalGroup(
            pnlPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        tpane.addTab("Piezas", pnlPiezas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       try {
            cto=new contacto();
            cto.setId(Integer.parseInt(txtBuscar.getText()));
            
            cto=f.BuscarContacto(cto);
            

            if(cto!=null){
                if(cto.getId()==0){
                btnSalvar.setEnabled(false);
                btnNuevo.setEnabled(true);
                btnEditar.setEnabled(false);
                btnRemover.setEnabled(false);
                btnCancelar.setEnabled(false);
                }
                else{
                    btnSalvar.setEnabled(false);
                    btnNuevo.setEnabled(true);
                    btnEditar.setEnabled(true);
                    btnRemover.setEnabled(true);
                    btnCancelar.setEnabled(false);
                }
                Deshabilitar();
                txtPsw.setVisible(false);
                lblPassword.setVisible(false);
                
                txtBuscar.setText("");
                txtID.setText(String.valueOf(cto.getId()));
                txtNombre.setText(cto.getNombre());
                txtTelefono.setText(cto.getTelefono());
                txtPaterno.setText(cto.getPaterno());
                txtMaterno.setText(cto.getMaterno());
                txtUsername.setText(cto.getUsername());
                cbPerfil.setSelectedItem(cto.getPerfil());
                txtDireccion.setText(cto.getDireccion());
               
                
            }else{
            JOptionPane.showMessageDialog(null, "No existe ese ID");
            txtBuscar.setText("");}
            
        } catch (FileNotFoundException ex) {

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      /* if(band){
           contID++;
           band=false;
       }*/
    Habilitar();
    txtPsw.setVisible(true);
    lblPassword.setVisible(true);
                
    btnSalvar.setEnabled(true);
    btnNuevo.setEnabled(false);
    btnEditar.setEnabled(false);
    btnRemover.setEnabled(false);
    btnCancelar.setEnabled(false);

    txtID.setText("");
    txtNombre.setText("");
    txtTelefono.setText("");
    txtPaterno.setText("");
    txtMaterno.setText("");
    txtUsername.setText("");
    cbPerfil.setSelectedItem("");
    txtDireccion.setText("");
    txtPsw.setText("");
       
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            cto=new contacto();
            cto.setUsername(txtUsername.getText());

            if(ban!=true &&  f.BuscarUsuario(cto)!=null){
                JOptionPane.showMessageDialog(null, "Ese Nombre de Usuario ya existe");
                return;
            }
            
            cto.setId(Integer.parseInt(txtID.getText()));
            cto.setNombre(txtNombre.getText());
            cto.setTelefono(txtTelefono.getText());
            cto.setPaterno(txtPaterno.getText());
            cto.setMaterno(txtMaterno.getText());
            cto.setPerfil(cbPerfil.getSelectedItem().toString());
            cto.setDireccion(txtDireccion.getText());
            cto.setPassword(txtPsw.getText());
            
            if(ban!=true){
            f.Guardar(cto);
            JOptionPane.showMessageDialog(null, "Guardado con Éxito");
            }
            else{
             ban=false;
             try {
                f.Editar(cto);
                JOptionPane.showMessageDialog(null, "Editado con Éxito");
                System.out.println( "SI");
                } catch (IOException ex) {

                }
            }
            btnSalvar.setEnabled(false);
            btnNuevo.setEnabled(true);
            btnEditar.setEnabled(false);
            btnRemover.setEnabled(false);
            btnCancelar.setEnabled(false);
            
            //band=true;
        } catch (FileNotFoundException ex) {

        }
    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaternoActionPerformed

    private void txtMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaternoActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        try {
            cto=new contacto();
            cto.setId(Integer.parseInt(txtID.getText()));
            cto=f.BuscarContacto(cto);
            
            if(cto!=null){
                try { 
                        if(cto!=null){
                        f.Eliminar(cto);
                        btnSalvar.setEnabled(false);
                        btnNuevo.setEnabled(true);
                        btnEditar.setEnabled(false);
                        btnRemover.setEnabled(false);
                        btnCancelar.setEnabled(true);
                        
                        txtID.setText("");
                        txtNombre.setText("");
                        txtTelefono.setText("");
                        txtPaterno.setText("");
                        txtMaterno.setText("");
                        txtUsername.setText("");
                        cbPerfil.setSelectedItem("");
                        txtDireccion.setText("");
                        
                    }else
                    JOptionPane.showMessageDialog(null, "No existe el registro");
                } catch (IOException ex) {
                    
                }
            }else
            JOptionPane.showMessageDialog(null, "No existe el registro");
        } catch (FileNotFoundException ex) {
            
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAutentificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutentificarActionPerformed
                cto=new contacto();
                cto.setUsername(txtUsuario.getText());
                
                String pw;
                pw=String.valueOf(txtPassword.getPassword());
                
                try {
                    cto=f.BuscarUsuario(cto);
                } catch (FileNotFoundException ex) {

                }
                if(cto!=null){
                    if(cto.getPassword().equals(pw)){
                        txtUsuario.setText(""); 
                        txtPassword.setText("");
                        
                        pnlUsuarios.setEnabled(true);
                        tpane.setSelectedIndex(1);
                        
                        btnSalvar.setEnabled(true);
                        btnNuevo.setEnabled(false);
                        btnEditar.setEnabled(false);
                        btnRemover.setEnabled(false);
                        btnCancelar.setEnabled(false);
                    
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                        txtPassword.setText("");
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "No existe ese Usuario");
                    txtPassword.setText("");
                }
        
                
    }//GEN-LAST:event_btnAutentificarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
            Habilitar();
            btnSalvar.setEnabled(true);
            btnNuevo.setEnabled(false);
            btnEditar.setEnabled(false);
            btnRemover.setEnabled(false);
            btnCancelar.setEnabled(true);
            ban=true;
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        tpane.setSelectedIndex(0);
        
        txtBuscar.setText("");
        
        txtID.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtUsername.setText("");
        cbPerfil.setSelectedItem("");
        txtDireccion.setText("");
        
        Deshabilitar();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    Habilitar();
    btnSalvar.setEnabled(false);
    btnNuevo.setEnabled(true);
    btnEditar.setEnabled(false);
    btnRemover.setEnabled(false);
    btnCancelar.setEnabled(false);
    
    txtBuscar.setText("");
        
    txtID.setText("");
    txtNombre.setText("");
    txtTelefono.setText("");
    txtPaterno.setText("");
    txtMaterno.setText("");
    txtUsername.setText("");
    cbPerfil.setSelectedItem("");
    txtDireccion.setText("");
    
    ban=false;
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutentificar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private java.awt.Label label4;
    private java.awt.Label labelBuscarid;
    private java.awt.Label labelID;
    private java.awt.Label labelNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPiezas;
    private javax.swing.JPanel pnlReparaciones;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JPanel pnlVehiculos;
    private javax.swing.JTabbedPane tpane;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtPsw;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
