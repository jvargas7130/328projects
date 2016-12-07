import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class hashTester {

	public static void main(String[] args) {
		
		ArrayList<Hash> table = readFile("titles.txt");
		
		// part 1
		part1(table);

	}

	public static void readInFile(String fileName, ArrayList<String> title) {

		// Reads in Files
		try {
			Scanner read = new Scanner(new File(fileName));
			do {

				String line = read.nextLine();
				// String[] tokens = line.split(" ");
				title.add(line);

			} while (read.hasNext());
			read.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("File was not found");
		}

	}

	public static void part1(ArrayList<Hash> t) {

		for (int i = 0; i < t.size(); i++) {

			String string = t.get(i).getKey();
			System.out.println(string);
			t.setVal(calcHash( string ));
			
		}

	}
	
	public static int calcHash( String key ) {
		double sum = 0;
		for (int j = 0; j < 25; j++) {
			char c = key.charAt(j);

			int s = (int) c;
			//System.out.println(s);
			// int s = Character.getNumericValue(c);
			
			
			long product = (long)(s * Math.pow(31, j));

			sum = sum + product;
		
		}
		System.out.println(sum);
		sum *= 0.68033989;
		System.out.println(sum);
		
		System.out.println("floor" + (int)sum);
		sum = sum - (long)sum;
		System.out.println(sum);
		System.out.println((((int)sum * 300)));
		
		long l = (long)218641297833324.9345;
		
		System.out.println(l);
		
		return (int) sum;
	}
	
	public Hash search( ArrayList<Hash> list, String key ) {
		
		Hash h = null;
		
		for ( int i = 0; i < list.size(); i++ ) {
			
			if ( list.get(i).getKey() == key ) {
				
				h = list.get(i);
				
				return h;
			}
		}
		
		return h;
	}
	
	public void swap( ArrayList<Hash> list, String key, String swap ) {
		
		for ( int i = 0; i < list.size(); i++ ) {
			
			if ( list.get(i).getKey() == key ) {
				
				list.get(i).setKey(swap);
				list.get(i).setVal(calcHash(swap));
			}
		}
	}
	
	public static ArrayList<Hash> readFile( String path ) {
		
		ArrayList<Hash> list = new ArrayList<Hash>(100);
		
		try {
			
			Scanner read = new Scanner(new File(path));
			
			while ( read.hasNextLine() ) {
				
				String str = read.nextLine();
				
				list.add(new Hash(str, calcHash(str)));
			}
		}
		catch( FileNotFoundException fnf ) {}
		
		return list;
	}
	
	public static void writeFile( ArrayList<Hash> list ) {
		
		try {
			
			PrintWriter write = new PrintWriter("output.txt");
			
			for ( int i = 0; i < list.size(); i++ ) {
				
				write.println(list.get(i).getKey());
			}	
			
			write.close();
		}
		catch ( FileNotFoundException fnf ) {}
	}
}
