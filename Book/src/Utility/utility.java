package Utility;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.Set;
	import java.util.Vector;

	


	public class utility {
		Scanner scanner;

		public utility() {
			scanner = new Scanner(System.in);
		}

		public String inputString() {
			return scanner.next();
		}

		public int inputInteger() {
			return scanner.nextInt();
		}
		
		public double inputDouble() {
			return scanner.nextDouble();
		}
		
		public int[] inputarray(int num){
			int []array=new int[num];
			for(int i=0;i<num;i++)
			{
				array[i]=scanner.nextInt();
			}
			return array;
		}
		
		public static<T extends Comparable<T>> T[] inputFile() throws IOException
		{
			 String Wordlist;
	       int Frequency;

	     //  File file = new File("file1.txt");
	     //  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
	       BufferedReader br = new BufferedReader(new FileReader("C:/practise/BasicJavaPrograms/src/com/jda/Algorithms/File1.txt"));
	       String line = null;
	       T[] tokens = null;

	       while( (line = br.readLine()) != null) {
	           tokens = (T[]) line.split(",");
	      //   System.out.println(line);
	       }
	     
			return tokens;
	      
		}
		
		
		
		public Integer[] inputArray(int num){
			Integer []array=new Integer[num];
			for(int i=0;i<num;i++)
			{
				array[i]=scanner.nextInt();
			}
			return array;
		}
		
		public String[] inputArrayofStrings(int num)
		{
			String []array=new String[num];
			for(int i=0;i<num;i++)
			{
				array[i]=scanner.next();
			}
			return array;
		}

}
