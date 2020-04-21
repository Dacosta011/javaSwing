/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import gestion.GestionCliente;
import gestion.GestionCurriculo;
import gestion.GestionDemandante;
import gestion.GestionPerfil;
import gestion.GestionPerfilCliente;
import gestion.GestionTitulacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Cliente;
import negocio.Curriculo;
import negocio.Demandante;
import negocio.Perfil;
import negocio.PerfilCliente;
import negocio.Titulacion;

public class VistaPerfilCliente extends javax.swing.JFrame implements ActionListener
{
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AÑADIR PERFIL CLIENTE ");

        jLabel2.setText("Perfil");

        jLabel3.setText("Cliente");

        jButton1.setText("Guardar");

        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Regresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(53, 53, 53)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

   private GestionDemandante gd;
    private GestionTitulacion gt;
    private GestionPerfilCliente gpc;
    
    public VistaPerfilCliente() 
    {
        initComponents();
        
        this.gpc = new GestionPerfilCliente();
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        this.llenaCombo();
        this.llenaCombo2();
    }
    
    private void llenaCombo()
    {
        GestionPerfil gp=new GestionPerfil();
        ArrayList<Perfil> perfiles=gp.getTodos();
        
        for (Perfil perfil : perfiles) 
        {
            this.jComboBox1.addItem(perfil.getDescripcio());
        }
    }
    private void llenaCombo2()
    {
        GestionCliente gc=new GestionCliente();
        ArrayList<Cliente> clientes=gc.getTodos();
        System.out.println(clientes);
        
        
        for (Cliente cliente : clientes) 
        {
            this.jComboBox2.addItem(cliente.getNombre());
        }
    }
    
    public String llena()
    {
            String Nombre = (String) this.jComboBox1.getSelectedItem();
            String Id = "";
            GestionPerfil gp=new GestionPerfil();
            ArrayList<Perfil> perfiles=gp.getTodos();
            
            for (Perfil perfil : perfiles) 
            {
                if (perfil.getDescripcio().equals(Nombre)) 
                {
                    Id = perfil.getIdPerfil();
                }
            }
          return Id;  
    }
    public String llena2()
    {
            String Nombre = (String) this.jComboBox2.getSelectedItem();
            String Id = "";
            GestionCliente gc=new GestionCliente();
            ArrayList<Cliente> clientes=gc.getTodos();
            
            for (Cliente cliente : clientes) 
            {
                if (cliente.getNombre().equals(Nombre)) 
                {
                    Id = cliente.getIdCliente();
                }
            }
         return Id;  
    }
    
    private void guardar()
    {
        //proceso de guardar:
        String idper,idcli;
        boolean ok;
        
        idper=this.llena();
        idcli=this.llena2();
        
        PerfilCliente perfilCliente = new PerfilCliente(idper, idcli);
        System.out.println(perfilCliente);
        
        ok=this.gpc.guardaPerfilCliente(perfilCliente);
        if(ok)
        {
            JOptionPane.showMessageDialog(null,"OPERACIÓN EXITOSA..!!");
        }
        else
            JOptionPane.showMessageDialog(null,"OPERACIÓN FALLIDA..!!");
    }
    
    private void poneaEscuchar()
    {
        this.jButton1.addActionListener(this);
        this.jButton2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.jButton1)//buscar la foto
        {
            this.guardar();
        }
        if(e.getSource()==this.jButton2)//mandar guardar
        {
           
            this.setVisible(false);
            //this.vd.setVisible(true);
            //new VistaDemandante(this, 1);
            //this.llena();
            new CRUDcliente();
        }
        
    }

}
