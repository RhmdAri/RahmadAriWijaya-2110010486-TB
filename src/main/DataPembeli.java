package main;

import db.Koneksi;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rhmd_Ari
 */
public class DataPembeli extends javax.swing.JDialog {

    private Connection conn;
    
    private String IdPembeli;
    private String NamaPembeli;
    private String NoPembeli;
    private String EmailPembeli;

    public String getIdPembeli() {
        return IdPembeli;
    }

    public String getNamaPembeli() {
        return NamaPembeli;
    }

    public String getNoPembeli() {
        return NoPembeli;
    }

    public String getEmailPembeli() {
        return EmailPembeli;
    }
    
    public DataPembeli(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        conn = Koneksi.getConnection(); 
        setTabelModel();
        loadData();
        actionButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Data Pembeli ");

        tblData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblData.setGridColor(new java.awt.Color(204, 204, 204));
        tblData.setRowHeight(40);
        tblData.setShowGrid(true);
        jScrollPane1.setViewportView(tblData);

        txtSearch.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(204, 204, 204));

        jButton10.setText("First Page");

        jButton11.setText("<");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton12.setText(">");

        jButton13.setText("Last Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                            .addComponent(txtSearch)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12)
                    .addComponent(jButton13))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DataPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataPembeli dialog = new DataPembeli(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void actionButton(){
        txtSearch.addKeyListener(new KeyAdapter(){
        @Override
        public void keyReleased(KeyEvent e){
            searchData();
        }
    });
        
        tblData.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                pilihData();
            }
        });
 }
    
    private void loadData() {
        getData((DefaultTableModel) tblData.getModel());
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("ID Pembeli");
        model.addColumn("Nama Pembeli");
        model.addColumn("No Telepon");
        model.addColumn("Email");
    }
    
    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM pembeli";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                
                while (rs.next()){
                    String id           = rs.getString("id_pembeli");
                    String Nama         = rs.getString("nama_pembeli");
                    String NoTelp       = rs.getString("no_telp");
                    String Email        = rs.getString("email");
                
                    Object [] rowData = {id,Nama, NoTelp, Email};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
           Logger.getLogger(MenuPembeli.class.getName()).log(Level.SEVERE, null, e);
        }
    }   
    
    private void searchData() {
        // Mengambil kata kunci pencarian dari komponen teks
        String kataKunci = txtSearch.getText();

        // Mendapatkan model tabel default
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        // Mengatur jumlah baris model tabel menjadi 0 untuk menghapus data sebelumnya
        model.setRowCount(0);

        try {
            // Query SQL untuk mencari data pembeli berdasarkan ID atau nama pembeli
            String sql = "SELECT * FROM pembeli WHERE id_pembeli LIKE ? OR nama_pembeli LIKE ?";
        
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                // Mengatur parameter pada statement SQL untuk kata kunci pencarian
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");

                // Mengeksekusi query SQL dan mendapatkan hasil
                ResultSet rs = st.executeQuery();

                // Memproses hasil query dan menambahkannya ke dalam model tabel
                while (rs.next()) {
                    String id = rs.getString("id_pembeli");
                    String Nama = rs.getString("nama_pembeli");
                    String NoTelp = rs.getString("no_telp");
                    String Email = rs.getString("email");

                    // Membuat array objek berisi data pembeli
                    Object[] rowData = {id, Nama, NoTelp, Email};
                    // Menambahkan data pembeli ke dalam model tabel
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            // Menangani kesalahan SQL dengan mencatatnya ke log
            Logger.getLogger(MenuPembeli.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void pilihData(){
        int row = tblData.getSelectedRow();
        
        IdPembeli       = tblData.getValueAt(row, 0).toString();
        NamaPembeli     = tblData.getValueAt(row, 1).toString();
        NoPembeli       = tblData.getValueAt(row, 2).toString();
        EmailPembeli    = tblData.getValueAt(row, 3).toString();
        
        dispose();
    }
    
}