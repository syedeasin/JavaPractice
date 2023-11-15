package ExceptionHandling;

public class DataFetcherDemo {
    public static void main(String[] args){
        DataFetcher dataFetcher = new DataFetcher();
        String url = "https://google.com";

        try {
            dataFetcher.fetchFromUrl(url);
        } catch (CheckedException e) {
            System.out.println("Unable to fetch data");
        }
    }
}