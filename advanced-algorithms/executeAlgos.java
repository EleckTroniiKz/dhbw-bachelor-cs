
public class executeAlgos {
	
	public static void main(String[] args) {
		
		Graph graph = new Graph();
		graph.init();
		
		graph.show();
		
		for (int i = 0; i < graph.anzahlKnoten(); i++) {
			for (int j = 0; j < graph.anzahlKnoten(); j++) {
				if (Math.random() < 0.3) {
					graph.addEdge(i, j);
				}
			}
		}
		//graph.addEdge(0, 2);
		//graph.addEdge(2, 3);
		//graph.addEdge(3, 4);
		
		graph.show();
		
		TransitiveHuelle.erzeugeTransitiveHuelle(graph);
		
		graph.show();
	}

}
