public class QuadraticIndefIntegrator extends QuadTool {
    public String integrate(String fn) {
        if (isOK(fn)) {
            String fin = "";
            parseFunc(fn);
            //fin = coefA/3 + "x^3" + coefB/2 + "x^2" + coefC + "x" + " + C";
            if (coefA != 0) 
                fin += coefA/3 + "x^3";
            if (coefB != 0){
                if (coefB>0)
                    fin += "+" + coefB/2 + "x^2";
                else fin += coefB/2 + "x^2";
            }
            if (coefC != 0) {
                if (coefC>0)
                    fin += "+" + coefC + "x";
                else fin += coefC + "x";
            }
            return fin;
        }
        else return "Invalid input!";
    }
}
