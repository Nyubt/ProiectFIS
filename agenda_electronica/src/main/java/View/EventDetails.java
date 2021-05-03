/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Agenda;
import Model.Eveniment;
import static View.CalendarFiller.sortListByDate;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;

/**
 *
 * @author Nadia
 */
public class EventDetails extends javax.swing.JFrame  {
    CalendarMain parentFrame;
    
    /**
     * Creates new form EventDetails
     */
    public EventDetails() {
        initComponents();
    }

    public EventDetails(CalendarMain parent, String info) throws ParseException{
        initComponents();
        this.parentFrame = parent;
        Integer id = getIdFromString(info);
        Eveniment evt = getEvenimentFromInfo(id);
        jTitluTextField.setText(evt.getTitlu());
        jDescriereTextArea.setText(evt.getDescriere());
        jInceputTextField.setText(evt.getInceput().toString());
        jSfarsitTextField.setText(evt.getSfarsit().toString());
        jColorTextField.setText(getColorNameFromHex(evt.getCuloare()));
        jRecurentaComboBox.setSelectedItem(evt.getAlarma().getFactorRecurenta() + " min");
        jIntervalTimpTextField.setText(evt.getAlarma().getIntervalTimp() + " min");
        parentFrame.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDescriereTextArea = new javax.swing.JTextArea();
        jTitluTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jInceputTextField = new javax.swing.JTextField();
        jSfarsitTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jColorTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRecurentaComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jIntervalTimpTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Titlu");

        jLabel2.setBackground(new java.awt.Color(255, 255, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Descriere");

        jDescriereTextArea.setColumns(20);
        jDescriereTextArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jDescriereTextArea.setRows(5);
        jDescriereTextArea.setName("JTextAreaDescriere"); // NOI18N
        jScrollPane1.setViewportView(jDescriereTextArea);
        jDescriereTextArea.getAccessibleContext().setAccessibleName("jDescriereTextArea");

        jTitluTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTitluTextField.setText(" ");
        jTitluTextField.setMaximumSize(new java.awt.Dimension(20, 20));
        jTitluTextField.setName("JTextFiledTitle"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Inceput");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Sfarsit");
        jLabel4.setToolTipText("");

        jInceputTextField.setEditable(false);
        jInceputTextField.setName("jTextFiledIncepe"); // NOI18N

        jSfarsitTextField.setEditable(false);
        jSfarsitTextField.setText("  ");
        jSfarsitTextField.setName("jTextFiledFinal"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Culoare");

        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText(" ");

        jColorTextField.setEditable(false);
        jColorTextField.setText(" ");
        jColorTextField.setName("jTextFiledIntervalTimp"); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurenta.png"))); // NOI18N

        jRecurentaComboBox.setForeground(new java.awt.Color(0, 102, 102));
        jRecurentaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5 min", "10 min", "15 min", "30 min", "60 min" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("DETALII EVENIMENT");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Recurenta");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("IntervalTimp");

        jIntervalTimpTextField.setEditable(false);
        jIntervalTimpTextField.setText(" ");
        jIntervalTimpTextField.setName("jTextFiledIntervalTimp"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSfarsitTextField)
                            .addComponent(jTitluTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jInceputTextField)
                            .addComponent(jColorTextField)
                            .addComponent(jRecurentaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIntervalTimpTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel8)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTitluTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInceputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jSfarsitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRecurentaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jIntervalTimpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTitluTextField.getAccessibleContext().setAccessibleName("jTitluTextField");
        jInceputTextField.getAccessibleContext().setAccessibleName("jInceputTextField");
        jInceputTextField.getAccessibleContext().setAccessibleDescription("");
        jSfarsitTextField.getAccessibleContext().setAccessibleName("jSfarsitTextField");
        jColorTextField.getAccessibleContext().setAccessibleName("jColorTextField");
        jRecurentaComboBox.getAccessibleContext().setAccessibleName("jRecurentaComboBox");
        jIntervalTimpTextField.getAccessibleContext().setAccessibleName("jIntervalTimpTextField");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        parentFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private static Eveniment getEvenimentFromInfo(Integer id) throws ParseException{        
        List<Eveniment> evenimente = Agenda.SelectareEvente(new Date(), "ALL").getEventList();  
        if(id == null){
            return null;
        }
        for(Eveniment evt : evenimente){   
            if (id == evt.getEvenimentId()){
                return evt;
            }
        }
        return null;
    }
    
    private static Integer getIdFromString(String info){
        String regex = "Id: ([0-9]+) ";
        Pattern pattern = Pattern.compile(regex);        
        Matcher matcher = pattern.matcher(info);
        while (matcher.find()){
            return Integer.valueOf(matcher.group(1));
        }
        return null;
    }
    
    private static String getColorNameFromHex(String hexColor){
        if(hexColor.compareTo("#C0C0C0") == 0){
            return "Silver";
        }
        if(hexColor.compareTo("#00FF00") == 0){
            return "Green";
        }
        if(hexColor.compareTo("#808000") == 0){
            return "Olive";
        }
        if(hexColor.compareTo("#008000") == 0){
            return "Japanese Laurel";
        }
        if(hexColor.compareTo("#232323") == 0){
            return "Mine Shaft";
        }
        if(hexColor.compareTo("#FF0000") == 0){
            return "Red";
        }
        
        return "No Color";
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
            java.util.logging.Logger.getLogger(EventDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jColorTextField;
    private javax.swing.JTextArea jDescriereTextArea;
    private javax.swing.JTextField jInceputTextField;
    private javax.swing.JTextField jIntervalTimpTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jRecurentaComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSfarsitTextField;
    private javax.swing.JTextField jTitluTextField;
    // End of variables declaration//GEN-END:variables
}
