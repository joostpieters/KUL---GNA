package main;

import java.util.Random;


public class Func {
	
	public static void create2(int len){
		int[] one = new int[len];
		int[] two = new int[len];
		
		Random r = new Random();
		
		//System.out.println("First Array: ");
		
		for(int i = 0; i < len; i++){
			one[i] = r.nextInt(10000);
			//System.out.println(i+": "+one[i]);
		}
		
		//System.out.println("\nNext Array: ");
		
		for(int i = 0; i < len; i++){
			two[i] = r.nextInt(10000);
			//System.out.println(i+": "+two[i]);
		}
		//System.out.println("===== CHECKING =====");
		check2(one, two);

	}
	
	public static void check2(int[] one, int[] two){
		int cnt = 0;
		long start_time = System.currentTimeMillis();

		for(int i = 0; i < one.length; i++){
			for(int j = 0; j < two.length; j++){
				if(one[i] == two[j]){
					//System.out.println(one[i]+" 1:"+i+" 2:"+j);
					cnt++;
					break;
				}
			}
		}
		long end_time = System.currentTimeMillis();
		long difference = end_time-start_time;
		System.out.println("\nTOTAL for 2 arrays: "+cnt+" matches in "+difference/1000.0+" seconds.");
	}
	
	public static void create3(int len){
		int[] one = new int[len];
		int[] two = new int[len];
		int[] three = new int[len];
		
		Random r = new Random();
		
		//System.out.println("First Array: ");
		
		for(int i = 0; i < len; i++){
			one[i] = r.nextInt(10000);
			//System.out.println(i+": "+one[i]);
		}
		
		//System.out.println("\nNext Array: ");
		
		for(int i = 0; i < len; i++){
			two[i] = r.nextInt(10000);
			//System.out.println(i+": "+two[i]);
		}
		//System.out.println("\nNext Array: ");
		
		for(int i = 0; i < len; i++){
			three[i] = r.nextInt(10000);
			//System.out.println(i+": "+three[i]);
		}
		//System.out.println("===== CHECKING =====");
		check3(one, two, three);
		check3naive(one, two, three);

	}
	
	public static void check3(int[] one, int[] two, int[] three){
		int cnt = 0;
		long start_time = System.currentTimeMillis();

		for(int i = 0; i < one.length; i++){
			for(int j = 0; j < two.length; j++){
				if(one[i] == two[j]){
					for(int z = 0; z < three.length; z++){
						if(two[j] == three[z]){
							//System.out.println(one[i]+" 1:"+i+" 2:"+j+" 3:"+z);
							cnt++;
							break;
						}
					}
				}
			}
		}
		long end_time = System.currentTimeMillis();
		long difference = end_time-start_time;
		System.out.println("\nTOTAL for 3 arrays: "+cnt+" matches in "+difference/1000.0+" seconds.");
	}

	public static void check3naive(int[] one, int[] two, int[] three){
		int cnt = 0;
		long start_time = System.currentTimeMillis();

		for(int i = 0; i < one.length; i++){
			for(int j = 0; j < two.length; j++){
				for(int z = 0; z < three.length; z++){
					if(one[i] == two[j]){
							if(two[j] == three[z]){
								//System.out.println(one[i]+" 1:"+i+" 2:"+j+" 3:"+z);
								cnt++;
								break;
							}
					}
				}
			}
		}
		long end_time = System.currentTimeMillis();
		long difference = end_time-start_time;
		System.out.println("\nTOTAL for 3 arrays (naive way): "+cnt+" matches in "+difference/1000.0+" seconds.");
	}

}
