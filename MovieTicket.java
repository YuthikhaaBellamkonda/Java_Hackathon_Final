public class MovieTicket {
    String movieName, customerName;
    double ticketPrice;
    int numberOfTickets;

    MovieTicket() {
        movieName = "Not Selected";
        customerName = "Guest";
        ticketPrice = 0;
        numberOfTickets = 0;
    }

    MovieTicket(String m, String c, double p, int n) {
        movieName = m;
        customerName = c;
        ticketPrice = p;
        numberOfTickets = n;
    }

    void bookTickets(int n) {
        numberOfTickets = n;
    }

    void bookTickets(int n, String c) {
        numberOfTickets = n;
        customerName = c;
    }

    void display() {
        if (numberOfTickets <= 0) {
            System.out.println("Invalid number of tickets");
            return;
        }

        double total = ticketPrice * numberOfTickets;
        double discount = 0;

        if (numberOfTickets >= 5) {
            discount = total * 0.10;
        }

        System.out.println("Movie Name: " + movieName.toUpperCase());
        System.out.println("Customer Name: " + customerName.toUpperCase());
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + (total - discount));
    }

    public static void main(String[] args) {
        MovieTicket b1 = new MovieTicket(
            "Avatar", "Yuthikhaa", 200, 6
        );

        b1.display();

        System.out.println();

        MovieTicket b2 = new MovieTicket();
        b2.movieName = "Avengers";
        b2.ticketPrice = 150;

        b2.bookTickets(3);
        b2.bookTickets(3, "Slesha");

        b2.display();

        System.out.println();

        if (b1.customerName.equalsIgnoreCase(b2.customerName)) {
            System.out.println("Same Customer");
        } else {
            System.out.println("Different Customers");
        }
    }
}