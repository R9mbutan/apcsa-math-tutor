public class QuadraticAROCFinder extends QuadTool {
    // compute f(t) given t
    public double doFn(String fn, double t){
        if (isOK(fn)) {
            parseFunc(fn);
            // Ax^2+Bx+C
            return (coefA * Math.pow(t,2) + coefB * t + coefC);
        }
        else return 0;
    }
    // compute with equation of (f(tf)-f(ti))/(tf-ti) given f(x), tf, and ti
    public String answerAROC(String fn, double t0, double tf) {
        if (isOK(fn)) {
        return ""+(doFn(fn, tf) - doFn(fn, t0)) / (tf - t0);}
        else return "Invalid Input!";
        }
    }

