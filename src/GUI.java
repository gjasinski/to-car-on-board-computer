public class GUI {
    private EComponent currDisplayedData;
    private CarData carData = new CarData();
    public void display(EComponent componentToDisplay) {
        if(componentToDisplay != currDisplayedData) {
            currDisplayedData = componentToDisplay;
            System.out.println("Now displaying: " + currDisplayedData);
            System.out.println(carData.get(componentToDisplay).getData());
        }
    }
}