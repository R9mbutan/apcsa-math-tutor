import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Quadratic Math Tutor");
        System.out.print("Setting up...");
        QuadraticAROCFinder arocFinder = new QuadraticAROCFinder();
        QuadraticDefIntegrator defIntegrator = new QuadraticDefIntegrator();
        QuadraticDifferentiator differentiator = new QuadraticDifferentiator();
        QuadraticIndefIntegrator indefIntegrator = new QuadraticIndefIntegrator();
        QuadraticSolver solver = new QuadraticSolver();
        Scanner interact = new Scanner(System.in);
        System.out.println("Finished.");


        int choice = 0;
        //while ((choice != 999) || ((choice < 5) || (choice > 0))) {
            System.out.println("Which tool would you like to use? \n Options: \n 1. AROC Finder \n 2. Definite Integrator \n 3. Differentiator \n 5. Indefinite Integrator \n 5. Solver \n Input 1, 2, 3, 4, or 5. \n Input 999 to end.");
            try {
                choice = interact.nextInt();
            interact.close();
            if (choice == 1)
                {
                    System.out.println("placeholder 1");
                }
            else if (choice == 2)
                {
                    System.out.println("placeholder 2");
                }
            else if (choice == 3)
                {
                    System.out.println("placeholder 3");
                }
            else if (choice == 4)
                {
                    System.out.println("placeholder 4");
                }
            else if (choice == 5)
                {
                    System.out.println("placeholder 5");
                }
                //HAS INFINITE LOOP. FINISH LATER
            } catch(Exception e) {
                System.out.println("Please use a valid input!");
            }
       // }
    }    
}
