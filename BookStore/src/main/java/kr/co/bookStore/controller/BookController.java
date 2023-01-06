package kr.co.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.bookStore.Service.BookService;
import kr.co.bookStore.vo.BookVO;

@Controller
public class BookController {

	@Autowired
	private BookService service;
	
	//목록
	@GetMapping("/book/list")
	public String list(Model model) {
		List<BookVO> books = service.selectBooks();
		model.addAttribute("books", books);
		return "/book/list";
	}
	//등록
	@GetMapping("/book/register")	
	public String register() {
		return "/book/register";
	}
	@PostMapping("/book/register")	
	public String register(BookVO vo) {
		service.insertBook(vo);
		return "redirect:/book/list";
	}
	//수정
	@GetMapping("/book/modify")	
	public String modify(Model model, String bookId) {
		BookVO book = service.selectBook(bookId);
		model.addAttribute("book", book);
		return "/book/modify";
	}
	@PostMapping("/book/modify")	
	public String modify(BookVO vo) {
		service.updateBook(vo);
		return "redirect:/book/list";
	}
	//삭제
	@GetMapping("/book/delete")	
	public String delete(String bookId) {
		service.deleteBook(bookId);
		return "redirect:/book/list";
	}
}
