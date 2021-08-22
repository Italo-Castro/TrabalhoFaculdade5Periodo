
package projetoconsultório.View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetoconsultório.Controller.PacienteController;
import projetoconsultório.Model.Paciente;


public class BuscarPacienteView extends javax.swing.JFrame {
    /*
    public  int idPaciente = 0 , idMedico =0;
    public  String nomePaciente ="", nomeMedico ="";
   
     private static BuscarPacienteView instance = null;

    public static BuscarPacienteView getInstance() {
        if (instance == null) {
            instance = new BuscarPacienteView();
          
        }
        return instance;
    }
*/
    
    
    public BuscarPacienteView() {
        initComponents();
        carregarTabela();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);  
    }
    public void carregarTabela() {
        PacienteController controller = new PacienteController();
        ArrayList<Paciente> listaPaciente = new ArrayList();
        
        listaPaciente = controller.buscarTodosPacientes();
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        for (int i=0;i<listaPaciente.size();i++){
            modelo.addRow(new Object[]{
                listaPaciente.get(i).getId(),
                listaPaciente.get(i).getNome(),
            });
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nome"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonExit.setText("Voltar");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jButtonExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExit))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
      
      
        
        this.dispose();
        ConsultaView c = new ConsultaView();
        c.setVisible(true);
   
       /*
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        int idPaciente = Integer.parseInt(modelo.getValueAt(jTable1.getSelectedRow(),0).toString());
        this.nomePaciente = modelo.getValueAt(jTable1.getSelectedRow(),1).toString();
        */
    }//GEN-LAST:event_jButtonExitActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
