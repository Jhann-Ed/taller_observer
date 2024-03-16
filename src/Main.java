import interfaces.Observer;
import services.Inventory;
import services.PaymentService;
import services.ShoppingCart;
import services.User;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        Observer shoppingCart = new ShoppingCart();
        Observer inventory = new Inventory();
        Observer user = new User();

        paymentService.regiterObserver(shoppingCart);
        paymentService.regiterObserver(inventory);
        paymentService.regiterObserver(user);

        paymentService.completePayment();

    }
}