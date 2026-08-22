import java.util.Scanner;

class TheatreBooking {
    int[] seats;
    int bookedCount;

    TheatreBooking(int totalSeats) {
        seats = new int[totalSeats];
        bookedCount = 0;
    }

    String bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            return "Invalid Seat";
        }
        int index = seatNumber - 1;
        if (seats[index] == 1) {
            return "Already Booked";
        }
        seats[index] = 1;
        bookedCount++;
        return "Booked";
    }

    int getAvailableCount() {
        int availableCount = seats.length - bookedCount;
        return availableCount;
    }

    void displaySeatStatus() {
        System.out.println("Seat Status");
        for (int i = 0; i < seats.length; i++) {
            String status = (seats[i] == 1)? "Booked" : "Available";
            System.out.println("Seat " + (i + 1) + ": " + status);
        }
    }
}

public class Theatre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSeats = scanner.nextInt();
        int numRequests = scanner.nextInt();

        TheatreBooking tb = new TheatreBooking(totalSeats);

        for (int i = 1; i <= numRequests; i++) {
            int seatNum = scanner.nextInt();
            String result = tb.bookSeat(seatNum);
            System.out.println("Request " + i + " - Seat " + seatNum + ": " + result);
        }

        tb.displaySeatStatus();
        System.out.println("Booked Seats: " + tb.bookedCount);
        System.out.println("Available Seats: " + tb.getAvailableCount());

        scanner.close();
    }
}
