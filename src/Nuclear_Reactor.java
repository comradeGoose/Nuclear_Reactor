import java.util.Scanner;

public class Nuclear_Reactor {
    int value;
    int input;

    Nuclear_Reactor() {
        this.value = 50;
        this.input = 50;
    }

    public synchronized int inc() {
        if (input >= value) {
            this.value++;
        }
        return this.value;
    }

    public synchronized int dec() {
        if (input <= value) {
            this.value--;
        }
        return this.value;
    }

    public void inputValue() {
        Scanner scanner = new Scanner(System.in);
        this.input = scanner.nextInt();
    }

}



