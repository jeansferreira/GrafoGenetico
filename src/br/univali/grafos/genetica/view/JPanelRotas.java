package br.univali.grafos.genetica.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import br.univali.grafos.genetica.model.Cromossomo;


public class JPanelRotas extends JPanel {

	
	private Graphics2D grafico;
	private Line2D rota;
	private Ellipse2D node;
	
	private ArrayList nos;
	private ArrayList populacao;
	
	public JPanelRotas(ArrayList coordenadas, ArrayList cromossomos){
		nos = coordenadas;
		populacao = cromossomos;
	}
	
	/** Método responsável por plotar no gráfico as coordenadas que respresentam os 'nós'*/
	public void paint(Graphics componente) {
		
		Point coordenada = null;
		
		grafico = (Graphics2D)componente;
		
		if(nos != null){

			Iterator iterator = nos.iterator();
			
			while(iterator.hasNext()){
			
				coordenada = (Point)iterator.next();
				
				node = new Ellipse2D.Double(coordenada.x, coordenada.y, 5.0, 5.0); 
				grafico.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				grafico.setPaint(Color.white);
				grafico.fill(node);
				grafico.setPaint(Color.red);  
				grafico.draw(node);
			}
		}
        drawRotas(grafico);
	}

	
	/** Método responsável por plotar no gráfico as 'rotas' entre os 'nós'*/
	public void drawRotas(Graphics2D grafico) {

		Cromossomo cromossomo;
		
		Cromossomo inicial = (Cromossomo)populacao.get(0);
		Integer first = (Integer)inicial.getRotas().get(0);
		
		Iterator pop = populacao.iterator();

		Point origem  = null;
        Point destino = null;
		
		int index = 0;
		
		while(pop.hasNext()){
			
			cromossomo = (Cromossomo)pop.next();
			Iterator i = cromossomo.getRotas().iterator();
        	
			index = ((Integer)i.next()).intValue();
           	origem = (Point)nos.get(index);
			
			while(i.hasNext()){
				
				index = ((Integer)i.next()).intValue();
				destino = (Point)nos.get(index);

				rota = new Line2D.Double(origem.x, origem.y, destino.x, destino.y);
        		grafico.setColor(Color.blue);
              	grafico.draw(rota);
              
              	origem = destino;
			}
			
			destino = (Point)nos.get(first.intValue());
			
			rota = new Line2D.Double(origem.x, origem.y, destino.x, destino.y);
			grafico.setColor(Color.blue);
	      	grafico.draw(rota);
		
		}
		grafico.dispose();
	}
	
}
