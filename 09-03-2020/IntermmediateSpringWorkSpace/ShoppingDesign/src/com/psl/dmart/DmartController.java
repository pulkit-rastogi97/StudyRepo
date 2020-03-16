package com.psl.dmart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.dmart.bean.Login;
import com.psl.dmart.bean.Product;
import com.psl.dmart.service.LoginService;
import com.psl.dmart.service.ProductService;

@Controller
public class DmartController {

	@Autowired
	LoginService loginService;
	
	@Autowired
	ProductService productService;
	
	static List<Product> cart = new ArrayList<Product>();
	
	static HashMap<Integer,Product> products = new HashMap<Integer, Product>();
	
	@RequestMapping("index")
	public String gotToHome()
	{
		return "home";
	}
	
	@RequestMapping("loginF")
	public String goToLogin(Model model)
	{
		Login login = new Login();
		model.addAttribute("loginUser",login);
		return "loginPage";
		
	}
	
	@RequestMapping("loginPage")
	public String loginUser(@ModelAttribute("loginUser") @Valid Login login, BindingResult result, Model model)
	{
		if(result.hasErrors())
		{
			System.out.println("print");
			return "loginPage";
		}
		else
		{
			Boolean isValidated = loginService.validateUser(login);
			if(isValidated)
			{
				products =  productService.getAllProducts();
				model.addAttribute("products",products);
				
				return "showAllProducts";
			}
			else
			{
				System.out.println("not user");
				return "loginPage";
			}
		}
	}
	
	@RequestMapping("addToCart")
	public String addToCart(@RequestParam("id") int id, Model model)
	{
		productService.addToCart(id);
		model.addAttribute("products",products);
		model.addAttribute("viewCart",productService.displayCartItems());
		return "showAllProducts";
	}
	
	@RequestMapping("removeFromCart")
	public String removeFromCart(@RequestParam("id") int id, Model model)
	{
		
		productService.removeFromCart(id);
		model.addAttribute("products",products);
		model.addAttribute("viewCart",productService.displayCartItems());
		return "showAllProducts";
		
	}
}
