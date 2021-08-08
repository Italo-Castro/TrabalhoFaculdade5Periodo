
package projetoconsultório.View;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import java.awt.Color;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import projetoconsultório.Controller.EnderecoController;
import projetoconsultório.Controller.PacienteController;
import projetoconsultório.Controller.PlanoDeSaudeController;
import projetoconsultório.Model.Endereco;
import projetoconsultório.Model.Paciente;
import projetoconsultório.Model.PlanoDeSaude;

public class PacienteView extends javax.swing.JInternalFrame {
    
    PacienteController controller = new PacienteController();
    
    
    public PacienteView() {
        initComponents();
        carregarJcomboPlanoSaude();
        jButtonRegister.setEnabled(false);
    }
    
    public void carregarJcomboPlanoSaude(){
        ArrayList<PlanoDeSaude> lista = new ArrayList();
        PlanoDeSaudeController controller = new PlanoDeSaudeController();
        
        lista = controller.buscarPlanoSaude();
        if(lista.isEmpty()){
            jComboPlanoDeSaude.addItem("NÃO HÁ PLANOS DE SAUDE CADASTRADOS");
        }       
        else {
            for (PlanoDeSaude planos : lista){
                jComboPlanoDeSaude.addItem(planos.getTipo());  
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane3 = new javax.swing.JSplitPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jRadioMasculino = new javax.swing.JRadioButton();
        jRadioFeminino = new javax.swing.JRadioButton();
        jRadioIndiferente = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioSim = new javax.swing.JRadioButton();
        jRadioNao = new javax.swing.JRadioButton();
        jComboPlanoDeSaude = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextRua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextBairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextCep = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextCpf = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboEstado = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextTelefone = new javax.swing.JFormattedTextField();

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jButtonExit.setText("Sair");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonRegister.setText("Gravar");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonNew.setText("Novo");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonExit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jButtonRegister, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jButtonNew, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jButtonNew)
                .add(18, 18, 18)
                .add(jButtonRegister)
                .add(18, 18, 18)
                .add(jButtonExit)
                .addContainerGap(654, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel3);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Codigo");

        jTextCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextCodigoKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        jTextNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        buttonGroup1.add(jRadioMasculino);
        jRadioMasculino.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioMasculino.setText("Masculino");

        buttonGroup1.add(jRadioFeminino);
        jRadioFeminino.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioFeminino.setText("Feminino");

        buttonGroup1.add(jRadioIndiferente);
        jRadioIndiferente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioIndiferente.setText("Indiferente");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Plano Saude");

        buttonGroup2.add(jRadioSim);
        jRadioSim.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioSim.setText("Sim");

        buttonGroup2.add(jRadioNao);
        jRadioNao.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jRadioNao.setSelected(true);
        jRadioNao.setText("Não");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Endereço");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Rua");

        jTextRua.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Bairro");

        jTextBairro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setText("Cidade");

        jTextCidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("Cep");

        try {
            jTextCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextCep.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextCepKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setText("Sexo");

        jLabel10.setText("Tecle 0 e enter para um novo paciente");

        jLabel11.setText("Informe o cpf e telce enter  ");

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel12.setText("CPF");

        try {
            jTextCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextCpf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel13.setText("Estado");

        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RJ", "SP", "MG", "SC" }));

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel14.setText("Telefone de Contato");

        try {
            jTextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextTelefone.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(jLabel9))
                    .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jLabel3)
                        .add(jLabel1)
                        .add(jPanel5Layout.createSequentialGroup()
                            .add(9, 9, 9)
                            .add(jRadioSim)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                            .add(jRadioNao))
                        .add(jLabel4)
                        .add(jPanel5Layout.createSequentialGroup()
                            .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jPanel5Layout.createSequentialGroup()
                                    .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jLabel6)
                                        .add(jLabel5)
                                        .add(jLabel8))
                                    .add(15, 15, 15))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .add(jLabel7)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                            .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(jTextCidade)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jTextRua)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jTextBairro)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel5Layout.createSequentialGroup()
                                    .add(jTextCep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 213, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(jLabel11))))
                        .add(jPanel5Layout.createSequentialGroup()
                            .add(jTextCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jLabel10))
                        .add(jTextNome)
                        .add(jComboPlanoDeSaude, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel12)
                        .add(jTextCpf)
                        .add(jPanel5Layout.createSequentialGroup()
                            .add(jLabel13)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jComboEstado, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(jTextTelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel14)
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(jRadioMasculino)
                        .add(18, 18, 18)
                        .add(jRadioFeminino)
                        .add(18, 18, 18)
                        .add(jRadioIndiferente))
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(jLabel2)))
                .addContainerGap(492, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel10))
                .add(18, 18, 18)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel12)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextCpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel14)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextTelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(24, 24, 24)
                .add(jLabel9)
                .add(2, 2, 2)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioMasculino)
                    .add(jRadioFeminino)
                    .add(jRadioIndiferente))
                .add(18, 18, 18)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioSim)
                    .add(jRadioNao))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jComboPlanoDeSaude, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(33, 33, 33)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jTextCep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11))
                .add(11, 11, 11)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel5)
                        .add(jTextRua, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                        .add(42, 42, 42)
                        .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextBairro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel6))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel13)
                    .add(jComboEstado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(41, 41, 41))
        );

        jScrollPane2.setViewportView(jPanel5);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane2.setRightComponent(jPanel1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jSplitPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCodigoKeyPressed
        if(evt.getKeyCode() == VK_ENTER){
            if(jTextCodigo.getText().equals("0")) {
               
               jTextNome.requestFocus();
               jTextNome.setText("");
               jTextCpf.setText("");
               jTextCep.setText("");
               jRadioMasculino.setSelected(false);
               jRadioFeminino.setSelected(false);
               jRadioIndiferente.setSelected(false);
               jTextRua.setText("");
               jTextBairro.setText("");
               jTextCidade.setText("");
               jRadioSim.setSelected(false);
               jRadioNao.setSelected(false);
               jComboPlanoDeSaude.setSelectedIndex(0);
            }
        else {
            int id = Integer.parseInt(jTextCodigo.getText());
            Paciente p = controller.buscarPacientePorId(id);
            
            if(p.getNome() == null) {
               jTextNome.requestFocus();
               jTextNome.setText("");
               jTextCpf.setText("");
               jTextCep.setText("");
               jRadioMasculino.setSelected(false);
               jRadioFeminino.setSelected(false);
               jRadioIndiferente.setSelected(false);
               jTextRua.setText("");
               jTextBairro.setText("");
               jTextCidade.setText("");
               jRadioSim.setSelected(false);
               jRadioNao.setSelected(false);
               jComboPlanoDeSaude.setSelectedIndex(0);
            }
            else {
                
            JOptionPane.showMessageDialog(null,"Codigo "+id+" encontrado no paciente "+p.getNome(),"",JOptionPane.WARNING_MESSAGE);
            
            jTextNome.setText(p.getNome());
            jTextCpf.setText(p.getCpf());
            
            if(p.getSexo().equals("MASCULINO")){
               jRadioMasculino.setSelected(true);
            }
            else if(p.getSexo().equals("FEMININO")){
                jRadioFeminino.setSelected(true);
            }
            
            Endereco idEndereco = p.getIdEndereco();
            
            EnderecoController endController = new EnderecoController();
            Endereco end = new Endereco();
            
            System.out.print(p.getIdEndereco().getId());
            
            end = endController.buscarEnderecoPorId(p.getIdEndereco().getId());
            
            jTextCep.setText(end.getCep());
            jTextRua.setText(end.getRua());
            jTextBairro.setText(end.getBairro());
            jTextCidade.setText(end.getCidade());   
            jComboEstado.setSelectedItem(end.getEstado());
           }
            } 
          }
         
    }//GEN-LAST:event_jTextCodigoKeyPressed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        jTextCodigo.setText("0");
        jButtonRegister.setEnabled(true);
        jTextCodigo.setEnabled(false);
        jTextNome.setText("");
        jTextNome.requestFocus();
        jTextCpf.setText("");
        jRadioMasculino.setSelected(false);
        jRadioFeminino.setSelected(false);
        jRadioIndiferente.setSelected(false);
        jRadioSim.setSelected(false);
        jRadioNao.setSelected(false);
        jTextCep.setText("");
        jTextRua.setText("");
        jTextBairro.setText("");
        jTextCidade.setText("");
        jComboPlanoDeSaude.setSelectedIndex(-1);
        
        
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
    
       if(jTextNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Informe o nome do paciente","ARGUMENT INVALID",JOptionPane.WARNING_MESSAGE);
            jTextNome.setBorder(new LineBorder(Color.RED));
        }
         if(jTextCpf.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null,"Informe o cpf do paciente","ARGUMENT INVALID",JOptionPane.WARNING_MESSAGE);
            jTextCpf.setBorder(new LineBorder(Color.RED));
        }
         if(jTextCep.getText().equals("     -   ")) {
            JOptionPane.showMessageDialog(null,"Informe o CEP do paciente","ARGUMENT INVALID",JOptionPane.WARNING_MESSAGE);
            jTextCep.setBorder(new LineBorder(Color.RED));
        }
        else {
            
       PlanoDeSaude plano = new PlanoDeSaude();
       Paciente paciente = new Paciente();
       Endereco endereco = new Endereco();
       EnderecoController controllerEndereco = new EnderecoController();
       
       endereco.setCep(jTextCep.getText());
       endereco.setBairro(jTextBairro.getText());
       endereco.setCidade(jTextCidade.getText());
       endereco.setEstado(jComboEstado.getSelectedItem().toString());
       endereco.setRua(jTextRua.getText());
      
       JOptionPane.showMessageDialog(null,jTextCep.getText());
     
       
       
       Endereco en = controllerEndereco.buscarEnderecoPorCep(jTextCep.getText()); // nesta linha consulta se o cep ja esta cadastrad
       int idEndereco = 0;
       
       if(en.getId() != 0){                                                          // se ele ja estiver cadastrado o objeto não sera nulo, ai eu pego o id dele para colocar no idEndereco, do cliente.
           idEndereco = en.getId();          
       }
       else if( en.getId() == 0) {
            //JOptionPane.showMessageDialog(null,"Cep não encontrado adicionando cep a base de dados");
            
            controllerEndereco.cadastrarEndereco(endereco);                    // se o objeto for nulo cadastro o endereco;
            en = controllerEndereco.buscarEnderecoPorCep(jTextCep.getText()); //busco o cep que acabei de cadastrar
            idEndereco = en.getId();                                                       //pego o id do cep recem cadastrado
       }
       
       
       paciente.getIdEndereco().setId(idEndereco);     
       paciente.setCpf(jTextCpf.getText());
       paciente.setNome(jTextNome.getText());
       paciente.setTelefone(jTextTelefone.getText());
       
        String sexo = "";
        if(jRadioFeminino.isSelected()) {
            sexo = "FEMININO";
        }
        else if (jRadioMasculino.isSelected()) {
            sexo = "MASCULINO";
        }
        else if (jRadioIndiferente.isSelected()){
            sexo = "INDIFERENTE";
        }
        paciente.setSexo(sexo);

        if(jRadioSim.isSelected()) {
            
        PlanoDeSaudeController controllerPlanoSaude = new PlanoDeSaudeController();
        
        plano = controllerPlanoSaude.buscarPlanoSaudePorTipo(jComboPlanoDeSaude.getSelectedItem().toString()); //busca o plano de saude selecionado
        
        if(plano == null) {
             JOptionPane.showMessageDialog(null,"O plano e = null"); // não to conseguindo passar por esse if
                paciente.getIdPlanoSaude().setId(1);
            }
            else {
             paciente.getIdPlanoSaude().setId(plano.getId());
            }
        
        }
        if (jRadioNao.isSelected()) {
            paciente.getIdPlanoSaude().setId(1);
        }
       
        
        
        
        if(controller.cadastrarPaciente(paciente)){
            JOptionPane.showMessageDialog(null,"Paciente cadastrado");
        }
        else {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Paciente","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jTextCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCepKeyPressed
        if(evt.getKeyCode() == VK_ENTER){
            ViaCEP cep = new ViaCEP();
            try {
                
                cep.buscar(jTextCep.getText().toString());
                jTextRua.setText(cep.getLogradouro());
                jTextCidade.setText(cep.getLocalidade());
                jTextBairro.setText(cep.getBairro());
                jComboEstado.setSelectedItem(cep.getUf());
             
                
            } catch (ViaCEPException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao buscar CEP");
            }
            
        }
    }//GEN-LAST:event_jTextCepKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JComboBox<String> jComboEstado;
    private javax.swing.JComboBox<String> jComboPlanoDeSaude;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioFeminino;
    private javax.swing.JRadioButton jRadioIndiferente;
    private javax.swing.JRadioButton jRadioMasculino;
    private javax.swing.JRadioButton jRadioNao;
    private javax.swing.JRadioButton jRadioSim;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JFormattedTextField jTextCep;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JFormattedTextField jTextCpf;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextRua;
    private javax.swing.JFormattedTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables
}
