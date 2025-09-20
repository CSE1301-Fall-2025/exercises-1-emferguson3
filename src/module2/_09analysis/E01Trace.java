package module2._09analysis;

public class E01Trace {
	
	//Exercise 1: Trace through this code by tracking the values
	//of each variable on a sheet of paper.
    public static void main(String[] args) {
        int var1 = 3;
        int var2 = 2;
System.out.println("var1: " + var1 + " var2: " + var2);
        while ((var2 != 0) && ((var1 / var2) >= 0)) {
            System.out.println("var1: " + var1 + " var2: " + var2);
            var1 = var1 + 1;
            var2 = var2 - 1;
        }
    }
}

