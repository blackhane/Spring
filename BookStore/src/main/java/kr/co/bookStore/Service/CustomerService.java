package kr.co.bookStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookStore.DAO.CustomerDAO;
import kr.co.bookStore.vo.CustomerVO;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO dao;
	
	public void insertCustomer(CustomerVO vo) {
		dao.insertCustomer(vo);
	}
	public CustomerVO selectCustomer(String custId) {
		return dao.selectCustomer(custId);
	}
	public List<CustomerVO> selectCustomers() {
		return dao.selectCustomers();
	}
	public void updateCustomer(CustomerVO vo) {
		dao.updateCustomer(vo);
	}
	public void deleteCustomer(String custId) {
		dao.deleteCustomer(custId);
	}
}
