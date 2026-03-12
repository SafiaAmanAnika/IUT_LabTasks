public class HeadChef extends Employee {
    public HeadChef(int id, String name) {
        super(id, name);
    }

    public void prepareOrder(Order order, boolean priority, String chefs, String time) {
        System.out.println("\n--- Kitchen Preparation (Head Chef) ---");
        System.out.println("Reviewing Order #" + order.getOrderId());

        if (priority) {
            order.setPriority(OrderPriority.PRIORITY);
            System.out.println("Order marked as PRIORITY");
        }

        order.setKitchenDetails(chefs, time);
        order.setStatus(OrderStatus.PREPARING);

        System.out.println("Assigned Chefs: " + chefs);
        System.out.println("Estimated Time: " + time);

        order.setStatus(OrderStatus.READY_FOR_DELIVERY);
        System.out.println("Status Updated: READY FOR DELIVERY");
    }
}