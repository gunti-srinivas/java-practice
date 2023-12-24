package Factory2.Buttons;

public class IosButton implements  Button{
    @Override
    public void getButton() {
        System.out.println("I am ios button");
    }
}
