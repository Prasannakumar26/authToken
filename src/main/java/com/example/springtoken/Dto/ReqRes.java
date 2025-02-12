package com.example.springtoken.Dto;


import com.example.springtoken.Entity.OurUsers;
import com.example.springtoken.Entity.Products;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReqRes {
    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshtoken;
    private String expirationTime;
    private String name;
    private String email;
    private String role;
    private  String password;
    private List<Products> products;
    private OurUsers ourUsers;
}
