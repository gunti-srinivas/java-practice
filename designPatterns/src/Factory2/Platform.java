package Factory2;

public class Platform {


    public static DisplayFactory getPlatform(SupportedPlatforms supportedPlatform){
        if(supportedPlatform == SupportedPlatforms.ANDROID){
            return new Android();
        }
        else if(supportedPlatform == SupportedPlatforms.IOS){
            return new Ios();
        }
        return null;
    }
}
