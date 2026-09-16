public class Main {
    public static void main(String[] args) {
        //System.out.println("hi your code works now you\'re welcome");
        QuadTool bud = new QuadTool(); /*
        bud.testing("x^2+2x+3"); //normal
        bud.testing("-x^2-2x-3"); //negative
        bud.testing("10x^2+20x+30"); //double digit
        bud.testing("x^2+2x"); //no c Y
        bud.testing("x^2+3"); //no b N
        bud.testing("2x+3"); //no a Y
        bud.testing("3"); //only c - return should 0, 0, 3 N
        bud.testing("x^2"); //only a - should return 1, 0, 0 N
        bud.testing("2x"); //only b - should return 0, 2, 0 Y */
        
        /*QuadraticSolver bod = new QuadraticSolver();
        System.out.println(bod.answer("x4fueiwdjkf^2+5x+5"));
        System.out.println(bod.answer("x^2+5x+5"));
        QuadraticDifferentiator bid = new QuadraticDifferentiator();
        System.out.println(bid.answerDif("4x^2+8"));
        bud.testing("3x^2+x+2");  */

        QuadraticAROCFinder aaron = new QuadraticAROCFinder();
        bud.testing("6x+3");
        System.out.println(aaron.calculate("6x+3", 0, 4));
        //System.out.println(aaron.calculate("6x+332ewdrf", 0, 4));

        QuadraticSolver quinn = new QuadraticSolver();
        System.out.println(quinn.answer("x^2+4x+5"));
        System.out.println(quinn.answer("x^2"));
        System.out.println(quinn.answer("x^2+2x+1"));
    }    
}
