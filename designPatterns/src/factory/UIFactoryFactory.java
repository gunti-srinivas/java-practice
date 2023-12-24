package factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryFromPlatform(SupportedPlatforms supportedPlatform){

        if(supportedPlatform == SupportedPlatforms.ANDROID){
            return new AndroidUIFactory();
        }
        if(supportedPlatform == SupportedPlatforms.IOS){
            return new IosUIFactory();
        }
        return null;
    }
}
