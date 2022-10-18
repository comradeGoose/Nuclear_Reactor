public class Main {

    public static void main(String[] args) {
	// write your code here
        Nuclear_Reactor reactor = new Nuclear_Reactor();

        Thread threadInc = new Thread(new Runnable() {
            @Override
            public void run() {
                while (reactor.value < 100 && reactor.value > 0){
                    System.out.println("threadInc : " + reactor.inc());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("threadInc out of range");
            }
        });

        Thread threadDec = new Thread(new Runnable() {
            @Override
            public void run() {
                while (reactor.value < 100 && reactor.value > 0){
                    System.out.println("threadDec : " + reactor.dec());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("threadInc out of range");
            }
        });

        Thread threadInput = new Thread(new Runnable() {
            @Override
            public void run() {
                while (reactor.value < 100 && reactor.value > 0){
                    reactor.inputValue();
                    System.out.println("threadInput: value = " + reactor.input);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("error");
            }
        });

        threadInc.start();
        threadDec.start();
        threadInput.start();

    }
}
