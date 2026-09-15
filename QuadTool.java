public class QuadTool {
    public int coefA = 1;
    public int coefB = 1;
    public int coefC = 1;

    public void parseFunc(String fn){
        coefA = Integer.parseInt(fn.substring(0, fn.indexOf("x^2")));
        String afterA = fn.substring(fn.indexOf("x^2")+4, fn.length());
        coefB = Integer.parseInt(afterA.substring(0, afterA.indexOf("x")));
        coefC = Integer.parseInt(afterA.substring(afterA.indexOf("x")+2, afterA.length()));  
        /*testing*/System.out.println(coefA + ", " + coefB + ", " + coefC);
    }
}
