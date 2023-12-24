package Factory2;

import Factory2.Buttons.Button;
import Factory2.Dashboards.Dashboard;

public interface DisplayFactory {

    public Button button();

    public Dashboard dashboard();
}
