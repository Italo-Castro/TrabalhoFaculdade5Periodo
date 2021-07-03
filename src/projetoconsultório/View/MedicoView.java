
package projetoconsultório.View;

import java.awt.Color;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import projetoconsultório.Controller.MedicoController;
import projetoconsultório.Model.Medico;

public class MedicoView extends javax.swing.JInternalFrame {

    MedicoController controller = new MedicoController();
    
    public MedicoView() {
        initComponents(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonNew = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextCpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextDataNascimento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioMasculino = new javax.swing.JRadioButton();
        jRadioFeminino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTextEspecializacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextCrm = new javax.swing.JTextField();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jButtonNew.setText("Novo");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonRegister.setText("Gravar");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonExit.setText("Sair");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jButtonRegister, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jButtonNew, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jButtonExit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jButtonNew)
                .add(18, 18, 18)
                .add(jButtonRegister)
                .add(18, 18, 18)
                .add(jButtonExit)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Codigo");

        jTextCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextCodigoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("CPF");

        try {
            jTextCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Data Nascimento");

        try {
            jTextDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextDataNascimento.setText("01/02/0321");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Sexo");

        jRadioMasculino.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioMasculino.setText("Masculino");

        jRadioFeminino.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioFeminino.setText("Feminino");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Especialização");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setText("CRM");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTextNome)
                    .add(jTextEspecializacao, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                    .add(jLabel1)
                    .add(jTextCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 293, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2)
                    .add(jLabel5)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jRadioMasculino)
                        .add(18, 18, 18)
                        .add(jRadioFeminino))
                    .add(jLabel6)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jTextCpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(68, 68, 68)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4)
                            .add(jTextDataNascimento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(54, 54, 54)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel7)
                            .add(jTextCrm))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jLabel4)
                    .add(jLabel7))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextCpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextDataNascimento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextCrm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioMasculino)
                    .add(jRadioFeminino))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextEspecializacao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jSplitPane1.setRightComponent(jScrollPane1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCodigoKeyPressed
        if(evt.getKeyCode() == VK_ENTER){
            if(jTextCodigo.getText().equals("0")) {
                jTextCodigo.setEnabled(false);
                jTextNome.requestFocus();
                jTextNome.setText("");
                jTextCpf.setText("");
                jTextDataNascimento.setText("");
                jRadioMasculino.setSelected(false);
                jRadioFeminino.setSelected(false);
                jTextEspecializacao.setText("");
            }else {
                jTextCodigo.setEnabled(false);
                int id = Integer.parseInt(jTextCodigo.getText());
                Medico medico = controller.buscarPorId(id);
                jTextNome.setText(medico.getNome());
                jTextDataNascimento.setText(medico.getDataNascimento().toString());
                jTextEspecializacao.setText(medico.getEspecializacao());
                jTextCpf.setText(medico.getCpf());
                
                String sexo = medico.getSexo();
                
                if(sexo.equals("MASCULINO")){
                    jRadioMasculino.setSelected(true);
                }
                else if (sexo.equals("FEMININO")) {
                    jRadioFeminino.setSelected(true);
                }
                
                //aqui busca pelo id do medico digitado no campo de codigo
            }
        }
    }//GEN-LAST:event_jTextCodigoKeyPressed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed

        jTextCodigo.setEnabled(true);
        jTextNome.requestFocus();
        jTextNome.setText("");
        jTextCpf.setText("");
        //jTextDataNascimento.setText("");
        jRadioMasculino.setSelected(false);
        jRadioFeminino.setSelected(false);
        jTextEspecializacao.setText("");

    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        
        
        if(jTextNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Informe o nome do medico","ARGUMENT INVALID",JOptionPane.WARNING_MESSAGE);
             jTextNome.setBorder(new LineBorder(Color.RED));
        }
        else if(jTextCpf.getText().equals("   .   .   -  ")){
            JOptionPane.showMessageDialog(null,"Informe o cpf do medico","ARGUMENT INVALID",JOptionPane.WARNING_MESSAGE);
            jTextCpf.setBorder(new LineBorder(Color.RED));
        }
        else if(jTextCrm.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Informe o CRM do profissional","ARGUMENT INVALID",JOptionPane.WARNING_MESSAGE);
            jTextCrm.setBorder(new LineBorder(Color.RED));
        }
        else if(jTextEspecializacao.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Informe a especializacao do medico","ARGUMENT INVALID",JOptionPane.WARNING_MESSAGE);
            jTextEspecializacao.setBorder(new LineBorder(Color.RED));
        }
        else {
        
        Medico medico = new Medico();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String sexo = "";

        String data = jTextDataNascimento.getText().toString();
        
        try {
          
           java.util.Date dateUtil = new java.util.Date();
           
            dateUtil = sdf.parse(data);
            
           java.sql.Date dateSql = new java.sql.Date(dateUtil.getTime());
           
           dateUtil = sdf.parse(data);
           
           
           
          
          
           
            medico.setDataNascimento(dateSql);
           
      

            if(jRadioFeminino.isSelected()) {
                sexo = "FEMININO";
            }
            else if (jRadioMasculino.isSelected()) {
                sexo = "MASCULINO";
            }
                
                medico.setNome(jTextNome.getText());
                medico.setCpf(jTextCpf.getText());
                medico.setEspecializacao(jTextEspecializacao.getText());
                medico.setSexo(sexo);
                medico.setCrm(jTextCrm.getText());
                
                boolean retorno = controller.cadastrarMedico(medico);    
          
            
                if(retorno){
                    JOptionPane.showMessageDialog(null,"Erro ao inserir no banco de dados");
                }else {
                     JOptionPane.showMessageDialog(null,"Medico cadastrado com sucesso");
                   
                }
    
        } catch (ParseException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao gravar data de nascimento"+ex.getMessage());
       }
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioFeminino;
    private javax.swing.JRadioButton jRadioMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JFormattedTextField jTextCpf;
    private javax.swing.JTextField jTextCrm;
    private javax.swing.JFormattedTextField jTextDataNascimento;
    private javax.swing.JTextField jTextEspecializacao;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
