import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void yardSaleWholeSale(String name, double price, int quantity){
        double total = quantity * price;
        Date date = new Date();
        SimpleDateFormat simpleDate = new SimpleDateFormat("EEEE, MMMMM dd, y");
        String formattedDate = simpleDate.format(date);

        StringBuilder receipt = new StringBuilder();
        receipt.append("----------------------------------------------\n");
        receipt.append(String.format("Name %-5c Qty %<-5c Price %<-5c Total",'\t'));
        receipt.append(String.format("%c%-5s %-5s %-5s %-5s", '\n',"----\t\t", "---\t\t", "-----\t\t", "-------\n"));
        receipt.append(String.format("%-5s \t\t %-1d \t\t %c%.1f \t\t %c%.2f", name, quantity, '$', price, '$', total));
        receipt.append(String.format("\n\n\t\tThank you. Come again!!!\n\nPurchased on: %s", formattedDate));
        receipt.append("\n----------------------------------------------");

        System.out.println(receipt);
    }


    public static void main(String[] args) {
        yardSaleWholeSale("Rice", 5.0, 20);
    }
}
