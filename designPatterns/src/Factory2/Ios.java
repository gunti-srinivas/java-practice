package Factory2;

import Factory2.Buttons.Button;
import Factory2.Buttons.IosButton;
import Factory2.Dashboards.Dashboard;
import Factory2.Dashboards.IosDashboard;

public class Ios implements  DisplayFactory{
    @Override
    public Button button() {
        return new IosButton();
    }

    @Override
    public Dashboard dashboard() {
        return new IosDashboard();
    }
}
