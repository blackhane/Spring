package kr.co.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.bookStore.Service.CustomerService;
import kr.co.bookStore.vo.CustomerVO;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	//목록
	@GetMapping("/customer/list")
	public String list(Model model) {
		List<CustomerVO> customers = service.selectCustomers();
		model.addAttribute("customers", customers);
		return "/customer/list";
	}
	//등록
	@GetMapping("/customer/register")
	public String register() {
		return "/customer/register";
	}
	@PostMapping("/customer/register")
	public String register(CustomerVO vo) {
		service.insertCustomer(vo);
		return "redirect:/customer/list";
	}
	//수정
	@GetMapping("/customer/modify")
	public String modify(Model model, String custId) {
		CustomerVO customer = service.selectCustomer(custId);
		model.addAttribute("customer", customer);
		return "/customer/modify";
	}
	@PostMapping("/customer/modify")
	public String modify(CustomerVO vo) {
		service.updateCustomer(vo);
		return "redirect:/customer/list";
	}
	//삭제
	@GetMapping("/customer/delete")
	public String delete(String custId) {
		service.deleteCustomer(custId);
		return "redirect:/customer/list";
	}
	
}
