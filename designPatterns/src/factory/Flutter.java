package factory;

public class Flutter {

    private SupportedPlatforms supportedPlatform;

    public  Flutter(SupportedPlatforms supportedPlatform){
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme(){
        System.out.println("setting theme");
    }

    public void setRefreshRate(){
        System.out.println("setting refresh rate");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.getUIFactoryFromPlatform(supportedPlatform);
    }
}
