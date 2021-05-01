package Question2_F2019027045;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class GetData_FromDB extends javax.swing.JFrame {

    /**
     * Creates new form GetData
     */
    public GetData_FromDB() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        city_id = new javax.swing.JLabel();
        city_name = new javax.swing.JLabel();
        city_id_Combobox = new javax.swing.JComboBox<>();
        cityName_Combobox = new javax.swing.JComboBox<>();
        getid = new javax.swing.JButton();
        getname = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        city_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        city_id.setText("City_ID:");

        city_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        city_name.setText("City_Name:");

        getid.setBackground(new java.awt.Color(0, 204, 255));
        getid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getid.setText("Get ID");
        getid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getidActionPerformed(evt);
            }
        });

        getname.setBackground(new java.awt.Color(0, 204, 255));
        getname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getname.setText("Get Name");
        getname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(city_name)
                    .addComponent(city_id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(city_id_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityName_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(getname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city_id_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getid)
                    .addComponent(city_id))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityName_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getname)
                    .addComponent(city_name))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getidActionPerformed
        // TODO add your handling code here:
         
         try {
            Connection conn;
            String dbURL = "jdbc:postgresql://127.0.0.1:5432/new_db";
            String userName = "postgres";
            String password = "arslan123";
            conn = DriverManager.getConnection(dbURL, userName, password);
            String query = "select * from arslan.\"Cities\" ";
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
               String value = rs.getString("city_id");
               city_id_Combobox.addItem(value);

            }
            rs.close();
            stmt.close();
            conn.close();

        } 
           catch (SQLException e) {
            e.printStackTrace();
             
        }
        
    }//GEN-LAST:event_getidActionPerformed

    private void getnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getnameActionPerformed
        // TODO add your handling code here:
        
        try {
            Connection conn;
            String dbURL = "jdbc:postgresql://127.0.0.1:5432/new_db";
            String userName = "postgres";
            String password = "arslan123";
            conn = DriverManager.getConnection(dbURL, userName, password);
            String query = "select * from arslan.\"Cities\" ";
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
               String value1 = rs.getString("city_name");
               cityName_Combobox.addItem(value1);  //add city names to the list

            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
             
        }
        
        
    }//GEN-LAST:event_getnameActionPerformed

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
            java.util.logging.Logger.getLogger(GetData_FromDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetData_FromDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetData_FromDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetData_FromDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetData_FromDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cityName_Combobox;
    private javax.swing.JLabel city_id;
    private javax.swing.JComboBox<String> city_id_Combobox;
    private javax.swing.JLabel city_name;
    private javax.swing.JButton getid;
    private javax.swing.JButton getname;
    // End of variables declaration//GEN-END:variables
}
