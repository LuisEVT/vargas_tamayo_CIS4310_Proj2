/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/*******************************************************************************
***CLASS NAME: GUI
***CLASS AUTHOR: LUIS E VARGAS TAMAYO
********************************************************************************
***PURPOSE OF CLASS: GRAPHICAL USER INTERFACE FOR USER
********************************************************************************
***DATE: 17 OCTOBER, 2018
********************************************************************************
***LIST OF CHANGES WITH DATES: NONE
********************************************************************************
***SPECIAL NOTES: NONE
*** 
***
*******************************************************************************/
public class GUI extends javax.swing.JFrame {

    Generic_Algorithm GA;
    
    /***************************************************************************
    ***METHOD NAME: GUI()
    ***METHOD AUTHOR: LUIS E VARGAS TAMAYO
    ****************************************************************************
    ***PURPOSE OF THE METHOD: CONSTRUCTOR
    ***METHOD USED: initComponents()
    ***METHOD PARAMETERS: NONE
    ***RETURN VALUE: NONE
    ****************************************************************************
    ***DATE: 17 OCTOBER, 2018
    ***************************************************************************/    
    public GUI() 
    {
        initComponents();
    }
    
    /***************************************************************************
    ***METHOD NAME: setGeneticAlgorithm()
    ***METHOD AUTHOR: LUIS E VARGAS TAMAYO
    ****************************************************************************
    ***PURPOSE OF THE METHOD: SET THE GENETIC ALGORITH
    ***METHOD USED: NONE
    ***METHOD PARAMETERS: Generic_Algorithm
    ***RETURN VALUE: NONE
    ****************************************************************************
    ***DATE: 17 OCTOBER, 2018
    ***************************************************************************/    
    public void setGeneticAlgorithm(Generic_Algorithm GA)
    {
        this.GA = GA;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        instructionPanel = new javax.swing.JPanel();
        lblInstructionTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        AlgorithmPanel = new javax.swing.JPanel();
        lblAlgorithTitle = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResults = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setResizeWeight(0.3);

        instructionPanel.setBackground(new java.awt.Color(204, 255, 204));
        instructionPanel.setMinimumSize(new java.awt.Dimension(200, 300));
        instructionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInstructionTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInstructionTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructionTitle.setText("Instructions");
        lblInstructionTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        instructionPanel.add(lblInstructionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 50));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Hello! This is a \ngenetic algorithm\nthat will try to \nfind the smallest \ndistance to travel \nbetween ten cities.\n\nOn the right, select\nthe city you would \nlike to start in.\nThen, click \"Search\"\n\nResults will be\nposted below.\n\nNote:\n\nResults will take about\nfive seconds to post.\n");
        jScrollPane1.setViewportView(jTextArea1);

        instructionPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 400));

        jSplitPane1.setLeftComponent(instructionPanel);

        AlgorithmPanel.setBackground(new java.awt.Color(0, 153, 153));
        AlgorithmPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        lblAlgorithTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAlgorithTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlgorithTitle.setText("Genetic Algorithm");
        lblAlgorithTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cmbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Killeen", "Dallas", "Houston", "El Paso", "Sherman", "Taylor", "Tyler", "Dime Box", "Big Foot", "Frio Town" }));
        cmbCity.setAlignmentY(0.0F);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Select City...");

        txtResults.setEditable(false);
        txtResults.setColumns(20);
        txtResults.setRows(5);
        jScrollPane2.setViewportView(txtResults);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Results will be posted here");

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AlgorithmPanelLayout = new javax.swing.GroupLayout(AlgorithmPanel);
        AlgorithmPanel.setLayout(AlgorithmPanelLayout);
        AlgorithmPanelLayout.setHorizontalGroup(
            AlgorithmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAlgorithTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AlgorithmPanelLayout.createSequentialGroup()
                .addGroup(AlgorithmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlgorithmPanelLayout.createSequentialGroup()
                        .addGroup(AlgorithmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AlgorithmPanelLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AlgorithmPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AlgorithmPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AlgorithmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                            .addGroup(AlgorithmPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmbCity, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        AlgorithmPanelLayout.setVerticalGroup(
            AlgorithmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlgorithmPanelLayout.createSequentialGroup()
                .addComponent(lblAlgorithTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(0, 83, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(AlgorithmPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    /***************************************************************************
    ***METHOD NAME: btnSearchActionPerformed()
    ***METHOD AUTHOR: LUIS E VARGAS TAMAYO
    ****************************************************************************
    ***PURPOSE OF THE METHOD: PERFORM OPERATIONS WHEN BUTTON IS PRESSED
    ***METHOD USED: NONE
    ***METHOD PARAMETERS: ACTION EVENT
    ***RETURN VALUE: NONE
    ****************************************************************************
    ***DATE: 17 OCTOBER, 2018
    ***************************************************************************/
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //GET SELECTED INDEX FROM COMBO BOX
        int city = this.cmbCity.getSelectedIndex();
        //SET THE CITY SELECTED
        this.GA.setFirstCity(city);
        //MAKE OPERATIONS
        this.GA.Calculate();
        //SHOW RESULTS
        this.txtResults.setText(this.GA.getResults());
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

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
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AlgorithmPanel;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbCity;
    private javax.swing.JPanel instructionPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAlgorithTitle;
    private javax.swing.JLabel lblInstructionTitle;
    private javax.swing.JTextArea txtResults;
    // End of variables declaration//GEN-END:variables
}
