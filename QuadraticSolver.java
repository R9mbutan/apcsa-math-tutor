public class QuadraticSolver extends QuadTool{
    private double root1;
    private double root2;

    public void solve(double a, double b, double c) {
        root1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2*a) ;
        root2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2*a) ;
    }

    public String answer(String fn){
        if (isOK(fn)) {
            parseFunc(fn);
            solve(coefA, coefB, coefC);
            return "Roots are: " + root1 + " and " + root2;
        }
        else return "Invalid Input!";
    }
    
}