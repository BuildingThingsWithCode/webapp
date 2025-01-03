package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Product;
import service.ProductService;

@Controller
public class ProductsController {

	private final ProductService productService;

	public ProductsController(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping("/products")
	public String viewProducts(Model model) {
		List<Product> products = productService.findAll();
		model.addAttribute("products", products);
		return "products.html";
	}
	
	@RequestMapping(path = "/products", method = RequestMethod.POST)
	public String addProduct(@RequestParam String name, @RequestParam double price, Model model) {
		Product p = new Product();
		p.setName(name);
		p.setPrice(price);
		productService.addProduct(p);
		List<Product> products = productService.findAll();
		model.addAttribute("products", products);
		return "products.html";
	}
}
