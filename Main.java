import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Quadratic Math Tutor");
        System.out.print("Setting up...");
        QuadTool tool = new QuadTool();
        QuadraticAROCFinder arocFinder = new QuadraticAROCFinder();
        QuadraticDefIntegrator defIntegrator = new QuadraticDefIntegrator();
        QuadraticDifferentiator differentiator = new QuadraticDifferentiator();
        QuadraticIndefIntegrator indefIntegrator = new QuadraticIndefIntegrator();
        QuadraticSolver solver = new QuadraticSolver();
        Scanner interact = new Scanner(System.in);
        System.out.println("Finished.");
        
        int choice = 0;
        try {
            while (choice != 999) {
                System.out.println("Choose an operation for your quadratic: \n1. Average Rate of Change Finder\n2. Find Definite Integral\n3. Find Indefinite Integral\n4. Find Derivative\n5. Find Roots\n999 to exit");
                System.out.print("Choice: ");
                choice = interact.nextInt();
                interact.nextLine();


                if (choice == 1) {
                    System.out.println("Function: ");
                    String func = interact.nextLine();
                    System.out.print("Initial Time: ");
                    double ti = interact.nextDouble();
                    System.out.print("Final Time: ");
                    double tf = interact.nextDouble();

                    System.out.println("The average rate of change of " + func + " from " + tf + " to " + ti + " is " + arocFinder.answerAROC(func, ti,  tf));
                }
                else if (choice == 2) {
                    System.out.println("Function: ");
                    String func = interact.nextLine();
                    System.out.print("Initial Time: ");
                    double ti = interact.nextDouble();
                    System.out.print("Final Time: ");
                    double tf = interact.nextDouble();

                    System.out.println("The integral of " + func + " from " + tf + " to " + ti + " is " + defIntegrator.defIntegrate(func, ti, tf));
                }
                else if (choice == 3) {
                    System.out.println("Function: ");
                    String func = interact.nextLine();
                    System.out.println("The indefinite integral of " + func + " is " + indefIntegrator.integrate(func));
                }
                else if (choice == 4) {
                    System.out.println("Function: ");
                    String func = interact.nextLine();
                    System.out.println("The derivatave of " + func + " is " + differentiator.getDerivative(func));
                }
                else if (choice == 5) {
                    System.out.println("Function: ");
                    String func = interact.nextLine();
                    System.out.println(solver.getRoots(func));
                }
                else if (choice == 999) {
                    System.out.println("Bye bye!");
                }
                else
                    System.out.println("Please input a choice or exit. ");
            }
        } catch(Exception e) {System.out.println("What the heckle is that supposed to mean? Aborting program...");}


        System.out.println("Exiting...");
        interact.close();
        System.out.println("Done.");
    }    
}
