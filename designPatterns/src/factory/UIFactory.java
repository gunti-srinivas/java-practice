package factory;

import factory.Buttons.Button;
import factory.dropdowns.Dropdown;
import factory.menus.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}
