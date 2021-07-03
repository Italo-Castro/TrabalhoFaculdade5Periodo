
package projetoconsultório.View.Agenda;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Agenda extends javax.swing.JInternalFrame {

    int AnoFixo =0, MesFixo =0, DiaFixo = 0; //ano mes e dia atual; <-
    int AnoAltera =0, MesAltera =0, DiaAltera =0; // dias que vaõ ser alterados
    int valorSelecao =0; //
    
    
    
    
    public Agenda() {
        initComponents();
        IniciaCalendario ();
        Calendario ();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        SelecaoAno = new javax.swing.JComboBox<>();
        SelecaoMes = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        s6 = new javax.swing.JLabel();
        s7 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        t15 = new javax.swing.JLabel();
        t22 = new javax.swing.JLabel();
        t29 = new javax.swing.JLabel();
        t36 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();
        t10 = new javax.swing.JLabel();
        t11 = new javax.swing.JLabel();
        t12 = new javax.swing.JLabel();
        t13 = new javax.swing.JLabel();
        t14 = new javax.swing.JLabel();
        t16 = new javax.swing.JLabel();
        t17 = new javax.swing.JLabel();
        t18 = new javax.swing.JLabel();
        t19 = new javax.swing.JLabel();
        t20 = new javax.swing.JLabel();
        t21 = new javax.swing.JLabel();
        t23 = new javax.swing.JLabel();
        t24 = new javax.swing.JLabel();
        t25 = new javax.swing.JLabel();
        t26 = new javax.swing.JLabel();
        t27 = new javax.swing.JLabel();
        t28 = new javax.swing.JLabel();
        t30 = new javax.swing.JLabel();
        t31 = new javax.swing.JLabel();
        t32 = new javax.swing.JLabel();
        t33 = new javax.swing.JLabel();
        t34 = new javax.swing.JLabel();
        t35 = new javax.swing.JLabel();
        t37 = new javax.swing.JLabel();
        t39 = new javax.swing.JLabel();
        t38 = new javax.swing.JLabel();
        t40 = new javax.swing.JLabel();
        t41 = new javax.swing.JLabel();
        t42 = new javax.swing.JLabel();
        SemanaPagina1 = new javax.swing.JLabel();
        DiaPagina1 = new javax.swing.JLabel();
        MesPagina1 = new javax.swing.JLabel();
        AnoPagina1 = new javax.swing.JLabel();
        AnoPagina2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SelecaoAno.setEditable(true);

        SelecaoMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro ", "Dezembro" }));

        s1.setBackground(new java.awt.Color(0, 255, 255));
        s1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 0, 0));
        s1.setText("Dom");

        s2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        s2.setText("Seg");

        s3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        s3.setText("Ter");

        s4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        s4.setText("Qua");

        s5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        s5.setText("Qui");

        s6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        s6.setText("Sex");

        s7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        s7.setText("Sab");

        t1.setText("0");

        t2.setText("0");

        t3.setText("0");

        t4.setText("0");

        t5.setText("0");

        t6.setText("0");

        t7.setText("0");

        t8.setText("0");

        t15.setText("0");

        t22.setText("0");

        t29.setText("0");

        t36.setText("0");

        t9.setText("0");

        t10.setText("0");

        t11.setText("0");

        t12.setText("0");

        t13.setText("0");

        t14.setText("0");

        t16.setText("0");

        t17.setText("0");

        t18.setText("0");

        t19.setText("0");

        t20.setText("0");

        t21.setText("0");

        t23.setText("0");

        t24.setText("0");

        t25.setText("0");

        t26.setText("0");

        t27.setText("0");

        t28.setText("0");

        t30.setText("0");

        t31.setText("0");

        t32.setText("0");

        t33.setText("0");

        t34.setText("0");

        t35.setText("0");

        t37.setText("0");

        t39.setText("0");

        t38.setText("0");

        t40.setText("0");

        t41.setText("0");

        t42.setText("0");

        jLayeredPane2.setLayer(SelecaoAno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(SelecaoMes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jSpinner1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(s1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(s2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(s3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(s4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(s5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(s6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(s7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t40, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t42, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(SelecaoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelecaoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s1)
                            .addComponent(t1)
                            .addComponent(t8)
                            .addComponent(t15)
                            .addComponent(t22)
                            .addComponent(t29)
                            .addComponent(t36))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s2)
                            .addComponent(t2)
                            .addComponent(t9)
                            .addComponent(t16)
                            .addComponent(t23)
                            .addComponent(t30)
                            .addComponent(t37))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s3)
                            .addComponent(t3)
                            .addComponent(t10)
                            .addComponent(t17)
                            .addComponent(t24)
                            .addComponent(t31)
                            .addComponent(t39))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s4)
                            .addComponent(t4)
                            .addComponent(t11)
                            .addComponent(t18)
                            .addComponent(t25)
                            .addComponent(t32)
                            .addComponent(t38))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s5)
                            .addComponent(t5)
                            .addComponent(t12)
                            .addComponent(t19)
                            .addComponent(t26)
                            .addComponent(t33)
                            .addComponent(t40))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s6)
                            .addComponent(t6)
                            .addComponent(t13)
                            .addComponent(t20)
                            .addComponent(t27)
                            .addComponent(t34)
                            .addComponent(t41))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t42)
                            .addComponent(t35)
                            .addComponent(t28)
                            .addComponent(t21)
                            .addComponent(t14)
                            .addComponent(t7)
                            .addComponent(s7))))
                .addGap(0, 282, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelecaoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelecaoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1)
                    .addComponent(s2)
                    .addComponent(s5)
                    .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3)
                    .addComponent(s4)
                    .addComponent(s6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1)
                    .addComponent(t2)
                    .addComponent(t3)
                    .addComponent(t4)
                    .addComponent(t5)
                    .addComponent(t6)
                    .addComponent(t7))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t8)
                    .addComponent(t9)
                    .addComponent(t10)
                    .addComponent(t11)
                    .addComponent(t12)
                    .addComponent(t13)
                    .addComponent(t14))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t15)
                    .addComponent(t16)
                    .addComponent(t17)
                    .addComponent(t18)
                    .addComponent(t19)
                    .addComponent(t20)
                    .addComponent(t21))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t22)
                    .addComponent(t23)
                    .addComponent(t24)
                    .addComponent(t25)
                    .addComponent(t26)
                    .addComponent(t27)
                    .addComponent(t28))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t29)
                    .addComponent(t30)
                    .addComponent(t31)
                    .addComponent(t32)
                    .addComponent(t33)
                    .addComponent(t34)
                    .addComponent(t35))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t36)
                    .addComponent(t37)
                    .addComponent(t39)
                    .addComponent(t38)
                    .addComponent(t40)
                    .addComponent(t41)
                    .addComponent(t42))
                .addContainerGap(488, Short.MAX_VALUE))
        );

        SemanaPagina1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        SemanaPagina1.setText("Sexta");

        DiaPagina1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        DiaPagina1.setText("1");

        MesPagina1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        MesPagina1.setText("Janeiro");

        AnoPagina1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        AnoPagina1.setText("2021");

        AnoPagina2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        AnoPagina2.setText("2021");

        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SemanaPagina1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DiaPagina1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(MesPagina1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(AnoPagina1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(AnoPagina2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(AnoPagina1)
                .addGap(69, 69, 69)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DiaPagina1)
                            .addComponent(MesPagina1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(SemanaPagina1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AnoPagina2)
                        .addGap(89, 89, 89))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SemanaPagina1)
                            .addComponent(AnoPagina2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiaPagina1)
                            .addComponent(AnoPagina1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MesPagina1))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnoPagina1;
    private javax.swing.JLabel AnoPagina2;
    private javax.swing.JLabel DiaPagina1;
    private javax.swing.JLabel MesPagina1;
    private javax.swing.JComboBox<String> SelecaoAno;
    private javax.swing.JComboBox<String> SelecaoMes;
    private javax.swing.JLabel SemanaPagina1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel s6;
    private javax.swing.JLabel s7;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t10;
    private javax.swing.JLabel t11;
    private javax.swing.JLabel t12;
    private javax.swing.JLabel t13;
    private javax.swing.JLabel t14;
    private javax.swing.JLabel t15;
    private javax.swing.JLabel t16;
    private javax.swing.JLabel t17;
    private javax.swing.JLabel t18;
    private javax.swing.JLabel t19;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t20;
    private javax.swing.JLabel t21;
    private javax.swing.JLabel t22;
    private javax.swing.JLabel t23;
    private javax.swing.JLabel t24;
    private javax.swing.JLabel t25;
    private javax.swing.JLabel t26;
    private javax.swing.JLabel t27;
    private javax.swing.JLabel t28;
    private javax.swing.JLabel t29;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t30;
    private javax.swing.JLabel t31;
    private javax.swing.JLabel t32;
    private javax.swing.JLabel t33;
    private javax.swing.JLabel t34;
    private javax.swing.JLabel t35;
    private javax.swing.JLabel t36;
    private javax.swing.JLabel t37;
    private javax.swing.JLabel t38;
    private javax.swing.JLabel t39;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t40;
    private javax.swing.JLabel t41;
    private javax.swing.JLabel t42;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t9;
    // End of variables declaration//GEN-END:variables
    
    //Começa construcao do calendario
    public void IniciaCalendario (){
        
        SimpleDateFormat Ano = new SimpleDateFormat("yyyy");
        SimpleDateFormat Mes = new SimpleDateFormat("MM");
        SimpleDateFormat Dia = new SimpleDateFormat("dd");
        
        AnoFixo = Integer.parseInt(Ano.format(new Date()));
        MesFixo = Integer.parseInt(Mes.format(new Date()));
        DiaFixo = Integer.parseInt(Dia.format(new Date()));
        
        //JOptionPane.showMessageDialog(null, "Data de hoje \n"+ DiaFixo +"/"+MesFixo+"/"+AnoFixo);
        
        
        int AnoMaximo = AnoFixo + 50;
        for (int i = 2021; i < AnoMaximo; i++){
            SelecaoAno.addItem(String.valueOf(i));  //ADICIONANDO AO JCombo o ano que estamos mais 50 anos para frente
         }
        
        SelecaoAno.setSelectedItem(AnoFixo);      //Setando o ano que estamos como fixo
                
        //Verifica qual o mes estamos, e seta no jComboMes
        if(MesFixo == 1){
            SelecaoMes.setSelectedIndex(0);
        }
        else if(MesFixo == 2) {
            SelecaoMes.setSelectedIndex(1);
        }
        else if(MesFixo == 3) {
            SelecaoMes.setSelectedIndex(2);
        }
        else if(MesFixo == 4) {
            SelecaoMes.setSelectedIndex(3);
        }
        else if(MesFixo == 5) {
            SelecaoMes.setSelectedIndex(4);
        }
        else if(MesFixo == 6) {
            SelecaoMes.setSelectedIndex(5);
        }
        else if(MesFixo == 7) {
            SelecaoMes.setSelectedIndex(6);
        }
        else if(MesFixo == 8) {
            SelecaoMes.setSelectedIndex(7);
        }
        else if(MesFixo == 9) {
            SelecaoMes.setSelectedIndex(8);
        }
        else if(MesFixo == 10) {
            SelecaoMes.setSelectedIndex(9);
        }
        else if(MesFixo == 11) {
            SelecaoMes.setSelectedIndex(10);
        }
        else if(MesFixo == 12) {
            SelecaoMes.setSelectedIndex(11);
        }
        t1.setForeground(Color.RED);
        t8.setForeground(Color.RED);
        t15.setForeground(Color.RED);
        t22.setForeground(Color.RED);
        t29.setForeground(Color.RED);
        t36.setForeground(Color.RED);
        
        
        
    }
     public void Calendario (){
        
         t1.setText("");
         t2.setText("");
         t3.setText("");
         t4.setText("");
         t5.setText("");
         t6.setText("");
         t7.setText("");
         t8.setText("");
         t9.setText("");
         t10.setText("");
         t11.setText("");
         t12.setText("");
         t13.setText("");
         t14.setText("");
         t15.setText("");
         t16.setText("");
         t17.setText("");
         t18.setText("");
         t19.setText("");
         t20.setText("");
         t21.setText("");
         t22.setText("");
         t23.setText("");
         t24.setText("");
         t25.setText("");
         t26.setText("");
         t27.setText("");
         t28.setText("");
         t29.setText("");
         t30.setText("");
         t31.setText("");
         t32.setText("");
         t33.setText("");
         t34.setText("");
         t35.setText("");                       
         t36.setText("");
         t37.setText("");
         t38.setText("");
         t39.setText("");
         t40.setText("");
         t41.setText("");
         t42.setText("");
      
         DiaAltera = DiaFixo;
         MesAltera = SelecaoMes.getSelectedIndex();
         AnoAltera = Integer.parseInt(SelecaoAno.getSelectedItem().toString());
         
         int TotalDiaMes = 0; //variavel para receber a quantidade de dias no mes
                               // abaixo faço a verificao de qual mes esta selecionado, para setar a quantidade de dias para o mes selecionado
         if(MesAltera == 0) {   
             TotalDiaMes = 31;
         } else if(MesAltera == 1) {
             int resultado = (AnoAltera % 4);
             if(resultado == 0 ){
                 TotalDiaMes = 29;
             }else
                 TotalDiaMes = 28;            
             }
         else if(MesAltera == 2){
             TotalDiaMes = 31;
         }
         else if(MesAltera == 3){
             TotalDiaMes = 30;
         }
         else if(MesAltera == 4){
             TotalDiaMes = 31;
         }
         else if(MesAltera == 5){
             TotalDiaMes = 30;
         }
         else if(MesAltera == 6){
             TotalDiaMes = 31;
         }
         else if(MesAltera == 7){
             TotalDiaMes = 31;
         }
         else if(MesAltera == 8){
             TotalDiaMes = 30;
         }
         else if(MesAltera == 9){
             TotalDiaMes = 31;
         }
         else if(MesAltera == 10){
             TotalDiaMes = 30;
         }
         else if(MesAltera == 11){
             TotalDiaMes = 31;
         }
         
         
         //Abaixo verifica-se qual dia da semana inicia o mes 
         Calendar calendar = Calendar.getInstance();
         calendar.set(AnoAltera, MesAltera, 1); 
         int SetaDia = 0;
         
         int Semana = calendar.get(Calendar.DAY_OF_WEEK);
         
         if(Semana == Calendar.SUNDAY) {
             SetaDia = 1;
             System.out.print("Dom");
         }
         else if ( Semana == Calendar.MONDAY){
             SetaDia = 2;
              System.out.print("Seg");
         }
          else if ( Semana == Calendar.TUESDAY){
             SetaDia = 3;
              System.out.print("Terca");
         }
          else if ( Semana == Calendar.WEDNESDAY){
             SetaDia = 4;
             System.out.print("Quarta");
         }
          else if ( Semana == Calendar.THURSDAY){
             SetaDia = 5;
              System.out.print("qUINTA");
         }
          else if ( Semana == Calendar.FRIDAY){
             SetaDia = 6;
              System.out.print("Sexta");
         }
          else if ( Semana == Calendar.SATURDAY){
             SetaDia = 7;
              System.out.print("Sabado");
         }
         
         //Setando os dias
         for(int i= 1 ; i<= TotalDiaMes; i++){
             
             switch(SetaDia) {
                                
                 case 1:
                     t1.setText(""+i);
                     break;
                
                case 2:
                        t2.setText(""+i);
                        break;
                   
                case 3:
                     t3.setText(""+i);
                     break;
                
                case 4:
                     t4.setText(""+i);
                     break;
                
                case 5:
                     t5.setText(""+i);
                     break;
                
                case 6:
                     t6.setText(""+i);
                     break;
                
                case 7:
                     t7.setText(""+i);
                     break;
                
                case 8:
                     t8.setText(""+i);
                     break;
                
                case 9:
                     t9.setText(""+i);
                     break;
                
                case 10:
                     t10.setText(""+i);
                     break;
                 
                case 11:
                     t11.setText(""+i);
                     break;
                case 12:
                     t12.setText(""+i);
                     break;    
                case 13:
                     t13.setText(""+i);
                     break;
                case 14:
                     t14.setText(""+i);
                     break;
                case 15:
                     t15.setText(""+i);
                     break;
                case 16:
                     t16.setText(""+i);
                     break;
                case 17:
                     t17.setText(""+i);
                     break;
                case 18:
                     t18.setText(""+i);
                     break;
                case 19:
                     t19.setText(""+i);
                     break;
                case 20:
                     t20.setText(""+i);
                     break;
                case 21:
                     t21.setText(""+i);
                     break;
               case 22:
                     t22.setText(""+i);
                     break;
                case 23:
                     t23.setText(""+i);
                     break;
                case 24:
                     t24.setText(""+i);
                     break;
                case 25:
                     t25.setText(""+i);
                     break;
                case 26:
                     t26.setText(""+i);
                     break;
                case 27:
                     t27.setText(""+i);
                     break;
                case 28:
                     t28.setText(""+i);
                     break;
                case 29:
                     t29.setText(""+i);
                     break;
                case 30:
                     t30.setText(""+i);
                     break;
                case 31:
                     t31.setText(""+i);
                     break;
                case 32:
                     t32.setText(""+i);
                     break;
                case 33:
                     t33.setText(""+i);
                     break;
                case 34:
                     t34.setText(""+i);
                     break;
                case 35:
                     t35.setText(""+i);
                     break;
                case 36:
                     t36.setText(""+i);
                     break;
                case 37:
                     t37.setText(""+i);
                     break;
                case 38:
                     t38.setText(""+i);
                     break;
                case 39:
                     t39.setText(""+i);
                     break;
                case 40:
                     t40.setText(""+i);
                     break;
                case 41:
                     t41.setText(""+i);
                     break;
                case 42:
                     t42.setText(""+i);
                     break;     
               
         }
            SetaDia ++;
         }
        
         
         
         
         
     }   
        
}

