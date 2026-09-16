import java.util.Scanner;
public class QuadTool {
    public double coefA = 0;
    public double coefB = 0;
    public double coefC = 0;
    public double t0;
    public double tf;

    //updates the coefficients of A, B, and C based on the given argument (NO TRY/CATCH)
    public void parseFunc(String fn){
        //for coefA
        //if coefA is there:
        if (fn.indexOf("x^2") != -1) {
            if (fn.substring(0, fn.indexOf("x^2")).equals("")) coefA = 1;
            else if (fn.substring(0, fn.indexOf("x^2")).equals("-")) coefA = -1;
            else coefA = Double.parseDouble(fn.substring(0, fn.indexOf("x^2")));
            //String afterA = fn.substring(fn.indexOf("x^2")+3, fn.length());
        }
        else {
            coefA = 0;
            //String afterA = fn;
        }
        // sets afterA to the argument without x^2 term
        String afterA = (fn.indexOf("x^2") != -1) ? fn.substring(fn.indexOf("x^2")+3, fn.length()) : fn;
        //for coefB
/* System.out.println("afterA is "+afterA);
System.out.println("so coefB is: " +afterA.substring(0, afterA.indexOf("x")));
System.out.println("huh? " + afterA.substring(1, afterA.indexOf("x")).equals("")); */

        //if coefB is there
        if (afterA.indexOf("x") != -1) {
            if ((afterA.substring(0, afterA.indexOf("x")).equals("+"))) coefB = 1;
            else if ((afterA.substring(0, afterA.indexOf("x")).equals("-"))) coefB = -1;
            else if (afterA.indexOf("x") == -1) coefB = 0;
            else coefB = Double.parseDouble(afterA.substring(0, afterA.indexOf("x")));
        }
        else coefB = 0;
        //for coefC
        if (afterA.substring(afterA.indexOf("x")+1, afterA.length()).equals("")) coefC = 0;
        else coefC = Double.parseDouble(afterA.substring(afterA.indexOf("x")+1, afterA.length()));  
    }

    //returns whether an argument is acceptable
    public boolean isOK(String argum) {
        try {
            parseFunc(argum);
        } catch(Exception e) {return false;}
        
        return true; 
    }

    public void testing(String fn) {
        if (isOK(fn)) {
            parseFunc(fn);
            System.out.println(coefA + ", " + coefB + ", " + coefC);
        }
        else System.out.println("Please input in proper format!");
    }


    //TESTING


}

















  