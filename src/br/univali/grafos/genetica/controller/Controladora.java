package br.univali.grafos.genetica.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;

import br.univali.grafos.genetica.model.ControlePopulacional;
import br.univali.grafos.genetica.model.Cromossomo;
import br.univali.grafos.genetica.view.JFrameEntrada;
import br.univali.grafos.genetica.view.JFrameRotas;
import br.univali.grafos.genetica.view.JPanelRotas;

/**                           
 *@author  David Victor & Jean Ferreira
 */
public class Controladora implements ActionListener{

	JFrameEntrada entrada;
	JFrameRotas rotas;
	ControlePopulacional populacional;
	JButton button;
	
	
	public Controladora(JFrameEntrada entrada, ControlePopulacional populacional){
		
		this.entrada = entrada;
		this.populacional = populacional;
		button = entrada.getButton();
		button.addActionListener(this);
	}
	

   /** 
	* Método 'listener'(ouvinte) dos eventos acionados pelas interfaces gráficas
	*/
	public void actionPerformed(ActionEvent evt) {
				
		Object source = evt.getSource();
		
		if(source == entrada.getButton() && entrada.validarEntrada()){
			
			ArrayList populacao = new ArrayList();
			
			ArrayList nos = populacional.geraNos(Integer.valueOf(entrada.getNos()));			
			
			for(int i=0; i<Integer.parseInt(entrada.getPopulacao());i++){
				populacao.add(populacional.geraCromossomo(nos));
			}
			JPanelRotas painel = new JPanelRotas(nos,populacao);
			JFrameRotas rotas = new JFrameRotas(painel);
		}
		
	}
	
	
}
