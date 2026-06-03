package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private List<CartItem> cart = new ArrayList<>();

    // 1. Get cart items
    @GetMapping("/items")
    public List<CartItem> getItems() {
        return cart;
    }

    // 2. Add item
    @PostMapping("/add")
    public String addItem(@RequestBody CartItem item) {
        cart.add(item);
        return "Item added";
    }

    // 3. Delete item
    @DeleteMapping("/delete/{name}")
    public String deleteItem(@PathVariable String name) {
        cart.removeIf(i -> i.getName().equalsIgnoreCase(name));
        return "Item deleted";
    }

    // 4. Define all APIs
    @GetMapping("/info")
    public String info() {
        return "APIs: /cart/items , /cart/add , /cart/delete/{name} , /cart/info";
    }
}