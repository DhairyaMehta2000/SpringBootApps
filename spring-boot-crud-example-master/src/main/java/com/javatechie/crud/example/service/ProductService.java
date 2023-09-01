package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
//    @Autowired
//    private ProductRepository repository;
//
//    public Product saveProduct(Product product) {
//        return repository.save(product);
//    }
//
//    public List<Product> saveProducts(List<Product> products) {
//        return repository.saveAll(products);
//    }
//
//    public List<Product> getProducts() {
//        return repository.findAll();
//    }
//
//    public Product getProductById(int id) {
//        return repository.findById(id).orElse(null);
//    }
//
//    public Product getProductByName(String name) {
//        return repository.findByName(name);
//    }
//
//    public String deleteProduct(int id) {
//        repository.deleteById(id);
//        return "product removed !! " + id;
//    }
//
//    public Product updateProduct(Product product) {
//        Product existingProduct = repository.findById(product.getId()).orElse(null);
//        existingProduct.setName(product.getName());
//        existingProduct.setQuantity(product.getQuantity());
//        existingProduct.setPrice(product.getPrice());
//        return repository.save(existingProduct);
//        
//    }
//
	@Autowired
	ProductRepository productRepo;

	public List<Product> getProducts(){
	return productRepo.findAll();
	}
	
	public Product postProduct(Product product) {
		return productRepo.save(product);
	}
	
	public Product getOneProduct(int productId) {
		return productRepo.findById(productId).orElse(null);
	}
	
	public Product updateOneProduct(Product product, int productId) {
		Product product_to_update = productRepo.findById(productId).orElse(null);
		
		if(product_to_update!=null) {
			product_to_update.setName(product.getName());
			product_to_update.setPrice(product.getPrice());
			product_to_update.setQuantity(product.getQuantity());
			return productRepo.save(product_to_update);
		}
		else {
			return null;
		}
	}
	
	public String deleteOneProduct(int productId) {
		 productRepo.deleteById(productId);
		 return "Product with Id "+ productId + " deleted";
		
	}
}
