package java.com.q.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDao {
//	@Autowired
//	JdbcTemplate jdbcTemplate;
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Map<String, Object>> selectByCodeAndPassword(String code, String password){
		String sql = "select * from smbms_user where userCode=? and userPassword=?";
		return jdbcTemplate.queryForList(sql, new Object[]{code, password});
	}
}
