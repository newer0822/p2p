package com.newer.p2p.service;

import com.newer.p2p.domain.Investment;
import com.newer.p2p.domain.Product;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    public List<Product> showProduct();

    public Product findById(Integer pid);

    public int updPro(Product product);

    public int insertIn(Investment investment);

    public List<Investment> findByUiid(Integer uiid);

}
