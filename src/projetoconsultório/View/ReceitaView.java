
package projetoconsultório.View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetoconsultório.Controller.ItemReceitaController;
import projetoconsultório.Controller.MedicamentoController;
import projetoconsultório.Controller.MedicoController;
import projetoconsultório.Controller.ReceitaController;
import projetoconsultório.Model.ItemReceita;
import projetoconsultório.Model.Medicamento;
import projetoconsultório.Model.Receita;

public class ReceitaView extends javax.swing.JFrame {

    ArrayList<Medicamento> listaMedicamento = new ArrayList(); 
    
    public ReceitaView(String nomePaciente, String nomeMedico) {
        initComponents();
        jLabelNomeMedico.setText(nomeMedico);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);  
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNomeMedico = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextDescricao = new javax.swing.JTextField();
        jButtonAddMedicament = new javax.swing.JButton();
        jTextDosagem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextObservacao = new javax.swing.JTextField();
        jButtonFinishRecipe = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoconsultório/icones/128x128/Clinic-icon.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Medico Responsavel");

        jLabelNomeMedico.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelNomeMedico.setText("Nome Medico");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Prescreva Abaixo os Medicamentos para o cliente");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("Descricao");

        jButtonAddMedicament.setText("Adicionar");
        jButtonAddMedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMedicamentActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Dosagem");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoconsultório/icones/16X16/16X16_BACK.png"))); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descricao", "Dosagem", "Observação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("Observação");

        jButtonFinishRecipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoconsultório/icones/16X16/accept.png"))); // NOI18N
        jButtonFinishRecipe.setText("Finalizar Receita");
        jButtonFinishRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinishRecipeActionPerformed(evt);
            }
        });

        jButton2.setText("F8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabelNomeMedico))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jButtonAddMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(92, 92, 92)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonFinishRecipe))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel6))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextDosagem, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextObservacao))))
                                .addGap(0, 20, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButtonFinishRecipe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomeMedico)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDosagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(12, 12, 12)
                .addComponent(jButtonAddMedicament)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(649, 649, 649)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        ConsultaView consulta = new ConsultaView();
        consulta.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAddMedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMedicamentActionPerformed
      DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
      MedicamentoController controller = new MedicamentoController();
      Medicamento m = new Medicamento();
      
       String nomeMedicamento = jTextDescricao.getText();
       m = controller.buscarPorNome(nomeMedicamento);
       
      
       if(m == null) {  
           
                Medicamento medicamento = new Medicamento();
                medicamento.setNome(nomeMedicamento);
                controller.cadastrarMedicamento(medicamento);
                listaMedicamento.add(controller.retornarUltimoCadastrado());
                
                JOptionPane.showMessageDialog(null,"Medicamento cadastrado com sucesso");
    
                modelo.addRow(new Object[]{
                jTextDescricao.getText(),
                jTextDosagem.getText(),
                jTextObservacao.getText(),
       });
                
                
       }else if(m != null) {
            JOptionPane.showMessageDialog(null,"Medicamento ja cadastrado");
           System.out.print("\n nome medicamento \n"+m.getId());   
       }
       
       
       //JOptionPane.showMessageDialog(null,"Adicionar na tabela somente apos o cadastro do produto estiver ok");
       /*
       modelo.addRow(new Object[]{
            jTextDescricao.getText(),
            jTextDosagem.getText(),
            jTextObservacao.getText(),
       });
       */
      
       
    }//GEN-LAST:event_jButtonAddMedicamentActionPerformed

    private void jButtonFinishRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinishRecipeActionPerformed
        ReceitaController receitaController = new ReceitaController();
        ItemReceitaController itemController = new ItemReceitaController();
        MedicoController medicoController = new MedicoController();
        
        boolean retornoReceita = true;
        
        Receita receita = new Receita(); //crio o objeto receita
        ItemReceita item = new ItemReceita(); //crio o objeto item_receita
        Date data = new Date(); //pegando a data atual
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String d = sdf.format(data); //formatando a data no padrão dia/mes/ano
        
        try {
           java.util.Date dateUtil = new java.util.Date(); //criando um objeto do java.util.Date
           dateUtil = sdf.parse(d);
           java.sql.Date dateSql = new java.sql.Date(dateUtil.getTime()); //pegando a data do objeto dateUtil e transformando para o tipo sql.Date  
           dateUtil = sdf.parse(d);
           
           receita.setIdMedico(medicoController.buscarPorNome(jLabelNomeMedico.getText()));
           receita.setDataReceita(dateSql);    
           retornoReceita = receitaController.cadastrarReceita(receita); //InsertReceita cadastro a receita para gerar um novo id, setando a data da mesma        
            
          } catch (ParseException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao gravar data "+ex.getMessage());
        }
          
        
       
        
        Receita r = receitaController.getLastId(); //pegando o ultimo da receita cadastrada
        
        item.setIdReceita(r);
        
        
        //daqui pra baixo so Deus pode me ajudar // Funcionou Deus e bao d maiss
        
        
       
        //int idItemReceita = itemController.getLastId();
        
        
        boolean retornoItens = true;
        
        if (listaMedicamento.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Não há nenhum medicamento para ser adicionado a receita. ");
        }
        
        for(int i=0;i<listaMedicamento.size();i++) {
            Medicamento m = new Medicamento();
            m.setId(listaMedicamento.get(i).getId());
            
            item.setIdReceita(r);
            item.setIdMedicamento(m); 
            
            item.setDosagem("italo");
            retornoItens = itemController.insertItemReceita(item);
            
        }
        
        
        // // a receita ja e cadastra la em cima para gerar o id es
        
        
        if(retornoReceita){
           JOptionPane.showMessageDialog(null,"Erro ao gravar receita");
        }
        else {
            JOptionPane.showMessageDialog(null,"RECEITA gravada com sucesso ");
        }
        
        if(retornoItens) {
            
          JOptionPane.showMessageDialog(null,"Erro ao gravar itens receita");
        }
        else {
            JOptionPane.showMessageDialog(null,"Itens receita gravados com sucesso ");
        }
        
        
        
    }//GEN-LAST:event_jButtonFinishRecipeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAddMedicament;
    private javax.swing.JButton jButtonFinishRecipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelNomeMedico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextDosagem;
    private javax.swing.JTextField jTextObservacao;
    // End of variables declaration//GEN-END:variables
}
