package hw2;

public class Main {

    static int productNumber;
    static String productName;
    static double productPrice;
    static int productQuantity;
    static int dayQuantity;
    static double totalSales;
    static double averageDailySales;

    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {

//       1) за допомогою printf

        productNumber = 1;
        productName = "smartphone";
        productPrice = 1736.201;
        productQuantity = 7;
        dayQuantity = 5;

        totalSales = productPrice * productQuantity;
        averageDailySales = totalSales / dayQuantity;

        System.out.printf("Product No %d: %s,\n" +
                        "total sales for %d days is %s %.2f,\n" +
                        "sales by day is %s %.2f.\n\n",
                productNumber, productName, dayQuantity, CURRENCY, totalSales, CURRENCY, averageDailySales);

//       2) за допомогою String.format

        productNumber = 2;
        productName = "laptop";
        productPrice = 2097.37;
        productQuantity = 5;
        dayQuantity = 7;

        totalSales = productPrice * productQuantity;
        averageDailySales = totalSales / dayQuantity;

        String totalSalesPrint = String.format("%.2f", totalSales);
        String averageDailySalesPrint = String.format("%.2f", averageDailySales);

        System.out.println("Product No " + productNumber + ": " + productName + "," + "\n" +
                "total sales for " + dayQuantity + " days is " + CURRENCY + " " + totalSalesPrint + "," + "\n" +
                "sales by day is " + CURRENCY + " " + averageDailySalesPrint + "." + "\n");

    }
}


