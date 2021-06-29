package it.polito.tdp.imdb.model;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.imdb.db.ImdbDAO;

public class Model {

	Map<Integer, Actor> idMap;
	ImdbDAO dao;
	Graph<Actor, DefaultWeightedEdge> grafo;
	
	public Model() {
		idMap = new HashMap<Integer, Actor>();
		dao = new ImdbDAO();
		dao.listAllActors(idMap);
	}
	
	public String creaGrafo(String genere) {
		grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
		Graphs.addAllVertices(grafo, dao.getVertici(genere, idMap));
		
		for(Adiacenza a:dao.getArchi(genere, idMap)) {
			if(grafo.getEdge(a.getId1(), a.getId2()) == null) {
				Graphs.addEdgeWithVertices(grafo, a.getId1(), a.getId2(), a.getPeso());
			}
		}
		
		return String.format("Grafo creato con %d vertici e %d archi\n",
				this.grafo.vertexSet().size(),
				this.grafo.edgeSet().size()) ;
	}
}
