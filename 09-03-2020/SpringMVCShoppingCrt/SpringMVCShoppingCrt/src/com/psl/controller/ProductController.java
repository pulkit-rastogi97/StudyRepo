package com.psl.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.bean.Login;
import com.psl.bean.Product;
import com.psl.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService service;
	
	static List<Product> prodlist=new ArrayList<Product>();
	static List<Product> cartList = new ArrayList<Product>();
	
	
	@RequestMapping("index")
	public String goTologin(Model model)
	{
		Login newLogin=new Login();
		model.addAttribute("newLogin",newLogin);
		return "login";
	}
	
	@RequestMapping("login")
	public String goToLogin(@ModelAttribute("newLogin")@Valid Login login1,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "login";
		}
		else{
		boolean check=service.validate(login1.getUsername(),login1.getPassword());
		//model.addAttribute("loginRef",check);
		if(check)
		{
		
			prodlist=service.showAllProducts();
			model.addAttribute("prodlist", prodlist); 
			return "showallprod";
		}
		else
		{
			return "login";
		}
		}
	}
	
	@RequestMapping("add")
	public String addProduct(@RequestParam("productId")int id,Model model)
	{
		Product prod=service.getproductbyId(id);
		System.out.println((cartList.add(prod)));
		model.addAttribute("prodlist", prodlist);
		return "showallprod";
	}
	
	@RequestMapping("showcart")
	public String showmycart(Model model)
	{
		model.addAttribute("cartList",cartList);
		return "mycart";
    }
	
	@RequestMapping("delprod")
	public String delProduct(@RequestParam("productId")int id,Model model)
	{
		Product prod=service.getproductbyId(id);
		System.out.println(prod);
//		List<Product> toRemove = new ArrayList<Product>();
//		toRemove.add(prod);
		for(Product product : cartList)
		{
			System.out.println(product);
		}
		boolean c = cartList.contains(prod);
		System.out.println(c);
		System.out.println("**********************");
		for(Product product : cartList)
		{
			System.out.println(product);
		}
		System.out.println("**********************");

		model.addAttribute("cartList", cartList);
		
		return "mycart";
	}
	
}
