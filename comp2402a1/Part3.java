package comp2402a1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
public class Part3 {


/**	public static List<String> slurp(BufferedReader r) throws IOException {
		StringBuffer sb = new StringBuffer();
		 char[] buf = new char[1024];
		 int c = 0;
		while ((c = r.read(buf)) > 0) {
			sb.append(String.valueOf(buf, 0, c).toLowerCase());
		}
		return Arrays.asList(sb.toString().split("\\W+"));
	}

	static String reverse(String s) {
		return new StringBuffer(s).reverse().toString();
	}

	 * @param r the reader to read from
	 * @param w the writer to write to
	 * @throws IOException
	 */
	public static void doIt(BufferedReader r, PrintWriter w) throws IOException {
		// Your code goes here - see Part0 for an example
		List<String>ds = new ArrayList<>();
		for (String line = r.readLine(); line != null; line = r.readLine()) {
				ds.add(line);
				if(ds.size() > 5000){
					ds.remove(0);
		}

	}
	//System.out.println("\n");
	for (String text : ds) {
			w.println(text);
	}

	}

	/**
	 * The driver.  Open a BufferedReader and a PrintWriter, either from System.in
	 * and System.out or from filenames specified on the command line, then call doIt.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader r;
			PrintWriter w;
			if (args.length == 0) {
				r = new BufferedReader(new InputStreamReader(System.in));
				w = new PrintWriter(System.out);
			} else if (args.length == 1) {
				r = new BufferedReader(new FileReader(args[0]));
				w = new PrintWriter(System.out);
			} else {
				r = new BufferedReader(new FileReader(args[0]));
				w = new PrintWriter(new FileWriter(args[1]));
			}
			long start = System.nanoTime();
			doIt(r, w);
			w.flush();
			long stop = System.nanoTime();
			System.out.println("Execution time: " + 1e-9 * (stop-start));
		} catch (IOException e) {
			System.err.println(e);
			System.exit(-1);
		}
	}
}
