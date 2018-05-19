/*
 * JFrameRotas.java
 *
 * Created on 27 de Maio de 2006, 17:01
 */

package br.univali.grafos.genetica.view;

import java.util.ArrayList;

import javax.swing.JPanel;


/**
 * @author David Victor & Jean Ferreira
 */
public class JFrameRotas extends javax.swing.JFrame {
    
    private javax.swing.JButton jButtonSair;
    private JPanelRotas jPanelRotas;
    
    private ArrayList nos;
    private ArrayList populacao;
    
    public JFrameRotas(JPanelRotas rotas) {
    	
//    	nos = coordenadas;
//    	populacao = cromossomos;
    	jPanelRotas = rotas;
    	
    	initComponents();
        setVisible(true);
    }
    
   
    private void initComponents() {

    	jButtonSair = new javax.swing.JButton();
        //jPanelRotas = new JPanelRotas(nos,populacao);

        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Computa\u00e7\u00e3o Gen\u00e9tica");
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair(evt);
            }
        });

        jPanelRotas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        org.jdesktop.layout.GroupLayout jPanelRotasLayout = new org.jdesktop.layout.GroupLayout(jPanelRotas);
        jPanelRotas.setLayout(jPanelRotasLayout);
        jPanelRotasLayout.setHorizontalGroup(
            jPanelRotasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 868, Short.MAX_VALUE)
        );
        jPanelRotasLayout.setVerticalGroup(
            jPanelRotasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 568, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanelRotas, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButtonSair))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelRotas, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonSair)
                .addContainerGap())
        );
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-900)/2, (screenSize.height-650)/2, 900, 650);
    }

    private void sair(java.awt.event.ActionEvent evt) {                      
            this.dispose();
    }                     
   
}


   