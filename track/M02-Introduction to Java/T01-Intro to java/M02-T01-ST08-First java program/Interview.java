
public class Interview {

    public static void main(String[] args) {
        int roundCode = 4;
        int attemptsUsed = 2;
        int maxAttempts = 3;
        String roundName;
        switch (roundCode) {
            case 1:
                System.out.println("Current Round: Aptitude Round");
                break;
            case 2:
                System.out.println("Current Round: Technical Round");
                break;
            case 3:
                System.out.println(roundName = "Current Round: Technical Round");
                break;
            case 4:
            case 5:
                System.out.println("Current Round: HR Round");
                break;
            default:
                System.out.println("Invalid Round Code");
                break;

        }
        String limitThere = attemptsUsed <= maxAttempts ? "Attempt Available" : "Attempt Limit Reached";
        System.out.println("Attempt Status: " + limitThere);
    }
}
