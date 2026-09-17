public class QuadraticDefIntegrator extends QuadTool {
    public double defIntegrate(String fn, double t0, double tf) {
        if (isOK(fn)) {
            double sum = 0;
            parseFunc(fn);
            sum += coefA/3 * Math.pow(tf,3);
            sum += coefB/2 * Math.pow(tf,2);
            sum += coefC * tf;
            sum -= coefA/3 * Math.pow(t0,3);
            sum -= coefB/2 * Math.pow(t0,2);
            sum -= coefC * t0;
            return sum;
        }
        else return -0.006767;
    }
}
