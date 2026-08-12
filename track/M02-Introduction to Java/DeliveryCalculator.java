public class DeliveryCalculator {
    int calculateCharge(int distance){
        int res = distance * 5;
        return res;
    }
    int calculateCharge(int distance, int expressFee){
        int res1 = distance * 5 + expressFee;
        return res1;
    }

    public static void main(String[] args) {
        DeliveryCalculator d = new DeliveryCalculator();
        int res = d.calculateCharge(10);
        int res1 = d.calculateCharge(10, 5);
        System.out.println("Standard Charge: " + res);
        System.out.println("ExpressFee: " + res1);
    }
}
