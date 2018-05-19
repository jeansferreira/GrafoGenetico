/*
 * JFrameEntrada.java
 *
 * Created on 27 de Maio de 2006, 16:28
 */

package br.univali.grafos.genetica.view;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Classe 'JFrameEntrada': responsável por apresentar interface gráfica ao usuário
 * 						   para a captura de dados de entrada.
 *                           
 *@author  David Victor & Jean Ferreira
 */
public class JFrameEntrada extends javax.swing.JFrame {
    
	private javax.swing.JButton jButtonGerar;
    private javax.swing.JLabel jLabelNos;
    private javax.swing.JLabel jLabelPopulacao;
    private javax.swing.JPanel jPanelInput;
    private javax.swing.JTextField jTextFieldNos;
    private javax.swing.JTextField jTextFieldPopulacao;
	
	
    public JFrameEntrada() {
        initComponents();
    }
    
    public boolean retornaValores(){
        return true;
    }
  
    private void initComponents() {
        jPanelInput = new javax.swing.JPanel();
        jLabelNos = new javax.swing.JLabel();
        jLabelPopulacao = new javax.swing.JLabel();
        jTextFieldNos = new javax.swing.JTextField();
        jTextFieldPopulacao = new javax.swing.JTextField();
        jButtonGerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Computa\u00e7\u00e3o Gen\u00e9tica");
        setResizable(false);
        jPanelInput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados de Entrada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 102)));
        jLabelNos.setText("N\u00f3s: ");

        jLabelPopulacao.setText("Popula\u00e7\u00e3o: ");

        jButtonGerar.setText("Gerar");
    
        org.jdesktop.layout.GroupLayout jPanelInputLayout = new org.jdesktop.layout.GroupLayout(jPanelInput);
        jPanelInput.setLayout(jPanelInputLayout);
        jPanelInputLayout.setHorizontalGroup(
            jPanelInputLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelInputLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelInputLayout.createSequentialGroup()
                        .add(jPanelInputLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabelPopulacao)
                            .add(jLabelNos))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanelInputLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jTextFieldPopulacao)
                            .add(jTextFieldNos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                    .add(jButtonGerar))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanelInputLayout.setVerticalGroup(
            jPanelInputLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelInputLayout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jPanelInputLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelNos)
                    .add(jTextFieldNos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelInputLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelPopulacao)
                    .add(jTextFieldPopulacao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 40, Short.MAX_VALUE)
                .add(jButtonGerar)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelInput, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelInput, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        setBounds(20, 40, 210, 220);
    }

    public boolean validarEntrada(){
    	
    	String qtdNos = jTextFieldNos.getText().trim();
    	String tamanhoPop = jTextFieldPopulacao.getText().trim();
    	
    	if(qtdNos.matches("[^\\s][0-9]*")&(tamanhoPop.matches("[^\\s][0-9]*")))
    		return true;
    	else
    		JOptionPane.showMessageDialog(null,"Digite apenas números!", "Computação Genética (ERRO)", JOptionPane.WARNING_MESSAGE);
    		return false;
    }
    
    public JButton getButton(){
    	return this.jButtonGerar;
    }
    
    public String getNos(){
    	return jTextFieldNos.getText();
    }
    
    public String getPopulacao(){
    	return jTextFieldPopulacao.getText();
    }
    
    
    
    
}
