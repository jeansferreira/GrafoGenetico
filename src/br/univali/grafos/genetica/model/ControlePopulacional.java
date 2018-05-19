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
	 * M�todo respons�vel por gerar aleatoriamente as coordenadas
	 * no gr�fico que representar�o os n�s. O n�mero de coordenadas
	 * a serem geradas � dada pelo argumento 'nos'.
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
	 * M�todo respons�vel por gerar um �nico cromossomo que representar� 
	 * um �nico indiv�duo na popula��o.
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
