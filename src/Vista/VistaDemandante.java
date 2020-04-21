
package Vista;

import gestion.GestionDemandante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import negocio.Demandante;
public class VistaDemandante extends javax.swing.JFrame implements ActionListener
{
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Dirección");

        jLabel4.setText("Telefono");

        jLabel5.setText("Tipo Licencia");

        jLabel6.setText("Perfil");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField5.setEnabled(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setText("...");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------------", "Categoría A1", "Categoría A2", "Categoría B1", "Categoría B2", "Categoría B3", "Categoría C1", "Categoría C2", "Categoría C3" }));
        jComboBox1.setToolTipText("");

        jButton2.setText("Foto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Guardar");

        jButton4.setText("Eliminar");

        jButton5.setText("Modificar");

        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setText("Regresar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 7, Short.MAX_VALUE))
            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char validar =evt.getKeyChar();
        
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(this,"Solo Numeros:");
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char validar =evt.getKeyChar();
        
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(this,"Solo letras:");
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char validar =evt.getKeyChar();
        
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(this,"Solo letras:");
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char validar =evt.getKeyChar();
        
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(this,"Solo Numeros:");
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
    
    private Principal ppl;
    private CRUDdemandante crud;
    private VistaPerfil vp;
    private GestionDemandante gd;
    private String rutaFoto;
    private Demandante demandante;
    private String nombreFoto;
    private String oldId;
    private int opcion;
 
    public VistaDemandante(CRUDdemandante crud,int opc)
    {
        initComponents();
        
        this.rutaFoto="./fotos/";
        this.nombreFoto="";
        this.crud=crud;
        this.opcion=opc;
        
        this.gd=new GestionDemandante();
        
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.poneaEscuchar();
        this.habilitador(opc);
      
    }
    public VistaDemandante(VistaPerfil vp,int opc)
    {
        initComponents();
        
        this.rutaFoto="./fotos/";
        this.nombreFoto="";
        this.crud=crud;
        this.opcion=opc;
        
        this.gd=new GestionDemandante();
        
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.poneaEscuchar();
        this.habilitador(opc);
      
    }
    public VistaDemandante(CRUDdemandante crud,int opc,Demandante demandante)
    {
        initComponents();
        
        this.rutaFoto="./fotos/";
        this.nombreFoto="";
        this.crud=crud;
        this.opcion=opc;
        
        this.demandante=demandante;
        this.gd=new GestionDemandante();
        
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.poneaEscuchar();
        this.habilitador(opc);        
        
        this.despiegaDemandante();
        this.oldId=this.jTextField1.getText();
      
    }
    
    private void poneaEscuchar()
    {
        this.jButton1.addActionListener(this);
        this.jButton2.addActionListener(this);
        this.jButton3.addActionListener(this);
        this.jButton4.addActionListener(this);
        this.jButton5.addActionListener(this);
        this.jButton6.addActionListener(this);
    }
    public void llenaperfil(String Nombre)
    {
        this.jTextField5.setText(Nombre);
    }
    
     private void habilitador(int opcion)
    {         
        if(this.opcion==1)
        {
            this.jButton5.setEnabled(false);
            this.jButton4.setEnabled(false);
            
            this.nombreFoto="sinfoto.jpg";
            jLabel7.setIcon(new ImageIcon(this.rutaFoto+this.nombreFoto));
            this.jTextField1.requestFocus();
        }
        if(this.opcion==2)
        {
            this.jButton3.setEnabled(false);
            
        }
    }
     
     private void despiegaDemandante()
     {
            this.jTextField1.setText(this.demandante.getCedula());
            this.jTextField2.setText(this.demandante.getNombre());
            this.jTextField3.setText(this.demandante.getDireccion());
            this.jTextField4.setText(this.demandante.getTelefono());
            this.jComboBox1.setSelectedItem(this.demandante.getTipoLicencia());
            this.jTextField5.setText(this.demandante.getPerfil());
            jLabel7.setIcon(new ImageIcon(this.rutaFoto+this.demandante.getNombreFoto()));  
     }
    private void buscaFoto()
    {
        JFileChooser jfc=new JFileChooser(this.rutaFoto);//pa' que vaya directamente a la carpeta fotos
        int rta=jfc.showSaveDialog(null);
        if(rta==JFileChooser.APPROVE_OPTION)
            this.nombreFoto=jfc.getSelectedFile().getName();
        else
            this.nombreFoto="sinfoto.jpg";
        
        jLabel7.setIcon(new ImageIcon(this.rutaFoto+this.nombreFoto));
        this.jTextField1.requestFocus();
    }
    
    private void guardar()
    {
        //proceso de guardar:
        String cedu,name,dir,tele,tip,per="";
        boolean ok;
        
        cedu=this.jTextField1.getText();
        name=this.jTextField2.getText();
        dir=this.jTextField3.getText();
        tele=this.jTextField4.getText();
        tip=(String)this.jComboBox1.getSelectedItem();
        if(this.jTextField5.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Escoger un perfil !!!!!");
        }
        else
        {
            per=this.jTextField5.getText();
        }
        Demandante demandate=new Demandante(cedu,name,dir,tele,tip,per,this.nombreFoto);
        
        ok=this.gd.guardaDemandante(demandate);
        if(ok)
        {
            JOptionPane.showMessageDialog(null,"OPERACIÓN EXITOSA..!!");
            this.limpiar();
        }
        else
            JOptionPane.showMessageDialog(null,"OPERACIÓN FALLIDA..!!");
    }
    private void limpiar()
    {
        this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
        this.nombreFoto="sinfoto.jpg";
        jLabel7.setIcon(new ImageIcon(this.rutaFoto+this.nombreFoto));
        this.jTextField1.requestFocus();
    }
    private void eliminar()
    {
        //proceso de eliminar:
        String id;
        boolean ok;
        
        int opcion=JOptionPane.showConfirmDialog(null, "Esta seguro..?");
        if(opcion==0)
        {      
            id=this.jTextField1.getText();
            ok=this.gd.eliminarDemandante(id);
            if(ok)
                JOptionPane.showMessageDialog(null,"OPERACIÓN EXITOSA..!!");
            else
                JOptionPane.showMessageDialog(null,"OPERACIÓN FALLIDA..!!");
        }
    }
    private void modificar()
    {
        //proceso de modificar:
       String cedu,name,dir,tele,tip,per="";
        boolean ok;
        
        cedu=this.jTextField1.getText();
        name=this.jTextField2.getText();
        dir=this.jTextField3.getText();
        tele=this.jTextField4.getText();
        tip=(String)this.jComboBox1.getSelectedItem();
        per=this.jTextField5.getText();
        Demandante demandate=new Demandante(cedu,name,dir,tele,tip,per,this.nombreFoto);
        
        ok=this.gd.modificarDemandante(demandate, this.oldId);
        if(ok)
            JOptionPane.showMessageDialog(null,"OPERACIÓN EXITOSA..!!");
        else
            JOptionPane.showMessageDialog(null,"OPERACIÓN FALLIDA..!!");
    }
    
     
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.jButton1)//Regresar
        {
            //this.setVisible(false);
            new VistaPerfil();
        }
        if(e.getSource()==this.jButton2)//buscar la foto
        {
            this.buscaFoto();
        }
        if(e.getSource()==this.jButton3)//mandar guardar
        {
           this.guardar();
        }
        if(e.getSource()==this.jButton4)//limpiar
        {
           this.eliminar();
        }
        if(e.getSource()==this.jButton5)//mandar eliminar
        {
            this.modificar();
        }
        if(e.getSource()==this.jButton6)//mandar modificar
        {
           this.gd.cierraConexion();
           System.out.println("Tranquilo he cerrado la Conexion..!!"); 
            
           this.setVisible(false);
           new CRUDdemandante();
        }
         if(e.getSource()==this.jButton6)//mandar modificar
        {
           
        }
    }
}
