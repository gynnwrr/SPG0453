//youtube link: https://www.youtube.com/watch?v=Y9Iam4fZ0O4&ab_channel=PaulOamen

package calcaida;

import java.awt.Image;
import java.awt.Toolkit;



public class Calculator extends javax.swing.JFrame {
    
    double NumEnter1,NumEnter2,Result;
    String Op;
    
    
    
    public Calculator() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\CalcAida\\src\\calcaida\\haaarryy.jpg");
        this.setIconImage(icon);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResult = new javax.swing.JTextField();
        jbtnBS = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jtbnMultiply = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnPoint = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalcAidaaa");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(164, 73, 164));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 70));

        jbtnBS.setBackground(new java.awt.Color(239, 231, 214));
        jbtnBS.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnBS.setText("DEL");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 70));

        jbtnC.setBackground(new java.awt.Color(239, 231, 214));
        jbtnC.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnC.setText("AC");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, 70));

        jbtnPlus.setBackground(new java.awt.Color(228, 201, 228));
        jbtnPlus.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 80, 150));

        jbtnDigit7.setBackground(new java.awt.Color(228, 201, 228));
        jbtnDigit7.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 70));

        jbtnDigit8.setBackground(new java.awt.Color(228, 201, 228));
        jbtnDigit8.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 80, 70));

        jbtnDigit9.setBackground(new java.awt.Color(228, 201, 228));
        jbtnDigit9.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 80, 70));

        jbtnMinus.setBackground(new java.awt.Color(228, 201, 228));
        jbtnMinus.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnMinus.setText("-");
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 80, 70));

        jbtnDigit4.setBackground(new java.awt.Color(228, 201, 228));
        jbtnDigit4.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 70));

        jbtnDigit5.setBackground(new java.awt.Color(228, 201, 228));
        jbtnDigit5.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 80, 70));

        jbtnDigit6.setBackground(new java.awt.Color(228, 201, 228));
        jbtnDigit6.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 80, 70));

        jtbnMultiply.setBackground(new java.awt.Color(228, 201, 228));
        jtbnMultiply.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jtbnMultiply.setText("x");
        jtbnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnMultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 80, 70));

        jbtnDigit1.setBackground(new java.awt.Color(228, 201, 228));
        jbtnDigit1.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 70));

        jbtnDigit2.setBackground(new java.awt.Color(228, 201, 228));
        jbtnDigit2.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 80, 70));

        jbtnDigit3.setBackground(new java.awt.Color(228, 201, 228));
        jbtnDigit3.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 80, 70));

        jbtnDivide.setBackground(new java.awt.Color(228, 201, 228));
        jbtnDivide.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnDivide.setText("÷");
        jbtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivideActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 80, 70));

        jbtnDigit0.setBackground(new java.awt.Color(228, 201, 228));
        jbtnDigit0.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 80, 70));

        jbtnPoint.setBackground(new java.awt.Color(228, 201, 228));
        jbtnPoint.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnPoint.setText(".");
        jbtnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPointActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 80, 70));

        jbtnEqual.setBackground(new java.awt.Color(228, 201, 228));
        jbtnEqual.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jbtnEqual.setText("=");
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 80, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterNumbers(String q)
    {
       String Nums = jtxtResult.getText() + q;
       jtxtResult.setText(Nums);
    }
    
    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtResultActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
        EnterNumbers("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
        EnterNumbers("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
        EnterNumbers("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
        EnterNumbers("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
        EnterNumbers("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
        EnterNumbers("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
        EnterNumbers("1");
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
        EnterNumbers("2");
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
        EnterNumbers("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
        EnterNumbers("0");
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivideActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        Op = "÷";
    }//GEN-LAST:event_jbtnDivideActionPerformed

    private void jtbnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnMultiplyActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        Op = "x";
    }//GEN-LAST:event_jtbnMultiplyActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        Op = "-";
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        Op = "+";
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        jtxtResult.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
        String backSp = null;

        if (jtxtResult.getText().length() > 0)
        {
            StringBuilder sb = new StringBuilder(jtxtResult.getText());
            sb.deleteCharAt(jtxtResult.getText().length() - 1);
            backSp = sb.toString();
            jtxtResult.setText(backSp);
        }
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPointActionPerformed
        if (! jtxtResult.getText().contains("."))
        {
            jtxtResult.setText(jtxtResult.getText() + jbtnPoint.getText());
        }
    }//GEN-LAST:event_jbtnPointActionPerformed

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
        NumEnter2 = Double.parseDouble(jtxtResult.getText());
        if (Op == "+")
        {
            Result = NumEnter1 + NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        
        else if (Op == "-")
        {
            Result = NumEnter1 - NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        
        else if (Op == "x")
        {
            Result = NumEnter1 * NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        
        else if (Op == "÷")
        {
            Result = NumEnter1 / NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        
        // Check if result is an integer
        if (Result == (int) Result) {
             jtxtResult.setText(String.valueOf((int) Result));  // Display as integer
        }
        
        else {
        jtxtResult.setText(String.valueOf(Result));  // Display as double
        }
    }//GEN-LAST:event_jbtnEqualActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnPoint;
    private javax.swing.JButton jtbnMultiply;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables


}
