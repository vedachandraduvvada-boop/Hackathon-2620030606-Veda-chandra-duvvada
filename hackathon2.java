
    import java.util.Scanner;
import java.util.Locale;

class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Parameterized constructor
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Calculates the total ticket amount (ticketPrice * numberOfTickets)
    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // Calculates 10% discount if tickets >= 5, otherwise 0
    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    // Calculates final amount after discount
    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    // Displays the complete formatted booking bill
    public void displayBill() {
        System.out.println("Movie Name: " + movieName);
        System.out.printf(Locale.US, "Ticket Price: %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf(Locale.US, "Total Amount: %.2f%n", calculateTotal());
        System.out.printf(Locale.US, "Discount: %.2f%n", calculateDiscount());
        System.out.printf(Locale.US, "Final Amount: %.2f%n", calculateFinalAmount());
    }
}

public class hackathon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input parameters
        String movieName = scanner.nextLine();
        double ticketPrice = scanner.nextDouble();
        int numberOfTickets = scanner.nextInt();

        // Create MovieTicket instance
        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

        // Display bill (invokes calculateTotal, calculateDiscount, calculateFinalAmount internally)
        ticket.displayBill();

        scanner.close();
    }
}

