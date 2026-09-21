/*
Class: QuadraticIndefIntegrator
Author: Tran Khanh Phong
Purpose: To find & return the integral of a given function
Resources: Mr. Otterstetter, Ms. Cannon's Notes, Desmos.com for testing
*/
public class QuadraticIndefIntegrator extends QuadTool {
    public String integrate(String fn) {
        if (isOK(fn)) {
            String fin = "";
            parseFunc(fn);
            //if term A exists, raise power of x by 1 and divide by x's exponent
            if (coefA != 0) 
                fin += coefA/3 + "x^3";
            //if term B exists, raise power of x by 1 and divide by x's exponent
            if (coefB != 0){
                if (coefB>0) //ensures the correct sign of term B
                    fin += "+" + coefB/2 + "x^2";
                else fin += coefB/2 + "x^2";
            }
            //if term C exists, raise power of x by 1 and divide by x's exponent
            if (coefC != 0) {
                if (coefC>0) //ensures correct sign of term C
                    fin += "+" + coefC + "x";
                else fin += coefC + "x";
            }
            // return the total string plus "+C" 
            return fin+"+C";
        } //invalid function returns message
        else return "Invalid input!";
    }
}
