public class databaseConnection {

    private String apiKey;


    private String databaseUrlConnection;

    public databaseConnection(String apiKey, String databaseUrlConnection) {
        this.apiKey = apiKey;
        this.databaseUrlConnection = databaseUrlConnection;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getDatabaseUrlConnection() {
        return databaseUrlConnection;
    }




}
