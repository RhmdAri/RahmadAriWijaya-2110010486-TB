/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import db.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Rhmd_Ari
 */
public class LaporanPeminjaman extends javax.swing.JPanel {

    private final Connection conn;
    
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private Date tanggalMulai;
    private Date tanggalAkhir;
    private String statusPeminjaman = "Sudah di Bayar";
    
    public LaporanPeminjaman() {
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

        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTampilkan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        txtTanggalMulai = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTanggalAkhir = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setTextRefernce(txtTanggalMulai);

        dateChooser2.setDateFormat("yyyy-MM-dd");
        dateChooser2.setTextRefernce(txtTanggalAkhir);

        setPreferredSize(new java.awt.Dimension(1000, 600));
        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setPreferredSize(new java.awt.Dimension(1000, 600));
        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));
        panelView.setPreferredSize(new java.awt.Dimension(1000, 600));

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

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("DATA LAPORAN TRANSAKSI");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("DETAIL > Laporan");

        btnTampilkan.setBackground(new java.awt.Color(255, 255, 254));
        btnTampilkan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTampilkan.setForeground(new java.awt.Color(51, 153, 255));
        btnTampilkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        btnTampilkan.setText("TAMPILKAN");

        btnBatal.setBackground(new java.awt.Color(255, 255, 254));
        btnBatal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(51, 153, 255));
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close.png"))); // NOI18N
        btnBatal.setText("BATAL");

        txtSearch.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(204, 204, 204));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setText("Tanggal Mulai");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel13.setText("Tanggal Sampai");

        btnPrint.setBackground(new java.awt.Color(255, 255, 254));
        btnPrint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(0, 204, 102));
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        btnPrint.setText("PRINT");

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelViewLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addGroup(panelViewLayout.createSequentialGroup()
                            .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(txtTanggalMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addGap(28, 28, 28)
                            .addComponent(btnTampilkan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBatal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPrint)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTanggalMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTampilkan)
                        .addComponent(btnBatal)
                        .addComponent(btnPrint)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelMain.add(panelView, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnTampilkan;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTanggalAkhir;
    private javax.swing.JTextField txtTanggalMulai;
    // End of variables declaration//GEN-END:variables

   private void actionButton(){
       btnTampilkan.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               loadData();
           }
       });
       
           btnBatal.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                showPanel();
                loadData();
           }
       });
           
           btnPrint.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               cetakLaporan();
           }
       });
       
           txtSearch.addKeyListener(new KeyAdapter() {
           @Override
           public void keyReleased(KeyEvent e) {
               searchData();
           }
       });
   }
     
    
    private void loadData() {
        getData((DefaultTableModel) tblData.getModel());
    }
    
    private void showPanel(){
        panelMain.removeAll();
        panelMain.add(new LaporanPeminjaman());
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void resetForm() {

    }

    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("No Transaksi");
        model.addColumn("ID Pembeli");
        model.addColumn("Nama Pembeli");
        model.addColumn("Nama Wisata");
        model.addColumn("Pembelian");
        model.addColumn("Keberangkatan");
        model.addColumn("Jumlah");
        model.addColumn("Status");
    }

    private void getData(DefaultTableModel model) {
      model.setRowCount(0);

      String tanggalMulai = txtTanggalMulai.getText();
      String tanggalAkhir = txtTanggalAkhir.getText();

      try {
          this.tanggalMulai = dateFormat.parse(tanggalMulai);
          this.tanggalAkhir = dateFormat.parse(tanggalAkhir);

          String sql = "SELECT tr.id_transaksi, pb.id_pembeli, pb.nama_pembeli, ws.nama_wisata, tr.tanggal_beli, tr.tanggal_berangkat, dtr.jumlah, dtr.status " +
                          "FROM transaksi AS tr " +
                          "JOIN pembeli pb ON pb.id_pembeli = tr.id_pembeli " +
                          "JOIN detail_transaksi dtr ON dtr.id_transaksi = tr.id_transaksi " +
                          "JOIN wisata ws ON ws.id_wisata = dtr.id_wisata " +
                          "WHERE (tr.tanggal_beli BETWEEN ? AND ?) AND (dtr.status = 'Sudah Bayar') " +
                          "GROUP BY tr.id_transaksi " +
                          "ORDER BY tr.id_transaksi ASC";

          try (PreparedStatement st = conn.prepareStatement(sql)) {
              st.setDate(1, new java.sql.Date(this.tanggalMulai.getTime()));
              st.setDate(2, new java.sql.Date(this.tanggalAkhir.getTime()));
              ResultSet rs = st.executeQuery();

              while (rs.next()) {
                  String idTransaksi = rs.getString("id_transaksi");
                  String idPembeli = rs.getString("id_pembeli");
                  String namaPembeli = rs.getString("nama_pembeli");
                  String idWisata = rs.getString("nama_wisata");
                  String tglBeli = rs.getString("tanggal_beli");
                  String tglBerangkat = rs.getString("tanggal_berangkat");
                  String jumlah = rs.getString("jumlah");
                  String status = rs.getString("status");

                  Object[] rowData = {idTransaksi, idPembeli, namaPembeli, idWisata, tglBeli, tglBerangkat, jumlah, status};
                  model.addRow(rowData);
              }
          }
      } catch (SQLException | ParseException e) {
          Logger.getLogger(LaporanPeminjaman.class.getName()).log(Level.SEVERE, null, e);
      }
  }


    //Metode ini digunakan untuk melakukan pencarian data pembeli berdasarkan kata kunci.
    private void searchData() {
        // Mengambil kata kunci pencarian dari komponen teks
        String kataKunci = txtSearch.getText();

        // Mendapatkan model tabel default
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        // Mengatur jumlah baris model tabel menjadi 0 untuk menghapus data sebelumnya
        model.setRowCount(0);

            try {
                // Query SQL untuk mencari data pembeli berdasarkan ID atau nama pembeli
                String sql = "SELECT tr.id_transaksi, pb.id_pembeli, pb.nama_pembeli, ws.nama_wisata, tr.tanggal_beli, tr.tanggal_berangkat, dtr.jumlah, dtr.status " +
                  "FROM transaksi AS tr " +
                  "JOIN pembeli pb ON pb.id_pembeli = tr.id_pembeli " +
                  "JOIN detail_transaksi dtr ON dtr.id_transaksi = tr.id_transaksi " +
                  "JOIN wisata ws ON ws.id_wisata = dtr.id_wisata " +
                  "WHERE (tr.id_transaksi LIKE ? OR pb.nama_pembeli LIKE ? OR ws.nama_wisata LIKE ?) " +
                  "AND (tr.tanggal_beli BETWEEN ? AND ?) AND (dtr.status = 'Sudah Bayar') " +
                  "GROUP BY tr.id_transaksi " +
                  "ORDER BY tr.id_transaksi ASC";

        
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                // Mengatur parameter pada statement SQL untuk kata kunci pencarian
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                st.setString(3, "%" + kataKunci + "%");
                st.setDate(4, new java.sql.Date(this.tanggalMulai.getTime()));
                st.setDate(5, new java.sql.Date(this.tanggalAkhir.getTime()));

                // Mengeksekusi query SQL dan mendapatkan hasil
                ResultSet rs = st.executeQuery();

                // Memproses hasil query dan menambahkannya ke dalam model tabel
                while (rs.next()) {
                    String idTransaksi = rs.getString("id_transaksi");
                    String idPembeli = rs.getString("id_pembeli");
                    String namaPembeli = rs.getString("nama_pembeli");
                    String idWisata = rs.getString("nama_wisata");
                    String tglBeli = rs.getString("tanggal_beli");
                    String tglBerangkat = rs.getString("tanggal_berangkat");
                    String jumlah = rs.getString("jumlah");
                    String status = rs.getString("status");

                    Object[] rowData = {idTransaksi, idPembeli, namaPembeli, idWisata, tglBeli, tglBerangkat, jumlah, status};
                    model.addRow(rowData);
              }
            }
        } catch (SQLException e) {
            // Menangani kesalahan SQL dengan mencatatnya ke log
            Logger.getLogger(LaporanPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void cetakLaporan(){
        String tanggalMulai = txtTanggalMulai.getText();
        String tanggalAkhir = txtTanggalAkhir.getText();
        
        try {
            String reportPath = "src/report/LaporanTransaksi.jasper";
            
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("tanggalMulai", tanggalMulai);
            parameters.put("tanggalAkhir", tanggalAkhir);
            
            JasperPrint print =JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperViewer viewer = new JasperViewer(print,false);
            viewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            viewer.setVisible(true);
        } catch (Exception e) {
            Logger.getLogger(LaporanPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
