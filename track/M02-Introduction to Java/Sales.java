import java.util.Scanner;

class SalesAnalyzer {
    double[] dailySales;

    SalesAnalyzer(double[] dailySales) {
        this.dailySales = dailySales;
    }

    double calculateTotal() {
        double total = 0;
        for (int i = 0; i < dailySales.length; i++) {
            total = total + dailySales[i];
        }
        return total;
    }

    double calculateAverage() {
        double total = calculateTotal();
        double average = total / dailySales.length;
        return average;
    }

    int findHighestSalesDay() {
        int day = 1;
        double max = dailySales[0];
        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] > max) {
                max = dailySales[i];
                day = i + 1;
            }
        }
        return day;
    }

    int findLowestSalesDay() {
        int day = 1;
        double min = dailySales[0];
        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] < min) {
                min = dailySales[i];
                day = i + 1;
            }
        }
        return day;
    }

    int countAboveAverageDays() {
        double average = calculateAverage();
        int count = 0;
        for (int i = 0; i < dailySales.length; i++) {
            if (dailySales[i] > average) {
                count++;
            }
        }
        return count;
    }

    void displayReport() {
        double total = calculateTotal();
        double average = calculateAverage();
        int highestDay = findHighestSalesDay();
        int lowestDay = findLowestSalesDay();
        double highestSales = dailySales[highestDay - 1];
        double lowestSales = dailySales[lowestDay - 1];
        int aboveAvg = countAboveAverageDays();

        System.out.println("Number of Days: " + dailySales.length);
        System.out.println("Total Sales: " + total);
        System.out.println("Average Sales: " + average);
        System.out.println("Highest Sales Day: " + highestDay);
        System.out.println("Highest Sales: " + highestSales);
        System.out.println("Lowest Sales Day: " + lowestDay);
        System.out.println("Lowest Sales: " + lowestSales);
        System.out.println("Days Above Average: " + aboveAvg);
    }
}

public class Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = scanner.nextInt();
        double[] sales = new double[numberOfDays];

        for (int i = 0; i < numberOfDays; i++) {
            sales[i] = scanner.nextDouble();
        }

        SalesAnalyzer analyzer = new SalesAnalyzer(sales);
        analyzer.displayReport();

        scanner.close();
    }
}

