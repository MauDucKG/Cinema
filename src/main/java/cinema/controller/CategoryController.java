package cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import cinema.model.Category;
import cinema.service.CategoryService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category_register")
    public String categoryRegister() {
        return "categoryRegister";
    }

    @GetMapping("/available_categories")
    public ModelAndView getAllCategories() {
        List<Category> categoryList = categoryService.getAllCategories();
        return new ModelAndView("categoryList", "category", categoryList);
    }

    @PostMapping("/saveCategory")
    public String addCategory(@ModelAttribute Category category) {
        categoryService.save(category);
        return "redirect:/available_categories";
    }



    @RequestMapping("/deleteCategory/{id}")
    public String deleteCategory(@PathVariable("id") Long id) {
        categoryService.deleteCategory(id);
        return "redirect:/available_categories";
    }
}
