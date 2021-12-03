package com.example.Mybatis_Update.mapper;

import java.security.Timestamp;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.example.Mybatis_Update.bean.EXT_IN;

@Mapper
public interface EXT_IN_MAPPER {
	
	@Insert(
			"INSERT INTO EXT_IN ("
			+ "CASE_STATUS, "
		    + "EM_NO, " 
		  + "dis_cord, " 
		   +  "dis_loc, "
		   +  "T_TimeStmp, "
		  + "T_NO, "
		   + "CASE_STATUS_TimeStmp, "
		   + "LAST_T_TimeStmp)"
		   +" VALUES("
		   
		   +"#{CASE_STATUS}, "
		    +"#{EM_NO}, " 
		  +"#{dis_cord}, " 
		   +"#{dis_loc}, "
		   +"#{T_TimeStmp}, "
		  +"#{T_NO}, "
		   +"#{CASE_STATUS_TimeStmp}, "
		   +"#{LAST_T_TimeStmp})"
		    
			)
	public long insert(EXT_IN in);
	
	@Update(
			"UPDATE EXT_IN SET CASE_STATUS = #{CASE_STATUS}, CASE_STATUS_TimeStmp = #{CASE_STATUS_TimeStmp} WHERE T_TimeStmp >= #{LAST_T_TimeStmp} AND T_TimeStmp <= #{T_TimeStmp} AND T_NO = #{T_NO} AND EM_NO =  #{EM_NO}"
		 )
	public long update(EXT_IN in);
	
	
	@Update(
			"UPDATE EXT_IN SET CASE_STATUS = #{CASE_STATUS} WHERE EM_NO =  #{EM_NO}"
		 )
	public long updateNEW(EXT_IN in);
	
	
	
	
			

}
