public class WordOMatic {
	public static void main (String[] args) {
	
	String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "foulr-leaf-clover", "web-base", "nerd", "stigma-alpha", "tesla", "dynamic", "productive"};
	
	String[] wordListTwo = {"empowered", "sticky", "value-added", "problem_solver", "object-oriented", "distributed", "branded", "outside-the-box", "passive-aggressive", "networked", "focused", "leveraged", "clustered", "nested", "shared", "cooperative", "start-up"};
	
	String[] wordListThree = {"progress", "system", "internet-of-things", "solution", "problem-tree", "snap", "digital-cuurency", "strategy", "protocol", "hub", "space", "backbone", "vision", "paradigm", "mission"};
	
	// find out how many words are in each list
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;
	
	// generate three random numbers
	
	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * twoLength);
	int rand3 = (int) (Math.random() * threeLength);
	
	// now build a phrase
	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
	
	// print out the phrase
	System.out.println("What we need is a " + phrase);
	
	}
}
	
