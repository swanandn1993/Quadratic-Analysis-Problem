package qwerty;

import java.lang.Math;

public class testing {

	
	//private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
	
	
	static double [] val;
	static double [] optVal;
	static int now = -1;  
	  static int V;
	  static int count = 0;
	  static double matSize;
	static double DM[][]= new double [20][20];
	static double PM[][] = new double [20][20];
	static double meanCalc = 0;
	static double stdCalc = 0;
	
	static double check = 0;
	static double optimal;
	static double maxVal;
	static double counter[] = new double [20];
	static double counts = 0;
	
	
	
	public static void main(String[] args) {
		
		
		long starttime = System.currentTimeMillis();
		
//		double DM[][] = new double [13][13];
//		double PM[][] = new double [13][13];
//		System.out.println("Test 1");
		matSize =12;
		V = (int) matSize;
		

		counter[0] = 0;	counter[1] = 0;	counter[2] = 0;	counter[3] = 0;	counter[4] = 0;
		counter[5] = 0;	counter[6] = 0;	counter[7] = 0;	counter[8] = 0;
		counter[9] = 0;	counter[10] = 0;counter[11] = 0;counter[12] = 0;
		counter[13] = 0;counter[14] = 0;counter[15] = 0;counter[16] = 0;
		counter[17] = 0;counter[18] = 0;counter[19] = 0;
		
		
		
		DM[0][0] = 0;	DM[0][1] = 90;	DM[0][2] = 10;	DM[0][3] = 23;	DM[0][4] = 43;	DM[0][5] = 0;	DM[0][6] = 0;	DM[0][7] = 0;	DM[0][8] = 0;	DM[0][9] = 0;	DM[0][10] = 0;	DM[0][11] = 0;	DM[0][12] = 21;	DM[0][13] = 21;	DM[0][14] = 21;DM[0][15] = 21;	DM[0][16] = 21;
		DM[1][0] = 90;	DM[1][1] = 0;	DM[1][2] = 0;	DM[1][3] = 0;	DM[1][4] = 0;	DM[1][5] = 88;	DM[1][6] = 0;	DM[1][7] = 0;	DM[1][8] = 0;	DM[1][9] = 0;	DM[1][10] = 0;	DM[1][11] = 0;	DM[1][12] = 32;	DM[1][13] = 21;	DM[1][14] = 21;DM[1][15] = 21;	DM[1][16] = 21;
		DM[2][0] = 10;	DM[2][1] = 0;	DM[2][2] = 0;	DM[2][3] = 0;	DM[2][4] = 0;	DM[2][5] = 0;	DM[2][6] = 26;	DM[2][7] = 16;	DM[2][8] = 0;	DM[2][9] = 0;	DM[2][10] = 0;	DM[2][11] = 0;	DM[2][12] = 4;	DM[2][13] = 21;	DM[2][14] = 21;DM[2][15] = 21;	DM[2][16] = 21;
		DM[3][0] = 23;	DM[3][1] = 0;	DM[3][2] = 0;	DM[3][3] = 0;	DM[3][4] = 0;	DM[3][5] = 0;	DM[3][6] = 0;	DM[3][7] = 0;	DM[3][8] = 0;	DM[3][9] = 0;	DM[3][10] = 0;	DM[3][11] = 0;	DM[3][12] = 65;	DM[3][13] = 21;	DM[3][14] = 21;DM[3][15] = 21;	DM[3][16] = 21;
		DM[4][0] = 43;	DM[4][1] = 0;	DM[4][2] = 0;	DM[4][3] = 0;	DM[4][4] = 0;	DM[4][5] = 0;	DM[4][6] = 0;	DM[4][7] = 0;	DM[4][8] = 0;	DM[4][9] = 0;	DM[4][10] = 0;	DM[4][11] = 0;	DM[4][12] = 7;	DM[4][13] = 21;	DM[4][14] = 21;DM[4][15] = 21;	DM[4][16] = 21;
		DM[5][0] = 0;	DM[5][1] = 88;	DM[5][2] = 0;	DM[5][3] = 0;	DM[5][4] = 0;	DM[5][5] = 0;	DM[5][6] = 0;	DM[5][7] = 0;	DM[5][8] = 1;	DM[5][9] = 0;	DM[5][10] = 0;	DM[5][11] = 0;	DM[5][12] = 54;	DM[5][13] = 21;	DM[5][14] = 21;DM[5][15] = 21;	DM[5][16] = 21;
		DM[6][0] = 0;	DM[6][1] = 0;	DM[6][2] = 26;	DM[6][3] = 0;	DM[6][4] = 0;	DM[6][5] = 0;	DM[6][6] = 0;	DM[6][7] = 0;	DM[6][8] = 0;	DM[6][9] = 0;	DM[6][10] = 0;	DM[6][11] = 0;	DM[6][12] = 32;	DM[6][13] = 21;	DM[6][14] = 21;DM[6][15] = 21;	DM[6][16] = 21;
		DM[7][0] = 0;	DM[7][1] = 0;	DM[7][2] = 16;	DM[7][3] = 0;	DM[7][4] = 0;	DM[7][5] = 0;	DM[7][6] = 0;	DM[7][7] = 0;	DM[7][8] = 0;	DM[7][9] = 96;	DM[7][10] = 0;	DM[7][11] = 0;	DM[7][12] = 56;	DM[7][13] = 21;	DM[7][14] = 21;DM[7][15] = 21;	DM[7][16] = 21;
		DM[8][0] = 0;	DM[8][1] = 0;	DM[8][2] = 0;	DM[8][3] = 0;	DM[8][4] = 0;	DM[8][5] = 1;	DM[8][6] = 0;	DM[8][7] = 0;	DM[8][8] = 0;	DM[8][9] = 0;	DM[8][10] = 29;	DM[8][11] = 0;	DM[8][12] = 76;	DM[8][13] = 21;	DM[8][14] = 21;DM[8][15] = 21;	DM[8][16] = 21;
		DM[9][0] = 0;	DM[9][1] = 0;	DM[9][2] = 0;	DM[9][3] = 0;	DM[9][4] = 0;	DM[9][5] = 0;	DM[9][6] = 0;	DM[9][7] = 96;	DM[9][8] = 0;	DM[9][9] = 0;	DM[9][10] = 0;	DM[9][11] = 37;	DM[9][12] = 3;	DM[9][13] = 21;	DM[9][14] = 21;DM[9][15] = 21;	DM[9][16] = 21;
		DM[10][0] = 0;	DM[10][1] = 0;	DM[10][2] = 0;	DM[10][3] = 0;	DM[10][4] = 0;	DM[10][5] = 0;	DM[10][6] = 0;	DM[10][7] = 0;	DM[10][8] = 29;	DM[10][9] = 0;	DM[10][10] = 0;DM[10][11] = 0;DM[10][12] = 43;DM[10][13] = 21;DM[10][14] = 21;DM[10][15] = 21;DM[10][16] = 21;
		DM[11][0] = 0;	DM[11][1] = 0;	DM[11][2] = 0;	DM[11][3] = 0;	DM[11][4] = 0;	DM[11][5] = 0;	DM[11][6] = 0;	DM[11][7] = 0;	DM[11][8] = 0;	DM[11][9] = 37;	DM[11][10] = 0;DM[11][11] = 0;	DM[11][12] = 21;DM[11][13] = 21;DM[11][14] = 21;DM[11][15] = 21;DM[11][16] = 21;
		DM[12][0] = 11;	DM[12][1] = 3;	DM[12][2] = 0;	DM[12][3] = 11;	DM[12][4] = 0;	DM[12][5] = 11;	DM[12][6] = 20;	DM[12][7] = 0;	DM[12][8] = 31;	DM[12][9] = 3;	DM[12][10] = 10;DM[12][11] = 33;DM[12][12] = 11;DM[12][13] = 21;DM[12][14] = 21;DM[12][15] = 21;DM[12][16] = 21;
		DM[13][0] = 11;	DM[13][1] = 3;	DM[13][2] = 0;	DM[13][3] = 11;	DM[13][4] = 0;	DM[13][5] = 11;	DM[13][6] = 20;	DM[13][7] = 0;	DM[13][8] = 31;	DM[13][9] = 3;	DM[13][10] = 10;DM[13][11] = 33;DM[13][12] = 11;DM[13][13] = 21;DM[13][14] = 21;DM[13][15] = 21;DM[13][16] = 21;
		DM[14][0] = 11;	DM[14][1] = 3;	DM[14][2] = 0;	DM[14][3] = 11;	DM[14][4] = 0;	DM[14][5] = 11;	DM[14][6] = 20;	DM[14][7] = 0;	DM[14][8] = 31;	DM[14][9] = 3;	DM[14][10] = 10;DM[14][11] = 33;DM[14][12] = 11;DM[14][13] = 21;DM[14][14] = 21;DM[14][15] = 21;DM[14][16] = 21;
		DM[15][0] = 11;	DM[15][1] = 3;	DM[15][2] = 0;	DM[15][3] = 11;	DM[15][4] = 0;	DM[15][5] = 11;	DM[15][6] = 20;	DM[15][7] = 0;	DM[15][8] = 31;	DM[15][9] = 3;	DM[15][10] = 10;DM[15][11] = 33;DM[15][12] = 11;DM[15][13] = 21;DM[15][14] = 21;DM[15][15] = 21;DM[15][16] = 21;
		DM[16][0] = 11;	DM[16][1] = 3;	DM[16][2] = 0;	DM[16][3] = 11;	DM[16][4] = 0;	DM[16][5] = 11;	DM[16][6] = 20;	DM[16][7] = 0;	DM[16][8] = 31;	DM[16][9] = 3;	DM[16][10] = 10;DM[16][11] = 33;DM[16][12] = 11;DM[16][13] = 21;DM[16][14] = 21;DM[16][15] = 21;DM[16][16] = 21;

		
		
		
	
		PM[0][0] = 0;	PM[0][1] = 36;	PM[0][2] = 54;	PM[0][3] = 26;	PM[0][4] = 59;	PM[0][5] = 72;	PM[0][6] = 9;	PM[0][7] = 34;	PM[0][8] = 79;	PM[0][9] = 17;	PM[0][10] = 46;	PM[0][11] = 95;	PM[0][12] = 88;	PM[0][13] = 88;	PM[0][14] = 88;	PM[0][15] = 88;	PM[0][16] = 88;
		PM[1][0] = 36;	PM[1][1] = 0;	PM[1][2] = 73;	PM[1][3] = 35;	PM[1][4] = 90;	PM[1][5] = 58;	PM[1][6] = 30;	PM[1][7] = 78;	PM[1][8] = 35;	PM[1][9] = 44;	PM[1][10] = 79;	PM[1][11] = 36;	PM[1][12] = 4;	PM[1][13] = 88;	PM[1][14] = 88;	PM[1][15] = 88;	PM[1][16] = 88;
		PM[2][0] = 54;	PM[2][1] = 73;	PM[2][2] = 0;	PM[2][3] = 21;	PM[2][4] = 10;	PM[2][5] = 97;	PM[2][6] = 58;	PM[2][7] = 66;	PM[2][8] = 69;	PM[2][9] = 61;	PM[2][10] = 54;	PM[2][11] = 63;	PM[2][12] = 20;	PM[2][13] = 88;	PM[2][14] = 88;	PM[2][15] = 88;	PM[2][16] = 88;
		PM[3][0] = 26;	PM[3][1] = 35;	PM[3][2] = 21;	PM[3][3] = 0;	PM[3][4] = 93;	PM[3][5] = 12;	PM[3][6] = 46;	PM[3][7] = 40;	PM[3][8] = 37;	PM[3][9] = 48;	PM[3][10] = 68;	PM[3][11] = 85;	PM[3][12] = 53;	PM[3][13] = 88;	PM[3][14] = 88;	PM[3][15] = 88;	PM[3][16] = 88;
		PM[4][0] = 59;	PM[4][1] = 90;	PM[4][2] = 10;	PM[4][3] = 93;	PM[4][4] = 0;	PM[4][5] = 64;	PM[4][6] = 5;	PM[4][7] = 29;	PM[4][8] = 76;	PM[4][9] = 16;	PM[4][10] = 05;	PM[4][11] = 76;	PM[4][12] = 2;	PM[4][13] = 88;	PM[4][14] = 88;	PM[4][15] = 88;	PM[4][16] = 88;
		PM[5][0] = 72;	PM[5][1] = 58;	PM[5][2] = 97;	PM[5][3] = 12;	PM[5][4] = 64;	PM[5][5] = 0;	PM[5][6] = 96;	PM[5][7] = 55;	PM[5][8] = 38;	PM[5][9] = 54;	PM[5][10] = 00;	PM[5][11] = 34;	PM[5][12] = 64;	PM[5][13] = 88;	PM[5][14] = 88;	PM[5][15] = 88;	PM[5][16] = 88;
		PM[6][0] = 9;	PM[6][1] = 30;	PM[6][2] = 58;	PM[6][3] = 46;	PM[6][4] = 5;	PM[6][5] = 96;	PM[6][6] = 0;	PM[6][7] = 83;	PM[6][8] = 35;	PM[6][9] = 11;	PM[6][10] = 56;	PM[6][11] = 37;	PM[6][12] = 19;	PM[6][13] = 88;	PM[6][14] = 88;	PM[6][15] = 88;	PM[6][16] = 88;
		PM[7][0] = 34;	PM[7][1] = 78;	PM[7][2] = 66;	PM[7][3] = 40;	PM[7][4] = 29;	PM[7][5] = 55;	PM[7][6] = 83;	PM[7][7] = 0;	PM[7][8] = 44;	PM[7][9] = 12;	PM[7][10] = 15;	PM[7][11] = 80;	PM[7][12] = 25;	PM[7][13] = 88;	PM[7][14] = 88;	PM[7][15] = 88;	PM[7][16] = 88;
		PM[8][0] = 79;	PM[8][1] = 35;	PM[8][2] = 69;	PM[8][3] = 37;	PM[8][4] = 76;	PM[8][5] = 38;	PM[8][6] = 35;	PM[8][7] = 44;	PM[8][8] = 0;	PM[8][9] = 64;	PM[8][10] = 39;	PM[8][11] = 33;	PM[8][12] = 7;	PM[8][13] = 88;	PM[8][14] = 88;	PM[8][15] = 88;	PM[8][16] = 88;
		PM[9][0] = 17;	PM[9][1] = 44;	PM[9][2] = 61;	PM[9][3] = 48;	PM[9][4] = 16;	PM[9][5] = 54;	PM[9][6] = 11;	PM[9][7] = 12;	PM[9][8] = 64;	PM[9][9] = 0;	PM[9][10] = 70;	PM[9][11] = 86;	PM[9][12] = 97;	PM[9][13] = 88;	PM[9][14] = 88;	PM[9][15] = 88;	PM[9][16] = 88;
		PM[10][0] = 46;	PM[10][1] = 79;	PM[10][2] = 54;	PM[10][3] = 68;	PM[10][4] = 5;	PM[10][5] = 0;	PM[10][6] = 56;	PM[10][7] = 15;	PM[10][8] = 39;	PM[10][9] = 79;	PM[10][10] = 0;	PM[10][11] = 18;PM[10][12] = 91;PM[10][13] = 88;PM[10][14] = 88;PM[10][15] = 88;PM[10][16] = 88;
		PM[11][0] = 95;	PM[11][1] = 36;	PM[11][2] = 63;	PM[11][3] = 85;	PM[11][4] = 76;	PM[11][5] = 34;	PM[11][6] = 37;	PM[11][7] = 80;	PM[11][8] = 33;	PM[11][9] = 86;	PM[11][10] = 18;PM[11][11] = 0;	PM[11][12] = 48;PM[11][13] = 88;PM[11][14] = 88;PM[11][15] = 88;PM[11][16] = 88;
		PM[12][0] = 0;	PM[12][1] = 0;	PM[12][2] = 0;	PM[12][3] = 0;	PM[12][4] = 2;	PM[12][5] = 64;	PM[12][6] = 19;	PM[12][7] = 25;	PM[12][8] = 7;	PM[12][9] = 97;	PM[12][10] = 91;PM[12][11] = 48;PM[12][12] = 0;	PM[12][13] = 88;PM[12][14] = 88;PM[12][15] = 88;PM[12][16] = 88;
		PM[13][0] = 0;	PM[13][1] = 0;	PM[13][2] = 0;	PM[13][3] = 0;	PM[13][4] = 2;	PM[13][5] = 64;	PM[13][6] = 19;	PM[13][7] = 25;	PM[13][8] = 7;	PM[13][9] = 97;	PM[13][10] = 91;PM[13][11] = 48;PM[13][12] = 0;	PM[13][13] = 88;PM[13][14] = 88;PM[13][15] = 88;PM[13][16] = 88;
		PM[14][0] = 0;	PM[14][1] = 0;	PM[14][2] = 0;	PM[14][3] = 0;	PM[14][4] = 2;	PM[14][5] = 64;	PM[14][6] = 19;	PM[14][7] = 25;	PM[14][8] = 7;	PM[14][9] = 97;	PM[14][10] = 91;PM[14][11] = 48;PM[14][12] = 0;	PM[14][13] = 88;PM[14][14] = 88;PM[14][15] = 88;PM[14][16] = 88;
		PM[15][0] = 0;	PM[15][1] = 0;	PM[15][2] = 0;	PM[15][3] = 0;	PM[15][4] = 2;	PM[15][5] = 64;	PM[15][6] = 19;	PM[15][7] = 25;	PM[15][8] = 7;	PM[15][9] = 97;	PM[15][10] = 91;PM[15][11] = 48;PM[15][12] = 0;	PM[15][13] = 88;PM[15][14] = 88;PM[15][15] = 88;PM[15][16] = 88;
		PM[16][0] = 0;	PM[16][1] = 0;	PM[16][2] = 0;	PM[16][3] = 0;	PM[16][4] = 2;	PM[16][5] = 64;	PM[16][6] = 19;	PM[16][7] = 25;	PM[16][8] = 7;	PM[16][9] = 97;	PM[16][10] = 91;PM[16][11] = 48;PM[16][12] = 0;	PM[16][13] = 88;PM[16][14] = 88;PM[16][15] = 88;PM[16][16] = 88;
		
	//	System.out.println("Test 2");
		 for(double x=0; x<matSize; x++)
		 {		
		 for(double y=0; y<matSize; y++)
			{
				check = check + DM[(int)x][(int) y]*PM[(int)x][(int) y];
				
				//check2 = check;
			}
		 }
		 //System.out.println("Check is " + check);
		  optimal = check;
		  maxVal = check;
		  val = new double [(int) (V+1)];
		  optVal = new double [(int) (V+1)];
		    for (int i=0; i<=V; i++)
		      val[i]=0;
		    p(0);
		    
	//	    System.out.println("Test 3");
		    
		    for(int h = 0; h<9; h++)
		    {
		    	System.out.println(h+": "+ String.format("%.0f", counter[h]) +" for range " + (h*10000) +" to " + ((h+1)*10000));
		    	
		    	
		    }
			System.out.println("Optimum value is " + optimal);
			System.out.println("Maximum value is " + maxVal);
			System.out.println("Optimal configuration is : ");
		    
//			System.out.println("Test 4");
			
			for (int i =1; i<=V ;i++)
			{
				System.out.print("\t"+ optVal[i]);
				
			}
			
			long endtime = System.currentTimeMillis();
			
			System.out.println("\nTime Required is " + (endtime - starttime) + " millisecs");
			System.out.println("\nMean is " + (meanCalc/counts));
			double stdDevi = Math.sqrt((stdCalc - (meanCalc*meanCalc)/counts)/counts);
			System.out.println("\nStandard Deviation is " + stdDevi);
			
			
			
	}
	
	
	 public static void p(int k)
	  {
	    now++;
	    val[k]=now;
	    if (now==V) handleP();
	    for (int i=1; i<=V; i++)
	      if (val[i]==0) p(i);
	    now--;
	    val[k]=0; 
	  }
	  
	  
	  public static void handleP()
	  {
	      
//  		System.out.println("Val is " + val[0] + "\t" +val[1] + "\t" +val[2] + "\t" +val[3]+ "\t");

		  double xyz = 0;
			count++;   
			  
		  
	    for(int j=0; j<matSize; j++)
	    {  	
	        //Process the assignment/path in order to determine and preserve the implications of its cost
		  //  System.out.print(count+" ** ");   
	    
	    	for (int i=0; i<matSize; i++)
	    	{
	    		xyz = xyz + DM[j][i]*PM[(int) val[j+1]-1 ][(int) val[i+1] - 1];
	 //   		System.out.println("Val is " + val[0] + "\t" +val[1] + "\t" +val[2] + "\t" + val[3] + "\t" +val[4] + "\t" +val[5] + "\t"+ val[6] + "\t" +val[7] + "\t" +val[8] + "\t"+ val[9] + "\t" +val[10] + "\t" +val[11] + "\t");
	//    		System.out.println("Check xyz1 is " + xyz);
	    		//	System.out.print(val[i]+" ");
	    	}
	    	// System.out.println("** \t" + xyz + "\t" + optimal + "\t" + maxVal); 
	  //  	System.out.println();
	    	 
	    		    	 

	    }	
	    //System.out.println("Check xyz is " + xyz);
	    
	    if(xyz< optimal)
   	 {
   		 optimal = xyz;
   		 for (int i=1; i<=V; i++)
   		 {
   			 optVal[i] = val[i];
   		 }
   	 }

	 meanCalc = meanCalc + xyz;
	 stdCalc = stdCalc + (xyz*xyz);
	 
	 counts++;
   	 if(xyz> maxVal)
   	 {
   		 maxVal = xyz;
   	 }
   	 
   	 if(xyz>0 && xyz<=10000)
   	 {
   		 counter[0]++;
   	 }
   	 if(xyz>10000 && xyz<=20000)
   	 {
   		 counter[1]++;
   	 }
   	 if(xyz>20000 && xyz<=30000)
   	 {
   		 counter[2]++;
   	 }
   	 if(xyz>30000 && xyz<=40000)
   	 {
   		 counter[3]++;
   	 }
   	 if(xyz>40000 && xyz<=50000)
   	 {
   		 counter[4]++;
   	 }

   	 if(xyz>50000 && xyz<=60000)
   	 {
   		 counter[5]++;
   	 }
   	 if(xyz>60000 && xyz<=70000)
   	 {
   		 counter[6]++;
   	 }
   	if(xyz>70000 && xyz<=80000)
  	 {
  		 counter[7]++;
  	 }
   	if(xyz>80000 && xyz<=90000)
  	 {
  		 counter[8]++;
  	 }
	    
	   
	  }
	
	

}
