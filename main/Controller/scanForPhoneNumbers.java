public class scanForPhoneNumbers extends spamScanner {

    public scanForPhoneNumbers(String userInputString, int userInputInt) {
        super(userInputString, userInputInt);
    }
    @Override
    public void startScanProces(){
        // hier komt code om de user input te vergelijken d.m.v. de geconnecte database.
        System.out.println("Scantype telefoon nummer is geselecteerd.");
        System.out.println("De scan gaat nu van start..");
        System.out.println("");
    }
}
