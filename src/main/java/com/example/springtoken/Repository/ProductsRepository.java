package com.example.springtoken.Repository;

import com.example.springtoken.Entity.OurUsers;
import com.example.springtoken.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<Products,Long> {

}
