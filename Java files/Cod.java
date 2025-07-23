// Interface for payment methods
interface PaymentMethod {
    void processPayment(double amount);
}

// Implementation for Credit Card payment
class CreditCardPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// Implementation for PayPal payment
class PaypalPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// Implementation for Bitcoin payment
class BitcoinPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}

// PaymentProcessor class that uses PaymentMethod
class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}

// Main class to test payment processing
public class Cod {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PaypalPayment();
        PaymentMethod bitcoin = new BitcoinPayment();

        processor.processPayment(creditCard, 150.0);
        processor.processPayment(paypal, 250.0);
        processor.processPayment(bitcoin, 350.0);
    }
}
