package com.example.springapp.serviceabu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.modelabu.Productabu;
import com.example.springapp.repositoryabu.ProductRepoabu;

@Service
public class ProductService {
    @Autowired
    private ProductRepoabu productRepo;

    public boolean saveProduct(Productabu product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<Productabu> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public Productabu updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public Productabu deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}