package comp2402a1;



import java.io.BufferedReader;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.util.List;

import java.util.ArrayList;



public class Part7 {



	/**

	 * Your code goes here - see Part0 for an example

	 * @param r the reader to read from

	 * @param w the writer to write to

	 * @throws IOException

	 */

	public static void doIt(BufferedReader r, PrintWriter w) throws IOException {

		List<ArrayList<String>> s = new ArrayList<>();

		s.add(new ArrayList<String>());

		int chunkCount = 0;



		for (String line = r.readLine(); line != null; line = r.readLine()) {

				if(line.compareTo("----snip----") == 0){

					s.add(new ArrayList<String>());

					chunkCount++;

				}else{

					s.get(chunkCount).add(line);

				}





		}



		for(int i = s.size()-1;i>-1;i--){

			List chunk = s.get(i);

			for(int j = 0; j < chunk.size(); j++){

				w.println(chunk.get(j));

			}

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
