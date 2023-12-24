package Factory2;

public class Flutter {


    private SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms supportedPlatforms){
        this.supportedPlatforms = supportedPlatforms;
    }



    public DisplayFactory getSupportedPlatform(){
        return Platform.getPlatform(supportedPlatforms);
    }
}
