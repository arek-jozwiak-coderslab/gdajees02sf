package pl.coderslab.day2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
public class CartController {

    private final Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @RequestMapping("/addtocart")
    @ResponseBody
    public String addtocart(Model model) {
        Random rand = new Random();
        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
        return "addtocart";
    }

    @RequestMapping("/cart")
    @ResponseBody
    public String cart() {
        StringBuilder stringBuilder = new StringBuilder();
        for (CartItem cartItem : cart.getCartItems()) {
            stringBuilder.append(cartItem.getQuantity() + " ");
            stringBuilder.append(cartItem.getProduct());
            stringBuilder.append("<br/>");
        }
        return "cart:" + stringBuilder.toString();
    }
}
