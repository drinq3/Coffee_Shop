package coffee_shop;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public final class mainFrame extends javax.swing.JFrame {

    Connection conn;
    String name = null;
    String cash;
    String IP_ADDRESS = "";
    String SEND_TO = "";
    double totalAmount = 0;
    double cashDouble;
    double totalDouble;
    DefaultTableModel model;

    public mainFrame() {

        initComponents();
        setupComponent();
        conn = javaConnection.database();
        model = (DefaultTableModel) this.table.getModel();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM,dd,yyyy");
        String dateNow = now.format(formatter);
        dateLabel.setText(dateNow);
    }

    public boolean isValidGateway(String gateway) {
        try {
            String ipRegex = "\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
            Pattern pattern = Pattern.compile(ipRegex);
            Matcher matcher = pattern.matcher(gateway);
            return matcher.matches();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop1 = new javax.swing.JPopupMenu();
        rename1 = new javax.swing.JMenuItem();
        edit_price1 = new javax.swing.JMenuItem();
        edit_image1 = new javax.swing.JMenuItem();
        pop2 = new javax.swing.JPopupMenu();
        rename2 = new javax.swing.JMenuItem();
        edit_price2 = new javax.swing.JMenuItem();
        edit_image2 = new javax.swing.JMenuItem();
        pop3 = new javax.swing.JPopupMenu();
        rename3 = new javax.swing.JMenuItem();
        edit_price3 = new javax.swing.JMenuItem();
        edit_image3 = new javax.swing.JMenuItem();
        pop4 = new javax.swing.JPopupMenu();
        rename4 = new javax.swing.JMenuItem();
        edit_price4 = new javax.swing.JMenuItem();
        edit_image4 = new javax.swing.JMenuItem();
        pop5 = new javax.swing.JPopupMenu();
        rename5 = new javax.swing.JMenuItem();
        edit_price5 = new javax.swing.JMenuItem();
        edit_image5 = new javax.swing.JMenuItem();
        pop6 = new javax.swing.JPopupMenu();
        rename6 = new javax.swing.JMenuItem();
        edit_price6 = new javax.swing.JMenuItem();
        edit_image6 = new javax.swing.JMenuItem();
        pop7 = new javax.swing.JPopupMenu();
        rename7 = new javax.swing.JMenuItem();
        edit_price7 = new javax.swing.JMenuItem();
        edit_image7 = new javax.swing.JMenuItem();
        pop8 = new javax.swing.JPopupMenu();
        rename8 = new javax.swing.JMenuItem();
        edit_price8 = new javax.swing.JMenuItem();
        edit_image8 = new javax.swing.JMenuItem();
        pop9 = new javax.swing.JPopupMenu();
        rename9 = new javax.swing.JMenuItem();
        edit_price9 = new javax.swing.JMenuItem();
        edit_image9 = new javax.swing.JMenuItem();
        pop10 = new javax.swing.JPopupMenu();
        rename10 = new javax.swing.JMenuItem();
        edit_price10 = new javax.swing.JMenuItem();
        edit_image10 = new javax.swing.JMenuItem();
        pop11 = new javax.swing.JPopupMenu();
        rename11 = new javax.swing.JMenuItem();
        edit_price11 = new javax.swing.JMenuItem();
        edit_image11 = new javax.swing.JMenuItem();
        pop12 = new javax.swing.JPopupMenu();
        rename12 = new javax.swing.JMenuItem();
        edit_price12 = new javax.swing.JMenuItem();
        edit_image12 = new javax.swing.JMenuItem();
        tablePop = new javax.swing.JPopupMenu();
        remove = new javax.swing.JMenuItem();
        historyPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        excelPrintButton = new javax.swing.JButton();
        pdfPrintButton = new javax.swing.JButton();
        deleteOrder = new javax.swing.JButton();
        previousTotalSales = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        previousTable = new javax.swing.JTable();
        recieptPanel = new javax.swing.JPanel();
        empty = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sep1 = new javax.swing.JSeparator();
        amountLabel = new javax.swing.JLabel();
        itemLabel1 = new javax.swing.JLabel();
        quatityLabel1 = new javax.swing.JLabel();
        sep2 = new javax.swing.JSeparator();
        name1 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        qq1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        qq2 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        qq3 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        qq4 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        qq5 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        qq6 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        name7 = new javax.swing.JLabel();
        qq7 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        name8 = new javax.swing.JLabel();
        qq8 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        name9 = new javax.swing.JLabel();
        qq9 = new javax.swing.JLabel();
        a9 = new javax.swing.JLabel();
        name10 = new javax.swing.JLabel();
        qq10 = new javax.swing.JLabel();
        a10 = new javax.swing.JLabel();
        name11 = new javax.swing.JLabel();
        qq11 = new javax.swing.JLabel();
        a11 = new javax.swing.JLabel();
        name12 = new javax.swing.JLabel();
        qq12 = new javax.swing.JLabel();
        a12 = new javax.swing.JLabel();
        sep3 = new javax.swing.JSeparator();
        dateLabel = new javax.swing.JLabel();
        pAmount = new javax.swing.JLabel();
        pCash = new javax.swing.JLabel();
        pBalance = new javax.swing.JLabel();
        backGroundPanel = new javax.swing.JPanel();
        historyButton = new javax.swing.JButton();
        excelPrintButton2 = new javax.swing.JButton();
        basePanel = new javax.swing.JPanel();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        label_name4 = new javax.swing.JLabel();
        label_name1 = new javax.swing.JLabel();
        label_name2 = new javax.swing.JLabel();
        label_name3 = new javax.swing.JLabel();
        label_name5 = new javax.swing.JLabel();
        label_name6 = new javax.swing.JLabel();
        label_name7 = new javax.swing.JLabel();
        label_name8 = new javax.swing.JLabel();
        label_name9 = new javax.swing.JLabel();
        label_name10 = new javax.swing.JLabel();
        label_name11 = new javax.swing.JLabel();
        label_name12 = new javax.swing.JLabel();
        price_label6 = new javax.swing.JLabel();
        price_label5 = new javax.swing.JLabel();
        price_label7 = new javax.swing.JLabel();
        price_label8 = new javax.swing.JLabel();
        price_label4 = new javax.swing.JLabel();
        price_label3 = new javax.swing.JLabel();
        price_label2 = new javax.swing.JLabel();
        price_label1 = new javax.swing.JLabel();
        price_label9 = new javax.swing.JLabel();
        price_label10 = new javax.swing.JLabel();
        price_label11 = new javax.swing.JLabel();
        price_label12 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        copy = new javax.swing.JLabel();
        q2 = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        q3 = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        q4 = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        q5 = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        q6 = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        q7 = new javax.swing.JTextField();
        label8 = new javax.swing.JLabel();
        q8 = new javax.swing.JTextField();
        label9 = new javax.swing.JLabel();
        q9 = new javax.swing.JTextField();
        label10 = new javax.swing.JLabel();
        q10 = new javax.swing.JTextField();
        label11 = new javax.swing.JLabel();
        q11 = new javax.swing.JTextField();
        label12 = new javax.swing.JLabel();
        q12 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        summary_button = new javax.swing.JButton();
        leftPanel = new javax.swing.JPanel();
        tablePanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        totalValue = new javax.swing.JLabel();
        blcnLabel = new javax.swing.JLabel();
        totalLabel2 = new javax.swing.JLabel();
        cashValue = new javax.swing.JLabel();
        cashLabel1 = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        rename1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rename1.setText("Rename");
        pop1.add(rename1);

        edit_price1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_price1.setText("Edit Price");
        pop1.add(edit_price1);

        edit_image1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_image1.setText("Edit Image");
        pop1.add(edit_image1);

        rename2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rename2.setText("Rename");
        pop2.add(rename2);

        edit_price2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_price2.setText("Edit Price");
        pop2.add(edit_price2);

        edit_image2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_image2.setText("Edit Image");
        pop2.add(edit_image2);

        rename3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rename3.setText("Rename");
        pop3.add(rename3);

        edit_price3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_price3.setText("Edit Price");
        pop3.add(edit_price3);

        edit_image3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_image3.setText("Edit Image");
        pop3.add(edit_image3);

        rename4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rename4.setText("Rename");
        pop4.add(rename4);

        edit_price4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_price4.setText("Edit Price");
        pop4.add(edit_price4);

        edit_image4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_image4.setText("Edit Image");
        pop4.add(edit_image4);

        rename5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rename5.setText("Rename");
        pop5.add(rename5);

        edit_price5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_price5.setText("Edit Price");
        pop5.add(edit_price5);

        edit_image5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_image5.setText("Edit Image");
        pop5.add(edit_image5);

        rename6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rename6.setText("Rename");
        pop6.add(rename6);

        edit_price6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_price6.setText("Edit Price");
        pop6.add(edit_price6);

        edit_image6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_image6.setText("Edit Image");
        pop6.add(edit_image6);

        rename7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rename7.setText("Rename");
        pop7.add(rename7);

        edit_price7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_price7.setText("Edit Price");
        pop7.add(edit_price7);

        edit_image7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_image7.setText("Edit Image");
        pop7.add(edit_image7);

        rename8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rename8.setText("Rename");
        pop8.add(rename8);

        edit_price8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_price8.setText("Edit Price");
        pop8.add(edit_price8);

        edit_image8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_image8.setText("Edit Image");
        pop8.add(edit_image8);

        rename9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rename9.setText("Rename");
        pop9.add(rename9);

        edit_price9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_price9.setText("Edit Price");
        pop9.add(edit_price9);

        edit_image9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_image9.setText("Edit Image");
        pop9.add(edit_image9);

        rename10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rename10.setText("Rename");
        pop10.add(rename10);

        edit_price10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_price10.setText("Edit Price");
        pop10.add(edit_price10);

        edit_image10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_image10.setText("Edit Image");
        pop10.add(edit_image10);

        rename11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rename11.setText("Rename");
        pop11.add(rename11);

        edit_price11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_price11.setText("Edit Price");
        pop11.add(edit_price11);

        edit_image11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_image11.setText("Edit Image");
        pop11.add(edit_image11);

        rename12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rename12.setText("Rename");
        pop12.add(rename12);

        edit_price12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_price12.setText("Edit Price");
        pop12.add(edit_price12);

        edit_image12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_image12.setText("Edit Image");
        pop12.add(edit_image12);

        remove.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        remove.setText("Remove");
        remove.setOpaque(true);
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        tablePop.add(remove);

        historyPanel.setPreferredSize(new java.awt.Dimension(900, 600));
        historyPanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));
        historyPanel.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 75));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        excelPrintButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        excelPrintButton.setText("Print (Excel)");
        excelPrintButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excelPrintButton.setPreferredSize(new java.awt.Dimension(150, 40));
        excelPrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelPrintButtonActionPerformed(evt);
            }
        });
        jPanel2.add(excelPrintButton);

        pdfPrintButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pdfPrintButton.setText("Print (PDF)");
        pdfPrintButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pdfPrintButton.setPreferredSize(new java.awt.Dimension(150, 40));
        pdfPrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfPrintButtonActionPerformed(evt);
            }
        });
        jPanel2.add(pdfPrintButton);

        deleteOrder.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        deleteOrder.setText("Delete All Order");
        deleteOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteOrder.setPreferredSize(new java.awt.Dimension(150, 40));
        deleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrderActionPerformed(evt);
            }
        });
        jPanel2.add(deleteOrder);

        previousTotalSales.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        previousTotalSales.setForeground(new java.awt.Color(255, 255, 255));
        previousTotalSales.setText("Total Sales:");
        previousTotalSales.setToolTipText("");
        jPanel2.add(previousTotalSales);

        historyPanel.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        previousTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        previousTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(previousTable);
        if (previousTable.getColumnModel().getColumnCount() > 0) {
            previousTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            previousTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        historyPanel.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        recieptPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        recieptPanel.add(empty, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 410, 10));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setText("11nth Street");
        recieptPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 230, 40));

        sep1.setForeground(new java.awt.Color(0, 0, 0));
        recieptPanel.add(sep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 410, 10));

        amountLabel.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        amountLabel.setText("Amount");
        recieptPanel.add(amountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 110, 30));

        itemLabel1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        itemLabel1.setText("Item Name");
        recieptPanel.add(itemLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, 30));

        quatityLabel1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        quatityLabel1.setText("Quantity");
        recieptPanel.add(quatityLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 90, 30));

        sep2.setForeground(new java.awt.Color(0, 0, 0));
        recieptPanel.add(sep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 410, 10));

        name1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        recieptPanel.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 30));
        recieptPanel.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 110, 30));
        recieptPanel.add(qq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 80, 30));

        name2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        recieptPanel.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 30));
        recieptPanel.add(qq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 80, 30));
        recieptPanel.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 110, 30));

        name3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        recieptPanel.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 30));
        recieptPanel.add(qq3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 80, 30));
        recieptPanel.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 110, 30));

        name4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        recieptPanel.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, 30));
        recieptPanel.add(qq4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 80, 30));
        recieptPanel.add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 110, 30));

        name5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        recieptPanel.add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 180, 30));
        recieptPanel.add(qq5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 80, 30));
        recieptPanel.add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 110, 30));

        name6.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        recieptPanel.add(name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 180, 30));
        recieptPanel.add(qq6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 80, 30));
        recieptPanel.add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 110, 30));

        name7.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        recieptPanel.add(name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 180, 30));
        recieptPanel.add(qq7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 80, 30));
        recieptPanel.add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 110, 30));

        name8.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        recieptPanel.add(name8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 180, 30));
        recieptPanel.add(qq8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 80, 30));
        recieptPanel.add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 110, 30));

        name9.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        recieptPanel.add(name9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 180, 30));
        recieptPanel.add(qq9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 80, 30));
        recieptPanel.add(a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 110, 30));

        name10.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        recieptPanel.add(name10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 180, 30));
        recieptPanel.add(qq10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 80, 30));
        recieptPanel.add(a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 110, 30));

        name11.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        recieptPanel.add(name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 180, 30));
        recieptPanel.add(qq11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 80, 30));
        recieptPanel.add(a11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 110, 30));

        name12.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        recieptPanel.add(name12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 180, 30));
        recieptPanel.add(qq12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 80, 30));
        recieptPanel.add(a12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 110, 30));

        sep3.setForeground(new java.awt.Color(0, 0, 0));
        recieptPanel.add(sep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 410, 10));

        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recieptPanel.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 190, 30));

        pAmount.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        pAmount.setText("Total Amount:");
        recieptPanel.add(pAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 180, 40));

        pCash.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        pCash.setText("Cash:");
        recieptPanel.add(pCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 180, 40));

        pBalance.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        pBalance.setText("Balance:");
        recieptPanel.add(pBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 180, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        backGroundPanel.setBackground(new java.awt.Color(102, 51, 0));
        backGroundPanel.setPreferredSize(new java.awt.Dimension(1300, 50));
        backGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historyButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        historyButton.setText("Previous Order");
        historyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });
        backGroundPanel.add(historyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 170, 30));

        excelPrintButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        excelPrintButton2.setText("Go back");
        excelPrintButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excelPrintButton2.setPreferredSize(new java.awt.Dimension(150, 40));
        excelPrintButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelPrintButton2ActionPerformed(evt);
            }
        });
        backGroundPanel.add(excelPrintButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        getContentPane().add(backGroundPanel, java.awt.BorderLayout.NORTH);

        basePanel.setBackground(new java.awt.Color(137, 87, 55));
        basePanel.setPreferredSize(new java.awt.Dimension(850, 600));
        basePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b4.setText("Coffee 4");
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b4.setPreferredSize(new java.awt.Dimension(150, 40));
        basePanel.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 100, 100));

        b1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b1.setIcon(new javax.swing.ImageIcon("C:\\Users\\frances claire\\Downloads\\espp.jpg")); // NOI18N
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.setPreferredSize(new java.awt.Dimension(150, 40));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        basePanel.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 100));

        b2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b2.setIcon(new javax.swing.ImageIcon("C:\\Users\\frances claire\\Downloads\\africano.jpg")); // NOI18N
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.setPreferredSize(new java.awt.Dimension(150, 40));
        basePanel.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 100, 100));

        b3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b3.setIcon(new javax.swing.ImageIcon("C:\\Users\\frances claire\\Downloads\\javachips.png")); // NOI18N
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b3.setPreferredSize(new java.awt.Dimension(150, 40));
        basePanel.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 100, 100));

        b8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b8.setText("Coffee 8");
        b8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b8.setPreferredSize(new java.awt.Dimension(150, 40));
        basePanel.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 100, 100));

        b7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b7.setText("Coffee 7");
        b7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b7.setPreferredSize(new java.awt.Dimension(150, 40));
        basePanel.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 100, 100));

        b6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b6.setIcon(new javax.swing.ImageIcon("C:\\Users\\frances claire\\Downloads\\Matcha.jpg")); // NOI18N
        b6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b6.setPreferredSize(new java.awt.Dimension(150, 40));
        basePanel.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 100, 100));

        b5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b5.setIcon(new javax.swing.ImageIcon("C:\\Users\\frances claire\\Downloads\\spanish.jpg")); // NOI18N
        b5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b5.setPreferredSize(new java.awt.Dimension(150, 40));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        basePanel.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 100));

        b12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b12.setText("Coffee 12");
        b12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b12.setPreferredSize(new java.awt.Dimension(150, 40));
        basePanel.add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 100, 100));

        b11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b11.setText("Coffee 11");
        b11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b11.setPreferredSize(new java.awt.Dimension(150, 40));
        basePanel.add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 100, 100));

        b10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b10.setText("Coffee 10");
        b10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b10.setPreferredSize(new java.awt.Dimension(150, 40));
        basePanel.add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 100, 100));

        b9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b9.setText("Coffee 9");
        b9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b9.setPreferredSize(new java.awt.Dimension(150, 40));
        basePanel.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 100, 100));

        label_name4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        label_name4.setForeground(new java.awt.Color(255, 255, 255));
        label_name4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name4.setText("Mocha");
        label_name4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(label_name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 150, 30));

        label_name1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        label_name1.setForeground(new java.awt.Color(255, 255, 255));
        label_name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name1.setText("Espresso");
        label_name1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(label_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, 30));

        label_name2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        label_name2.setForeground(new java.awt.Color(255, 255, 255));
        label_name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name2.setText("Africano");
        label_name2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(label_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 150, 30));

        label_name3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        label_name3.setForeground(new java.awt.Color(255, 255, 255));
        label_name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name3.setText("Cappuccino");
        label_name3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(label_name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 150, 30));

        label_name5.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        label_name5.setForeground(new java.awt.Color(255, 255, 255));
        label_name5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name5.setText("Spanish Latte");
        label_name5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(label_name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 150, 30));

        label_name6.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        label_name6.setForeground(new java.awt.Color(255, 255, 255));
        label_name6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name6.setText("Matcha Latte");
        label_name6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(label_name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 150, 30));

        label_name7.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        label_name7.setForeground(new java.awt.Color(255, 255, 255));
        label_name7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name7.setText("Breve");
        label_name7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(label_name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 150, 30));

        label_name8.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        label_name8.setForeground(new java.awt.Color(255, 255, 255));
        label_name8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name8.setText("Ristretto");
        label_name8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(label_name8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 150, 30));

        label_name9.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        label_name9.setForeground(new java.awt.Color(255, 255, 255));
        label_name9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name9.setText("Espresso Romano");
        label_name9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(label_name9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 150, 30));

        label_name10.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        label_name10.setForeground(new java.awt.Color(255, 255, 255));
        label_name10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name10.setText("Red-Eye Coffee");
        label_name10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(label_name10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 150, 30));

        label_name11.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        label_name11.setForeground(new java.awt.Color(255, 255, 255));
        label_name11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name11.setText("Nitro Cold Brew");
        label_name11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(label_name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 150, 30));

        label_name12.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        label_name12.setForeground(new java.awt.Color(255, 255, 255));
        label_name12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name12.setText("Americano");
        label_name12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(label_name12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, 150, 30));

        price_label6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label6.setForeground(new java.awt.Color(255, 255, 255));
        price_label6.setText("₱100");
        price_label6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(price_label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 50, 30));

        price_label5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label5.setForeground(new java.awt.Color(255, 255, 255));
        price_label5.setText("₱100");
        price_label5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(price_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 50, 30));

        price_label7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label7.setForeground(new java.awt.Color(255, 255, 255));
        price_label7.setText("₱100");
        price_label7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(price_label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 50, 30));

        price_label8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label8.setForeground(new java.awt.Color(255, 255, 255));
        price_label8.setText("₱100");
        price_label8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(price_label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 50, 30));

        price_label4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label4.setForeground(new java.awt.Color(255, 255, 255));
        price_label4.setText("₱100");
        price_label4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(price_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 50, 30));

        price_label3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label3.setForeground(new java.awt.Color(255, 255, 255));
        price_label3.setText("₱100");
        price_label3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(price_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 50, 30));

        price_label2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label2.setForeground(new java.awt.Color(255, 255, 255));
        price_label2.setText("₱100");
        price_label2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(price_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 50, 30));

        price_label1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label1.setForeground(new java.awt.Color(255, 255, 255));
        price_label1.setText("₱100");
        price_label1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(price_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 50, 30));

        price_label9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label9.setForeground(new java.awt.Color(255, 255, 255));
        price_label9.setText("₱100");
        price_label9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(price_label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 50, 30));

        price_label10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label10.setForeground(new java.awt.Color(255, 255, 255));
        price_label10.setText("₱100");
        price_label10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(price_label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 50, 30));

        price_label11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label11.setForeground(new java.awt.Color(255, 255, 255));
        price_label11.setText("₱100");
        price_label11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(price_label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 50, 30));

        price_label12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_label12.setForeground(new java.awt.Color(255, 255, 255));
        price_label12.setText("₱100");
        price_label12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        basePanel.add(price_label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 560, 50, 30));

        q1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        basePanel.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 80, 20));

        label1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Quantity");
        basePanel.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 80, 30));

        copy.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        copy.setForeground(new java.awt.Color(243, 233, 220));
        copy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copy.setText("StarBarracks");
        basePanel.add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 620, 80));

        q2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        basePanel.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 80, 20));

        label2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Quantity");
        basePanel.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 80, 30));

        q3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        basePanel.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 80, 20));

        label3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Quantity");
        basePanel.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 80, 30));

        q4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        basePanel.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 80, 20));

        label4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Quantity");
        basePanel.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 80, 30));

        q5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        basePanel.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 80, 20));

        label5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Quantity");
        basePanel.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 80, 30));

        q6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        basePanel.add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 80, 20));

        label6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Quantity");
        basePanel.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 80, 30));

        label7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Quantity");
        basePanel.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 80, 30));

        q7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        basePanel.add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 80, 20));

        label8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Quantity");
        basePanel.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 80, 30));

        q8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        basePanel.add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 80, 20));

        label9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("Quantity");
        basePanel.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 80, 30));

        q9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        basePanel.add(q9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 80, 20));

        label10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setText("Quantity");
        basePanel.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 80, 30));

        q10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        basePanel.add(q10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 80, 20));

        label11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label11.setForeground(new java.awt.Color(255, 255, 255));
        label11.setText("Quantity");
        basePanel.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 80, 30));

        q11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        basePanel.add(q11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 80, 20));

        label12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setText("Quantity");
        basePanel.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 80, 30));

        q12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        basePanel.add(q12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 80, 20));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setForeground(copy.getForeground());
        jLabel3.setText("Menu");
        basePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 50));

        summary_button.setBackground(new java.awt.Color(243, 233, 220));
        summary_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        summary_button.setForeground(new java.awt.Color(94, 48, 35));
        summary_button.setText("Show Order Summary");
        summary_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        summary_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summary_buttonActionPerformed(evt);
            }
        });
        basePanel.add(summary_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 240, 40));

        leftPanel.setBackground(new java.awt.Color(137, 87, 55));
        leftPanel.setPreferredSize(new java.awt.Dimension(400, 600));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablePanel.setPreferredSize(new java.awt.Dimension(400, 360));
        tablePanel.setLayout(new java.awt.BorderLayout());

        titlePanel.setBackground(new java.awt.Color(102, 51, 0));
        titlePanel.setPreferredSize(new java.awt.Dimension(50, 50));
        titlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Summary");
        titlePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        tablePanel.add(titlePanel, java.awt.BorderLayout.PAGE_START);

        table.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Amount"
            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table.setRowHeight(27);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(1).setPreferredWidth(100);
            table.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        tablePanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        leftPanel.add(tablePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        jButton2.setBackground(new java.awt.Color(243, 233, 220));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(94, 48, 35));
        jButton2.setText("Clear");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        leftPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 150, 30));

        printButton.setBackground(new java.awt.Color(243, 233, 220));
        printButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printButton.setForeground(new java.awt.Color(94, 48, 35));
        printButton.setText("Print");
        printButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printButton.setPreferredSize(new java.awt.Dimension(150, 40));
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        leftPanel.add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, -1, -1));

        payButton.setBackground(new java.awt.Color(243, 233, 220));
        payButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        payButton.setForeground(new java.awt.Color(94, 48, 35));
        payButton.setText("Pay");
        payButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payButton.setPreferredSize(new java.awt.Dimension(150, 40));
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });
        leftPanel.add(payButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, -1));

        totalValue.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        totalValue.setForeground(new java.awt.Color(255, 255, 255));
        totalValue.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        leftPanel.add(totalValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 300, 40));

        blcnLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        blcnLabel.setForeground(new java.awt.Color(255, 255, 255));
        blcnLabel.setText("Balance:");
        leftPanel.add(blcnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 110, 40));

        totalLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalLabel2.setForeground(new java.awt.Color(243, 233, 220));
        totalLabel2.setText("Total:");
        leftPanel.add(totalLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 70, 40));

        cashValue.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        cashValue.setForeground(new java.awt.Color(255, 255, 255));
        cashValue.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        leftPanel.add(cashValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 300, 40));

        cashLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cashLabel1.setForeground(new java.awt.Color(255, 255, 255));
        cashLabel1.setText("Cash:");
        leftPanel.add(cashLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 70, 40));

        balanceLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        balanceLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        leftPanel.add(balanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 270, 40));

        basePanel.add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, 680));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 233, 220));
        jLabel4.setText("NON COFFEE ");
        basePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(243, 233, 220));
        jLabel5.setText("COFFEE BASED");
        basePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        getContentPane().add(basePanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1366, 769));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        model.setRowCount(0);
        totalValue.setText("");
        cashValue.setText("");
        balanceLabel.setText("");
        Methods.Total.getTotalAmount(model, totalValue);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
      Methods.Payments.caculatePayment(model, cash, totalValue, balanceLabel, cashValue, cashDouble, totalDouble, IP_ADDRESS, SEND_TO);
    }//GEN-LAST:event_payButtonActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed

        Methods.Table.RemoveItem(table, model, totalValue, cashValue, balanceLabel, totalAmount);

    }//GEN-LAST:event_removeActionPerformed

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            tablePop.show(table, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tableMousePressed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        Methods.PreviousCoffee.History(previousTable, previousTotalSales);
        onGlass();
        JOptionPane.showMessageDialog(null, historyPanel, "Previous Order", JOptionPane.PLAIN_MESSAGE);
        offGlass();
    }//GEN-LAST:event_historyButtonActionPerformed

    private void excelPrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelPrintButtonActionPerformed
        Methods.Excel.ExcelPrint();
    }//GEN-LAST:event_excelPrintButtonActionPerformed

    private void pdfPrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfPrintButtonActionPerformed
        Methods.PDF.PrintPDF(previousTable);
    }//GEN-LAST:event_pdfPrintButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        Methods.Total.getTotalAmount(model, totalValue);
        JLabel[] nameLabels = {name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12};
        JLabel[] qLabels = {qq1, qq2, qq3, qq4, qq5, qq6, qq7, qq8, qq9, qq10, qq11, qq12};
        JLabel[] aLabels = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12};
        onGlass();
        JOptionPane.showMessageDialog(null, recieptPanel, "", JOptionPane.PLAIN_MESSAGE);
        offGlass();

        Methods.Reciept.showReceiptPanel(recieptPanel, model, nameLabels, qLabels, aLabels);
        pAmount.setText("Total Amount: ₱" + totalValue.getText());
        pCash.setText("Cash: " + cashValue.getText());
        pBalance.setText("Balance: " + balanceLabel.getText());
        pAmount.repaint();
        pAmount.revalidate();

        pCash.repaint();
        pCash.revalidate();

        pBalance.repaint();
        pBalance.revalidate();

    }//GEN-LAST:event_printButtonActionPerformed


    private void summary_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summary_buttonActionPerformed

        model.setRowCount(0);
        showSummaryFunction();
        Methods.Total.getTotalAmount(model, totalValue);

        JLabel[] nameLabels = {name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12};
        JLabel[] qLabels = {qq1, qq2, qq3, qq4, qq5, qq6, qq7, qq8, qq9, qq10, qq11, qq12};
        JLabel[] aLabels = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12};

        Methods.Reciept.showReceiptPanel(recieptPanel, model, nameLabels, qLabels, aLabels);
        pAmount.setText("Total Amount: ₱" + totalValue.getText());
        pCash.setText("Cash: " + cashValue.getText());
        pBalance.setText("Balance: " + balanceLabel.getText());
        pAmount.repaint();
        pAmount.revalidate();

        pCash.repaint();
        pCash.revalidate();

        pBalance.repaint();
        pBalance.revalidate();


    }//GEN-LAST:event_summary_buttonActionPerformed

    private void deleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrderActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Are you sure want to delete all", "Warning", JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            try (PreparedStatement pst = conn.prepareStatement("truncate table PreviousCoffeeTable")) {
                previousTotalSales.setText("");
                int affect = pst.executeUpdate();
                if (affect > 0) {

                    model.setRowCount(0);

                }
            } catch (Exception e) {
                System.err.println(e);
            }

        }

    }//GEN-LAST:event_deleteOrderActionPerformed

    private void excelPrintButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelPrintButton2ActionPerformed
        new home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_excelPrintButton2ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus


    }//GEN-LAST:event_formWindowGainedFocus

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new mainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a10;
    private javax.swing.JLabel a11;
    private javax.swing.JLabel a12;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel a9;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JPanel backGroundPanel;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel blcnLabel;
    private javax.swing.JLabel cashLabel1;
    private javax.swing.JLabel cashValue;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteOrder;
    private javax.swing.JMenuItem edit_image1;
    private javax.swing.JMenuItem edit_image10;
    private javax.swing.JMenuItem edit_image11;
    private javax.swing.JMenuItem edit_image12;
    private javax.swing.JMenuItem edit_image2;
    private javax.swing.JMenuItem edit_image3;
    private javax.swing.JMenuItem edit_image4;
    private javax.swing.JMenuItem edit_image5;
    private javax.swing.JMenuItem edit_image6;
    private javax.swing.JMenuItem edit_image7;
    private javax.swing.JMenuItem edit_image8;
    private javax.swing.JMenuItem edit_image9;
    private javax.swing.JMenuItem edit_price1;
    private javax.swing.JMenuItem edit_price10;
    private javax.swing.JMenuItem edit_price11;
    private javax.swing.JMenuItem edit_price12;
    private javax.swing.JMenuItem edit_price2;
    private javax.swing.JMenuItem edit_price3;
    private javax.swing.JMenuItem edit_price4;
    private javax.swing.JMenuItem edit_price5;
    private javax.swing.JMenuItem edit_price6;
    private javax.swing.JMenuItem edit_price7;
    private javax.swing.JMenuItem edit_price8;
    private javax.swing.JMenuItem edit_price9;
    private javax.swing.JLabel empty;
    private javax.swing.JButton excelPrintButton;
    private javax.swing.JButton excelPrintButton2;
    private javax.swing.JButton historyButton;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JLabel itemLabel1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel label_name1;
    private javax.swing.JLabel label_name10;
    private javax.swing.JLabel label_name11;
    private javax.swing.JLabel label_name12;
    private javax.swing.JLabel label_name2;
    private javax.swing.JLabel label_name3;
    private javax.swing.JLabel label_name4;
    private javax.swing.JLabel label_name5;
    private javax.swing.JLabel label_name6;
    private javax.swing.JLabel label_name7;
    private javax.swing.JLabel label_name8;
    private javax.swing.JLabel label_name9;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name10;
    private javax.swing.JLabel name11;
    private javax.swing.JLabel name12;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JLabel name8;
    private javax.swing.JLabel name9;
    private javax.swing.JLabel pAmount;
    private javax.swing.JLabel pBalance;
    private javax.swing.JLabel pCash;
    private javax.swing.JButton payButton;
    private javax.swing.JButton pdfPrintButton;
    private javax.swing.JPopupMenu pop1;
    private javax.swing.JPopupMenu pop10;
    private javax.swing.JPopupMenu pop11;
    private javax.swing.JPopupMenu pop12;
    private javax.swing.JPopupMenu pop2;
    private javax.swing.JPopupMenu pop3;
    private javax.swing.JPopupMenu pop4;
    private javax.swing.JPopupMenu pop5;
    private javax.swing.JPopupMenu pop6;
    private javax.swing.JPopupMenu pop7;
    private javax.swing.JPopupMenu pop8;
    private javax.swing.JPopupMenu pop9;
    private javax.swing.JTable previousTable;
    private javax.swing.JLabel previousTotalSales;
    private javax.swing.JLabel price_label1;
    private javax.swing.JLabel price_label10;
    private javax.swing.JLabel price_label11;
    private javax.swing.JLabel price_label12;
    private javax.swing.JLabel price_label2;
    private javax.swing.JLabel price_label3;
    private javax.swing.JLabel price_label4;
    private javax.swing.JLabel price_label5;
    private javax.swing.JLabel price_label6;
    private javax.swing.JLabel price_label7;
    private javax.swing.JLabel price_label8;
    private javax.swing.JLabel price_label9;
    private javax.swing.JButton printButton;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q10;
    private javax.swing.JTextField q11;
    private javax.swing.JTextField q12;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField q6;
    private javax.swing.JTextField q7;
    private javax.swing.JTextField q8;
    private javax.swing.JTextField q9;
    private javax.swing.JLabel qq1;
    private javax.swing.JLabel qq10;
    private javax.swing.JLabel qq11;
    private javax.swing.JLabel qq12;
    private javax.swing.JLabel qq2;
    private javax.swing.JLabel qq3;
    private javax.swing.JLabel qq4;
    private javax.swing.JLabel qq5;
    private javax.swing.JLabel qq6;
    private javax.swing.JLabel qq7;
    private javax.swing.JLabel qq8;
    private javax.swing.JLabel qq9;
    private javax.swing.JLabel quatityLabel1;
    private javax.swing.JPanel recieptPanel;
    private javax.swing.JMenuItem remove;
    private javax.swing.JMenuItem rename1;
    private javax.swing.JMenuItem rename10;
    private javax.swing.JMenuItem rename11;
    private javax.swing.JMenuItem rename12;
    private javax.swing.JMenuItem rename2;
    private javax.swing.JMenuItem rename3;
    private javax.swing.JMenuItem rename4;
    private javax.swing.JMenuItem rename5;
    private javax.swing.JMenuItem rename6;
    private javax.swing.JMenuItem rename7;
    private javax.swing.JMenuItem rename8;
    private javax.swing.JMenuItem rename9;
    private javax.swing.JSeparator sep1;
    private javax.swing.JSeparator sep2;
    private javax.swing.JSeparator sep3;
    private javax.swing.JButton summary_button;
    private javax.swing.JTable table;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JPopupMenu tablePop;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel totalLabel2;
    private javax.swing.JLabel totalValue;
    // End of variables declaration//GEN-END:variables

    void showSummaryFunction() {

        model.setRowCount(0);

        if (!this.q1.getText().trim().isEmpty()) {
            String item1 = this.label_name1.getText();
            String price1 = this.price_label1.getText().replace("₱", "");
            String quantity1 = this.q1.getText();
            int total1 = Integer.parseInt(quantity1) * Integer.parseInt(price1);
            model.addRow(new Object[]{item1, quantity1, total1});
        }
        if (!this.q2.getText().trim().isEmpty()) {
            String item2 = this.label_name2.getText();
            String price2 = this.price_label2.getText().replace("₱", "");
            String quantity2 = this.q2.getText();
            int total2 = Integer.parseInt(quantity2) * Integer.parseInt(price2);
            model.addRow(new Object[]{item2, quantity2, total2});
        }
        if (!this.q3.getText().trim().isEmpty()) {
            String item3 = this.label_name3.getText();
            String price3 = this.price_label3.getText().replace("₱", "");
            String quantity3 = this.q3.getText();
            int total3 = Integer.parseInt(quantity3) * Integer.parseInt(price3);
            model.addRow(new Object[]{item3, quantity3, total3});
        }
        if (!this.q4.getText().trim().isEmpty()) {
            String item4 = this.label_name4.getText();
            String price4 = this.price_label4.getText().replace("₱", "");
            String quantity4 = this.q4.getText();
            int total4 = Integer.parseInt(quantity4) * Integer.parseInt(price4);
            model.addRow(new Object[]{item4, quantity4, total4});
        }
        if (!this.q5.getText().trim().isEmpty()) {
            String item5 = this.label_name5.getText();
            String price5 = this.price_label5.getText().replace("₱", "");
            String quantity5 = this.q5.getText();
            int total5 = Integer.parseInt(quantity5) * Integer.parseInt(price5);
            model.addRow(new Object[]{item5, quantity5, total5});
        }
        if (!this.q6.getText().trim().isEmpty()) {
            String item6 = this.label_name6.getText();
            String price6 = this.price_label6.getText().replace("₱", "");
            String quantity6 = this.q6.getText();
            int total6 = Integer.parseInt(quantity6) * Integer.parseInt(price6);
            model.addRow(new Object[]{item6, quantity6, total6});
        }
        if (!this.q7.getText().trim().isEmpty()) {
            String item7 = this.label_name7.getText();
            String price7 = this.price_label7.getText().replace("₱", "");
            String quantity7 = this.q7.getText();
            int total7 = Integer.parseInt(quantity7) * Integer.parseInt(price7);
            model.addRow(new Object[]{item7, quantity7, total7});
        }
        if (!this.q8.getText().trim().isEmpty()) {
            String item8 = this.label_name8.getText();
            String price8 = this.price_label8.getText().replace("₱", "");
            String quantity8 = this.q8.getText();
            int total8 = Integer.parseInt(quantity8) * Integer.parseInt(price8);
            model.addRow(new Object[]{item8, quantity8, total8});
        }
        if (!this.q9.getText().trim().isEmpty()) {
            String item9 = this.label_name9.getText();
            String price9 = this.price_label9.getText().replace("₱", "");
            String quantity9 = this.q9.getText();
            int total9 = Integer.parseInt(quantity9) * Integer.parseInt(price9);
            model.addRow(new Object[]{item9, quantity9, total9});
        }
        if (!this.q10.getText().trim().isEmpty()) {
            String item10 = this.label_name10.getText();
            String price10 = this.price_label10.getText().replace("₱", "");
            String quantity10 = this.q10.getText();
            int total10 = Integer.parseInt(quantity10) * Integer.parseInt(price10);
            model.addRow(new Object[]{item10, quantity10, total10});
        }
        if (!this.q11.getText().trim().isEmpty()) {
            String item11 = this.label_name11.getText();
            String price11 = this.price_label11.getText().replace("₱", "");
            String quantity11 = this.q11.getText();
            int total11 = Integer.parseInt(quantity11) * Integer.parseInt(price11);
            model.addRow(new Object[]{item11, quantity11, total11});
        }
        if (!this.q12.getText().trim().isEmpty()) {
            String item12 = this.label_name12.getText();
            String price12 = this.price_label12.getText().replace("₱", "");
            String quantity12 = this.q12.getText();
            int total12 = Integer.parseInt(quantity12) * Integer.parseInt(price12);
            model.addRow(new Object[]{item12, quantity12, total12});
        }
    }

    public void onGlass() {
        rootPane.getGlassPane().setVisible(true);
    }

    public void offGlass() {
        rootPane.getGlassPane().setVisible(false);
    }

    void setupComponent() {
        Methods.GlassPane.setTheGlassPane(rootPane);
        Methods.Table.DesignTable(table);

        Methods.PopMenu.JPopMenuShow_Function(pop1, b1);
        Methods.PopMenu.JPopMenuShow_Function(pop2, b2);
        Methods.PopMenu.JPopMenuShow_Function(pop3, b3);
        Methods.PopMenu.JPopMenuShow_Function(pop4, b4);
        Methods.PopMenu.JPopMenuShow_Function(pop5, b5);
        Methods.PopMenu.JPopMenuShow_Function(pop6, b6);
        Methods.PopMenu.JPopMenuShow_Function(pop7, b7);
        Methods.PopMenu.JPopMenuShow_Function(pop8, b8);
        Methods.PopMenu.JPopMenuShow_Function(pop9, b9);
        Methods.PopMenu.JPopMenuShow_Function(pop10, b10);
        Methods.PopMenu.JPopMenuShow_Function(pop11, b11);
        Methods.PopMenu.JPopMenuShow_Function(pop12, b12);

        Methods.MenuItem.JMenuItem_Rename_Function(rename1, label_name1);
        Methods.MenuItem.JMenuItem_Rename_Function(rename2, label_name2);
        Methods.MenuItem.JMenuItem_Rename_Function(rename3, label_name3);
        Methods.MenuItem.JMenuItem_Rename_Function(rename4, label_name4);
        Methods.MenuItem.JMenuItem_Rename_Function(rename5, label_name5);
        Methods.MenuItem.JMenuItem_Rename_Function(rename6, label_name6);
        Methods.MenuItem.JMenuItem_Rename_Function(rename7, label_name7);
        Methods.MenuItem.JMenuItem_Rename_Function(rename8, label_name8);
        Methods.MenuItem.JMenuItem_Rename_Function(rename9, label_name9);
        Methods.MenuItem.JMenuItem_Rename_Function(rename10, label_name10);
        Methods.MenuItem.JMenuItem_Rename_Function(rename11, label_name11);
        Methods.MenuItem.JMenuItem_Rename_Function(rename12, label_name12);

        Methods.MenuItem.JMenuItem_EditPrice_Function(edit_price1, price_label1);
        Methods.MenuItem.JMenuItem_EditPrice_Function(edit_price2, price_label2);
        Methods.MenuItem.JMenuItem_EditPrice_Function(edit_price3, price_label3);
        Methods.MenuItem.JMenuItem_EditPrice_Function(edit_price4, price_label4);
        Methods.MenuItem.JMenuItem_EditPrice_Function(edit_price5, price_label5);
        Methods.MenuItem.JMenuItem_EditPrice_Function(edit_price6, price_label6);
        Methods.MenuItem.JMenuItem_EditPrice_Function(edit_price7, price_label7);
        Methods.MenuItem.JMenuItem_EditPrice_Function(edit_price8, price_label8);
        Methods.MenuItem.JMenuItem_EditPrice_Function(edit_price9, price_label9);
        Methods.MenuItem.JMenuItem_EditPrice_Function(edit_price10, price_label10);
        Methods.MenuItem.JMenuItem_EditPrice_Function(edit_price11, price_label11);
        Methods.MenuItem.JMenuItem_EditPrice_Function(edit_price12, price_label12);

        Methods.Image.chooseImage(edit_image1, b1);
        Methods.Image.chooseImage(edit_image2, b2);
        Methods.Image.chooseImage(edit_image3, b3);
        Methods.Image.chooseImage(edit_image4, b4);
        Methods.Image.chooseImage(edit_image5, b5);
        Methods.Image.chooseImage(edit_image6, b6);
        Methods.Image.chooseImage(edit_image7, b7);
        Methods.Image.chooseImage(edit_image8, b8);
        Methods.Image.chooseImage(edit_image9, b9);
        Methods.Image.chooseImage(edit_image10, b10);
        Methods.Image.chooseImage(edit_image11, b11);
        Methods.Image.chooseImage(edit_image12, b12);

        Methods.Character.noCharacterQuantity(q1);
        Methods.Character.noCharacterQuantity(q2);
        Methods.Character.noCharacterQuantity(q3);
        Methods.Character.noCharacterQuantity(q4);
        Methods.Character.noCharacterQuantity(q5);
        Methods.Character.noCharacterQuantity(q6);
        Methods.Character.noCharacterQuantity(q7);
        Methods.Character.noCharacterQuantity(q8);
        Methods.Character.noCharacterQuantity(q9);
        Methods.Character.noCharacterQuantity(q10);
        Methods.Character.noCharacterQuantity(q11);
        Methods.Character.noCharacterQuantity(q12);

    }

}
