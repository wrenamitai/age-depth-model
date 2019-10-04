import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AgeDepthModel {

	public static void main(String[] args) throws IOException {
		Depths startDepths = new Depths(22);
		AgeConstants cons = new AgeConstants();
		File file = new File("C:\\Users\\Wren\\Age Depth Calculations\\test.txt");
		BufferedWriter toFile = null;
		try {
			toFile = new BufferedWriter(new FileWriter("C:\\Users\\Wren\\Age Depth Calculations\\t.txt"));
		} catch (FileNotFoundException x) {
			System.out.println("Hi! I think you forgot to change the name of the output file. Best of luck! Eyes on the prize (the publication)");
		}
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Hello!  I think you forgot to change the name of the input file (the .txt part) on line 10.");
		}
		sc.useDelimiter("-| |\\n");
		toFile.write("Depth\tAge");
		toFile.newLine();
		while (sc.hasNext()) {
			int core = Integer.parseInt(sc.next());
			double offset = Double.parseDouble(sc.next());
			double subsect = Double.parseDouble(sc.next());
			double end = Double.parseDouble(sc.next());
			double depth = startDepths.depth[core-1][1];
			depth = depth + (offset-1)*1.5 + subsect*.01;
			if (core == 17 && offset == 7) {
				depth = depth - .8;
			}
			double sed = cons.getSedRate(depth);
			double yint = cons.getYIntercept(depth);
			double age = (depth-yint)/sed;
			age = (double)Math.round(age * 100d) / 100d;
			String test = Double.toString(depth) + "\t" + Double.toString(age);
			toFile.write(test);
			toFile.newLine();
			
		}
		sc.close();
		toFile.close();
	

	}

}
