package com.example.Mybatis_Update.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.Mybatis_Update.bean.EXT_IN;
import com.example.Mybatis_Update.mapper.EXT_IN_MAPPER;

@Component
public class updateDAO {
	
	
//	@Autowired
//	private SqlSessionFactory factory;
	
	
//	@Autowired
//	@Qualifier("update")
//	private SqlSessionFactory up;
	
	@Autowired
	private SqlSessionTemplate temp;
	
	
	
	
	public long insert_list_In(List<EXT_IN> list) {
		
		
		
		
			EXT_IN_MAPPER mapper = temp.getMapper(EXT_IN_MAPPER.class);
			
			list.forEach(bean ->{
				long retrurnVal =  mapper.insert(bean);
				System.out.println(bean.getEM_NO()+" Inserted "+retrurnVal);
			});
			
		
		return 0;
		
	}
	
	public long insert_In(EXT_IN in) {
		
		
			EXT_IN_MAPPER mapper = temp.getMapper(EXT_IN_MAPPER.class);
			
			
				long retrurnVal =  mapper.insert(in);
				System.out.println(in.getEM_NO()+" Inserted "+retrurnVal);
			
			
		
		return 0;
		
	}
	
	
	public long update_list_In(List<EXT_IN> list) {
		
		
			EXT_IN_MAPPER mapper = temp.getMapper(EXT_IN_MAPPER.class);
			
			list.forEach(bean ->{
				long retrurnVal =  mapper.update(bean);
				System.out.println(bean.getEM_NO()+" updated "+retrurnVal);
			});
			
		
		
		return 0;
		
	}
	
	public long update_In(EXT_IN in) {
		
			EXT_IN_MAPPER mapper = temp.getMapper(EXT_IN_MAPPER.class);
			
			
				long retrurnVal =  mapper.updateNEW(in);
				System.out.println(in.getEM_NO()+" updated "+retrurnVal);
				
				
				System.out.println("SELECT");
				EXT_IN b = mapper.select(in);
				
				System.out.println(b);
			
	
		
		return 0;
		
	}
	

}
