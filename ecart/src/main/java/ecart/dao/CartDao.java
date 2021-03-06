package ecart.dao;

import java.util.List;

import ecart.model.Cart;
import ecart.model.User;

public interface CartDao {

	public boolean insertCart(Cart cart);
	public boolean deleteCart(Cart cart);
	public boolean updateCart(Cart cart);
	public List<Cart> getAllCart();
	public Cart getCartByUser(User user);
	public Cart getCartByCartId(int cartId);
	
	
}
