public class TicketBooking {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        Customer c1 = new Customer(counter, "Customer 1");
        Customer c2 = new Customer(counter, "Customer 2");
        Customer c3 = new Customer(counter, "Customer 3");

        c1.start();
        c2.start();
        c3.start();
    }
}
class TicketCounter {
    private int tickets = 10;

    public synchronized void bookTickets(String customer, int requested) {
        System.out.println(customer + " wants " + requested + " tickets.");

        if (tickets >= requested) {
            tickets -= requested;
            System.out.println(customer + " booked "
                    + requested + " tickets successfully.");
            System.out.println("Remaining tickets: " + tickets);
        } else {
            System.out.println("Booking failed for " + customer
                    + ". Only " + tickets + " tickets available.");
        }
    }
}

class Customer extends Thread {
    private TicketCounter counter;
    Customer(TicketCounter counter, String name) {
        super(name);
        this.counter = counter;
    }
    public void run() {
        counter.bookTickets(getName(), 4);
    }
}


