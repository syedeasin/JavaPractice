package ExceptionHandling;

public class DataFetcher {
    public String fetchFromUrl(String url) throws CheckedException{
        if(url == null){
            throw new CheckedException("URL Not Found");
        }
        String data = null;
        return data;
    }
}
