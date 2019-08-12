package com.example.demo.controller;

import com.sdm.shoppingcart.api.SellerAPIImpl;
import com.sdm.shoppingcart.factory.ProductFactory;
import com.sdm.shoppingcart.model.Product;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("product")
public class ProductController {
    private SellerAPIImpl sellerAPI = new SellerAPIImpl();

    @RequestMapping("save")
    public Product save(@RequestBody Product product) {
        System.out.println(product);
        return sellerAPI.addProduct(product);
    }


    @RequestMapping("/remove")
    public Product remove(@RequestParam long id) {
        sellerAPI.removeProduct(id);
        return null;
    }

    @RequestMapping("/list")
    public List getProductList() {
        return sellerAPI.getAllProducts();
    }
}

