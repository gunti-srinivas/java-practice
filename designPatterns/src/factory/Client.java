package factory;

import factory.Buttons.Button;
import factory.dropdowns.Dropdown;
import factory.menus.Menu;

public class Client {


    public static void main(String[] args){

        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
        UIFactory factory = flutter.createUIFactory();
        Button button = factory.createButton();
        Dropdown dropdown = factory.createDropdown();
        Menu menu = factory.createMenu();
    }
}
