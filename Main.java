public class Main {
    public static void main(String[] args) {
        //System.out.println("hi your code works now you\'re welcome");
        QuadTool bud = new QuadTool();
        bud.parseFunc("3x^2+5x+4");
        bud.parseFunc("40x^2+583x+344");
        try {bud.parseFunc("81feyfc93u");}
        catch(Exception e) { System.out.println("Please input in proper format!");}
    }    
}
