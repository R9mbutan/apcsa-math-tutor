public class QuadTool {
    public int coefA = 1;
    public int coefB = 1;
    public int coefC = 1;

    //updates the coefficients of A, B, and C based on the given argument (NO TRY/CATCH)
    public void parseFunc(String fn){
        coefA = Integer.parseInt(fn.substring(0, fn.indexOf("x^2")));
        String afterA = fn.substring(fn.indexOf("x^2")+4, fn.length());
        coefB = Integer.parseInt(afterA.substring(0, afterA.indexOf("x")));
        coefC = Integer.parseInt(afterA.substring(afterA.indexOf("x")+2, afterA.length()));  
    }

    //returns whether an argument is acceptable
    public boolean isOK(String argum) {
        try {
            parseFunc(argum);
        } catch(Exception e) {return false;}
        
        return true; 
    }

    public void testing(String fn) {
        if (isOK(fn)) {
            parseFunc(fn);
            System.out.println(coefA + ", " + coefB + ", " + coefC);
        }
        else System.out.println("Please input in proper format!");
    }
}
