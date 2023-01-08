package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.User2VO;

@Repository
public class User2DAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser(User2VO vo) {
		mybatis.insert("user2.insertUser", vo);
	}
	public User2VO selectUser(String uid) {
		return mybatis.selectOne("user2.selectUser", uid);
	}
	public List<User2VO> selectUsers() {
		return mybatis.selectList("user2.selectUsers");
	}
	public void updateUser(User2VO vo) {
		mybatis.update("user2.updateUser", vo);
	}
	public void deleteUser(String uid) {
		mybatis.delete("user2.deleteUser", uid);
	}
	
}
