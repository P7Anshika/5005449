public class Main {
    public static void main(String[] args) {
        // Create instances of payment gateways
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        // Create adapters
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);

        // Use the adapters to process payments
        payPalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(150.0);
    }
}
