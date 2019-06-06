/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import funciones.Numeros;

/**
 *
 * @author Thelaw
 */
public class Calculadora extends javax.swing.JFrame {
    
    //Variables Globales
    String valor1;
    String signo;
    String valor2;
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }
    
    public static String calculadora(String valor1,String valor2,String signo){
    Double resultado=0.0;
    String respuesta;
    
    
    if (signo.equals("-")) {
        resultado=Double.parseDouble(valor1)-Double.parseDouble(valor2);
        
    }
    if (signo.equals("+")) {
        resultado=Double.parseDouble(valor1)+Double.parseDouble(valor2);
        
    }
    if (signo.equals("*")) {
        resultado=Double.parseDouble(valor1)*Double.parseDouble(valor2);
        
    }
    if (signo.equals("/")) {
        resultado=Double.parseDouble(valor1)/Double.parseDouble(valor2);
        
    }
    
    respuesta=resultado.toString();
    return respuesta;
}
    
    public static boolean punto(String cadena){
        boolean resultado;
        resultado=false;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i+1).equals(".")) {
                resultado=true;
                break;
            }
        }
        return resultado;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupofunciones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtnumeros = new javax.swing.JTextField();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        rigual = new javax.swing.JRadioButton();
        rsuma = new javax.swing.JRadioButton();
        rresta = new javax.swing.JRadioButton();
        rmultiplicar = new javax.swing.JRadioButton();
        rdividir = new javax.swing.JRadioButton();
        rborrar = new javax.swing.JRadioButton();
        rborrartodo = new javax.swing.JRadioButton();
        rpunto = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtnumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 250, 60));

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        grupofunciones.add(rigual);
        rigual.setText("=");
        rigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rigualActionPerformed(evt);
            }
        });
        jPanel1.add(rigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        grupofunciones.add(rsuma);
        rsuma.setText("+");
        rsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsumaActionPerformed(evt);
            }
        });
        jPanel1.add(rsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        grupofunciones.add(rresta);
        rresta.setText("-");
        rresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrestaActionPerformed(evt);
            }
        });
        jPanel1.add(rresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        grupofunciones.add(rmultiplicar);
        rmultiplicar.setText("x");
        rmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmultiplicarActionPerformed(evt);
            }
        });
        jPanel1.add(rmultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        grupofunciones.add(rdividir);
        rdividir.setText("÷");
        rdividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdividirActionPerformed(evt);
            }
        });
        jPanel1.add(rdividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        grupofunciones.add(rborrar);
        rborrar.setText("CA");
        rborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rborrarActionPerformed(evt);
            }
        });
        jPanel1.add(rborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        grupofunciones.add(rborrartodo);
        rborrartodo.setText("C");
        rborrartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rborrartodoActionPerformed(evt);
            }
        });
        jPanel1.add(rborrartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        grupofunciones.add(rpunto);
        rpunto.setText(".");
        rpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpuntoActionPerformed(evt);
            }
        });
        jPanel1.add(rpunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Numeros numerouno = new Numeros();
        String uno = "";
        txtnumeros.setText(txtnumeros.getText()+numerouno.numerouno(uno));
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        Numeros numerodos = new Numeros();
        String dos = "";
        txtnumeros.setText(txtnumeros.getText()+numerodos.numerodos(dos));
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        Numeros numerotres = new Numeros();
        String tres = "";
        txtnumeros.setText(txtnumeros.getText()+numerotres.numerotres(tres));      
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        Numeros numerocuatro = new Numeros();
        String cuatro = "";
        txtnumeros.setText(txtnumeros.getText()+numerocuatro.numerocuatro(cuatro)); 
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        Numeros numerocinco = new Numeros();
        String cinco = "";
        txtnumeros.setText(txtnumeros.getText()+numerocinco.numerocinco(cinco)); 
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        Numeros numeroseis = new Numeros();
        String seis = "";
        txtnumeros.setText(txtnumeros.getText()+numeroseis.numeroseis(seis)); 
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        Numeros numerosiete = new Numeros();
        String siete = "";
        txtnumeros.setText(txtnumeros.getText()+numerosiete.numerosiete(siete)); 
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        Numeros numeroocho = new Numeros();
        String ocho = "";
        txtnumeros.setText(txtnumeros.getText()+numeroocho.numeroocho(ocho)); 
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        Numeros numeronueve = new Numeros();
        String nueve = "";
        txtnumeros.setText(txtnumeros.getText()+numeronueve.numeronueve(nueve)); 
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        Numeros numerocero = new Numeros();
        String cero = "";
        txtnumeros.setText(txtnumeros.getText()+numerocero.numerocero(cero)); 
    }//GEN-LAST:event_btn0ActionPerformed

    private void rsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsumaActionPerformed
        if (!txtnumeros.getText().equals("")) {
            valor1=txtnumeros.getText();
            signo="+";
            txtnumeros.setText("");
        }
    }//GEN-LAST:event_rsumaActionPerformed

    private void rigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rigualActionPerformed
        String resultado;
        valor2=txtnumeros.getText();
        if (!valor2.equals("")) {
            resultado=calculadora(valor1,valor2,signo);
            txtnumeros.setText(resultado);
        }
    }//GEN-LAST:event_rigualActionPerformed

    private void rrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrestaActionPerformed
        if (!txtnumeros.getText().equals("")) {
            valor1=txtnumeros.getText();
            signo="-";
            txtnumeros.setText("");
        }
    }//GEN-LAST:event_rrestaActionPerformed

    private void rmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmultiplicarActionPerformed
        if (!txtnumeros.getText().equals("")) {
            valor1=txtnumeros.getText();
            signo="*";
            txtnumeros.setText("");
        }
    }//GEN-LAST:event_rmultiplicarActionPerformed

    private void rdividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdividirActionPerformed
        if (!txtnumeros.getText().equals("")) {
            valor1=txtnumeros.getText();
            signo="/";
            txtnumeros.setText("");
        }
    }//GEN-LAST:event_rdividirActionPerformed

    private void rborrartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rborrartodoActionPerformed
        String cadena;
        //cadena la igualo al texto del jtextfield
        cadena=txtnumeros.getText();
        if (cadena.length()>0) {
            cadena=cadena.substring(0, cadena.length()-1);
            txtnumeros.setText(cadena);
        }  
    }//GEN-LAST:event_rborrartodoActionPerformed

    private void rborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rborrarActionPerformed
        txtnumeros.setText("");
    }//GEN-LAST:event_rborrarActionPerformed

    private void rpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpuntoActionPerformed
        String cadena;
        cadena=txtnumeros.getText();
        
        if (cadena.length()<=0) {
            txtnumeros.setText("0.");
          }
        else{
            if (!punto(txtnumeros.getText())) {
                txtnumeros.setText(txtnumeros.getText()+".");               
            }  
        }
    }//GEN-LAST:event_rpuntoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.ButtonGroup grupofunciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rborrar;
    private javax.swing.JRadioButton rborrartodo;
    private javax.swing.JRadioButton rdividir;
    private javax.swing.JRadioButton rigual;
    private javax.swing.JRadioButton rmultiplicar;
    private javax.swing.JRadioButton rpunto;
    private javax.swing.JRadioButton rresta;
    private javax.swing.JRadioButton rsuma;
    private javax.swing.JTextField txtnumeros;
    // End of variables declaration//GEN-END:variables
}
