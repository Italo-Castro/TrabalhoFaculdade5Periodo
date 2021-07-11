
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
    int DiaCliq = 0;
    
    
    
    public Agenda() {
        initComponents();
        IniciaCalendario();
        Calendario();
        Calendario_EVT();
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
        VoltarDataInicial = new javax.swing.JButton();
        MesPagina2 = new javax.swing.JLabel();
        DiaPagina2 = new javax.swing.JLabel();
        SemanaPagina2 = new javax.swing.JLabel();

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
        SelecaoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecaoAnoActionPerformed(evt);
            }
        });

        SelecaoMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro ", "Dezembro" }));
        SelecaoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecaoMesActionPerformed(evt);
            }
        });

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

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

        t1.setBackground(new java.awt.Color(153, 153, 153));
        t1.setForeground(new java.awt.Color(255, 0, 51));
        t1.setText("0");
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });

        t2.setBackground(new java.awt.Color(153, 153, 153));
        t2.setText("0");

        t3.setText("0");

        t4.setText("0");

        t5.setText("0");

        t6.setText("0");

        t7.setText("0");

        t8.setForeground(new java.awt.Color(255, 0, 51));
        t8.setText("0");

        t15.setForeground(new java.awt.Color(255, 0, 51));
        t15.setText("0");

        t22.setForeground(new java.awt.Color(255, 0, 51));
        t22.setText("0");

        t29.setForeground(new java.awt.Color(204, 0, 51));
        t29.setText("0");

        t36.setForeground(new java.awt.Color(204, 0, 0));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(SelecaoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
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
                            .addComponent(t38))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
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
                            .addComponent(s7)))
                    .addComponent(SelecaoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(17, Short.MAX_VALUE))
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

        VoltarDataInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VoltarDataInicialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VoltarDataInicialMouseExited(evt);
            }
        });
        VoltarDataInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarDataInicialActionPerformed(evt);
            }
        });

        MesPagina2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        MesPagina2.setText("Janeiro");

        DiaPagina2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        DiaPagina2.setText("1");

        SemanaPagina2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        SemanaPagina2.setText("Sexta");

        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SemanaPagina1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DiaPagina1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(MesPagina1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(AnoPagina1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(AnoPagina2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(VoltarDataInicial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(MesPagina2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DiaPagina2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SemanaPagina2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(VoltarDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MesPagina1)
                    .addComponent(AnoPagina1)
                    .addComponent(SemanaPagina1)
                    .addComponent(DiaPagina1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(AnoPagina2)
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DiaPagina2)
                            .addComponent(SemanaPagina2))
                        .addGap(220, 220, 220))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(MesPagina2)
                        .addContainerGap())))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(491, 491, 491))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(SemanaPagina1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DiaPagina1))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(VoltarDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MesPagina1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnoPagina1))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(SemanaPagina2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DiaPagina2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MesPagina2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnoPagina2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void SelecaoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecaoMesActionPerformed
       
        DiaAltera = DiaFixo;
        Calendario();
        
        
    }//GEN-LAST:event_SelecaoMesActionPerformed

    private void SelecaoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecaoAnoActionPerformed
       try {
           
           int x = Integer.parseInt(SelecaoAno.getSelectedItem().toString());
           DiaAltera = DiaFixo;
           Calendario();
           AnoPagina1.setText(SelecaoAno.getSelectedItem().toString());
           AnoPagina2.setText(SelecaoAno.getSelectedItem().toString());
           
       }catch(Exception e) {
           SelecaoAno.setSelectedItem(AnoFixo);
       }
    }//GEN-LAST:event_SelecaoAnoActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
      
        
        valorSelecao = Integer.parseInt(jSpinner1.getValue().toString());
        int x = SelecaoMes.getSelectedIndex();
        int ano = Integer.parseInt(SelecaoAno.getSelectedItem().toString());
        
        if (valorSelecao == - 1){
            if(SelecaoMes.getSelectedIndex() != 11) {
                SelecaoMes.setSelectedIndex(x + 1);
            } else {
                SelecaoMes.setSelectedIndex(0);
                ano = ano + 1;
                SelecaoAno.setSelectedItem(ano);
            }
        }
        
        if(valorSelecao == 1){
            if(SelecaoMes.getSelectedIndex() != 0){
                SelecaoMes.setSelectedIndex(x - 1);
            } else {
                SelecaoMes.setSelectedIndex(11);
                ano = ano - 1;
                SelecaoAno.setSelectedItem(ano);
            }
            
        }
        jSpinner1.setValue(0);
        //JOptionPane.showMessageDialog(null,jSpinner1.getValue());
    }//GEN-LAST:event_jSpinner1StateChanged

    private void VoltarDataInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarDataInicialActionPerformed
        IniciaCalendario();
        Calendario();
    }//GEN-LAST:event_VoltarDataInicialActionPerformed

    private void VoltarDataInicialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarDataInicialMouseEntered
        VoltarDataInicial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VoltarDataInicialMouseEntered

    private void VoltarDataInicialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarDataInicialMouseExited
       VoltarDataInicial.setBorder(null);
    }//GEN-LAST:event_VoltarDataInicialMouseExited

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnoPagina1;
    private javax.swing.JLabel AnoPagina2;
    private javax.swing.JLabel DiaPagina1;
    private javax.swing.JLabel DiaPagina2;
    private javax.swing.JLabel MesPagina1;
    private javax.swing.JLabel MesPagina2;
    private javax.swing.JComboBox<String> SelecaoAno;
    private javax.swing.JComboBox<String> SelecaoMes;
    private javax.swing.JLabel SemanaPagina1;
    private javax.swing.JLabel SemanaPagina2;
    private javax.swing.JButton VoltarDataInicial;
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
              System.out.print("Quinta");
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
        
         
         
         if ("".equals(t1.getText())){
             t1.setOpaque(true);
            
         }else {
             t1.setOpaque(false);
         }
         
         
           if (!"".equals(t2.getText())){
             t2.setOpaque(true);
         }else {
             t2.setOpaque(false);
         }
           
           if (!"".equals(t3.getText())){
             t3.setOpaque(true);
         }else {
             t3.setOpaque(false);
         }
           
           if (!"".equals(t4.getText())){
             t4.setOpaque(true);
         }else {
             t4.setOpaque(false);
         }
   
           if (!"".equals(t5.getText())){
             t5.setOpaque(true);
         }else {
             t5.setOpaque(false);
         }
           
           if (!"".equals(t6.getText())){
             t6.setOpaque(true);
         }else {
             t6.setOpaque(false);
         }
           
           if (!"".equals(t7.getText())){
             t7.setOpaque(true);
         }else {
             t7.setOpaque(false);
         }
           
           if (!"".equals(t8.getText())){
             t8.setOpaque(true);
         }else {
             t8.setOpaque(false);
         }
           
           if (!"".equals(t9.getText())){
             t9.setOpaque(true);
         }else {
             t9.setOpaque(false);
         }
           
           if (!"".equals(t10.getText())){
             t10.setOpaque(true);
         }else {
             t10.setOpaque(false);
         }
           
           if (!"".equals(t11.getText())){
             t11.setOpaque(true);
         }else {
             t11.setOpaque(false);
         }
           
           if (!"".equals(t12.getText())){
             t12.setOpaque(true);
         }else {
             t12.setOpaque(false);
         }
           
           if (!"".equals(t13.getText())){
             t13.setOpaque(true);
         }else {
             t13.setOpaque(false);
         }
           
           if (!"".equals(t14.getText())){
             t14.setOpaque(true);
         }else {
             t14.setOpaque(false);
         }
           
           if (!"".equals(t15.getText())){
             t15.setOpaque(true);
         }else {
             t15.setOpaque(false);
         }
           
           if (!"".equals(t16.getText())){
             t16.setOpaque(true);
         }else {
             t16.setOpaque(false);
         }
           
           if (!"".equals(t17.getText())){
             t17.setOpaque(true);
         }else {
             t17.setOpaque(false);
         }
           
           if (!"".equals(t18.getText())){
             t18.setOpaque(true);
         }else {
             t18.setOpaque(false);
         }
           if (!"".equals(t19.getText())){
             t19.setOpaque(true);
         }else {
             t19.setOpaque(false);
         }
           
           if (!"".equals(t20.getText())){
             t20.setOpaque(true);
         }else {
             t20.setOpaque(false);
         }
           
           if (!"".equals(t21.getText())){
             t21.setOpaque(true);
         }else {
             t21.setOpaque(false);
         }
           
           if (!"".equals(t22.getText())){
             t22.setOpaque(true);
         }else {
             t22.setOpaque(false);
         }
           
           if (!"".equals(t23.getText())){
             t23.setOpaque(true);
         }else {
             t23.setOpaque(false);
         }
           
           if (!"".equals(t24.getText())){
             t24.setOpaque(true);
         }else {
             t24.setOpaque(false);
         }
           
           if (!"".equals(t25.getText())){
             t25.setOpaque(true);
         }else {
             t25.setOpaque(false);
         }
           
           if (!"".equals(t26.getText())){
             t26.setOpaque(true);
         }else {
             t26.setOpaque(false);
         }
           
           if (!"".equals(t27.getText())){
             t27.setOpaque(true);
         }else {
             t27.setOpaque(false);
         }
           
           if (!"".equals(t28.getText())){
             t28.setOpaque(true);
         }else {
             t28.setOpaque(false);
         }
           
           if (!"".equals(t29.getText())){
             t29.setOpaque(true);
         }else {
             t29.setOpaque(false);
         }
           
           if (!"".equals(t30.getText())){
             t30.setOpaque(true);
         }else {
             t30.setOpaque(false);
         }
           
           if (!"".equals(t31.getText())){
             t31.setOpaque(true);
         }else {
             t31.setOpaque(false);
         }
           
         if (!"".equals(t32.getText())){
             t32.setOpaque(true);
         }else {
             t32.setOpaque(false);
         }
         
           if (!"".equals(t33.getText())){
             t33.setOpaque(true);
         }else {
             t33.setOpaque(false);
         }
           
           if (!"".equals(t34.getText())){
             t34.setOpaque(true);
         }else {
             t34.setOpaque(false);
         }
           
           if (!"".equals(t35.getText())){
             t35.setOpaque(true);
         }else {
             t35.setOpaque(false);
         }
           
           if (!"".equals(t36.getText())){
             t36.setOpaque(true);
         }else {
             t36.setOpaque(false);
         }
           
           if (!"".equals(t37.getText())){
             t37.setOpaque(true);
             System.out.print("t37");
         }else {
             t37.setOpaque(false);
         }
           
           if (!"".equals(t38.getText())){
             t38.setOpaque(true);
         }else {
             t38.setOpaque(false);
         }
           
           if (!"".equals(t39.getText())){
             t39.setOpaque(true);
         }else {
             t39.setOpaque(false);
         }
           
           if (!"".equals(t40.getText())){
             t40.setOpaque(true);
         }else {
             t40.setOpaque(false);
         }
           
           if (!"".equals(t41.getText())){
             t41.setOpaque(true);
         }else {
             t41.setOpaque(false);
         }
           
           if (!"".equals(t42.getText())){
             t42.setOpaque(true);
         }else {
             t42.setOpaque(false);
         }

         VerificaSemana();   
     }   
    public void VerificaSemana() {
       //este metodo verifica o dia da semana, para setar nas paginas 1 e 2
        try {
            MesAltera  = SelecaoMes.getSelectedIndex();
            AnoAltera = Integer.parseInt(SelecaoAno.getSelectedItem().toString());
            
            Calendar calendarN = Calendar.getInstance();
            calendarN.set(AnoAltera,MesAltera,DiaAltera);
            
            MesPagina1.setText(SelecaoMes.getSelectedItem().toString());
            MesPagina2.setText(SelecaoMes.getSelectedItem().toString());
            
            DiaPagina1.setText("" +DiaAltera);
            DiaPagina2.setText(""+ DiaAltera);
            
            int SemanaN = calendarN.get(Calendar.DAY_OF_WEEK);
            
            if(SemanaN == Calendar.SUNDAY){
                SemanaPagina1.setText("Domingo");
                SemanaPagina2.setText("Domingo");
            }
            else if ( SemanaN == Calendar.MONDAY){
                SemanaPagina1.setText("Segunda");
                SemanaPagina2.setText("Segunda");
            }
            else if ( SemanaN == Calendar.TUESDAY){
                SemanaPagina1.setText("Terça");
                SemanaPagina2.setText("Terça");
            }
            else if ( SemanaN == Calendar.WEDNESDAY){
                SemanaPagina1.setText("Quarta");
                SemanaPagina2.setText("Quarta");
            }
            else if ( SemanaN == Calendar.THURSDAY){
                SemanaPagina1.setText("Quinta");
                SemanaPagina2.setText("Quinta");
            }
            else if ( SemanaN == Calendar.WEDNESDAY){
                SemanaPagina1.setText("Sexta");
                SemanaPagina2.setText("Sexta");
            }
            else if ( SemanaN == Calendar.WEDNESDAY){
                SemanaPagina1.setText("Sabado");
                SemanaPagina2.setText("Sabado");
            }
        }catch (Exception e) {
            System.out.print(e);
        }
    }
    
    public void Calendario_EVT (){
        
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t1.getText())){
                    t1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t1.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t1.getText())) {
                    DiaPagina1.setText(t1.getText());
                    DiaPagina2.setText(t1.getText());
                    
                    DiaAltera = Integer.parseInt(t1.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
                
                
            }
        });
        
        t12.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t2.getText())){
                    t2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t2.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t2.getText())) {
                    DiaPagina1.setText(t2.getText());
                    DiaPagina2.setText(t2.getText());
                    
                    DiaAltera = Integer.parseInt(t2.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t3.getText())){
                    t3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t3.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                  if (!"".equals(t3.getText())) {
                    DiaPagina1.setText(t3.getText());
                    DiaPagina2.setText(t3.getText());
                    
                    DiaAltera = Integer.parseInt(t3.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t4.getText())){
                    t4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t4.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                  if (!"".equals(t4.getText())) {
                    DiaPagina1.setText(t4.getText());
                    DiaPagina2.setText(t4.getText());
                    
                    DiaAltera = Integer.parseInt(t4.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
        t5.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t5.getText())){
                    t5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t5.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                  if (!"".equals(t5.getText())) {
                    DiaPagina1.setText(t5.getText());
                    DiaPagina2.setText(t5.getText());
                    
                    DiaAltera = Integer.parseInt(t5.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
        t6.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t6.getText())){
                    t6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t6.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                  if (!"".equals(t6.getText())) {
                    DiaPagina1.setText(t6.getText());
                    DiaPagina2.setText(t6.getText());
                    
                    DiaAltera = Integer.parseInt(t6.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
        t7.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t7.getText())){
                    t7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t7.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                  if (!"".equals(t7.getText())) {
                    DiaPagina1.setText(t7.getText());
                    DiaPagina2.setText(t7.getText());
                    
                    DiaAltera = Integer.parseInt(t7.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
        t8.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t8.getText())){
                    t8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t8.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                  if (!"".equals(t8.getText())) {
                    DiaPagina1.setText(t8.getText());
                    DiaPagina2.setText(t8.getText());
                    
                    DiaAltera = Integer.parseInt(t8.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
        t9.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t9.getText())){
                    t9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t9.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                  if (!"".equals(t9.getText())) {
                    DiaPagina1.setText(t9.getText());
                    DiaPagina2.setText(t9.getText());
                    
                    DiaAltera = Integer.parseInt(t9.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
        t10.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t10.getText())){
                    t10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t10.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                 if (!"".equals(t10.getText())) {
                    DiaPagina1.setText(t10.getText());
                    DiaPagina2.setText(t10.getText());
                    
                    DiaAltera = Integer.parseInt(t10.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            
            }
        });
        
        t11.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t11.getText())){
                    t11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t11.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                 if (!"".equals(t11.getText())) {
                    DiaPagina1.setText(t11.getText());
                    DiaPagina2.setText(t11.getText());
                    
                    DiaAltera = Integer.parseInt(t11.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            
            }
        });
        
        t12.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t12.getText())){
                    t12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t12.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                 if (!"".equals(t12.getText())) {
                    DiaPagina1.setText(t12.getText());
                    DiaPagina2.setText(t12.getText());
                    
                    DiaAltera = Integer.parseInt(t12.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            
            }
        });
        
        t13.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t13.getText())){
                    t13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t13.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t13.getText())) {
                    DiaPagina1.setText(t13.getText());
                    DiaPagina2.setText(t13.getText());
                    
                    DiaAltera = Integer.parseInt(t13.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
        
        t14.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t14.getText())){
                    t14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t14.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t14.getText())) {
                    DiaPagina1.setText(t14.getText());
                    DiaPagina2.setText(t14.getText());
                    
                    DiaAltera = Integer.parseInt(t14.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
        t15.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t15.getText())){
                    t15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t15.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t15.getText())) {
                    DiaPagina1.setText(t15.getText());
                    DiaPagina2.setText(t15.getText());
                    
                    DiaAltera = Integer.parseInt(t15.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
          t16.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t16.getText())){
                    t16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t16.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t16.getText())) {
                    DiaPagina1.setText(t16.getText());
                    DiaPagina2.setText(t16.getText());
                    
                    DiaAltera = Integer.parseInt(t16.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
            t17.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t17.getText())){
                    t17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t17.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t17.getText())) {
                    DiaPagina1.setText(t17.getText());
                    DiaPagina2.setText(t17.getText());
                    
                    DiaAltera = Integer.parseInt(t17.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
            t18.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t18.getText())){
                    t18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t18.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t18.getText())) {
                    DiaPagina1.setText(t18.getText());
                    DiaPagina2.setText(t18.getText());
                    
                    DiaAltera = Integer.parseInt(t18.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
          t19.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t19.getText())){
                    t19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t19.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t19.getText())) {
                    DiaPagina1.setText(t19.getText());
                    DiaPagina2.setText(t19.getText());
                    
                    DiaAltera = Integer.parseInt(t19.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
          t20.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t20.getText())){
                    t20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t20.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t20.getText())) {
                    DiaPagina1.setText(t20.getText());
                    DiaPagina2.setText(t20.getText());
                    
                    DiaAltera = Integer.parseInt(t20.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
        
           t21.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t21.getText())){
                    t21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t21.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t21.getText())) {
                    DiaPagina1.setText(t21.getText());
                    DiaPagina2.setText(t21.getText());
                    
                    DiaAltera = Integer.parseInt(t21.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
           t22.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t22.getText())){
                    t22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t22.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t22.getText())) {
                    DiaPagina1.setText(t22.getText());
                    DiaPagina2.setText(t22.getText());
                    
                    DiaAltera = Integer.parseInt(t22.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
           t23.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t23.getText())){
                    t23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t23.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t23.getText())) {
                    DiaPagina1.setText(t23.getText());
                    DiaPagina2.setText(t23.getText());
                    
                    DiaAltera = Integer.parseInt(t23.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
           t24.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t24.getText())){
                    t24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t24.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t24.getText())) {
                    DiaPagina1.setText(t24.getText());
                    DiaPagina2.setText(t24.getText());
                    
                    DiaAltera = Integer.parseInt(t24.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
           t25.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t25.getText())){
                    t25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t25.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t25.getText())) {
                    DiaPagina1.setText(t25.getText());
                    DiaPagina2.setText(t25.getText());
                    
                    DiaAltera = Integer.parseInt(t25.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
           t26.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t26.getText())){
                    t26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t26.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t26.getText())) {
                    DiaPagina1.setText(t26.getText());
                    DiaPagina2.setText(t2.getText());
                    
                    DiaAltera = Integer.parseInt(t26.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
           t27.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t27.getText())){
                    t27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t27.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t27.getText())) {
                    DiaPagina1.setText(t27.getText());
                    DiaPagina2.setText(t27.getText());
                    
                    DiaAltera = Integer.parseInt(t27.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
           t28.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t28.getText())){
                    t28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t28.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t28.getText())) {
                    DiaPagina1.setText(t28.getText());
                    DiaPagina2.setText(t28.getText());
                    
                    DiaAltera = Integer.parseInt(t28.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
           t29.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t29.getText())){
                    t29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t29.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t29.getText())) {
                    DiaPagina1.setText(t29.getText());
                    DiaPagina2.setText(t29.getText());
                    
                    DiaAltera = Integer.parseInt(t29.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
           t30.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t30.getText())){
                    t30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t30.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t30.getText())) {
                    DiaPagina1.setText(t30.getText());
                    DiaPagina2.setText(t30.getText());
                    
                    DiaAltera = Integer.parseInt(t30.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
           t31.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t31.getText())){
                    t31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t31.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t31.getText())) {
                    DiaPagina1.setText(t31.getText());
                    DiaPagina2.setText(t31.getText());
                    
                    DiaAltera = Integer.parseInt(t31.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
          t32.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t32.getText())){
                    t32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t32.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t32.getText())) {
                    DiaPagina1.setText(t32.getText());
                    DiaPagina2.setText(t32.getText());
                    
                    DiaAltera = Integer.parseInt(t32.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
          t33.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t33.getText())){
                    t33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t33.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t33.getText())) {
                    DiaPagina1.setText(t33.getText());
                    DiaPagina2.setText(t33.getText());
                    
                    DiaAltera = Integer.parseInt(t33.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
          t34.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t34.getText())){
                    t34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t34.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t34.getText())) {
                    DiaPagina1.setText(t34.getText());
                    DiaPagina2.setText(t34.getText());
                    
                    DiaAltera = Integer.parseInt(t34.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
          t35.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t35.getText())){
                    t35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t35.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t35.getText())) {
                    DiaPagina1.setText(t35.getText());
                    DiaPagina2.setText(t35.getText());
                    
                    DiaAltera = Integer.parseInt(t35.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
          t36.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t36.getText())){
                    t36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t36.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t36.getText())) {
                    DiaPagina1.setText(t36.getText());
                    DiaPagina2.setText(t36.getText());
                    
                    DiaAltera = Integer.parseInt(t36.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
          
          t37.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t37.getText())){
                    t37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t37.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t37.getText())) {
                    DiaPagina1.setText(t37.getText());
                    DiaPagina2.setText(t37.getText());
                    
                    DiaAltera = Integer.parseInt(t37.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
            
         t38.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t38.getText())){
                    t38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t38.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t38.getText())) {
                    DiaPagina1.setText(t38.getText());
                    DiaPagina2.setText(t38.getText());
                    
                    DiaAltera = Integer.parseInt(t38.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
            
          t39.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t39.getText())){
                    t39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t39.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t39.getText())) {
                    DiaPagina1.setText(t39.getText());
                    DiaPagina2.setText(t39.getText());
                    
                    DiaAltera = Integer.parseInt(t39.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
            
           t40.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t40.getText())){
                    t40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t40.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t40.getText())) {
                    DiaPagina1.setText(t40.getText());
                    DiaPagina2.setText(t40.getText());
                    
                    DiaAltera = Integer.parseInt(t40.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
            t41.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t41.getText())){
                    t41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t41.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t41.getText())) {
                    DiaPagina1.setText(t41.getText());
                    DiaPagina2.setText(t41.getText());
                    
                    DiaAltera = Integer.parseInt(t41.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
             t42.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseEntered (java.awt.event.MouseEvent evt){
                if(! "".equals(t42.getText())){
                    t42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited (java.awt.event.MouseEvent evt){
                t42.setBorder(null);
            }
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                if (!"".equals(t42.getText())) {
                    DiaPagina1.setText(t42.getText());
                    DiaPagina2.setText(t42.getText());
                    
                    DiaAltera = Integer.parseInt(t42.getText());
                    DiaCliq = 0 ;
                    VerificaSemana();
                    //LEAgenda();
                }
            }
        });
        
        
        
        
        
        }
        
    }
     


