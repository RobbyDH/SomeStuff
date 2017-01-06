package ui;

import java.util.Arrays;

public class Class_Arrays {

    public static void main(String... args) {
        new Class_Arrays();
    }

    public Class_Arrays() {
        
  //      equals en deepEquals
        System.out.println("equals en deepEquals {\"one\", \"two\"}");
        String[] s1 = new String[]{"one", "two"};
        String[] s2 = new String[]{"one", "two"};
        System.out.println("Arrays.equals : "
                + Arrays.equals(s1, s2));
        System.out.println("Arrays.deepEquals : "
                + Arrays.deepEquals(s1, s2));

        
        //equals en deepEquals
        //-------------------------
        
        System.out.println("\nequals en deepEquals new String[]{\"two\"}");
        Object[] o1 = new Object[]{"one", new String[]{"two"}};
        Object[] o2 = new Object[]{"one", new String[]{"two"}};

        System.out.println("Arrays.equals : "
                + Arrays.equals(o1, o2));
        System.out.println("Arrays.deepEquals : "
                + Arrays.deepEquals(o1, o2));
        

        
        //toString en deepToString
        //-----------------------------
       System.out.println("\ntoString en deepToString new String[]{\"two\"}");
       System.out.println("o1: " + Arrays.toString(o2));
        
       System.out.println("deepToString o2: "
                + Arrays.deepToString(o2));
        
       System.out.println("\ndeepToString 2 dim. array");
       Object[][] o3 = new Object[][]{{"r0k0", "r0k1"}, 
             {"r1k0", "r1k1"}};
         System.out.println("deepToString o3: "
         + Arrays.deepToString(o3));
      
       
       
         //copyOf en copyRangeOf
         System.out.println("\ncopyOf en copyRangeOf");
         int[] i3 = {1, 2, 3, 4, 5, 6};
         int[] nieuw = Arrays.copyOf(i3, i3.length);
         System.out.println("nieuw (lengte=6)" + 
         Arrays.toString(nieuw));
        
         nieuw = Arrays.copyOf(i3, i3.length+10);
         System.out.println("nieuw (lengte=16)" + 
                 Arrays.toString(nieuw));
         
         nieuw = Arrays.copyOfRange(i3, 2, 20);
         System.out.println("nieuw (lengte=20-2)" + 
         Arrays.toString(nieuw));
        
         
         
         //ArrayStoreException:
         int[] i1 = {2, 3};
         double[] d1 = new double[2];
         Integer[] i2 = new Integer[2];
         //System.arraycopy(i1, 0, d1, 0, i1.length);
         //System.arraycopy(i1, 0, i2, 0, i1.length);
         
    }
}
