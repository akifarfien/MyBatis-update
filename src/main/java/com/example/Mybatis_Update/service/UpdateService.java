package com.example.Mybatis_Update.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Mybatis_Update.bean.EXT_IN;
import com.example.Mybatis_Update.dao.updateDAO;

@Component
public class UpdateService {
	
	@Autowired
	private updateDAO dao;
	
	public void createrecords() {
		
		EXT_IN inbean1 = new EXT_IN("2333","7720099876542",1.87,7.334,Timestamp.valueOf("2021-11-20 23:10:43.456"),88076511L,Timestamp.valueOf("2021-11-28 23:10:43.456"),Timestamp.valueOf("2020-05-28 23:10:43.456"));
		
		EXT_IN inbean2 = new EXT_IN("234","7720099876544",1.87,7.334,Timestamp.valueOf("2021-11-20 23:10:43.456"),88076511L,Timestamp.valueOf("2021-11-28 23:10:43.456"),Timestamp.valueOf("2020-05-28 23:10:43.456"));
		EXT_IN inbean3 = new EXT_IN("767","772009987658",1.87,7.334,Timestamp.valueOf("2021-11-20 23:10:43.456"),88076511L,Timestamp.valueOf("2021-11-28 23:10:43.456"),Timestamp.valueOf("2020-05-28 23:10:43.456"));
		EXT_IN inbean4 = new EXT_IN("786","7720099876502",1.87,7.334,Timestamp.valueOf("2021-11-20 23:10:43.456"),88076511L,Timestamp.valueOf("2021-11-28 23:10:43.456"),Timestamp.valueOf("2020-05-28 23:10:43.456"));
		EXT_IN inbean5 = new EXT_IN("132","7720099876512",1.87,7.334,Timestamp.valueOf("2021-11-20 23:10:43.456"),88076511L,Timestamp.valueOf("2021-11-28 23:10:43.456"),Timestamp.valueOf("2020-05-28 23:10:43.456"));
		EXT_IN inbean6 = new EXT_IN("867","7720099876232",1.87,7.334,Timestamp.valueOf("2021-11-20 23:10:43.456"),88076511L,Timestamp.valueOf("2021-11-28 23:10:43.456"),Timestamp.valueOf("2020-05-28 23:10:43.456"));

		List<EXT_IN> list = new ArrayList<EXT_IN>();
		list.add(inbean6);
		list.add(inbean5);
		list.add(inbean4);
		
		System.out.println("Inserting a bean");
		dao.insert_In(inbean1);
		
		System.out.println("Inserting list of beans");
		dao.insert_list_In(list);
		
		
		System.out.println("Update list of beans");
		inbean6.setCASE_STATUS("000");
		//inbean1.setEM_NO("000");
		
		dao.update_In(inbean6);
		
		
	}
	
	

}
