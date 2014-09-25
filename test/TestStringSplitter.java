import static org.junit.Assert.*;

import org.junit.Test;


public class TestStringSplitter {
    /**
     * Returns a string from an input array a, and delimiter delim, 
     * such that the output = a_0 + delim + a_1 + delim + ... + delim + a_k.
     *
     * if a is empty, returns an empty string
     * 
     * @param output
     * @param delim
     * @return
     */
    private static String reconstruct(String[] output, String delim) {
        String reconstruction = "";

        if(output.length == 0) {
            return "";
        }
        
        reconstruction = output[0];
        for (int i=1; i<output.length; i++) {
            reconstruction += delim + output[i];
        }
        return reconstruction;
    }    

    @Test
    public void simpleTest2 () {
        String text = "this is another sentence";
        String delim = " ";
        
        String[] output = StringSplitter.splitString (text, delim);
        
        String reconstruction = reconstruct(output, delim);
        
        assertEquals(text, reconstruction);
    }
    
    @Test
    public void simpleTest () {
        String text = "this is a sentence";
        String delim = " ";
        
        String[] output = StringSplitter.splitString (text, delim);
        
        String reconstruction = reconstruct(output, delim);
        
        assertEquals(text, reconstruction);
    }
}
