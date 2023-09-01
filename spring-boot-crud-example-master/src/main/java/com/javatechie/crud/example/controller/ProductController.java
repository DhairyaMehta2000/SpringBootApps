package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ProductController {
	

//    @Autowired
//    private ProductService service;
//
//    @PostMapping("/addProduct")
//    public Product addProduct(@RequestBody Product product) {
//        return service.saveProduct(product);
//    }
//
//    @PostMapping("/addProducts")
//    public List<Product> addProducts(@RequestBody List<Product> products) {
//        return service.saveProducts(products);
//    }
//
//    @GetMapping("/products")
//    public List<Product> findAllProducts() {
//        return service.getProducts();
//    }
//
//    @GetMapping("/productById/{id}")
//    public Product findProductById(@PathVariable int id) {
//        return service.getProductById(id);
//    }
//
//    @GetMapping("/product/{name}")
//    public Product findProductByName(@PathVariable String name) {
//        return service.getProductByName(name);
//    }
//
//    @PutMapping("/update")
//    public Product updateProduct(@RequestBody Product product) {
//        return service.updateProduct(product);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteProduct(@PathVariable int id) {
//        return service.deleteProduct(id);
//    }
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return productService.getProducts();		
	}
	
	@PostMapping("/products/addProduct")
	public Product postAProduct(@RequestBody Product product){
		return productService.postProduct(product);
	}
	
	@GetMapping("/products/{productId}")
	public Product getAProduct(@PathVariable int productId) {
		return productService.getOneProduct(productId);
	}
	
	@PutMapping("/products/updateProduct/{productId}")
	public Product updateAProduct(@RequestBody Product product, @PathVariable int productId){
		return productService.updateOneProduct(product,productId);
	}
	
	@DeleteMapping("products/{productId}")
	public String deleteAProduct(@PathVariable int productId){
		return productService.deleteOneProduct(productId);
	}
}
