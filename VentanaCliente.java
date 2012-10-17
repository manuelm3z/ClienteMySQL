/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClienteMySQL;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author ManuelMartin
 */
public class VentanaCliente extends javax.swing.JFrame {
    /*Declaramos las variables*/
    Socket Cliente;
    String DireccionServidor;
    ObjectInputStream Entrada;
    ObjectOutputStream Salida;
    String Mensaje;
    String Respuesta;
    /**
     * Creates new form VentanaCliente
     */
    public VentanaCliente() {
        initComponents();
        this.setTitle("Cliente");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_Agregar = new javax.swing.JButton();
        JL_Bienvenido = new javax.swing.JLabel();
        JL_Cedula = new javax.swing.JLabel();
        JL_Nombre = new javax.swing.JLabel();
        JL_Apellido = new javax.swing.JLabel();
        JL_Telefono = new javax.swing.JLabel();
        JTF_Cedula = new javax.swing.JTextField();
        JTF_Nombre = new javax.swing.JTextField();
        JTF_Apellido = new javax.swing.JTextField();
        JTF_Telefono = new javax.swing.JTextField();
        JB_Actualizar = new javax.swing.JButton();
        JB_Buscar = new javax.swing.JButton();
        JB_Borrar = new javax.swing.JButton();
        JTF_DireccionIp = new javax.swing.JTextField();
        JL_DirecionServidor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Res = new javax.swing.JLabel();
        JB_Conectar = new javax.swing.JButton();
        ElServidorDice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JB_Agregar.setText("Agregar");
        JB_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AgregarActionPerformed(evt);
            }
        });

        JL_Bienvenido.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JL_Bienvenido.setText("Bienvenido");

        JL_Cedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JL_Cedula.setText("Cedula");

        JL_Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JL_Nombre.setText("Nombre");

        JL_Apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JL_Apellido.setText("Apellido");

        JL_Telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JL_Telefono.setText("Telefono");

        JB_Actualizar.setText("Actualizar");
        JB_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ActualizarActionPerformed(evt);
            }
        });

        JB_Buscar.setText("Buscar");
        JB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BuscarActionPerformed(evt);
            }
        });

        JB_Borrar.setText("Borrar");
        JB_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BorrarActionPerformed(evt);
            }
        });

        JL_DirecionServidor.setText("Direccion de Servidor");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Res.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Res.setText("Respuesta");

        JB_Conectar.setText("Conectar");
        JB_Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ConectarActionPerformed(evt);
            }
        });

        ElServidorDice.setText("El servidor dice:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(JL_Bienvenido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JL_DirecionServidor)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel7)))
                                .addGap(104, 104, 104))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(JTF_DireccionIp, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JB_Conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 127, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(JL_Nombre)
                                                    .addComponent(JL_Cedula)
                                                    .addComponent(JL_Apellido)
                                                    .addComponent(JL_Telefono))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(JTF_Nombre)
                                                    .addComponent(JTF_Apellido)
                                                    .addComponent(JTF_Cedula)
                                                    .addComponent(JTF_Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JB_Agregar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(JB_Actualizar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(JB_Buscar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(JB_Borrar))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(244, 244, 244)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Res, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ElServidorDice))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(JL_Bienvenido)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Cedula)
                    .addComponent(JTF_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Nombre)
                    .addComponent(JTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Apellido)
                    .addComponent(JTF_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Telefono)
                    .addComponent(JTF_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_Agregar)
                    .addComponent(JB_Actualizar)
                    .addComponent(JB_Buscar)
                    .addComponent(JB_Borrar))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_DirecionServidor)
                    .addComponent(ElServidorDice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_DireccionIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Res)
                    .addComponent(JB_Conectar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ConectarActionPerformed
        // TODO add your handling code here:
        if(JTF_DireccionIp.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la direccion del servidor");
        }else{
            if(JB_Conectar.getText().equals("Conectar")){
                DireccionServidor=JTF_DireccionIp.getText();
                //SE CREA UN NUEVO HILO
                new Thread(new Runnable(){
                    //LO CUAL EVITA QUE SE ESPERA TERMINAR EL BOTON, metodo run
                    @Override
                    public void run(){
                        try{
                        EjecutarCliente();
                        }catch(IOException ex){
                            Res.setText("Error");
                            JB_Conectar.setText("Conectar");
                        }
                    }
                    }).start();
                }else{
                Mensaje="FIN";
                EnviarMensaje(Mensaje);
                try{
                    CerrarConexion();
                    }catch(IOException ex){
                        Res.setText("Error");
                        JB_Conectar.setText("Desconectar");
                        }          
                Res.setText("Desconectado");
                JB_Conectar.setText("Conectar");
                }
            }
    }//GEN-LAST:event_JB_ConectarActionPerformed

    public void EjecutarCliente() throws IOException{
        try {
            ConectarServidor();
            CrearES();
            TratarDatos();
        } catch (IOException ex) {
            Res.setText("Conexion terminada");
            JB_Conectar.setText("Conectar");
        }
        
    }
    public void ConectarServidor() throws IOException{
        Res.setText("Conectando");
        Cliente=new Socket(InetAddress.getByName(DireccionServidor),12345);
        Res.setText("Conectado");
    }
    //Metodo que se encarga de establecer el envio de mensajes
    private boolean CrearES() throws IOException{
        try{
            Entrada=new ObjectInputStream(Cliente.getInputStream());
            Salida=new ObjectOutputStream(Cliente.getOutputStream());
            JB_Conectar.setText("Desconectar");
            Res.setText("Listo");
            return true;
        }catch(IOException ex){
            Res.setText("No hay conexion");
            return false;
        }
    }
    //Analiza las respuestas del servidor
    public void TratarDatos() throws IOException{
        do{
            try {
                Respuesta=(String) Entrada.readObject();
                Res.setText(Respuesta);
            } catch (ClassNotFoundException ex) {
                Res.setText("Dato Desconocido");
            }
        }while(!Respuesta.equals("FIN"));
    }
    public void CerrarConexion() throws IOException{
        Entrada.close();
        Salida.close();
        Cliente.close();
    }
    private boolean VerificarCampos(){
        if(JTF_Cedula.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la Cedula");
            return false;
        }else if(JTF_Nombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la Nombre");
            return false;
        }else if(JTF_Apellido.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la Apellido");
            return false;
        }else if(JTF_Telefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la Telefono");
            return false;
        }else{
            return true;
        }
    }
    
    private boolean VerificarCedula(){
        if(JTF_Cedula.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe Ingresar la Cedula");
            return false;
        }else{
            return true;
        }
    }
    public void Limpiar(){
        JTF_Cedula.setText("");
        JTF_Nombre.setText("");
        JTF_Apellido.setText("");
        JTF_Telefono.setText("");
    }
    private void JB_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AgregarActionPerformed
        // TODO add your handling code here:
        if(VerificarCampos()){
            Mensaje="agregar "+JTF_Cedula.getText()+" "+JTF_Nombre.getText()+" "+JTF_Apellido.getText()+" "+JTF_Telefono.getText();
            EnviarMensaje(Mensaje);
            Limpiar();
        }
            
    }//GEN-LAST:event_JB_AgregarActionPerformed

    private void JB_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ActualizarActionPerformed
        // TODO add your handling code here:
        if(VerificarCampos()){
            Mensaje="actualizar "+JTF_Cedula.getText()+" "+JTF_Nombre.getText()+" "+JTF_Apellido.getText()+" "+JTF_Telefono.getText();
            EnviarMensaje(Mensaje);
        }
    }//GEN-LAST:event_JB_ActualizarActionPerformed

    private void JB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BuscarActionPerformed
        // TODO add your handling code here:
        if(VerificarCedula()){
            Mensaje="buscar "+JTF_Cedula.getText();
            EnviarMensaje(Mensaje);
        }
    }//GEN-LAST:event_JB_BuscarActionPerformed

    private void JB_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BorrarActionPerformed
        // TODO add your handling code here:
        if(VerificarCampos()){
            Mensaje="borrar "+JTF_Cedula.getText()+" "+JTF_Nombre.getText()+" "+JTF_Apellido.getText()+" "+JTF_Telefono.getText();
            EnviarMensaje(Mensaje);
            Limpiar();
        }
    }//GEN-LAST:event_JB_BorrarActionPerformed

    public void EnviarMensaje(String Dato){
        try {
            // TODO add your handling code here:
            Salida.writeObject(Dato);//en la salida escribimos un msj
            Salida.flush();
            Res.setText("Enviado");
        } catch (IOException ex) {
            Res.setText("Error enviando");
        }
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
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ElServidorDice;
    private javax.swing.JButton JB_Actualizar;
    private javax.swing.JButton JB_Agregar;
    private javax.swing.JButton JB_Borrar;
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JButton JB_Conectar;
    private javax.swing.JLabel JL_Apellido;
    private javax.swing.JLabel JL_Bienvenido;
    private javax.swing.JLabel JL_Cedula;
    private javax.swing.JLabel JL_DirecionServidor;
    private javax.swing.JLabel JL_Nombre;
    private javax.swing.JLabel JL_Telefono;
    private javax.swing.JTextField JTF_Apellido;
    private javax.swing.JTextField JTF_Cedula;
    private javax.swing.JTextField JTF_DireccionIp;
    private javax.swing.JTextField JTF_Nombre;
    private javax.swing.JTextField JTF_Telefono;
    private javax.swing.JLabel Res;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
