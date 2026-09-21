/*
Class: QuadraticDifferentiator
Author: Tran Khanh Phong
Purpose: To find & return the derivative of a given function
Resources: Mr. Otterstetter, Ms. Cannon's Notes, Desmos.com for testing
*/
public class QuadraticDifferentiator extends QuadTool {
    // initialize finalDerivative as String b/c equations are Strings in this program
    private String finalDerivitave = "0";

    // returns the derivative of a quadratic given a, b, and c
    public void differentiate(double a, double b, double c) {
        finalDerivitave = 2*a + "x + " + b;
    }
    // parses a given function, calls differentiate function with the coefficients, then returns
    public String getDerivative(String fn) {
        if (isOK(fn)) { 
            parseFunc(fn);
            differentiate(coefA, coefB, coefC);
            return finalDerivitave;
        } //invalid function returns message
        else return "Invalid Input!";
    }
}
