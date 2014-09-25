import java.util.ArrayList;
import java.util.List;

public class StringSplitter {
    /**
     * Split text into an array a = [ a_0, a_1, ..., a_k ] such that a_0 + delim
     * + a_1 + delim + ... + delim + a_k is equal to text.
     * 
     * And, all elements a_i in the output will not have delim.
     * 
     * @param text
     *            String to be split
     * @param delim
     *            String to split on
     * @return array of substrings of text appearing between instances of delim
     * 
     *         effects: throws NoSplitsException if and only if text does not
     *         contain delim; otherwise, returns a where none of a[i] contain
     *         substring delim
     */
    public static String[] splitString(String text, String delim) 
        throws RuntimeException {
		List<String> results = new ArrayList<String>();
		int curPos = 0;
		int idx = text.indexOf(delim);		// "this is a sentence"
		if (idx == -1) {
		    throw new RuntimeException ();
		}
		while (idx != -1) {
			results.add(text.substring(curPos,idx));
			curPos = idx+delim.length();
			idx = text.indexOf(delim, curPos);
		}
		if (curPos != text.length()) {
			results.add(text.substring(curPos, text.length()));
		}
		
		String[] resultsArray = new String[0];
		
		return results.toArray(resultsArray);
    }

    public static void main(String[] args) {
        String test = "yetanothersentence";

        int idx = test.indexOf("sentence");

        System.out.println("Index of first space is: " + idx);

    }
}
