public class apiHealthChecker {

    private boolean apiIsStillAlive;

    apiHealthChecker(boolean apiIsStillAlive){
        this.apiIsStillAlive = apiIsStillAlive;
    }

    public void checkIfApiIsAlive(){
        if (true) {
            apiIsStillAlive = true;
        }
    }


}
