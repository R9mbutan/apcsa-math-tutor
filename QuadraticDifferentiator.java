public class QuadraticDifferentiator extends QuadTool {
    private String finalDerivitave = "0";
    public void differentiate(double a, double b, double c) {
        finalDerivitave = 2*a + "x + " + b;
    }
    public String answerDif(String fn) {
        if (isOK(fn)) {
            parseFunc(fn);
            differentiate(coefA, coefB, coefC);
            return finalDerivitave;
        }
        else return "Invalid Input!";
    }
}
