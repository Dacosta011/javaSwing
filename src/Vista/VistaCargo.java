/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import negocio.Cargo;
import gestion.GestionCargo;
import gestion.GestionEmpresa;
import gestion.GestionUniversidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.Empresa;
import negocio.Universidad;

/**
 *
 * @author USER
 */
public class VistaCargo extends javax.swing.JFrame implements ActionListener
{

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("CREACIÓN DE CARGO ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Escoger un cargo");

        jLabel1.setText("ID");

        jLabel2.setText("NOMBRE");

        jButton1.setText("Guardar");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton2.setText("Actualizar ");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jButton3.setText("Regresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel4)
                .addGap(71, 71, 71)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private GestionCargo gc;
    private VistaExperiencia ve;
    private DefaultTableModel modelo;
    
    
     public VistaCargo() 
     {
        initComponents();
        
        this.modelo=new DefaultTableModel();
        this.gc=new GestionCargo();
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        this.configurarTabla();
        this.traePerfiles();
        this.llenaCombo();
    }
     
     private void poneaEscuchar()
    {
        this.jButton1.addActionListener(this);
        this.jButton2.addActionListener(this);
        this.jButton3.addActionListener(this);
    }
     
     public void llena()
    {
        String Nombre = (String) this.jComboBox1.getSelectedItem();
            GestionCargo gc=new GestionCargo();
            ArrayList<Cargo> cargos=gc.getTodos();
            
            for (Cargo  cargo: cargos) 
            {
                if (cargo.getNombre().equals(Nombre)) 
                {
                    String Id = cargo.getID();
                    this.ve.jTextField4.setText(Id);
                    
                }
            }
    }
   
    private void configurarTabla()
    {
        this.jTable1.setModel(this.modelo);
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
    }
    
    private void guardar()
    {
        //proceso de guardar:
        String id,nom;
        boolean ok;
        
        id=this.jTextField1.getText();
        nom=this.jTextField2.getText();
        Cargo cargo=new Cargo(id,nom);
        
        ok=this.gc.guardaCargo(cargo);
        if(ok)
        {
            JOptionPane.showMessageDialog(null,"OPERACIÓN EXITOSA..!!");
        }
        else
            JOptionPane.showMessageDialog(null,"OPERACIÓN FALLIDA..!!");
    }
    public void limpiarTabla()
    {
        int a =modelo.getRowCount()-1;
        for(int i=a; i>=0; i--)
        {
            modelo.removeRow(i );
        }
      this.traePerfiles();
      this.jComboBox1.removeAllItems();
      this.llenaCombo();
    }
    private void llenaCombo()
    {
        GestionCargo gc=new GestionCargo();
        ArrayList<Cargo> cargos=gc.getTodos();
        
        for (Cargo cargo : cargos) 
        {
            this.jComboBox1.addItem(cargo.getNombre());
        }
    }
    
    private void traePerfiles()
    {
        GestionCargo gc=new GestionCargo();
        ArrayList<Cargo> cargos=gc.getTodos();
        
        if(cargos.size()>0)
        {
            for(Cargo cargo : cargos)
            {
                Vector fila=new Vector();
                fila.add(cargo.getID());
                fila.add(cargo.getNombre());

                this.modelo.addRow(fila);
            }
        }
        else
            JOptionPane.showMessageDialog(null, "No hay elementos en la base de datos..!!");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.jButton1)//Regresar
        {
            if(this.jTextField1.getText().isEmpty() || this.jTextField2.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this,"ingrese la informacion completa");
            }
            else
            {
                this.guardar();
            }
        }
        if(e.getSource()==this.jButton2)//buscar la foto
        {
            this.limpiarTabla();
        }
        if(e.getSource()==this.jButton3)//mandar guardar
        {
           
            this.setVisible(false);
            //this.vd.setVisible(true);
            //new VistaDemandante(this, 1);
            //this.ve.jTextField4.setText((String) this.jComboBox1.getSelectedItem());
            this.llena();
        }
        
    }

}
