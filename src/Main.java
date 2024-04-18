//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        moonRover test1 = new moonRover(1, 2, "N");
        test1.getInstructor("LMLMLMLMM");
        System.out.println("Test Case 1: Location: 12N Movement: LMLMLMLMM Output: ");
        test1.result();

        moonRover test2 = new moonRover(3, 3, "E");
        test2.getInstructor("MMRMMRMRRM");
        System.out.println("Test Case 2: Location: 33E Movement: MMRMMRMRRM Output: ");
        test2.result();

        moonRover test3 = new moonRover(5, 5, "N");
        test3.getInstructor("MMRMMLLMRMLLM");
        System.out.println("Test Case 3: Location: 55N Movement: MMRMMLLMRMLLM  Output: ");
        test3.result();
    }
}