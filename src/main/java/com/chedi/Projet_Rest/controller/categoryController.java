package com.chedi.Projet_Rest.controller;

import com.chedi.Projet_Rest.model.Category;
import com.chedi.Projet_Rest.service.categoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class categoryController {

    private final categoryService categoryService1;

    public categoryController(categoryService categoryService1) {
        this.categoryService1 = categoryService1;
    }


    @GetMapping("/categories")
    public List<Category> getProducts(){
        return categoryService1.getAllCategories();
    }

    @PostMapping("/addCategory")
    public @ResponseBody Category addProduct(@RequestBody Category c){
        return categoryService1.addCategory(c);
    }

    @DeleteMapping("/category/{id}")
    public void deleteProduct(@PathVariable int id){
        categoryService1.deleteCategory(id);
    }

    @PatchMapping("/updateCategory")
    public @ResponseBody Category updateProduct(@RequestBody Category c){
        return categoryService1.updateCategory(c);
    }

    @GetMapping("/category/{id}")

    public Category getProductById(@PathVariable int id){
        return categoryService1.getCategoryById(id);
    }

}
