public class Money {
    private long dollars;
    private long cents;

    // Constructor to create a Money object from a double amount
    public Money(double amount) {
        long totalCents = Math.round(amount * 100); // Convert amount to cents

        dollars = totalCents / 100; // Calculate the dollar amount
        cents = totalCents % 100; // Calculate the cent amount
    }

    // Copy constructor to create a duplicate Money object from another Money object
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Method to add another Money object to the current Money object
    public Money add(Money otherAmount) {
        this.dollars += otherAmount.dollars;
        this.cents += otherAmount.cents;
    
        // Normalize cents if it exceeds 100
        if (this.cents >= 100) {
            this.dollars += this.cents / 100;
            this.cents %= 100;
        }
    
        return this;
    }
    
    public Money subtract(Money otherAmount) {
        this.dollars -= otherAmount.dollars;
        this.cents -= otherAmount.cents;
    
        // Normalize cents if it becomes negative
        if (this.cents < 0) {
            this.dollars -= (Math.abs(this.cents) / 100) + 1;
            this.cents = 100 - (Math.abs(this.cents) % 100);
        }
    
        return this;
    }

    // Method to compare the current Money object with another Money object
    public int compareTo(Money otherObject) {
        if (this.dollars < otherObject.dollars) {
            return -1;
        } else if (this.dollars > otherObject.dollars) {
            return 1;
        } else {
            if (this.cents < otherObject.cents) {
                return -1;
            } else if (this.cents > otherObject.cents) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    // Method to check equality between the current Money object and another Money object
    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    // Method to convert the Money object to a string representation
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }
}