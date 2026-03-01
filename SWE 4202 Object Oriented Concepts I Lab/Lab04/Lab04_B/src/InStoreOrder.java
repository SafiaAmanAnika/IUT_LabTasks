public class InStoreOrder extends Order {
    
    @Override
    public void processOrder() {
        System.out.println("Processing an in-store pickup order.");
    }
}