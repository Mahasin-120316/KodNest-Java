import java.util.Scanner;

class WaterTank {
    int capacity;
    int currentLevel;

    WaterTank(int capacity) {
        this.capacity = capacity;
        this.currentLevel = 0;
    }

    WaterTank(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    int fillWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int availableSpace = capacity - currentLevel;
        int addedAmount;
        if (amount > availableSpace) {
            addedAmount = availableSpace;
        } else {
            addedAmount = amount;
        }
        currentLevel += addedAmount;
        return addedAmount;
    }

    int drainWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int removedAmount;
        if (amount > currentLevel) {
            removedAmount = currentLevel;
        } else {
            removedAmount = amount;
        }
        currentLevel -= removedAmount;
        return removedAmount;
    }

    String getStatus() {
        if (currentLevel == 0) {
            return "Empty";
        }
        if (currentLevel == capacity) {
            return "Full";
        }
        double fillPercentage = currentLevel * 100.0 / capacity;
        if (fillPercentage < 25.0) {
            return "Low";
        } else if (fillPercentage <= 75.0) {
            return "Medium";
        } else {
            return "High";
        }
    }

    void displayTank() {
        int availableSpace = capacity - currentLevel;
        System.out.println("Capacity: " + capacity);
        System.out.println("Current Level: " + currentLevel);
        System.out.println("Available Space: " + availableSpace);
        System.out.println("Status: " + getStatus());
    }
}

public class Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        int currentLevel = sc.nextInt();
        int operationCount = sc.nextInt();
        WaterTank tank = new WaterTank(capacity, currentLevel);
        for (int operation = 1; operation <= operationCount; operation++) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int fillAmount = sc.nextInt();
                    int added = tank.fillWater(fillAmount);
                    System.out.println("Operation " + operation + " -Filled: " + added);
                    break;
                case 2:
                    int drainAmount = sc.nextInt();
                    int removed = tank.drainWater(drainAmount);
                    System.out.println("Operation " + operation + " -Drained: " + removed);
                    break;
                case 3:
                    System.out.println("Operation " + operation + " -Tank Status:");
                    tank.displayTank();
                    break;
                default:
                    System.out.println("Operation " + operation + " - Invalid Choice");
            }
        }
        System.out.println("Final Tank Status");
        tank.displayTank();

        sc.close();
    }
}
