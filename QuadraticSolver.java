public class QuadraticSolver extends QuadTool{
    private double root1;
    private double root2;
    private boolean r1Exists = false;
    private boolean r2Exists = false;

    public void solve(double a, double b, double c) {
        try {
            root1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2*a) ;
            r1Exists = true;
        } catch(Exception e) {r1Exists = false;}
        try {
            root2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2*a) ;
            r2Exists = true;
        } catch(Exception e) {r2Exists = false;}
    }

    public String answer(String fn){
        if (isOK(fn)) {
            parseFunc(fn);
            solve(coefA, coefB, coefC);
            if (r1Exists && r2Exists) return "Roots are: " + root1 + " and " + root2;
            else if (root1 == root2) return "The root is: " + root1;
            else return "No roots for that function!";
        }
        else return "Invalid Input!";
    }
    
}