package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.User1VO;

@Repository
public class User1DAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	//등록
	public void insertUser1(User1VO vo) {
		mybatis.insert("user1.insertUser1", vo);
	}
	//보기
	public User1VO selectUser1(String uid) {
		return mybatis.selectOne("user1.selectUser1", uid);
	}
	//목록
	public List<User1VO> selectUser1s() {
		return mybatis.selectList("user1.selectUser1s");
	}
	//수정
	public void updateUser1(User1VO vo) {
		mybatis.update("user1.updateUser1", vo);
	}
	//삭제
	public void deleteUser1(String uid) {
		mybatis.delete("user1.deleteUser1", uid);
	}
	
}
