package com.linernotes.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.log4j.BasicConfigurator;

/*import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.sail.SailRepository;
import org.openrdf.sail.memory.MemoryStore;
import org.openrdf.sail.SailConnection;
import org.openrdf.model.vocabulary.RDF;
import org.openrdf.model.vocabulary.RDFS;
import org.openrdf.model.Literal;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.URI;
import org.openrdf.OpenRDFException;*/

import com.tinkerpop.blueprints.impls.sail.impls.MemoryStoreSailGraph;
import com.tinkerpop.blueprints.impls.tg.TinkerGraph;
import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Direction;

public class App 
{

	public static void main( String[] args )
    {
		
		//Graph graph = new TinkerGraph();
    	Graph graph = new MemoryStoreSailGraph();
		Vertex a = graph.addVertex("http://www.names.com/marko");
		Vertex b = graph.addVertex("http://www.names.com/peter");
		//a.setProperty("name", "marko");
		//b.setProperty("name", "peter");
		Edge e = graph.addEdge(null, a, b, "http://www.knows.com/knows");
		System.out.println(e.getVertex(Direction.OUT) + "--" + e.getLabel() + "-->" + e.getVertex(Direction.IN).getProperty("name"));
		for (Edge edge : graph.getEdges()) {
		    System.out.println(edge);
		   }


   /* 	

    	System.out.println( "Hello World!" );
    	System.out.println( graph );
    	Vertex a = graph.addVertex("http://www.google.com/mark");
    	Vertex b = graph.addVertex(null);
    	//a.setProperty("name", "marko");
    	//b.setProperty("name", "peter");
    	Vertex c = graph.getVertex("http://www.google.com/mark");
    	System.out.println(c);
    	Edge e = graph.addEdge(null, a, b, "http://www.google.com/knows"); */
    //	for (Vertex vertex : graph.getVertices()) {
    //	    System.out.println(vertex);
    //	  }
    	//Repository myRepository = new SailRepository(new MemoryStore());
    	//myRepository.initialize();
    //	Sail sail = new GraphSail(new TinkerGraph());
    /*	sail.initialize();
    	SailConnection sc = sail.getConnection();
    	ValueFactory vf = sail.getValueFactory();
    	ValueFactory f = myRepository.getValueFactory();

    	//create some resources and literals to make statements out of
    	URI alice = f.createURI("http://example.org/people/alice");
    	URI bob = f.createURI("http://example.org/people/bob");
    	URI name = f.createURI("http://example.org/ontology/name");
    	URI person = f.createURI("http://example.org/ontology/Person");
    	Literal bobsName = f.createLiteral("Bob");
    	Literal alicesName = f.createLiteral("Alice");
    	Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Hello World");


    	
    	try {
    		   RepositoryConnection con = myRepository.getConnection();

    		   try {
    		      // alice is a person
    		      con.add(alice, RDF.TYPE, person);
    		      // alice's name is "Alice"
    		      con.add(alice, name, alicesName);

    		      // bob is a person
    		      con.add(bob, RDF.TYPE, person);
    		      // bob's name is "Bob"
    		      con.add(bob, name, bobsName);
    		   }
    		   finally {
    		      con.close();
    		   }
    		}
    		catch (OpenRDFException e) {
    		   // handle exception
    		}

*/
    }
}
