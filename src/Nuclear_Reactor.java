import java.util.Scanner;

public class Nuclear_Reactor {
    int value;

    Nuclear_Reactor(){
        this.value = 50;
    }

    public synchronized int inc(){
        this.value++;
        return this.value;
    }

    public synchronized int dec(){
        this.value--;
        return this.value;
    }

    public void inputValue(){
        Scanner scanner = new Scanner(System.in);
        this.value = scanner.nextInt();
    }

}



