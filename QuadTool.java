/*
Class: QuadTool
Author: Tran Khanh Phong
Purpose: To find & set the coefficients of a given quadratic; the parent class
Resources: Mr. Vollmer's Coding I curriculum
*/
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
            // if there is nothing between the beginnig and x^2, assume coefA = 1
            if (fn.substring(0, fn.indexOf("x^2")).equals("")) coefA = 1;
            // if there is only a negative there, coefA = -1
            else if (fn.substring(0, fn.indexOf("x^2")).equals("-")) coefA = -1;
            // otherwise, coefA = whatever is between start and x^2
            else coefA = Double.parseDouble(fn.substring(0, fn.indexOf("x^2")));        
        }
        // no x^2 means coefA DNE
        else {
            coefA = 0;
        }
        // sets afterA to the argument without x^2 term
        String afterA = (fn.indexOf("x^2") != -1) ? fn.substring(fn.indexOf("x^2")+3, fn.length()) : fn;

        //if coefB is there
        if (afterA.indexOf("x") != -1) {
            //if the substring is just "+": coefB = 1
            if ((afterA.substring(0, afterA.indexOf("x")).equals("+"))) coefB = 1;
            //if the substring is just "-": coefB = -1
            else if ((afterA.substring(0, afterA.indexOf("x")).equals("-"))) coefB = -1;
            //if there is no "x": coefB = 0
            else if (afterA.indexOf("x") == -1) coefB = 0;
            // otherwise, coefB is just whatever is between the start and x
            else coefB = Double.parseDouble(afterA.substring(0, afterA.indexOf("x")));
        }
        // no x means coefB DNE
        else coefB = 0;
        //for coefC
        // if the term after bx is nothing, coefC = 0
        if (afterA.substring(afterA.indexOf("x")+1, afterA.length()).equals("")) coefC = 0;
        // otherwise, coefC is just the last term
        else coefC = Double.parseDouble(afterA.substring(afterA.indexOf("x")+1, afterA.length()));  
    }

    //returns whether an argument is acceptable
    public boolean isOK(String argum) {
        try {
            //if it parses just fine, it is okay.
            parseFunc(argum);
        } catch(Exception e) {return false;} //NOT okay
        
        return true; 
    }

    // prints the function's coefs
    public void testing(String fn) {
        if (isOK(fn)) {
            parseFunc(fn);
            System.out.println(coefA + ", " + coefB + ", " + coefC);
        }
        else System.out.println("Please input in proper format!");
    }

}

















  