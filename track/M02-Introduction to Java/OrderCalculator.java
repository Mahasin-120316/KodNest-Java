
    class OrderCalculator {
    int calculateSubtotal(int price, int quantity) {
        int subtotal = price * quantity;
        return subtotal;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        int finalTotal = subtotal + deliveryCharge;
        return finalTotal;
    }


    public static void main(String[] args) {
        OrderCalculator c = new OrderCalculator();
        int subtotal = c.calculateSubtotal(100, 2);
        int finalTotal = c.calculateFinalTotal(subtotal, 50);

        System.out.println("Subtotal = " + subtotal);
        System.out.println("Final Total = " + finalTotal);
    }
}


