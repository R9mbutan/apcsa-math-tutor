import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Welcome message + status update
        System.out.println("Welcome to Quadratic Math Tutor");
        System.out.print("Setting up...");
        // initialize objects and vars
        QuadraticAROCFinder arocFinder = new QuadraticAROCFinder();
        QuadraticDefIntegrator defIntegrator = new QuadraticDefIntegrator();
        QuadraticDifferentiator differentiator = new QuadraticDifferentiator();
        QuadraticIndefIntegrator indefIntegrator = new QuadraticIndefIntegrator();
        QuadraticSolver solver = new QuadraticSolver();
        Scanner interact = new Scanner(System.in);
        int choice = 0;
        // status update
        System.out.println("Finished.");
        
        // try so that errors can be avoided; if error, terminate program
        try {
            // 999 is the exit code
            while (choice != 999) {
                //show the options
                System.out.println("Choose an operation for your quadratic: \n1. Average Rate of Change Finder\n2. Find Definite Integral\n3. Find Indefinite Integral\n4. Find Derivative\n5. Find Roots\n999 to exit\nFormat: Ax^2+Bx+C (no spaces. put terms in order of highest power of x to lowest. max power of x is 2.");
                System.out.print("Choice: ");
                // get input
                choice = interact.nextInt();
                // ensures the input is not skipped over 
                // (it won't allow function input without this line if there are end times needed)
                interact.nextLine();


                //AROC - needs end times and function
                if (choice == 1) {
                    System.out.println("Function: ");
                    String func = interact.nextLine();
                    System.out.print("Initial Time: ");
                    double ti = interact.nextDouble();
                    System.out.print("Final Time: ");
                    double tf = interact.nextDouble();

                    System.out.println("The average rate of change of " + func + " from " + tf + " to " + ti + " is " + arocFinder.answerAROC(func, ti,  tf));
                }
                //Definite Integral - needs end times and function
                else if (choice == 2) {
                    System.out.println("Function: ");
                    String func = interact.nextLine();
                    System.out.print("Initial Time: ");
                    double ti = interact.nextDouble();
                    System.out.print("Final Time: ");
                    double tf = interact.nextDouble();

                    System.out.println("The integral of " + func + " from " + ti + " to " + tf + " is " + defIntegrator.defIntegrate(func, ti, tf));
                }
                //Indefinite Integral - needs function only
                else if (choice == 3) {
                    System.out.println("Function: ");
                    String func = interact.nextLine();
                    System.out.println("The indefinite integral of " + func + " is " + indefIntegrator.integrate(func));
                }
                //Derivative - needs function only
                else if (choice == 4) {
                    System.out.println("Function: ");
                    String func = interact.nextLine();
                    System.out.println("The derivatave of " + func + " is " + differentiator.getDerivative(func));
                }
                //Quadratic Equation - needs function only
                else if (choice == 5) {
                    System.out.println("Function: ");
                    String func = interact.nextLine();
                    System.out.println(solver.getRoots(func));
                }
                //exit program
                else if (choice == 999) {
                    System.out.println("Bye bye!");
                }
                //unsupported number: continue loop
                else
                    System.out.println("Please input a choice or exit. ");
            }
            // exception --> stop program
        } catch(Exception e) {System.out.println("What the heckle is that supposed to mean? Aborting program...");}

        //exit message + status
        System.out.println("Exiting...");
        interact.close();
        System.out.println("Done.");
    }    
}
