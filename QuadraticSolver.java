public class QuadraticSolver extends QuadTool{
    
    //instantiate roots
    private double root1;
    private double root2;

    // solve with quadratic equation 
    public void solve(double a, double b, double c) {
            root1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2*a) ;
            root2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2*a) ;
    }

    public String getRoots(String fn){
        // if function is valid, parse and solve
        if (isOK(fn)) {
            parseFunc(fn);
            solve(coefA, coefB, coefC);
            //if both roots exist: return both
            if (!(Double.isNaN(root1) || Double.isNaN(root2)) && !(Math.abs(root1 - root2) < 0.0001)) return "Roots are: " + root1 + " and " + root2;
            // if roots are equal (or very similar cuz java is weird): return the root
            else if (Math.abs(root1 - root2) < 0.0001) return "The root is: " + root1;
            // if no roots are found: return none
            else return "No roots found with quadratic equation!";
        }
        else return "Invalid Input!";
    }
    
}