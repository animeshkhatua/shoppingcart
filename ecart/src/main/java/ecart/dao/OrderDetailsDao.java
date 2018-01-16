package ecart.dao;

import java.util.List;

import ecart.model.OrderDetails;
import ecart.model.User;

public interface OrderDetailsDao {

	
	public OrderDetails getOrderDetailsByOrderDetailsId(int orderDetails);
	public boolean updateOrderDetails(OrderDetails orderDetails);
	public boolean deleteOrderDetails(OrderDetails orderDetails);
	public boolean insertOrderDetails(OrderDetails orderDetails);
	public List<OrderDetails> getOrderDetailsListByUser (User user);
}
