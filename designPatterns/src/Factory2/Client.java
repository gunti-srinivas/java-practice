package Factory2;

import Factory2.Buttons.Button;
import Factory2.Dashboards.Dashboard;

public class Client {

    public static void main(String[] args){

        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);

        DisplayFactory displayFactory = flutter.getSupportedPlatform();

        Button iosButton = displayFactory.button();

        Dashboard iosdashboard = displayFactory.dashboard();

        iosButton.getButton();

        iosdashboard.getDashboard();
    }
}
