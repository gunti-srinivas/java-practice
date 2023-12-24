package Factory2;

import Factory2.Buttons.AndroidButton;
import Factory2.Buttons.Button;
import Factory2.Buttons.IosButton;
import Factory2.Dashboards.AndroidDashboard;
import Factory2.Dashboards.Dashboard;

public class Android implements  DisplayFactory{
    @Override
    public Button button() {
        return new AndroidButton();
    }

    @Override
    public Dashboard dashboard() {
        return new AndroidDashboard();
    }
}
