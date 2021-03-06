package pl.coderslab.day2;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {

    private List<CartItem> cartItems = new ArrayList<>();

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public void addToCart(CartItem cartItem) {
        boolean isNew = true;
        for (CartItem item : cartItems) {
            if (item.getProduct().getName().equals(cartItem.getProduct().getName())) {
                item.setQuantity(item.getQuantity() + 1);
                isNew = false;
            }
        }

        if (isNew) {
            cartItems.add(cartItem);
        }
    }

//    public void addToCartStream(CartItem cartItem) {
//        cartItems.stream()
//                .filter(a -> a.getProduct().getName().equals(cartItem.getProduct().getName())).findFirst()
//                .ifPresent(c -> c.setQuantity(c.getQuantity()));
//
//    }

}
