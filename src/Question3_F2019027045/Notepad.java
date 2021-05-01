package Question3_F2019027045;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.undo.UndoManager;

public class Notepad extends javax.swing.JFrame {

    String filename;
    public Notepad() {
        initComponents();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_Notepad = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        new_option = new javax.swing.JMenuItem();
        open_option = new javax.swing.JMenuItem();
        save_option = new javax.swing.JMenuItem();
        Separator_files = new javax.swing.JPopupMenu.Separator();
        Print_option = new javax.swing.JMenuItem();
        Exit_option = new javax.swing.JMenuItem();
        Edit_Menu = new javax.swing.JMenu();
        cut_option = new javax.swing.JMenuItem();
        copy_option = new javax.swing.JMenuItem();
        paste_option = new javax.swing.JMenuItem();
        find_option1 = new javax.swing.JMenuItem();
        selectall_option = new javax.swing.JMenuItem();
        Format = new javax.swing.JMenu();
        Word_Wrap = new javax.swing.JMenuItem();
        Font = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Zoom = new javax.swing.JMenuItem();
        StatusBar = new javax.swing.JMenuItem();
        Help_view = new javax.swing.JMenu();
        helpviewitem = new javax.swing.JMenuItem();
        features = new javax.swing.JMenuItem();
        Separator_help = new javax.swing.JPopupMenu.Separator();
        about_option = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea_Notepad.setColumns(20);
        TextArea_Notepad.setRows(5);
        jScrollPane1.setViewportView(TextArea_Notepad);

        jCheckBox1.setText("jCheckBox1");

        FileMenu.setText("File");

        new_option.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        new_option.setText("New");
        new_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_optionActionPerformed(evt);
            }
        });
        FileMenu.add(new_option);

        open_option.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        open_option.setText("Open");
        open_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_optionActionPerformed(evt);
            }
        });
        FileMenu.add(open_option);

        save_option.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        save_option.setText("Save");
        save_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_optionActionPerformed(evt);
            }
        });
        FileMenu.add(save_option);
        FileMenu.add(Separator_files);

        Print_option.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Print_option.setText("Print");
        Print_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_optionActionPerformed(evt);
            }
        });
        FileMenu.add(Print_option);

        Exit_option.setText("Exit");
        Exit_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_optionActionPerformed(evt);
            }
        });
        FileMenu.add(Exit_option);

        jMenuBar1.add(FileMenu);

        Edit_Menu.setText("Edit");
        Edit_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_MenuActionPerformed(evt);
            }
        });

        cut_option.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cut_option.setText("Cut");
        cut_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cut_optionActionPerformed(evt);
            }
        });
        Edit_Menu.add(cut_option);

        copy_option.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copy_option.setText("Copy");
        copy_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copy_optionActionPerformed(evt);
            }
        });
        Edit_Menu.add(copy_option);

        paste_option.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        paste_option.setText("Paste");
        paste_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paste_optionActionPerformed(evt);
            }
        });
        Edit_Menu.add(paste_option);

        find_option1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        find_option1.setText("Find");
        Edit_Menu.add(find_option1);

        selectall_option.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        selectall_option.setText("Select All");
        selectall_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectall_optionActionPerformed(evt);
            }
        });
        Edit_Menu.add(selectall_option);

        jMenuBar1.add(Edit_Menu);

        Format.setText("Format");

        Word_Wrap.setText("Word Wrap");
        Word_Wrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Word_WrapActionPerformed(evt);
            }
        });
        Format.add(Word_Wrap);

        Font.setText("Font");
        Font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontActionPerformed(evt);
            }
        });
        Format.add(Font);

        jMenuBar1.add(Format);

        jMenu1.setText("View");

        Zoom.setText("Zoom");
        Zoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomActionPerformed(evt);
            }
        });
        jMenu1.add(Zoom);

        StatusBar.setText("Status Bar");
        jMenu1.add(StatusBar);

        jMenuBar1.add(jMenu1);

        Help_view.setText("Help");
        Help_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Help_viewActionPerformed(evt);
            }
        });

        helpviewitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        helpviewitem.setText("Help View");
        Help_view.add(helpviewitem);

        features.setText("Features");
        features.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                featuresActionPerformed(evt);
            }
        });
        Help_view.add(features);
        Help_view.add(Separator_help);

        about_option.setText("About");
        about_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_optionActionPerformed(evt);
            }
        });
        Help_view.add(about_option);

        jMenuBar1.add(Help_view);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void new_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_optionActionPerformed
        // TODO add your handling code here:
        TextArea_Notepad.setText("");
        setTitle(filename);
    }//GEN-LAST:event_new_optionActionPerformed

    private void open_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_optionActionPerformed
        // TODO add your handling code here:
        FileDialog fd = new FileDialog(Notepad.this, "Select File", FileDialog.LOAD);
        fd.setVisible(true);

        if (fd.getFile() != null) {
            filename = fd.getDirectory() + fd.getFile();
            setTitle(filename);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuffer stringBuffer = new StringBuffer();
            String line = null;
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line + "\n");
                TextArea_Notepad.setText(stringBuffer.toString());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File is not found");
        }

        // jTextArea1.requestFocus();
    }//GEN-LAST:event_open_optionActionPerformed

    private void Exit_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_optionActionPerformed
        // TODO add your handling code here:
        System.exit(0);


    }//GEN-LAST:event_Exit_optionActionPerformed

    private void save_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_optionActionPerformed
        // TODO add your handling code here:
        FileDialog fileDialog = new FileDialog(Notepad.this, "Save File ", FileDialog.SAVE);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
            try {
                FileWriter output = new FileWriter(filename);
                output.write(TextArea_Notepad.getText());
                output.close();
                setTitle(filename);

            } catch (Exception e) {
                System.out.println("File is not Found");
            }
        }
        TextArea_Notepad.requestFocus();
    }//GEN-LAST:event_save_optionActionPerformed

    private void Help_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Help_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Help_viewActionPerformed

    private void about_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_optionActionPerformed
        // TODO add your handling code here:
    
      JOptionPane.showMessageDialog(null, "Miscrosoft Windows\n"
              + "@Miccrosoft Corporation. All rights reserved\n"
              + "The Windows 10 Pro operating System and its user interface are protected\n"
              + "by trademark and other pending or existing intellectual property rights in\n"
              + "the United States and other countries/regions.\n\n\n"
              + "The product is licenced under the Miccrosoft Corporation.Iicense\n"
              + "Terms to:\n"
              + "Arslan Shabbir");
    }//GEN-LAST:event_about_optionActionPerformed

    private void featuresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_featuresActionPerformed
      

    }//GEN-LAST:event_featuresActionPerformed

    private void FontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_FontActionPerformed

    private void Edit_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Edit_MenuActionPerformed

    private void selectall_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectall_optionActionPerformed
        // TODO add your handling code here:

        TextArea_Notepad.selectAll();
    }//GEN-LAST:event_selectall_optionActionPerformed

    private void paste_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paste_optionActionPerformed
        // TODO add your handling code here:
        TextArea_Notepad.paste();
    }//GEN-LAST:event_paste_optionActionPerformed

    private void copy_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copy_optionActionPerformed
        // TODO add your handling code here:
        TextArea_Notepad.copy();
    }//GEN-LAST:event_copy_optionActionPerformed

    private void cut_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cut_optionActionPerformed
        // TODO add your handling code here:
        TextArea_Notepad.cut();
    }//GEN-LAST:event_cut_optionActionPerformed

    private void Print_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_optionActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_Print_optionActionPerformed

    private void Word_WrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Word_WrapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Word_WrapActionPerformed

    private void ZoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZoomActionPerformed

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
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Edit_Menu;
    private javax.swing.JMenuItem Exit_option;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem Font;
    private javax.swing.JMenu Format;
    private javax.swing.JMenu Help_view;
    private javax.swing.JMenuItem Print_option;
    private javax.swing.JPopupMenu.Separator Separator_files;
    private javax.swing.JPopupMenu.Separator Separator_help;
    private javax.swing.JMenuItem StatusBar;
    private javax.swing.JTextArea TextArea_Notepad;
    private javax.swing.JMenuItem Word_Wrap;
    private javax.swing.JMenuItem Zoom;
    private javax.swing.JMenuItem about_option;
    public javax.swing.JMenuItem copy_option;
    private javax.swing.JMenuItem cut_option;
    private javax.swing.JMenuItem features;
    private javax.swing.JMenuItem find_option1;
    private javax.swing.JMenuItem helpviewitem;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem new_option;
    private javax.swing.JMenuItem open_option;
    private javax.swing.JMenuItem paste_option;
    private javax.swing.JMenuItem save_option;
    private javax.swing.JMenuItem selectall_option;
    // End of variables declaration//GEN-END:variables
}
