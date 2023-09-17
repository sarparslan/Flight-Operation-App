import java.util.*;

public class main {
//-----------------------------------------------------
// Title: Main Class
// Author: Sarp Arslan
// ID: 11458145526
// Section: 3
// Assignment: 1
// Description: This class tests the program
//-----------------------------------------------------

    public static void main(String[] args) {
         //--------------------------------------------------------
    	// Summary: Tests the program, initialize values creates graph
    	// and prints the result.
    	// Precondition: There must be a main class
    	// Postcondition: The program works and prints the result.
    	//--------------------------------------------------------
    	
    	Scanner scanner = new Scanner(System.in);

    	int time;
  	  System.out.println("Enter the values");
  	  
        // Read the first line of input
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);  //5 => vertex sayısı
        int m = Integer.parseInt(firstLine[1]);  //5 => edge sayısı
        int t = Integer.parseInt(firstLine[2]);  //3 => l-r süresi
        int c = Integer.parseInt(firstLine[3]);  //5 => uçuş süresi
        
        // Create a graph object and add the vertices and edges
        Graph graph = new Graph();
        
      //  System.out.println(n+" "+m+" "+t+" "+c);
        for (int i = 0; i <m; i++) {
			String []otherLines = scanner.nextLine().split(" ");
			int u = Integer.parseInt(otherLines[0]);
			int v = Integer.parseInt(otherLines[1]);
			//System.out.println(u+" "+v);
			if(!graph.contains(u)) {
				graph.addVertex(u);

			}
			if(!graph.contains(v))
			{
				graph.addVertex(v);
			}
			

			graph.addEdge(u,v);
			//System.out.println("----------");
	      //  System.out.println(graph.toString());
	        
		}
    //   System.out.println(graph.toString());
        
        
      // Get the start and end vertices for finding the shortest path

        String []lastLine = scanner.nextLine().split(" ");
        int x = Integer.parseInt(lastLine[0]);
        int y = Integer.parseInt(lastLine[1]);
        
            
        // Close the scanner
        scanner.close();
        
        // Find all the paths between the start and end vertices
        List<List<Integer>> allPaths = graph.findAllPaths(x, y);
        int minSize = Integer.MAX_VALUE;
   
         // Find the shortest path
        for (List<Integer> path : allPaths) {
            int size = path.size();
            if (size < minSize) {
                minSize = size;
            }
        }
        
        
    // Print the minSize

        System.out.println(minSize);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (List<Integer> path : allPaths) {
            if (path.size() == minSize) {
                for (int i = 0; i < path.size(); i++) {
                    System.out.print(path.get(i));
                    temp.add(path.get(i));
                    if (i < path.size() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        
        // Calculate the total time for the trip
        int totalTime = 0;
        int ucus = c;
        int yıkama = t;
        
        int counter = 0;
        for(int i : temp) {
        	
        	
        	if(counter != temp.size()-1) {
        		totalTime += ucus;
        		        	//	System.out.println(counter + "ucus " + totalTime);

        		
        		        		if(counter != temp.size()-2) {
        		        			totalTime += yıkama - (totalTime%yıkama);
        	//	System.out.println(counter + " mod yıkama " + totalTime);
        		        		}
        		
        	
        	}
        	
        	counter ++;
        }
        
        // Print the total time for the trip
        System.out.println(totalTime);

        
        
    }

}

