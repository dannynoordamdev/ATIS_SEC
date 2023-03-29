public class scanForemailAdress extends spamScanner {

    public scanForemailAdress(String userInputString, int userInputInt) {
        super(userInputString, userInputInt);
    }
    @Override
    public void startScanProces(){
        // hier komt code om de user input te vergelijken d.m.v. de geconnecte database.
        System.out.println("Scantype email adress is geselecteerd.");
        System.out.println("De scan gaat nu van start..");
        System.out.println("");
    }

}
