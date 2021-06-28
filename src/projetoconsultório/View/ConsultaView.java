
package projetoconsultório.View;

import static java.awt.event.KeyEvent.VK_ENTER;
import projetoconsultório.Controller.MedicoController;
import projetoconsultório.Controller.PacienteController;
import projetoconsultório.Model.Medico;
import projetoconsultório.Model.Paciente;


public class ConsultaView extends javax.swing.JInternalFrame {
    
    public static PacienteController pacienteController = new PacienteController();
    public static MedicoController medicoController = new MedicoController();
    
    public ConsultaView() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextNomePaciente = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextNomeMedico = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextRelatoPaciente = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextCodPaciente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextCodMedico = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jButton1.setText("Nova Consulta");

        jButton2.setText("Gravar");

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton1)
                .add(18, 18, 18)
                .add(jButton2)
                .add(18, 18, 18)
                .add(jButton3)
                .addContainerGap(415, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Nome Paciente");

        jButtonBuscarCliente.setText("F8");
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Nome Medico");

        jButton5.setText("F8");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Relato Paciente");

        jTextRelatoPaciente.setColumns(20);
        jTextRelatoPaciente.setRows(5);
        jScrollPane1.setViewportView(jTextRelatoPaciente);

        jButton6.setText("Gerar Receita");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel4.setText("Codigo");

        jTextCodPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextCodPacienteKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel5.setText("Codigo");

        jTextCodMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextCodMedicoKeyPressed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1)
                                    .add(jLabel3)
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(jTextNomePaciente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 469, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jButtonBuscarCliente)))
                                .add(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 539, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jTextNomeMedico, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 469, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel2))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton5))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextCodPaciente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextCodMedico, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextNomePaciente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonBuscarCliente))
                .add(1, 1, 1)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jTextCodPaciente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextNomeMedico, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jTextCodMedico, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(32, 32, 32)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 221, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton6)
                .add(10, 10, 10))
        );

        jSplitPane1.setRightComponent(jPanel2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        BuscarPacienteView bcPaciente = new BuscarPacienteView();
        bcPaciente.setVisible(true);
       
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
      BuscarMedicoView bcMedico = new BuscarMedicoView();
      bcMedico.setVisible(true);
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextCodPacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCodPacienteKeyPressed
       
        if(evt.getKeyCode() == VK_ENTER){
          int idPaciente = Integer.parseInt(jTextCodPaciente.getText());
            Paciente p = pacienteController.buscarPacientePorId(idPaciente);
            jTextNomePaciente.setText(p.getNome());
       }
        
    }//GEN-LAST:event_jTextCodPacienteKeyPressed

    private void jTextCodMedicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCodMedicoKeyPressed
        if(evt.getKeyCode() == VK_ENTER){
          int idMedico = Integer.parseInt(jTextCodMedico.getText());
            Medico m = medicoController.buscarPorId(idMedico);
            jTextNomeMedico.setText(m.getNome());
       }
    }//GEN-LAST:event_jTextCodMedicoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextCodMedico;
    private javax.swing.JTextField jTextCodPaciente;
    private javax.swing.JTextField jTextNomeMedico;
    private javax.swing.JTextField jTextNomePaciente;
    private javax.swing.JTextArea jTextRelatoPaciente;
    // End of variables declaration//GEN-END:variables
}
