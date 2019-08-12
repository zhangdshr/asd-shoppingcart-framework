package com.example.demo.controller;

import com.sdm.shoppingcart.api.BuyerAPIImpl;
import com.sdm.shoppingcart.model.CartItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cart")
public class CartController {
    private BuyerAPIImpl buyerAPI = new BuyerAPIImpl();
    @RequestMapping("addProduct")
    public CartItem addProduct(@RequestBody CartItem cartItem) {
        buyerAPI.addProductToShoppingCart(cartItem);
        return cartItem;
    }

    @RequestMapping("cancel")
    public ResponseEntity cancelAdd(){
        buyerAPI.cancelAddProductToShoppingCart();
        return new ResponseEntity("success", HttpStatus.OK);
    }

    @RequestMapping("edit")
    public ResponseEntity editProductCountById(@RequestBody CartItem cartItem){
        buyerAPI.editProductCountById(cartItem);
        return new ResponseEntity("success", HttpStatus.OK);
    }

    @RequestMapping("remove")
    public ResponseEntity removeProductById(@RequestParam long cartItem_id){
        buyerAPI.removeProductFromShoppingCart(cartItem_id);
        return new ResponseEntity("success", HttpStatus.OK);
    }

    @RequestMapping("list")
    public List<CartItem> getCartItemListInShoppingList(@RequestParam long uid){
        buyerAPI.getCartItemListInShoppingList(uid);
        return buyerAPI.getCartItemListInShoppingList(uid);
    }
}
