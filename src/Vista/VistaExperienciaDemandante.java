/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import gestion.GestionCliente;
import gestion.GestionDemandante;
import gestion.GestionExperiencia;
import gestion.GestionExperienciaDemandante;
import gestion.GestionPerfil;
import gestion.GestionPerfilCliente;
import gestion.GestionTitulacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Cliente;
import negocio.Demandante;
import negocio.Experiencia;
import negocio.ExperienciaDemandante;
import negocio.Perfil;
import negocio.PerfilCliente;

/**
 *
 * @author USER
 */
public class VistaExperienciaDemandante extends javax.swing.JFrame implements ActionListener
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

        jLabel1.setText("AÑADIR EXPERIENCIA A CLIENTE");

        jLabel2.setText("Demandante");

        jLabel3.setText("Experiencia");

        jButton1.setText("Guardar");

        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Regresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2)
                                .addGap(122, 122, 122)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    private GestionExperienciaDemandante ged;
    
     public VistaExperienciaDemandante() 
     {
        initComponents();
        
        this.ged = new GestionExperienciaDemandante();
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        this.llenaCombo();
        this.llenaCombo2();
        
    }
     private void llenaCombo()
    {
        GestionDemandante gd = new GestionDemandante();
        ArrayList<Demandante> demandantes=gd.getTodos();
        
        for (Demandante demandante : demandantes) 
        {
            this.jComboBox1.addItem(demandante.getNombre());
        }
    }
    private void llenaCombo2()
    {
        GestionExperiencia ge=new GestionExperiencia();
        ArrayList<Experiencia> experiencias=ge.getTodos();
        System.out.println(experiencias);
        
        for (Experiencia experiencia : experiencias) 
        {
            this.jComboBox2.addItem(experiencia.getIdExperiencia());
        }
    }
    
    public String llena()
    {
            String Nombre = (String) this.jComboBox1.getSelectedItem();
            String Id = "";
            GestionDemandante gd = new GestionDemandante();
            ArrayList<Demandante> demandantes=gd.getTodos();
            
            for (Demandante demandante : demandantes) 
            {
                if (demandante.getNombre().equals(Nombre)) 
                {
                    Id = demandante.getCedula();
                }
            }
          return Id;  
    }

    
    private void guardar()
    {
        //proceso de guardar:
        String ced,idexp;
        boolean ok;
        
        ced=this.llena();
        idexp=(String) this.jComboBox2.getSelectedItem();
        
        ExperienciaDemandante experienciaDemandante = new ExperienciaDemandante(ced, idexp);
        
        System.out.println(experienciaDemandante);
        
        ok=this.ged.guardaExperienciaDemandante(experienciaDemandante);
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
            new CRUDdemandante();
        }
        
    }
}
