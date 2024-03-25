package com.example.springtoken.Controller;


import com.example.springtoken.Dto.ReqRes;
import com.example.springtoken.Entity.Products;
import com.example.springtoken.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

@Autowired
private ProductsRepository productsRepository;
    @PostMapping("/admin/addproduct")
    public ResponseEntity<Products> saveProduct(@RequestBody ReqRes reqRes){
        Products productName = new Products();
        productName.setName(reqRes.getName());
        return ResponseEntity.ok(productsRepository.save(productName));
    }
}
