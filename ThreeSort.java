// ThreeSort.java: Takes three integers as command-line arguments and writes
// them in ascending order, separated by spaces.

import edu.princeton.cs.algs4.StdOut;
public class ThreeSort {
    public static void main(String[] args) {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);
      int lo = Math.min(Math.min(a, b), Math.min(b,c));
      int hi = Math.max(Math.max(a, b), Math.max(b,c));
      int mid = (a+b+c)-(hi+lo);
      StdOut.println(lo+" "+mid+" "+hi);
}
}
