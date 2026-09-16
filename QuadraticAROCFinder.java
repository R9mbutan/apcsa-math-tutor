public class QuadraticAROCFinder extends QuadTool {
    
    public double doFn(String fn, double t){
        if (isOK(fn)) {
            parseFunc(fn);
            return (coefA * Math.pow(t,2) + coefB * t + coefC);
        }
        else return -67.67676767;
    }
    public String answerAROC(String fn, double t0, double tf) {
        if (isOK(fn)) {    
        return ""+(doFn(fn, tf) - doFn(fn, t0)) / (tf - t0);}
        else return "Invalid Input!";
        }
    }

