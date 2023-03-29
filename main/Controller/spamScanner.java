public class spamScanner {
    private String api_key;
    private String database_url;

    public spamScanner(String userInputString, int userInputInt) {
        this.userInputString = userInputString;
        this.userInputInt = userInputInt;
    }

    private String userInputString;
    private int userInputInt;



    public String getApi_key() {
        return api_key;
    }

    public String getDatabase_url() {
        return database_url;
    }

    public int getUserInputInt() {
        return userInputInt;
    }

    public String getUserInputString() {
        return userInputString;
    }



    public void startScanProces(){
        // hier komt code om de user input te vergelijken d.m.v. de geconnecte database.
        System.out.println("De scan gaat nu van start..");
    }

    public void checkIfInputIsSpam(){
        // hier komt code gebaseerd op de output vanuit de database.
    }





}

