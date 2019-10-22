// ThreeDice.java: Writes the sum of three random integers between 1 and 6, such
// as you might get when rolling three dice.

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
public class ThreeDice {
    public static void main(String[] args) {
       int a = StdRandom.uniform(1, 7);
       int b = StdRandom.uniform(1, 7);
       int c = StdRandom.uniform(1, 7);
       StdOut.println(a+b+c);
    }
}
