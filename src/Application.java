import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) {
        GUI gui = new GUI();
        Random random = new Random();
        for(int i = 0;i<10;++i){
            EComponent desiredComponent = EComponent.values()[random.nextInt(EComponent.values().length)];
            gui.display(desiredComponent);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
        }
    }

}