package com.shinhands.mu.Stationary.controller;

import com.shinhands.mu.Stationary.dto.ProductDTO;
import com.shinhands.mu.Stationary.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value="api/products")
public class ProductController
{
    @Autowired
    ProductService productService;
    @RequestMapping(value="",method= RequestMethod.GET)
    public ResponseEntity getAllProducts()
    {
        return ResponseEntity.ok().body(productService.getAllProducts());
    }
    @PostMapping()
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO)
    {
        return ResponseEntity.ok().body(productService.addProduct(productDTO));
    }
    @GetMapping(value="/{id}")
    public ResponseEntity getProductById(@PathVariable(name="id") long id)
    {
        return ResponseEntity.ok().body(productService.getProductById(id));
    }
    @GetMapping(value="idcart/{id}")
    public ResponseEntity getApiCartProduct(@PathVariable(name="id") long id)
    {
        return ResponseEntity.ok().body(productService.getApiCartProduct(id));
    }

    @GetMapping(value="offset/{offset}")
    public ResponseEntity getbyOffset(@PathVariable(name="offset") long offset)
    {
        return ResponseEntity.ok().body(productService.getProductFetch(offset));
    }


    @PutMapping(value="/{id}")
    public ResponseEntity updateProduct(@PathVariable(name="id") long id,@RequestBody ProductDTO productDTO)
    {
        return ResponseEntity.ok().body(productService.updateProduct(id,productDTO));
    }
    @DeleteMapping(value="/{id}")
    public ResponseEntity deleteProduct(@PathVariable(name="id") long id)
    {
        return ResponseEntity.ok().body(productService.deleteProduct(id));
    }
    @RequestMapping(value="count",method= RequestMethod.GET)
    public int countProduct()
    {
        return productService.countProduct();
    }

}
