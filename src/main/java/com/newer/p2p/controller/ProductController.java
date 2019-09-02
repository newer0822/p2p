package com.newer.p2p.controller;

import com.newer.p2p.domain.Investment;
import com.newer.p2p.domain.Product;
import com.newer.p2p.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("showProduct")
    public List<Product> showProduct(){
        List<Product> products = productService.showProduct();
        return products;
    }

    @RequestMapping("findByid")
    public Product findById(Integer pid){
        Product product = productService.findById(pid);
        return product;
    }

    @RequestMapping("updById")
    public int updById(Product product){
        int count = productService.updPro(product);
        return count;
    }

    @RequestMapping("insertIn")
    public int insertIn(Investment investment){
        int count = productService.insertIn(investment);
        return count;
    }

    @RequestMapping("findByUiid")
    public List<Investment> findByUiid(Integer uiid){
        List<Investment> investment= productService.findByUiid(uiid);
        return investment;
    }
}
