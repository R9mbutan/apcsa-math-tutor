public class QuadTool {
    public int coefA = 1;
    public int coefB = 1;
    public int coefC = 1;

    public void parseFunc(String fn){
        coefA = Integer.parseInt(fn.substring(0, fn.indexOf("x")));
        String afterA = fn.substring(fn.indexOf("x^2", fn.length()-1));
        //String afterA = fn;
        System.out.println(afterA);
        coefB = Integer.parseInt(afterA.substring(0, afterA.indexOf('x')));
        System.out.println(coefA + ", " + coefB + ", " + coefC);
    }
}
