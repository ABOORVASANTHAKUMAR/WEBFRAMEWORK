package com.example.day5cw1.serviceabu;

import org.springframework.stereotype.Service;

import com.example.day5cw1.modelabu.Productabu;
import com.example.day5cw1.repositoryabu.ProductRepoabu;

@Service
public class ProductServiceabu {
    public ProductRepoabu productRepo;
    public ProductServiceabu(ProductRepoabu productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(Productabu product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,Productabu product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public Productabu getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
