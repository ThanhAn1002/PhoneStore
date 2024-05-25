package Menu_Staff_4.SanPham;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.ImageIcon;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;

public class Form_San_Pham extends javax.swing.JPanel {

    private FormHome home;
    private final Animator animator;
    private Point animatePoint;
    private ModelItem itemSelected;

    public Form_San_Pham() {
        initComponents();
        setOpaque(false);

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(00, 0, 0, 0));

        setBackground(new Color(0, 0, 0, 0));
        init();
        animator = PropertySetter.createAnimator(500, mainPanel, "imageLocation", animatePoint, mainPanel.getTargetLocation());
        animator.addTarget(new PropertySetter(mainPanel, "imageSize", new Dimension(180, 120), mainPanel.getTargetSize()));
        animator.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel.setImageOld(null);
            }
        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
    }

    private void init() {
        home = new FormHome();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(home);
        testData();
    }

    private void testData() {
        home.setEvent((Component com, ModelItem item) -> {
            if (itemSelected != null) {
                mainPanel.setImageOld(itemSelected.getImage());
            }
            if (itemSelected != item) {
                if (!animator.isRunning()) {
                    itemSelected = item;
                    animatePoint = getLocationOf(com);
                    mainPanel.setImage(item.getImage());
                    mainPanel.setImageLocation(animatePoint);
                    mainPanel.setImageSize(new Dimension(180, 120));
                    mainPanel.repaint();
                    home.setSelected(com);
                    home.showItem(item);
                    animator.start();
                }
            }
        });
        int ID = 1;
        for (int i = 0; i < 1; i++) {
            home.addItem(new ModelItem(ID++, "iPhone 15 Pro Max", "Screen: OLED, 6.7'', Super Retina XDR \nOperating system: IOS 17 \nChip: Apple A17 Pro 6 cores \nRAM: 8 GB \nCapacity: 512 GB \nRear camera: Main 48 MP & Secondary 12 MP, 12 MP \nFront camera: 12 MP \nPin: 4422 mAh, Charger 20 W", 1499, "iPhone", new ImageIcon(getClass().getResource("/image/15 pro max.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 15 Pro", "Screen: OLED, 6.1'', Super Retina XDR \nOperating system: IOS 17 \nChip: Apple A17 Pro 6 cores \nRAM: 8 GB \nCapacity: 512 GB \nRear camera: Main 48 MP & Secondary 12 MP, 12 MP \nFront camera: 12 MP \nPin: 3274 mAh, Charger 20 W", 1299, "iPhone", new ImageIcon(getClass().getResource("/image/15 pro.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 15 Plus", "Screen: OLED, 6.7'', Super Retina XDR \nOperating system: IOS 17 \nChip: Apple A16 Bionic \nRAM: 6 GB \nCapacity: 512 GB \nRear camera: Main 48 MP & Secondary 12 MP, 12 MP \nFront camera: 12 MP \nPin: 4383 mAh, Charger 20 W", 1199, "iPhone", new ImageIcon(getClass().getResource("/image/15 plus.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 15", "Screen: OLED, 6.1'', Super Retina XDR \nOperating system: IOS 17 \nChip: Apple A16 Bionic \nRAM: 6 GB \nCapacity: 512 GB \nRear camera: Main 48 MP & Secondary 12 MP, 12 MP \nFront camera: 12 MP \nPin: 3349 mAh, Charger 20 W", 1099, "iPhone", new ImageIcon(getClass().getResource("/image/15.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 14 Pro Max", "Screen: OLED, 6.7'', Super Retina XDR \nOperating system: IOS 16 \nChip: Apple A16 Bionic \nRAM: 6 GB \nCapacity: 512 GB \nRear camera: Main 48 MP & Secondary 12 MP, 12 MP \nFront camera: 12 MP \nPin: 4323 mAh, Charger 20 W", 1399, "iPhone", new ImageIcon(getClass().getResource("/image/14 pro max.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 14 Pro", "Screen: OLED, 6.1'', Super Retina XDR \nOperating system: IOS 16 \nChip: Apple A16 Bionic \nRAM: 6 GB \nCapacity: 512 GB \nRear camera: Main 48 MP & Secondary 12 MP, 12 MP \nFront camera: 12 MP \nPin: 3200 mAh, Charger 20 W", 1299, "iPhone", new ImageIcon(getClass().getResource("/image/14 pro.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 14 Plus", "Screen: OLED, 6.7'', Super Retina XDR \nOperating system: IOS 16 \nChip: Apple A15 Bionic \nRAM: 6 GB \nCapacity: 512 GB \nRear camera: 2 camera 12 MP \nFront camera: 12 MP \nPin: 4325 mAh, Charger 20 W", 1099, "iPhone", new ImageIcon(getClass().getResource("/image/14 plus.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 14", "Screen: OLED, 6.1'', Super Retina XDR \nOperating system: IOS 16 \nChip: Apple A15 Bionic \nRAM: 6 GB \nCapacity: 512 GB \nRear camera: 2 camera 12 MP \nFront camera: 12 MP \nPin: 3279 mAh, Charger 20 W", 1099, "iPhone", new ImageIcon(getClass().getResource("/image/14.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 13 Pro Max", "Screen: OLED, 6.7'', Super Retina XDR \nOperating system: IOS 15 \nChip: Apple A15 Bionic \nRAM: 6 GB \nCapacity: 512 GB \nRear camera: 3 camera 12 MP \nFront camera: 12 MP \nPin: 4352 mAh, Charger 20 W", 1299, "iPhone", new ImageIcon(getClass().getResource("/image/13 pro max.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 13 Pro", "Screen: OLED, 6.1'', Super Retina XDR \nOperating system: IOS 15 \nChip: Apple A15 Bionic \nRAM: 6 GB \nCapacity: 512 GB \nRear camera: 3 camera 12 MP \nFront camera: 12 MP \nPin: 3095 mAh, Charger 20 W", 1299, "iPhone", new ImageIcon(getClass().getResource("/image/13 pro.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 13", "Screen: OLED, 6.1'', Super Retina XDR \nOperating system: IOS 15 \nChip: Apple A15 Bionic \nRAM: 4 GB \nCapacity: 512 GB \nRear camera: 2 camera 12 MP \nFront camera: 12 MP \nPin: 3240 mAh, Charger 20 W", 1099, "iPhone", new ImageIcon(getClass().getResource("/image/13.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 12 Pro Max", "Screen: OLED, 6.7'', Super Retina XDR \nOperating system: IOS 15 \nChip: Apple A14 Bionic \nRAM: 6 GB \nCapacity: 512 GB \nRear camera: 3 camera 12 MP \nFront camera: 12 MP \nPin: 3687 mAh, Charger 20 W", 1419, "iPhone", new ImageIcon(getClass().getResource("/image/12 pro max.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 12 Pro", "Screen: OLED, 6.1'', Super Retina XDR \nOperating system: IOS 15 \nChip: Apple A14 Bionic \nRAM: 6 GB \nCapacity: 512 GB \nRear camera: 3 camera 12 MP \nFront camera: 12 MP \nPin: 2815 mAh, Charger 20 W", 1299, "iPhone", new ImageIcon(getClass().getResource("/image/12 pro.png"))));
            home.addItem(new ModelItem(ID++, "iPhone 12", "Screen: OLED, 6.1'', Super Retina XDR \nOperating system: IOS 15 \nChip: Apple A14 Bionic \nRAM: 4 GB \nCapacity: 512 GB \nRear camera: 2 camera 12 MP \nFront camera: 12 MP \nPin: 2815 mAh, Charger 20 W", 899, "iPhone", new ImageIcon(getClass().getResource("/image/12.png"))));
            home.addItem(new ModelItem(ID++, "Galaxy S24 Ultra", "Screen: Dynamic AMOLED 2X, 6.8'', Quad HD+(2K+) \nOperating system: Android 14 \nChip: Snapdragon 8 Gen 3 for Galaxy \nRAM: 12 GB \nCapacity: 512 GB \nRear camera: Chính 200 MP & Secondary 50 MP, 12 MP, 10 MP \nFront camera: 12 MP \nPin: 5000 mAh, Charger 45 W", 1419, "Samsung", new ImageIcon(getClass().getResource("/image/galaxy s24 ultra.png"))));
            home.addItem(new ModelItem(ID++, "Galaxy S24+", "Screen: Dynamic AMOLED 2X, 6.7'', Quad HD+(2K+) \nOperating system: Android 14 \nChip: Exynos 2400 \nRAM: 12 GB \nCapacity: 512 GB \nRear camera: Main 50 MP & Secondary 12 MP, 10 MP \nFront camera: 12 MP \nPin: 4900 mAh, Charger 45 W", 1000, "Samsung", new ImageIcon(getClass().getResource("/image/galaxy s24+.png"))));
            home.addItem(new ModelItem(ID++, "Galaxy Z Flip5", "Screen: Main: Dynamic AMOLED 2X, Phụ: Super AMOLED, Main 6.7'' & Secondary 3.4'', Full HD+ \nOperating system: Android 13 \nChip: Snapdragon 8 Gen 2 for Galaxy \nRAM: 8 GB \nCapacity: 512 GB \nRear camera: 2 camera 12 MP \nFront camera: 10 MP \nPin: 3700 mAh, Charger 25 W", 1179, "Samsung", new ImageIcon(getClass().getResource("/image/galaxy z flip5.png"))));
            home.addItem(new ModelItem(ID++, "Galaxy Z Fold5", "Screen: Dynamic AMOLED 2X, Main 7.6'' & Secondary 6.2'', Quad HD+(2K+) \nHOperating system: Android 13 \nChip: Snapdragon 8 Gen 2 for Galaxy \nRAM: 12 GB \nCapacity: 512 GB \nRear camera: Main 50 MP & Secondary 12 MP, 10 MP \nFront camera: 10 MP & 4 Mp \nPin: 4400 mAh, Charger 25 W", 1800, "Samsung", new ImageIcon(getClass().getResource("/image/galaxy z fold5.png"))));
            home.addItem(new ModelItem(ID++, "Galaxy Z Flip4", "Screen: Chính: Dynamic AMOLED 2X, Phụ: Super AMOLED, Main 6.7'' & Secondary 1.9'', Full HD+ \nOperating system: Android 12 \nChip: Snapdragon 8+ Gen 1 \nRAM: 8 GB \nCapacity: 512 GB \nRear camera: 2 camera 12 MP \nFront camera: 10 MP \nPin: 3700 mAh, Charger 25 W", 1099, "Samsung", new ImageIcon(getClass().getResource("/image/galaxy z flip4.png"))));
            home.addItem(new ModelItem(ID++, "OPPO Reno11 5G", "Screen: AMOLED, 6.7'', Full HD+ \nOperating system: Android 14 \nChip: MediaTek Dimensity 7050 5G 8 cores \nRAM: 8 GB \nCapacity: 256 GB \nRear camera: Main 50 MP & Secondary 32 MP, 8 MP \nFront camera: 32 MP \nPin: 5000 mAh, Charger 67 W", 443, "OPPO", new ImageIcon(getClass().getResource("/image/oppo reno11.png"))));
            home.addItem(new ModelItem(ID++, "OPPO Reno11 F 5G", "Screen: AMOLED, 6.7'', Full HD+ \nOperating system: Android 14 \nChip: MediaTek Dimensity 7050 5G 8 cores \nRAM: 8 GB \nCapacity: 256 GB \nRear camera: Main 664 MP & Secondary 8 MP, 2 MP \nFront camera: 32 MP \nPin: 5000 mAh, Charger 67 W", 364, "OPPO", new ImageIcon(getClass().getResource("/image/oppo reno11 f.png"))));
            home.addItem(new ModelItem(ID++, "OPPO A18", "Screen: IPS LCD, 6.56'', HD+ \nOperating system: Android 13 \nChip: MediaTek Helio G85 \nRAM: 4 GB \nDCapacity: 128 GB \nRear camera: Main 8 MP & Secondary 2 MP \nFront camera: 5 MP \nPin: 5000 mAh, Charger 10 W", 162, "OPPO", new ImageIcon(getClass().getResource("/image/oppo a18.png"))));
            home.addItem(new ModelItem(ID++, "OPPO A38", "Screen: IPS LCD, 6.56'', HD+ \nOperating system: Android 13 \nChip: MediaTek Helio G85 \nRAM: 6 GB \nCapacity: 128 GB \nRear camera: Main 50 MP & Secondary 2 MP \nFront camera: 5 MP \nPin: 5000 mAh, Charger 33 W", 202, "OPPO", new ImageIcon(getClass().getResource("/image/oppo a38.png"))));
            home.addItem(new ModelItem(ID++, "OPPO A57", "Screen: IPS LCD, 6.56'', HD+ \nOperating system: Android 12 \nChip: MediaTek Helio G35 \nRAM: 4 GB \nCapacity: 128 GB \nRear camera: Main 13 MP & Secondary 2 MP \nFront camera: 8 MP \nPin: 5000 mAh, Charger 33 W", 180, "OPPO", new ImageIcon(getClass().getResource("/image/oppo a57.png"))));
            home.addItem(new ModelItem(ID++, "OPPO Reno11 Pro 5G", "Screen: AMOLED, 6.7'', Full HD+ \nOperating system: Android 14 \nChip: MediaTek Dimensity 8200 5G 8 cores \nRAM: 12 GB \nCapacity: 512 GB \nRear camera: Main 50 MP & Secondary 32 MP, 8 MP \nFront camera: 32 MP \nPin: 4600 mAh, Charger 80 W", 687, "OPPO", new ImageIcon(getClass().getResource("/image/oppo reno11 pro.png"))));
            home.addItem(new ModelItem(ID++, "OPPO Find N3 5G", "Screen: AMOLED, Main 7.82'' & Secondary 6.31'', Quad HD+(2K+) \nOperating system: Android 13 \nChip: Snapdragon 8 Gen 2 8 cores \nRAM: 16 GB \nCapacity: 512 GB \nRear camera: Main 48 MP & Secondary 48 MP, 64 MP \nFront camera: In: 20 MP & Outside: 32 MP \nPin: 4805 mAh, Charger 67 W", 1655, "OPPO", new ImageIcon(getClass().getResource("/image/oppo find n3.png"))));
            home.addItem(new ModelItem(ID++, "OPPO Find N3 Flip 5G", "Screen: AMOLED, Main 6.8'' & Secondary 3.26'', Full HD+ \nOperating system: Android 13 \nChip: MediaTek Dimensity 9200 5G 8 cores \nRAM: 12 GB \nCapacity: 256 GB \nRear camera: Main 50 MP & Secondary 48 MP, 32 MP \nFront camera: 32 MP \nPin: 4300 mAh, Charger 44 W", 928, "OPPO", new ImageIcon(getClass().getResource("/image/oppo n3 flip.png"))));
            home.addItem(new ModelItem(ID++, "OPPO Find N2 Flip 5G", "Screen: AMOLED, Main 6.8'' & Secondary 3.26'', Full HD+ \nOperating system: Android 13 \nChip: MediaTek Dimensity 9000+ 5G 8 cores \nRAM: 8 GB \nCapacity: 256 GB \nRear camera: Main 50 MP & Secondary 8 MP \nFront camera: 32 MP \nPin: 4300 mAh, Charger 44 W", 687, "OPPO", new ImageIcon(getClass().getResource("/image/oppo find n2 flip.png"))));

        }
    }

    private Point getLocationOf(Component com) {
        Point p = home.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 35;
        return new Point(x + itemX + left, y + itemY + top);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        background1 = new Menu_Staff_4.SanPham.Background();
        mainPanel = new Menu_Staff_4.SanPham.MainPanel();

        setBackground(new java.awt.Color(244, 244, 244));

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));

        background1.setBackground(new java.awt.Color(244, 244, 244));

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1019, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Menu_Staff_4.SanPham.Background background1;
    private javax.swing.JPanel jPanel1;
    private Menu_Staff_4.SanPham.MainPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
