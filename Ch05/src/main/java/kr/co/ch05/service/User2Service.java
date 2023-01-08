package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.User2DAO;
import kr.co.ch05.vo.User2VO;

@Service
public class User2Service {

	@Autowired
	private User2DAO dao;
	
	public void insertUser(User2VO vo) {
		dao.insertUser(vo);
	}
	public User2VO selectUser(String uid) {
		return dao.selectUser(uid);
	}
	public List<User2VO> selectUsers() {
		return dao.selectUsers();
	}
	public void updateUser(User2VO vo) {
		dao.updateUser(vo);
	}
	public void deleteUser(String uid) {
		dao.deleteUser(uid);
	}	
}
