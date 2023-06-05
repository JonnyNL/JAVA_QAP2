public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor to initialize the credit card with the card holder and credit limit
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0);
    }

    // Getter method to retrieve the balance
    public Money getBalance() {
        Money secureBalance = new Money(this.balance);
        return secureBalance;
    }

    // Getter method to retrieve the credit limit
    public Money getCreditLimit() {
        Money secureCredLim = new Money(this.creditLimit);
        return secureCredLim;
    }

    // Method to retrieve the personal information of the card holder
    public String getPersonals() {
        return owner.toString();
    }

    // Method to charge an amount to the credit card
    public void charge(Money amount) {
        Money newBalance = new Money(balance); // Create a new Money object
        newBalance.add(amount); // Perform the addition

        if (newBalance.compareTo(creditLimit) == 1) {
            System.out.println("Charge exceeds credit limit");
        } else {
            this.balance = newBalance; // Update the balance with the new value
        }
    }

    // Method to make a payment on the credit card
    public void payment(Money amount) {
        this.balance = balance.subtract(amount);
    }
}