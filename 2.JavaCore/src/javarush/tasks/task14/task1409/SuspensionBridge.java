package javarush.tasks.task14.task1409;

public class SuspensionBridge implements Bridge {
    static int COUNT = 200;
    @Override
    public int getCarsCount() {
        return COUNT;
    }
}
