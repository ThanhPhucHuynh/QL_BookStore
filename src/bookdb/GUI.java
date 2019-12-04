/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookdb;

import java.awt.Color;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Thanh Phuc Huynh
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    int Total = 0;
    int index, price;
    String getID = null;
    String getID_tb2 = null, getName_tb2 = null;
    connector cn = new connector();
    String[] id_sell = new String[0];
    public String name;
    //cac bien tam
    // ham xay dung khoi dau duoc goi tu login
    //voi name la mssv
    public GUI(String name) {
        this.name = name;
        initComponents();
        jPanel_vip.setVisible(false);
        total_lable.setText(" " + Total);
        id_sell_list.setVisible(false);
        setResizable(false);
        btn_readersClick(false);
        table_listBook.setVisible(false);
        search.setVisible(false);
        hello.setText("Wellcome " + name);
        btn_sellClick(false);
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        DefaultTableModel model1 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tb3.getModel();
        book[] books = cn.dvsv();
        readers[] Readers = cn.getReaders();
        //   TimeUnit.SECONDS.sleep(1);
        System.out.println("lenght: " + books.length);
        //book[]  = cn.dvsv();
        int i = 0;

        while (i != (books.length)) {
            model.addRow(new Object[]{books[i].getID(), books[i].getName(), books[i].getAuthor(), books[i].getCategory(), books[i].getPrice(), books[i].getSL()});
            model1.addRow(new Object[]{books[i].getID(), books[i].getName(), books[i].getPrice()});
            //  model2.addRow(new Object[] {Readers[i].getID(),Readers[i].getName(),Readers[i].getAddress(),Readers[i].getPhone()});
            i++;
        }
        i = 0;
        while (i != (Readers.length)) {
            model2.addRow(new Object[]{Readers[i].getID(), Readers[i].getName(), Readers[i].getAddress(), Readers[i].getPhone()});
            i++;
        }
        cn.checkAdmin("B1706515", "123");
        sort();

    }
    //ham xay dung goi tu lop add book
    public GUI(String name, int u) {
        this.name = name;
        initComponents();
        setResizable(false);
        btn_sellClick(false);
        btn_readersClick(false);
        total_lable.setText(" " + Total);
        id_sell_list.setVisible(false);
        hello.setText("Wellcome " + name);

        btn_sellClick(false);
        //tb1 bang hien thi thong tin sach
        //tb2 bang hien thi thong tin ban
        //tb3 bang hien thi thong tin thanh vien doc
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        DefaultTableModel model1 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tb3.getModel();
        //lay ra danh sach book
        book[] books = cn.dvsv();
        // lay ra ds nguoi doc
        readers[] Readers = cn.getReaders();
        System.out.println("lenght: " + books.length);
        int i = 0;
        //import data vao cac bang tu my sql
        while (i != (books.length)) {
            model.addRow(new Object[]{books[i].getID(), books[i].getName(), books[i].getAuthor(), books[i].getCategory(), books[i].getPrice(), books[i].getSL()});
            model1.addRow(new Object[]{books[i].getID(), books[i].getName(), books[i].getPrice()});
            i++;
        }
        i = 0;
        while (i != (Readers.length)) {
            model2.addRow(new Object[]{Readers[i].getID(), Readers[i].getName(), Readers[i].getAddress(), Readers[i].getPhone()});
            i++;
        }
        //

        sort();//add truong sap xep vao bang tb1

        cn.checkAdmin("B1706515", "123");
        // giao dien ban dau
        btn_BOOK.setBackground(Color.white);
        btn_BOOK.setForeground(Color.BLUE);
        btn_BOOK.setBorder(BorderFactory.createEmptyBorder());
        btn_BOOK.setBorderPainted(false);
        btn_BOOK.setOpaque(true);
        table_listBook.setVisible(true);
        GT.setVisible(false);
        search.setVisible(true);
    }

    //sap xep thep cot
    public void sort() {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        tb1.setRowSorter(sorter);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop = new javax.swing.JPopupMenu();
        grouprad = new javax.swing.ButtonGroup();
        GT = new javax.swing.JLabel();
        btn_readers = new javax.swing.JButton();
        btn_sell = new javax.swing.JButton();
        btn_BOOK = new javax.swing.JButton();
        hello = new javax.swing.JLabel();
        search = new javax.swing.JPanel();
        table_listBook = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        text_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        add_book = new javax.swing.JLabel();
        btn_del = new javax.swing.JButton();
        panelSell = new javax.swing.JPanel();
        rad_menbers = new javax.swing.JRadioButton();
        rad_guest = new javax.swing.JRadioButton();
        panel_menber = new javax.swing.JPanel();
        inputID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        search_book = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sell_list_book = new javax.swing.JList<>();
        table_listBook1 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        btn_add_sell = new javax.swing.JButton();
        btn_del_sell = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sell_gia_list = new javax.swing.JList<>();
        del_all = new javax.swing.JButton();
        total_lable = new javax.swing.JLabel();
        total_lable1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        id_sell_list = new javax.swing.JList<>();
        SELL = new javax.swing.JButton();
        jPanel_vip = new javax.swing.JPanel();
        readers_wellcome = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        discount = new javax.swing.JLabel();
        total_jf = new javax.swing.JLabel();
        total_lable2 = new javax.swing.JLabel();
        readers_pannel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        id_textfield_readers = new javax.swing.JTextField();
        Name_textfield_readers = new javax.swing.JTextField();
        address_textfield_readers = new javax.swing.JTextField();
        Phone_textfield_readers = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        del_readers = new javax.swing.JButton();
        add_reader = new javax.swing.JButton();
        update_reders = new javax.swing.JButton();
        search_readers = new javax.swing.JTextField();
        notification_readres = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        backgound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GT.png"))); // NOI18N
        getContentPane().add(GT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1030, 800));

        btn_readers.setBackground(new java.awt.Color(51, 102, 255));
        btn_readers.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_readers.setForeground(new java.awt.Color(255, 255, 255));
        btn_readers.setText("READERS");
        btn_readers.setBorder(null);
        btn_readers.setBorderPainted(false);
        btn_readers.setContentAreaFilled(false);
        btn_readers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_readers.setDefaultCapable(false);
        btn_readers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_readersMouseClicked(evt);
            }
        });
        getContentPane().add(btn_readers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 220, 60));

        btn_sell.setBackground(new java.awt.Color(51, 102, 255));
        btn_sell.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_sell.setForeground(new java.awt.Color(255, 255, 255));
        btn_sell.setText("SELL");
        btn_sell.setBorder(null);
        btn_sell.setBorderPainted(false);
        btn_sell.setContentAreaFilled(false);
        btn_sell.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_sell.setDefaultCapable(false);
        btn_sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sellMouseClicked(evt);
            }
        });
        getContentPane().add(btn_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 220, 60));

        btn_BOOK.setBackground(new java.awt.Color(51, 102, 255));
        btn_BOOK.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_BOOK.setForeground(new java.awt.Color(255, 255, 255));
        btn_BOOK.setText("BOOK");
        btn_BOOK.setBorder(null);
        btn_BOOK.setBorderPainted(false);
        btn_BOOK.setContentAreaFilled(false);
        btn_BOOK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_BOOK.setDefaultCapable(false);
        btn_BOOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BOOKMouseClicked(evt);
            }
        });
        getContentPane().add(btn_BOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 60));

        hello.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hello.setForeground(new java.awt.Color(255, 255, 255));
        hello.setText("Wellcome");
        hello.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helloMouseClicked(evt);
            }
        });
        getContentPane().add(hello, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 87, 130, 40));

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Book", "Name", "Author", "Category", "Gia", "So Luong"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        table_listBook.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(1).setPreferredWidth(200);
            tb1.getColumnModel().getColumn(5).setResizable(false);
        }

        search.add(table_listBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 770, 420));

        text_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_searchActionPerformed(evt);
            }
        });
        text_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_searchKeyTyped(evt);
            }
        });
        search.add(text_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search (1).png"))); // NOI18N
        search.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 50, 70));

        add_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        add_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_bookMouseClicked(evt);
            }
        });
        search.add(add_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 70));

        btn_del.setText("Del");
        btn_del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_delMouseClicked(evt);
            }
        });
        search.add(btn_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 80, 30));

        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 830, 660));

        panelSell.setBackground(new java.awt.Color(255, 255, 255));
        panelSell.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grouprad.add(rad_menbers);
        rad_menbers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rad_menbers.setText("Menbers");
        rad_menbers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rad_menbersMouseClicked(evt);
            }
        });
        panelSell.add(rad_menbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, 40));

        grouprad.add(rad_guest);
        rad_guest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rad_guest.setText("Guest");
        rad_guest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rad_guestMouseClicked(evt);
            }
        });
        panelSell.add(rad_guest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, 40));

        panel_menber.setBackground(new java.awt.Color(255, 255, 255));
        panel_menber.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputIDKeyTyped(evt);
            }
        });
        panel_menber.add(inputID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 40));

        jLabel2.setText("ID member:");
        panel_menber.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 20));

        panelSell.add(panel_menber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 100));

        search_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_bookActionPerformed(evt);
            }
        });
        search_book.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_bookKeyTyped(evt);
            }
        });
        panelSell.add(search_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 280, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID BOOK: ");
        panelSell.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 140, 20));

        sell_list_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sell_list_bookMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(sell_list_book);

        panelSell.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 270, 170));

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Book", "Name", "Gia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb2MouseClicked(evt);
            }
        });
        table_listBook1.setViewportView(tb2);
        if (tb2.getColumnModel().getColumnCount() > 0) {
            tb2.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        panelSell.add(table_listBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 360, 120));

        btn_add_sell.setText("ADD");
        btn_add_sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add_sellMouseClicked(evt);
            }
        });
        btn_add_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_sellActionPerformed(evt);
            }
        });
        panelSell.add(btn_add_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 70, 30));

        btn_del_sell.setText("Delete");
        btn_del_sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_del_sellMouseClicked(evt);
            }
        });
        panelSell.add(btn_del_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 80, 30));

        jScrollPane1.setViewportView(sell_gia_list);

        panelSell.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 80, 170));

        del_all.setText("Dellete all");
        del_all.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                del_allMouseClicked(evt);
            }
        });
        panelSell.add(del_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, 30));

        total_lable.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        total_lable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelSell.add(total_lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 130, 40));

        total_lable1.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        total_lable1.setText("Price:");
        panelSell.add(total_lable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 60, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        panelSell.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 130, 310));

        jScrollPane3.setViewportView(id_sell_list);

        panelSell.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 50, 170));

        SELL.setText("Sell");
        SELL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SELLMouseClicked(evt);
            }
        });
        panelSell.add(SELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 350, 40));

        jPanel_vip.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_vip.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        readers_wellcome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        readers_wellcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel_vip.add(readers_wellcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/member-card.png"))); // NOI18N
        jPanel_vip.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 150, 130));

        panelSell.add(jPanel_vip, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 180, 200));

        discount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        discount.setText("Discount:                        30%");
        panelSell.add(discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 180, 20));

        total_jf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        total_jf.setText("Total:");
        panelSell.add(total_jf, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 50, -1));

        total_lable2.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        total_lable2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelSell.add(total_lable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 180, 40));

        getContentPane().add(panelSell, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1020, 800));

        readers_pannel.setBackground(new java.awt.Color(255, 255, 255));
        readers_pannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tb3);
        if (tb3.getColumnModel().getColumnCount() > 0) {
            tb3.getColumnModel().getColumn(0).setPreferredWidth(2);
            tb3.getColumnModel().getColumn(1).setPreferredWidth(150);
            tb3.getColumnModel().getColumn(2).setPreferredWidth(4);
            tb3.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        readers_pannel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 510, 270));
        readers_pannel.add(id_textfield_readers, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 210, 30));
        readers_pannel.add(Name_textfield_readers, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 210, 30));

        address_textfield_readers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_textfield_readersActionPerformed(evt);
            }
        });
        readers_pannel.add(address_textfield_readers, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 210, 30));
        readers_pannel.add(Phone_textfield_readers, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 210, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phone   :");
        readers_pannel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 60, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ID          :");
        readers_pannel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 60, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Name    :");
        readers_pannel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 60, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Address :");
        readers_pannel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 60, 30));

        del_readers.setText("Delete");
        del_readers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                del_readersMouseClicked(evt);
            }
        });
        del_readers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_readersActionPerformed(evt);
            }
        });
        readers_pannel.add(del_readers, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        add_reader.setText("New");
        add_reader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_readerMouseClicked(evt);
            }
        });
        readers_pannel.add(add_reader, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 60, -1));

        update_reders.setText("Update");
        update_reders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_redersMouseClicked(evt);
            }
        });
        readers_pannel.add(update_reders, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        search_readers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_readersKeyTyped(evt);
            }
        });
        readers_pannel.add(search_readers, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 200, 30));

        notification_readres.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        notification_readres.setForeground(new java.awt.Color(255, 0, 51));
        notification_readres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readers_pannel.add(notification_readres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 220, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search (1).png"))); // NOI18N
        readers_pannel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 40, 30));

        getContentPane().add(readers_pannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1020, 800));

        backgound.setBackground(new java.awt.Color(255, 255, 255));
        backgound.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        backgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Web 1280 – 1.jpg"))); // NOI18N
        backgound.setAlignmentY(0.0F);
        getContentPane().add(backgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BOOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BOOKMouseClicked
        BookClick(true);
        //  btn_sellClick(false);
    }//GEN-LAST:event_btn_BOOKMouseClicked

    private void helloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helloMouseClicked
        // TODO add your handling code here
        GT.setVisible(true);
        BookClick(false);
        btn_sellClick(false);
        btn_readersClick(false);
    }//GEN-LAST:event_helloMouseClicked

    private void text_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_searchKeyTyped
        String text = text_search.getText().toString();
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tb1.getModel());
        tb1.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(text_search.getText()));


    }//GEN-LAST:event_text_searchKeyTyped

    private void text_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_searchActionPerformed

    private void add_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_bookMouseClicked
        this.setVisible(false);
        new Add_book(this.name).setVisible(true);


    }//GEN-LAST:event_add_bookMouseClicked

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        index = tb1.convertRowIndexToModel(tb1.getSelectedRow());

        getID = model.getValueAt(index, 0).toString();
        System.out.println(getID);
    }//GEN-LAST:event_tb1MouseClicked

    private void btn_delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_delMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        cn.delBook(getID);
        new GUI(name, 1).setVisible(true);
        this.setVisible(false);
        dispose();

    }//GEN-LAST:event_btn_delMouseClicked

    private void btn_sellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sellMouseClicked
        btn_sellClick(true);
    }//GEN-LAST:event_btn_sellMouseClicked

    private void rad_menbersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rad_menbersMouseClicked
        // TODO add your handling code here:
        if (rad_menbers.isSelected()) {
            panel_menber.setVisible(true);
        }

    }//GEN-LAST:event_rad_menbersMouseClicked

    private void rad_guestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rad_guestMouseClicked
        // TODO add your handling code here:
        if (rad_guest.isSelected()) {
            panel_menber.setVisible(false);
            jPanel_vip.setVisible(false);
            discount.setVisible(false);
            total_jf.setVisible(false);
            total_lable2.setVisible(false);
        }
    }//GEN-LAST:event_rad_guestMouseClicked

    private void search_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_bookActionPerformed

    private void tb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tb2.getModel();
        index = tb2.convertRowIndexToModel(tb2.getSelectedRow());

        getID_tb2 = model.getValueAt(index, 0).toString();
        getName_tb2 = model.getValueAt(index, 1).toString();
        price = Integer.parseInt(model.getValueAt(index, 2).toString());
        System.out.println(getID_tb2 + ": " + getName_tb2 + ":" + price);
    }//GEN-LAST:event_tb2MouseClicked

    private void btn_add_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_sellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_add_sellActionPerformed

    private void search_bookKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_bookKeyTyped
        // TODO add your handling code here:
        String text = search_book.getText().toString();
        DefaultTableModel model = (DefaultTableModel) tb2.getModel();
        TableRowSorter<DefaultTableModel> rowSorter;
        rowSorter = new TableRowSorter<DefaultTableModel>(model);
        tb2.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(search_book.getText().toString()));
    }//GEN-LAST:event_search_bookKeyTyped
    DefaultListModel<String> model_list = new DefaultListModel<>();
    DefaultListModel<String> model_list_gia = new DefaultListModel();
    DefaultListModel<String> model_list_id = new DefaultListModel();
    private void btn_add_sellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_sellMouseClicked
        // TODO add your handling code here:
        if (getID_tb2 == null) {
            System.out.println("chua chon");
        } else {
            model_list_gia.addElement(String.valueOf(price));
            model_list.addElement(getName_tb2);
            model_list_id.addElement(getID_tb2);
            sell_list_book.setModel(model_list);
            sell_gia_list.setModel(model_list_gia);
            id_sell_list.setModel(model_list_id);

            Total = Total + price;
            total_lable.setText("" + Total);
            float a = (float) Total * 70 / 100;
            //  a= 5*5;
            total_lable2.setText(a + " VND");
        }


    }//GEN-LAST:event_btn_add_sellMouseClicked

    private void del_allMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_del_allMouseClicked
        // TODO add your handling code here:
        if (Total == 0) {

        } else {
            DefaultListModel model_list1 = (DefaultListModel) sell_list_book.getModel();
            DefaultListModel model_list_gia1 = (DefaultListModel) sell_gia_list.getModel();
            DefaultListModel model_list_id1 = (DefaultListModel) id_sell_list.getModel();
            model_list1.removeAllElements();
            model_list_gia1.removeAllElements();
            model_list_id1.removeAllElements();
            Total = 0;
            total_lable.setText("" + Total);
            float a = (float) Total * 70 / 100;
            //  a= 5*5;
            total_lable2.setText(a + " VND");
        }
    }//GEN-LAST:event_del_allMouseClicked

    private void sell_list_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sell_list_bookMouseClicked
        // TODO add your handling code here:
        int i = sell_list_book.getSelectedIndex();
        System.out.println(i);
        sell_gia_list.setSelectedIndex(i);
        id_sell_list.setSelectedIndex(i);
    }//GEN-LAST:event_sell_list_bookMouseClicked

    private void btn_del_sellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_del_sellMouseClicked
        // TODO add your handling code here:
        if (sell_gia_list.getSelectedValue() == null) {
        } else {
            System.out.println(sell_gia_list.getSelectedValue());
            Total = Total - Integer.parseInt(sell_gia_list.getSelectedValue());
            DefaultListModel model_list1 = (DefaultListModel) sell_list_book.getModel();
            DefaultListModel model_list_gia1 = (DefaultListModel) sell_gia_list.getModel();
            DefaultListModel model_list_id1 = (DefaultListModel) id_sell_list.getModel();

            int index_list = sell_list_book.getSelectedIndex();
            total_lable.setText("" + Total);
            model_list_id1.remove(index_list);
            model_list1.remove(index_list);
            model_list_gia1.remove(index_list);
            float a = (float) Total * 70 / 100;
            //  a= 5*5;
            total_lable2.setText(a + " VND");
        }
    }//GEN-LAST:event_btn_del_sellMouseClicked

    private void SELLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SELLMouseClicked
        // TODO add your handling code here:
        try {
            DefaultListModel model_list_id1 = (DefaultListModel) id_sell_list.getModel();
            for (int i = 0; i < model_list_id1.getSize(); i++) {
                System.out.println(model_list_id1.getElementAt(i));
                String id = model_list_id1.getElementAt(i).toString();
                cn.delBook(id);
            }
            JOptionPane.showMessageDialog(rootPane, "Complete");
            new GUI(this.name).setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro");
        }


    }//GEN-LAST:event_SELLMouseClicked

    private void btn_readersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_readersMouseClicked
        // TODO add your handling code here:
        BookClick(false);
        btn_sellClick(false);
        btn_readersClick(true);
        id_textfield_readers.setText("");

    }//GEN-LAST:event_btn_readersMouseClicked

    private void address_textfield_readersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_textfield_readersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_textfield_readersActionPerformed

    private void del_readersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_readersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_del_readersActionPerformed

    private void tb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb3MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tb3.getModel();
        index = tb3.convertRowIndexToModel(tb3.getSelectedRow());
        getID = model.getValueAt(index, 0).toString();
        System.out.println(getID);
        id_textfield_readers.setText(model.getValueAt(index, 0).toString());
        Name_textfield_readers.setText(model.getValueAt(index, 1).toString());
        address_textfield_readers.setText(model.getValueAt(index, 2).toString());
        Phone_textfield_readers.setText(model.getValueAt(index, 3).toString());
    }//GEN-LAST:event_tb3MouseClicked

    private void search_readersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_readersKeyTyped
        // TODO add your handling code here:
        String text = search_readers.getText().toString();
        DefaultTableModel model = (DefaultTableModel) tb3.getModel();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tb3.getModel());
        tb3.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(search_readers.getText()));


    }//GEN-LAST:event_search_readersKeyTyped

    private void add_readerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_readerMouseClicked
        // TODO add your handling code here:
        String id, name, address, phone;
        id = id_textfield_readers.getText().toString();
        name = Name_textfield_readers.getText().toString();
        address = address_textfield_readers.getText().toString();
        phone = Phone_textfield_readers.getText().toString();
        System.out.println("id = "+(id==""));
        if (id.equals("") ||id == null) {
            notification_readres.setText("Error");
            notification_readres.setForeground(Color.red);
        }else
        {
            if (cn.addReaders(id, name, address, phone) == true) {
                notification_readres.setForeground(Color.GREEN);
                notification_readres.setText("complete");
                refTb3();
            } else {
                notification_readres.setText("Error");
                notification_readres.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_add_readerMouseClicked

    private void update_redersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_redersMouseClicked
        // TODO add your handling code here:
        String id, name, address, phone;
        id = id_textfield_readers.getText().toString();
        name = Name_textfield_readers.getText().toString();
        address = address_textfield_readers.getText().toString();
        phone = Phone_textfield_readers.getText().toString();

        if (id == "" && id == null) {
            notification_readres.setText("Error");
            notification_readres.setForeground(Color.red);
        }
        {
            if (cn.updateReaders(id, name, address, phone) == true) {
                notification_readres.setForeground(Color.GREEN);
                notification_readres.setText("complete");
                refTb3();
            } else {
                notification_readres.setText("Error");
                notification_readres.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_update_redersMouseClicked

    private void del_readersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_del_readersMouseClicked
        // TODO add your handling code here:
        String id, name, address, phone;
        id = id_textfield_readers.getText().toString();
        name = Name_textfield_readers.getText().toString();
        address = address_textfield_readers.getText().toString();
        phone = Phone_textfield_readers.getText().toString();

        if (id == "" && id == null) {
            notification_readres.setText("Error");
            notification_readres.setForeground(Color.red);
        }
        {
            if (cn.delReaders(id) == true) {
                notification_readres.setForeground(Color.GREEN);
                notification_readres.setText("complete");
                refTb3();
            } else {
                notification_readres.setText("Error");
                notification_readres.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_del_readersMouseClicked

    private void inputIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIDKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_inputIDKeyTyped

    private void inputIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIDKeyPressed
        // TODO add your handling code here:
        String id = inputID.getText();
        System.out.println(id);
        String name = cn.getnameReadersexist(id);
        System.out.println(name);
        if (!name.equals("xxx")) {

            readers_wellcome.setText(name);
            jPanel_vip.setVisible(true);
            discount.setVisible(true);
            total_jf.setVisible(true);
            float a = (float) Total * 70 / 100;
            total_lable2.setText(a + " VND");
            total_lable2.setVisible(true);
        } else {
            System.out.println("kh thay");
            jPanel_vip.setVisible(false);

            discount.setVisible(false);
            total_jf.setVisible(false);
            total_lable2.setVisible(false);
        }
    }//GEN-LAST:event_inputIDKeyPressed
    public void refTb3() {
        DefaultTableModel model2 = (DefaultTableModel) tb3.getModel();
        readers[] Readers = cn.getReaders();
        int rows = model2.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model2.removeRow(i);
        }
        int i = 0;
        while (i != (Readers.length)) {
            model2.addRow(new Object[]{Readers[i].getID(), Readers[i].getName(), Readers[i].getAddress(), Readers[i].getPhone()});
            i++;
        }
    }

    public void BookClick(boolean click) {
        if (click == false) {
            btn_BOOK.setBackground(new java.awt.Color(51, 102, 255));
            btn_BOOK.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            btn_BOOK.setForeground(new java.awt.Color(255, 255, 255));
            table_listBook.setVisible(false);
            btn_BOOK.setBorder(null);
            btn_BOOK.setBorderPainted(false);
            btn_BOOK.setContentAreaFilled(false);
            btn_BOOK.setDefaultCapable(false);
            btn_BOOK.setOpaque(false);
            table_listBook.setVisible(false);
            search.setVisible(false);
        } else {
            btn_BOOK.setBackground(Color.white);
            btn_BOOK.setForeground(Color.BLUE);
            btn_BOOK.setBorder(BorderFactory.createEmptyBorder());
            btn_BOOK.setBorderPainted(false);
            btn_BOOK.setOpaque(true);
            GT.setVisible(false);
            search.setVisible(true);
            search.setVisible(true);
            table_listBook.setVisible(true);
            tb1.setVisible(true);
            btn_sellClick(false);
            btn_readersClick(false);
        }
    }

    public void btn_sellClick(boolean click) {
        if (click == false) {
            btn_sell.setBackground(new java.awt.Color(51, 102, 255));
            btn_sell.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            btn_sell.setForeground(new java.awt.Color(255, 255, 255));
            btn_sell.setBorder(null);
            btn_sell.setBorderPainted(false);
            btn_sell.setContentAreaFilled(false);
            btn_sell.setDefaultCapable(false);
            btn_sell.setOpaque(false);
            panelSell.setVisible(false);
        } else {
            jPanel_vip.setVisible(false);
            discount.setVisible(false);
            total_jf.setVisible(false);
            total_lable2.setVisible(false);
            GT.setVisible(false);
            panelSell.setVisible(true);
            btn_sell.setBackground(Color.white);
            btn_sell.setForeground(Color.BLUE);
            btn_sell.setBorder(BorderFactory.createEmptyBorder());
            btn_sell.setBorderPainted(false);
            btn_sell.setOpaque(true);
            rad_guest.setSelected(true);
            panel_menber.setVisible(false);
            BookClick(false);
            btn_readersClick(false);
        }
    }

    public void btn_readersClick(boolean click) {
        if (click == false) {
            btn_readers.setBackground(new java.awt.Color(51, 102, 255));
            btn_readers.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            btn_readers.setForeground(new java.awt.Color(255, 255, 255));
            btn_readers.setBorder(null);
            btn_readers.setBorderPainted(false);
            btn_readers.setContentAreaFilled(false);
            btn_readers.setDefaultCapable(false);
            btn_readers.setOpaque(false);
            readers_pannel.setVisible(false);
        } else {
            GT.setVisible(false);
            search.setVisible(false);
            btn_readers.setBackground(Color.white);
            btn_readers.setForeground(Color.BLUE);
            btn_readers.setBorder(BorderFactory.createEmptyBorder());
            btn_readers.setBorderPainted(false);
            btn_readers.setOpaque(true);
            readers_pannel.setVisible(true);
            id_textfield_readers.setText("");
            BookClick(false);
            btn_sellClick(false);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI("hihi").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GT;
    private javax.swing.JTextField Name_textfield_readers;
    private javax.swing.JTextField Phone_textfield_readers;
    private javax.swing.JButton SELL;
    private javax.swing.JLabel add_book;
    private javax.swing.JButton add_reader;
    private javax.swing.JTextField address_textfield_readers;
    private javax.swing.JLabel backgound;
    private javax.swing.JButton btn_BOOK;
    private javax.swing.JButton btn_add_sell;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_del_sell;
    private javax.swing.JButton btn_readers;
    private javax.swing.JButton btn_sell;
    private javax.swing.JButton del_all;
    private javax.swing.JButton del_readers;
    private javax.swing.JLabel discount;
    private javax.swing.ButtonGroup grouprad;
    private javax.swing.JLabel hello;
    private javax.swing.JList<String> id_sell_list;
    private javax.swing.JTextField id_textfield_readers;
    private javax.swing.JTextField inputID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_vip;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel notification_readres;
    private javax.swing.JPanel panelSell;
    private javax.swing.JPanel panel_menber;
    private javax.swing.JPopupMenu pop;
    private javax.swing.JRadioButton rad_guest;
    private javax.swing.JRadioButton rad_menbers;
    private javax.swing.JPanel readers_pannel;
    private javax.swing.JLabel readers_wellcome;
    private javax.swing.JPanel search;
    private javax.swing.JTextField search_book;
    private javax.swing.JTextField search_readers;
    private javax.swing.JList<String> sell_gia_list;
    private javax.swing.JList<String> sell_list_book;
    private javax.swing.JScrollPane table_listBook;
    private javax.swing.JScrollPane table_listBook1;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTable tb3;
    private javax.swing.JTextField text_search;
    private javax.swing.JLabel total_jf;
    private javax.swing.JLabel total_lable;
    private javax.swing.JLabel total_lable1;
    private javax.swing.JLabel total_lable2;
    private javax.swing.JButton update_reders;
    // End of variables declaration//GEN-END:variables
}
