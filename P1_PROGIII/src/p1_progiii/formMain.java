/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_progiii;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class formMain extends javax.swing.JFrame {

    List<Literal> ListaVariables = new ArrayList<Literal>();

    /**
     * Creates new form formMain
     */
    public formMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtExpresion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnMas = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnMultiplica = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtResultadoOperacion = new javax.swing.JTextField();
        txtVariables = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtExpresion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExpresionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExpresionKeyTyped(evt);
            }
        });

        jLabel1.setText("Ingrese expresión a evaluar:");

        btnProcesar.setText("Procesar");
        btnProcesar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProcesarMouseClicked(evt);
            }
        });
        btnProcesar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnProcesarKeyPressed(evt);
            }
        });

        btnCancelar.setText("Limpiar Campos");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("NOTA: Los operadores soportados en las operaciones son: + - * / ^ √  ");

        jLabel3.setText("Resultado notación polaca:");

        jLabel5.setText("Operadores");

        btnMas.setText("+");
        btnMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasMouseClicked(evt);
            }
        });
        btnMas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnMasKeyPressed(evt);
            }
        });

        btnMenos.setText("-");
        btnMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenosMouseClicked(evt);
            }
        });
        btnMenos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnMenosKeyPressed(evt);
            }
        });

        btnMultiplica.setText("*");
        btnMultiplica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultiplicaMouseClicked(evt);
            }
        });
        btnMultiplica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnMultiplicaKeyPressed(evt);
            }
        });

        btnDivide.setText("/");
        btnDivide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDivideMouseClicked(evt);
            }
        });
        btnDivide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDivideKeyPressed(evt);
            }
        });

        btnPotencia.setText("^");
        btnPotencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPotenciaMouseClicked(evt);
            }
        });
        btnPotencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPotenciaKeyPressed(evt);
            }
        });

        btnRaiz.setText("√");
        btnRaiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRaizMouseClicked(evt);
            }
        });
        btnRaiz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRaizKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMultiplica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPotencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMas)
                    .addComponent(btnMenos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplica)
                    .addComponent(btnDivide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPotencia)
                    .addComponent(btnRaiz))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel6.setText("Los valores de las variables son:");

        txtResultadoOperacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtResultadoOperacion.setEnabled(false);

        txtVariables.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtVariables.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResultadoOperacion)
                                .addGap(110, 110, 110))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnProcesar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnProcesar)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtResultadoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnProcesarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcesarMouseClicked
        // TODO add your handling code here:
        procesar();
    }//GEN-LAST:event_btnProcesarMouseClicked

    private void txtExpresionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExpresionKeyTyped
        // TODO add your handling code here:
        //evaluaDigito(String.valueOf(evt.getKeyChar()));


    }//GEN-LAST:event_txtExpresionKeyTyped

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void btnProcesarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnProcesarKeyPressed
        // TODO add your handling code here:
        procesar();
    }//GEN-LAST:event_btnProcesarKeyPressed

    private void btnMasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnMasKeyPressed
        // TODO add your handling code here:
        agregaSigno("+");
    }//GEN-LAST:event_btnMasKeyPressed

    private void btnMenosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnMenosKeyPressed
        // TODO add your handling code here:
        agregaSigno("-");
    }//GEN-LAST:event_btnMenosKeyPressed

    private void btnMultiplicaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnMultiplicaKeyPressed
        // TODO add your handling code here:
        agregaSigno("*");
    }//GEN-LAST:event_btnMultiplicaKeyPressed

    private void btnDivideKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDivideKeyPressed
        // TODO add your handling code here:
        agregaSigno("/");
    }//GEN-LAST:event_btnDivideKeyPressed

    private void btnPotenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPotenciaKeyPressed
        // TODO add your handling code here:
        agregaSigno("^");
    }//GEN-LAST:event_btnPotenciaKeyPressed

    private void btnRaizKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRaizKeyPressed
        // TODO add your handling code here:
        agregaSigno("√");
    }//GEN-LAST:event_btnRaizKeyPressed

    private void btnMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasMouseClicked
        // TODO add your handling code here:
        agregaSigno("+");
    }//GEN-LAST:event_btnMasMouseClicked

    private void btnMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMouseClicked
        // TODO add your handling code here:
        agregaSigno("-");
    }//GEN-LAST:event_btnMenosMouseClicked

    private void btnMultiplicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicaMouseClicked
        // TODO add your handling code here:
        agregaSigno("*");
    }//GEN-LAST:event_btnMultiplicaMouseClicked

    private void btnDivideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivideMouseClicked
        // TODO add your handling code here:
        agregaSigno("/");
    }//GEN-LAST:event_btnDivideMouseClicked

    private void btnPotenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPotenciaMouseClicked
        // TODO add your handling code here:
        agregaSigno("^");
    }//GEN-LAST:event_btnPotenciaMouseClicked

    private void btnRaizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRaizMouseClicked
        // TODO add your handling code here:
        agregaSigno("√");
    }//GEN-LAST:event_btnRaizMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtExpresion.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void txtExpresionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExpresionKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER ) {
            procesar();
        }
    }//GEN-LAST:event_txtExpresionKeyPressed
    public void agregaSigno(String valor) {
        String temp;
        temp = txtExpresion.getText();
        temp = temp + valor;
        txtExpresion.setText(temp);
        txtExpresion.requestFocus();
    }

    public void limpiar() {
        txtExpresion.setText("");
        txtVariables.setText("");
        ListaVariables.removeAll(ListaVariables);
        txtExpresion.requestFocus();

    }

    public void procesar() {
        String resultado = "", expresion = "";
        ListaVariables.removeAll(ListaVariables);
        if (txtExpresion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una expresión para evaluar");
            limpiar();
        } else {
            expresion = txtExpresion.getText();
            revisaExpresion(expresion);
        }
    }

    public void revisaExpresion(String dato) {
        String letrasNumerosOperadores = "[a-z0-9+\\-*/=()^√\b]+";
        String letras = "[a-z]";
        String exp1 = "", exp2 = "";
        String var = "";
        if (dato.matches(letrasNumerosOperadores)) {
            exp1 = dato;
        } else {
            for (int i = 0; i < dato.length(); i++) {
                char c = dato.charAt(i);
                if (String.valueOf(c).matches(letrasNumerosOperadores)) {
                    exp1 = exp1 + c;
                } else {
                    exp2 = exp2 + c + " ";
                }
            }
        }
        if (exp2.length() != 0) {
            JOptionPane.showMessageDialog(null, "La expresión ingresada contiene los siguientes caracteres no permitidos: " + exp2);
        } else {
            for (int i = 0; i < dato.length(); i++) {
                char c = dato.charAt(i);
                if (String.valueOf(c).matches(letras)) {
                    Literal item = new Literal();
                    item.nombre = c;
                    item.valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor para: " + c));
                    ListaVariables.add(item);
                    txtExpresion.requestFocus();
                }
            }
            for (int i = 0; i < ListaVariables.size(); i++) {
                var = var + ListaVariables.get(i).getNombre() + " : " + ListaVariables.get(i).getValor() + " ";

            }
            txtVariables.setText(var);
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
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplica;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtExpresion;
    private javax.swing.JTextField txtResultadoOperacion;
    private javax.swing.JTextField txtVariables;
    // End of variables declaration//GEN-END:variables
}
