package pkgHelper;

import java.text.DecimalFormat;
import java.util.Scanner;

public class statCalculator {
		//scanner 
		Scanner input=new Scanner(System.in);
		//declare variables
		private static String playerName;
		private int AB;
		private int H;
		private int twoB;
		private int threeB;
		private int HR;
		private int R;
		private int BB;
	
		//declare constructor
		public statCalculator() {
			
			System.out.println("Enter Player Name: ");
			playerName=input.nextLine();
			
			System.out.println("Enter number of at-bats: ");
			this.AB=input.nextInt();
			
			System.out.println("Enter number of hits: ");
			this.H=input.nextInt();
			
			System.out.println("Enter number of 2Bs: ");
			this.twoB=input.nextInt();
			
			System.out.println("Enter number of 3Bs: ");
			this.threeB=input.nextInt();
			
			System.out.println("Enter number of Homeruns: ");
			this.HR=input.nextInt();
			
			System.out.println("Enter number of Runs: ");
			this.R=input.nextInt();
			
			System.out.println("Enter number of Walks: ");
			this.BB=input.nextInt();
		}
		//declare getters and setters
		public String getplayerName() {
			return playerName;
		}

		public static void setplayerName(String playername) {
			playerName=playername;
		}
		public int getAB() {
			return AB;
		}
		
		public void setAB(int ab) {
			this.AB=ab;
		}


		public int getH() {
			return H;
		}

		public void setH(int h) {
			this.H = h;
		}

		public int getTwoB() {
			return twoB;
		}

		public void setTwoB(int twoB) {
			this.twoB = twoB;
		}

		public int getThreeB() {
			return threeB;
		}

		public void setThreeB(int threeB) {
			this.threeB = threeB;
		}

		public int getHR() {
			return HR;
		}

		public void setHR(int hR) {
			this.HR = hR;
		}

		public int getR() {
			return R;
		}

		public void setR(int r) {
			this.R = r;
		}

		public int getBB() {
			return BB;
		}

		public void setBB(int bb) {
			this.BB = bb;
		}

		//start stat calculations
		public double battingAverage() {
			return ((double)H)/AB;	
		}
		//also includes hit by pitch which isn't accounted for here- making answer slightly different from real
		public double onBasePercentage() {
			return ((double)BB+H)/(AB+BB);
		}
		
		public double sluggingPercentage() {
			return ((double)(H-twoB-threeB-HR)+2*twoB+3*threeB+4*HR)/AB;
		}
		
		public double onBaseSlugging() {
			return onBasePercentage()+sluggingPercentage();
		}
		
		public int totalBases() {
			return (H-twoB-threeB-HR)+2*twoB+3*threeB+4*HR;
		}
		
		
		public static void main(String[] args) {
			DecimalFormat df = new DecimalFormat("#.###");
			statCalculator RuthStat= new statCalculator();
			
			System.out.println("Here are "+playerName+"'s stats:");
			System.out.println("Batting Average: "+df.format(RuthStat.battingAverage()));
			System.out.println("On-Base Percentage: "+df.format(RuthStat.onBasePercentage()));
			System.out.println("Slugging Percentage: "+df.format(RuthStat.sluggingPercentage()));
			System.out.println("On Base + Slugging Percentage: "+df.format(RuthStat.onBaseSlugging()));
			System.out.println("Total Bases: "+RuthStat.totalBases());
			
		}
}