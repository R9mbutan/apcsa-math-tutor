public class QuadraticAROCFinder extends QuadTool {
    
    private double t0;
    private double tf;

    public double doFn(String fn, double t){
        if (isOK(fn)) {
            parseFunc(fn);
            return (coefA * Math.pow(t,2) + coefB * t + coefC);
        }
        else return -67.67676767;
    }
    public double calculate(String fn, double t0, double tf) {
            return (doFn(fn, tf) - doFn(fn, t0)) / (tf - t0);
        }
    }

