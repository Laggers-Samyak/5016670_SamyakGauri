public class Main {
    public static void main(String[] args) {
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

        payPalAdapter.processPayment(100.0); // Output: Processing payment of $100.0 through PayPal.
        stripeAdapter.processPayment(200.0); // Output: Charging $200.0 using Stripe.
    }
}
