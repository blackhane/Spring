package kr.co.bookStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookStore.DAO.BookDAO;
import kr.co.bookStore.vo.BookVO;

@Service
public class BookService {

	@Autowired
	private BookDAO dao;
	
	public void insertBook(BookVO vo) {
		dao.insertBook(vo);
	}
	public BookVO selectBook(String bookId) {
		return dao.selectBook(bookId);
	}
	public List<BookVO> selectBooks() {
		return dao.selectBooks();
	}
	public void updateBook(BookVO vo) {
		dao.updateBook(vo);
	}
	public void deleteBook(String bookId) {
		dao.deleteBook(bookId);
	}
}
