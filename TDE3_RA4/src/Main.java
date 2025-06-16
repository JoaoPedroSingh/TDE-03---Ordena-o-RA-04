import util.Runner;

public class Main {
    public static void main(String[] args) {
        try {
            Runner.runAll();
            System.out.println("Execução finalizada.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}