public class OrderService {
    public void save(Order order){
        Helper.getConnection().save();
    }
}
