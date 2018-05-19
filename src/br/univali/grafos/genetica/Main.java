/*
 * Main.java
 *
 * Created on 27 de Maio de 2006, 15:18
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.univali.grafos.genetica;


import br.univali.grafos.genetica.controller.Controladora;
import br.univali.grafos.genetica.model.ControlePopulacional;
import br.univali.grafos.genetica.view.JFrameEntrada;
import br.univali.grafos.genetica.view.JFrameRotas;

/**
 *
 * Classe 'Main':  responsável por instanciar os objetos das camadas
 *                 de apresentação e controle.
 *
 * @author David Victor & Jean Ferreira
 *
 */
public class Main {
    
    
	public static void main(String[] args) {
        
    	JFrameEntrada entrada = new JFrameEntrada();
    	ControlePopulacional populacional = new ControlePopulacional();
    	Controladora controle = new Controladora(entrada,populacional);
        
    	entrada.setVisible(true);
    }
}
