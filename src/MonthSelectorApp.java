import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");

        // declare monthNames and monthSales arrays
        String[] monthNames = new String[12];
        monthNames[0] = "January";
        monthNames[1] = "February";
        monthNames[2] = "March";
        monthNames[3] = "April";
        monthNames[4] = "May";
        monthNames[5] = "June";
        monthNames[6] = "July";
        monthNames[7] = "August";
        monthNames[8] = "September";
        monthNames[9] = "October";
        monthNames[10] = "November";
        monthNames[11] = "December";

        double[] monthSales = new double[12];
        monthSales[0] = 1000.32;
        monthSales[1] = 2000.42;
        monthSales[2] = 3000.21;
        monthSales[3] = 4000.89;
        monthSales[4] = 5000.76;
        monthSales[5] = 6000.53;
        monthSales[6] = 7000.30;
        monthSales[7] = 8000.26;
        monthSales[8] = 9000.52;
        monthSales[9] = 1000.95;
        monthSales[10] = 1100.40;
        monthSales[11] = 1200.20;

        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");

            // validate input
            if (monthNumber < 1 || monthNumber > monthNames.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;
            }

            // get the index number for the month
            // and display the month name and sales
            int monthIndex = monthNumber - 1;
            Console.displayLine("Sales for " + monthNames[monthIndex] +
                    ": " + currency.format(monthSales[monthIndex]) + "\n");

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }

        // display the total sales for the year
        double sum = 0.0;
//        for (int i = 0; i < monthSales.length; i++) {
//            sum += monthSales[i];
//        }

        for (double sales : monthSales) {
            sum += sales;
        }
        Console.displayLine("Total sales: " + currency.format(sum));

        Console.displayLine();
    }

}
