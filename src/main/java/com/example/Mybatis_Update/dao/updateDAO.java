package com.example.Mybatis_Update.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.Mybatis_Update.bean.EXT_IN;
import com.example.Mybatis_Update.mapper.EXT_IN_MAPPER;

@Component
public class updateDAO {
	
	
	@Autowired
	private SqlSessionFactory factory;
	
	@Autowired
	@Qualifier("update")
	private SqlSessionFactory up;
	
	
	
	public long insert_list_In(List<EXT_IN> list) {
		
		
		
		try(SqlSession session = factory.openSession()){
			EXT_IN_MAPPER mapper = session.getMapper(EXT_IN_MAPPER.class);
			
			list.forEach(bean ->{
				long retrurnVal =  mapper.insert(bean);
				System.out.println(retrurnVal);
			});
			
		}
		return 0;
		
	}
	
	public long insert_In(EXT_IN in) {
		
		try(SqlSession session = factory.openSession()){
			EXT_IN_MAPPER mapper = session.getMapper(EXT_IN_MAPPER.class);
			
			
				long retrurnVal =  mapper.insert(in);
				System.out.println(retrurnVal);
			
			
		}
		return 0;
		
	}
	
	
	public long update_list_In(List<EXT_IN> list) {
		
		try(SqlSession session = up.openSession()){
			EXT_IN_MAPPER mapper = session.getMapper(EXT_IN_MAPPER.class);
			
			list.forEach(bean ->{
				long retrurnVal =  mapper.update(bean);
				System.out.println(retrurnVal);
			});
			
		}
		
		return 0;
		
	}
	
	public long update_In(EXT_IN in) {
		try(SqlSession session = up.openSession()){
			EXT_IN_MAPPER mapper = session.getMapper(EXT_IN_MAPPER.class);
			
			
				long retrurnVal =  mapper.updateNEW(in);
				System.out.println("update "+retrurnVal);
		
			
		}
		
		return 0;
		
	}
	

}
