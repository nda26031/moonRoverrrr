public class moonRover {
    private int x;
    private int y;
    private String heading;

    public moonRover(int x, int y, String heading) {
        this.x = x;
        this.y = y;
        this.heading = heading;
    }

    public void move(char instruction) {
        switch (instruction) {
            case 'L':
                turnL();
                break;
            case 'R':
                turnR();
                break;
            case 'M':
                forW();
                break;
        }
    }

    private void forW() {
        switch (heading) {
            case "N":
                y++;
                break;
            case "W":
                x--;
                break;
            case "S":
                y--;
                break;
            case "E":
                x++;
                break;
        }
    }

    private void turnL() {
        switch (heading) {
            case "N":
                heading = "W";
                break;
            case "W":
                heading = "S";
                break;
            case "S":
                heading = "E";
                break;
            case "E":
                heading = "N";
                break;
        }
    }

    private void turnR() {
        switch (heading) {
            case "N":
                heading = "E";
                break;
            case "E":
                heading = "S";
                break;
            case "S":
                heading = "W";
                break;
            case "W":
                heading = "N";
                break;
        }
    }

    public void getInstructor(String instructor) {
        for (char instr : instructor.toCharArray()) {
            move(instr);
        }
    }

    public void result() {
        System.out.println(x + "" + y + heading);
    }
}
