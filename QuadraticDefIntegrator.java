/*
Class: QuadraticDefIntegrator
Author: Tran Khanh Phong
Purpose: To calculate the definite integral of a given function between given times
Resources: Mr. Otterstetter, Ms. Cannon's Notes, Desmos.com for testing
*/
public class QuadraticDefIntegrator extends QuadTool {
    public double defIntegrate(String fn, double t0, double tf) {
        if (isOK(fn)) {
            double sum = 0;
            parseFunc(fn);
            // adds up (0 to tf)∫f(x)dx
            sum += coefA/3 * Math.pow(tf,3);
            sum += coefB/2 * Math.pow(tf,2);
            sum += coefC * tf;
            // subtracts (0 to ti)∫f(x)dx
            sum -= coefA/3 * Math.pow(t0,3);
            sum -= coefB/2 * Math.pow(t0,2);
            sum -= coefC * t0;
            // return total sum
            return sum;
        } //invalid function returns 0 b/c the function returns doubles only. 
        else return 0;
    }
}
