package comp2402a1;



import java.io.BufferedReader;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.util.Map;

import java.util.TreeMap;

import java.util.Collections;
import java.util.Set;
import java.util.Iterator;




public class Part8 {


	/**

	 * Your code goes here - see Part0 for an example

	 * @param r the reader to read from

	 * @param w the writer to write to

	 * @throws IOException

	 */

	public static void doIt(BufferedReader r, PrintWriter w) throws IOException {

		TreeMap<String,Integer> s = new TreeMap<String,Integer>();
		int size=-1;
		String key = "";

		for (String line = r.readLine(); line != null; line = r.readLine()){
			key = line;
			size++;
			s.put(line,size);

		}

Set set = s.entrySet();

Iterator it = set.iterator();

while(it.hasNext()){
	Map.Entry ve = (Map.Entry)it.next();
	w.println(ve.getValue());
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
