public class Main {
    public static void main(String[] args) {
        Order o1 = new Order();
        Order o2 = new OnlineOrder();
        Order o3 = new InStoreOrder();

        o1.processOrder();
        o1.processOrder("ORD123");
        o1.processOrder("ORD124", true);
        o2.processOrder();
        o2.processOrder("ORD125");
        o3.processOrder();
    }
}