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
            if (!(Double.isNaN(root1) || Double.isNaN(root2))) return "Roots are: " + root1 + " and " + root2;
            else if (root1 == root2) return "The root is: " + root1;
            else return "No roots for that function!";
        }
        else return "Invalid Input!";
    }
    
}