package com.example.demo.controller;

import com.sdm.shoppingcart.api.SellerAPIImpl;
import com.sdm.shoppingcart.factory.ProductFactory;
import com.sdm.shoppingcart.model.Category;
import com.sdm.shoppingcart.model.Product;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    private SellerAPIImpl sellerAPI = new SellerAPIImpl();

    @RequestMapping("/save")
    public Category save(@RequestBody Category category) {
        return sellerAPI.addCategory(category);
    }

    @RequestMapping("/remove")
    public Category remove(@RequestParam long id) {
        sellerAPI.removeCategory(id);
        return null;
    }

    @RequestMapping("/list")
    public List getCategoryList() {
        return sellerAPI.getCategoryList();
    }

    @RequestMapping("/productlist")
    public List getProductListByCategoryId(@RequestParam long id) {
        return sellerAPI.getProductListByCategoryId(id);
    }
}
