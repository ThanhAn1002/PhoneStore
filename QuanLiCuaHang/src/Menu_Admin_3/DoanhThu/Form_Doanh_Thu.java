package Menu_Admin_3.DoanhThu;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class Form_Doanh_Thu extends javax.swing.JPanel {

    public Form_Doanh_Thu() {
        initComponents();
        setOpaque(false);
        init();
    }

    private void init() {
        chart.addLegend("Income", new Color(245, 189, 135));
        chart.addLegend("Expense", new Color(135, 189, 245));
        chart.addLegend("Profit", new Color(189, 135, 245));
        chart.addLegend("Cost", new Color(139, 229, 222));
        chart.addData(new ModelChart("January", new double[]{100, 150, 200, 500}));
        chart.addData(new ModelChart("February", new double[]{600, 750, 300, 150}));
        chart.addData(new ModelChart("March", new double[]{200, 350, 1000, 900}));
        chart.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
        chart.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
        chart.addData(new ModelChart("June", new double[]{190, 500, 700, 1000}));
        chart.addData(new ModelChart("July", new double[]{190, 500, 700, 1000}));
        chart.addData(new ModelChart("August", new double[]{190, 500, 700, 1000}));
        chart.addData(new ModelChart("September", new double[]{190, 500, 700, 1000}));
        chart.addData(new ModelChart("October", new double[]{190, 500, 700, 1000}));
        chart.addData(new ModelChart("November", new double[]{190, 500, 700, 1000}));
        chart.addData(new ModelChart("December", new double[]{190, 500, 700, 1000}));

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{1, "Hoàng Thanh A", "Male", "0888167895", "Iphone 15 Pro Max", "$ 1.800", "1:36 16/04/2024"});
        model.addRow(new Object[]{2, "Nguyễn Thị D", "Female", "0888167895", "Iphone 11 Pro", "$ 1.400", "21:20 05/06/2024"});
        model.addRow(new Object[]{1, "Hoàng Thanh B", "Male", "0888167895", "Iphone 12 Pro Max", "$ 1.200", "1:36 16/04/2024"});
        model.addRow(new Object[]{2, "Nguyễn Thị L", "Female", "0888167895", "Iphone 14 Pro", "$ 1.700", "21:20 05/06/2024"});
        model.addRow(new Object[]{1, "Hoàng Thanh C", "Male", "0888167895", "Iphone 12 Pro Max", "$ 1.400", "1:36 16/04/2024"});
        model.addRow(new Object[]{2, "Nguyễn Thị V", "Female", "0888167895", "Iphone 15 Pro", "$ 1.500", "21:20 05/06/2024"});
        model.addRow(new Object[]{1, "Hoàng Thanh G", "Male", "0888167895", "Iphone 13 Pro Max", "$ 1.300", "1:36 16/04/2024"});
        model.addRow(new Object[]{2, "Nguyễn Thị A", "Female", "0888167895", "Iphone 112 Pro", "$ 1.200", "21:20 05/06/2024"});
        model.addRow(new Object[]{1, "Hoàng Thanh F", "Male", "0888167895", "Iphone 12 Pro Max", "$ 1.500", "1:36 16/04/2024"});
        model.addRow(new Object[]{2, "Nguyễn Thị B", "Female", "0888167895", "Iphone 11 Pro", "$ 1.700", "21:20 05/06/2024"});
        model.addRow(new Object[]{1, "Hoàng Thanh Q", "Male", "0888167895", "Iphone 13 Pro Max", "$ 1.800", "1:36 16/04/2024"});
        model.addRow(new Object[]{2, "Nguyễn Thị BC", "Female", "0888167895", "Iphone 12 Pro", "$ 1.900", "21:20 05/06/2024"});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollBarCustom2 = new ScrollBar.ScrollBarCustom();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new Menu_Admin_3.DoanhThu.PanelRound();
        chart = new Menu_Admin_3.DoanhThu.Chart();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Menu_Admin_3.DoanhThu.TableColumn();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setText("Revenue Chart");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 997, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBar(scrollBarCustom2);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Name", "Gender", "Phone Number", "Product", "Total Amount", "Purchase Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(79, 79, 79));
        jLabel2.setText("Purchase History");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollBarCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollBarCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Menu_Admin_3.DoanhThu.Chart chart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Menu_Admin_3.DoanhThu.PanelRound panelRound1;
    private ScrollBar.ScrollBarCustom scrollBarCustom2;
    private Menu_Admin_3.DoanhThu.TableColumn table;
    // End of variables declaration//GEN-END:variables
}
