package com.newer.p2p.service;

import com.newer.p2p.domain.Investment;
import com.newer.p2p.domain.Product;
import com.newer.p2p.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> showProduct() {
        return productMapper.showProduct();
    }

    @Override
    public Product findById(Integer pid){
        return productMapper.findById(pid);
    }

    @Override
    public int updPro(Product product){
        return productMapper.updPro(product);
    }

    @Override
    public int insertIn(Investment investment){
        return productMapper.insertIn(investment);
    }

    @Override
    public List<Investment> findByUiid(Integer uiid){
        return productMapper.findByUiid(uiid);
    }
}
