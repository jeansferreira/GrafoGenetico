package br.univali.grafos.genetica.model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;


/**                           
 *@author  David Victor & Jean Ferreira
 */
public class ControlePopulacional {

	Populacao populacao;
	Cromossomo cromossomo;
	ArrayList coordenadas;
	Point nodes;
	
	/** 
	 * Método responsável por gerar aleatoriamente as coordenadas
	 * no gráfico que representarão os nós. O número de coordenadas
	 * a serem geradas é dada pelo argumento 'nos'.
	 */
	public ArrayList geraNos(Integer nos){
		
		coordenadas = new ArrayList();
		
		Random aleatorio = new Random(System.currentTimeMillis());
			
		try{
			for(int i = 0; i < nos.intValue(); i++){

				nodes = new Point();
				nodes.x = aleatorio.nextInt(850) + 1;
				nodes.y = aleatorio.nextInt(550) + 1;
				
				coordenadas.add(nodes);
			}
			return coordenadas;
			
		}catch(Exception e){
			System.out.println("ERRO: ControlePopulacional.geraNos: " + e.getMessage());
			return null;
		}
	}
	
	
	/** 
	 * Método responsável por gerar um único cromossomo que representará 
	 * um único indivíduo na população.
	 */
	public Cromossomo geraCromossomo(ArrayList nos){
		
		Cromossomo cromossomo = null;
		
		ArrayList rotas = new ArrayList();
		Integer pontos = null; 

		Random aleatorio = new Random(System.currentTimeMillis());
		
		while(rotas.size() < nos.size()){
			
			pontos = Integer.valueOf(aleatorio.nextInt(nos.size()));
			
			while(rotas.contains(pontos)){
				pontos = Integer.valueOf(aleatorio.nextInt(nos.size()));
			}
			rotas.add(pontos);	
		}
		
		cromossomo = new Cromossomo();
		cromossomo.setRotas(rotas);
		
		return cromossomo;
	}
	
}
