
package projetoconsultório.View;

import static java.awt.event.KeyEvent.VK_ENTER;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetoconsultório.Controller.MedicoController;
import projetoconsultório.Model.Medico;


public class BuscarMedicoView extends javax.swing.JFrame {

    public BuscarMedicoView() {
        initComponents();
         //carregarTabela();
         setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);  
    }
/*
    public void carregarTabela(){
       MedicoController controller = new MedicoController();
       ArrayList<Medico> lista = new ArrayList();
        
       lista = controller.buscarTodosMedicos();
        
       if(lista.isEmpty()) {
           JOptionPane.showMessageDialog(null," Não há medicos cadastrados ");
       }
       else {
       
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        for(int  i =0;i<lista.size();i++){
            modelo.addRow(new Object[]{
                lista.get(i).getId(),
                lista.get(i).getNome(),
            });
     }    
       }

    }
    */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        jTextNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextNomeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextNome)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExit))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
    
        this.dispose();
        ConsultaView consulta = new ConsultaView();
        consulta.setVisible(true);
     
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomeKeyPressed
        if(evt.getKeyCode() == VK_ENTER) {
            MedicoController controller = new MedicoController();
            ArrayList<Medico> lista = new ArrayList();
            
            String nome = jTextNome.getText();
             
            lista = controller.pesquisaMedico(nome);
            
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            
            if(lista.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Nenhum resultado encontrado");
            }else {
            
            for(int i=0;i<lista.size();i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome()
                });
            }
           
         }    
        }
    }//GEN-LAST:event_jTextNomeKeyPressed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
