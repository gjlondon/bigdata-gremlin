package com.linernotes.app;

import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.impls.tg.TinkerGraph;

public class SampleCode {
		
	public static void main( String[] args )
    {
			
		Graph graph = new TinkerGraph();
		Vertex a = graph.addVertex(null);
		Vertex b = graph.addVertex(null);
		a.setProperty("name", "marko");
		b.setProperty("name", "peter");
		Edge e = graph.addEdge(null, a, b, "knows");
		System.out.println(e.getVertex(Direction.OUT).getProperty("name") + "--" + e.getLabel() + "-->" + e.getVertex(Direction.IN).getProperty("name"));
	
    }
}
