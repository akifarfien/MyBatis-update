package com.example.Mybatis_Update.bean;

import java.sql.Timestamp;

public class EXT_IN {
	
	private String CASE_STATUS; //CHAR(4)
    private String EM_NO ; //CHAR (19)
    private Double dis_cord;  //NUMBER (6,5)
    private Double dis_loc; //NUMBER (6,5)
    private Timestamp T_TimeStmp; //Timestamp (9)
    private  Long T_NO ; //NUMBER (15,0)
    private  Timestamp CASE_STATUS_TimeStmp; //Timestamp (9)
    private Timestamp LAST_T_TimeStmp; //Timestamp (9)
    
    // AND MANY MORE FIELDS 
   
	
    public EXT_IN() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public EXT_IN(String cASE_STATUS, String eM_NO, Double dis_cord, Double dis_loc, Timestamp t_TimeStmp, Long t_NO,
			Timestamp cASE_STATUS_TimeStmp, Timestamp lAST_T_TimeStmp) {
		super();
		CASE_STATUS = cASE_STATUS;
		EM_NO = eM_NO;
		this.dis_cord = dis_cord;
		this.dis_loc = dis_loc;
		T_TimeStmp = t_TimeStmp;
		T_NO = t_NO;
		CASE_STATUS_TimeStmp = cASE_STATUS_TimeStmp;
		LAST_T_TimeStmp = lAST_T_TimeStmp;
	}



	public String getCASE_STATUS() {
		return CASE_STATUS;
	}

	public void setCASE_STATUS(String cASE_STATUS) {
		CASE_STATUS = cASE_STATUS;
	}

	public String getEM_NO() {
		return EM_NO;
	}

	public void setEM_NO(String eM_NO) {
		EM_NO = eM_NO;
	}

	public Timestamp getT_TimeStmp() {
		return T_TimeStmp;
	}

	public void setT_TimeStmp(Timestamp t_TimeStmp) {
		T_TimeStmp = t_TimeStmp;
	}

	public Long getT_NO() {
		return T_NO;
	}

	public void setT_NO(Long t_NO) {
		T_NO = t_NO;
	}

	public Timestamp getCASE_STATUS_TimeStmp() {
		return CASE_STATUS_TimeStmp;
	}

	public void setCASE_STATUS_TimeStmp(Timestamp cASE_STATUS_TimeStmp) {
		CASE_STATUS_TimeStmp = cASE_STATUS_TimeStmp;
	}

	public Timestamp getLAST_T_TimeStmp() {
		return LAST_T_TimeStmp;
	}

	public void setLAST_T_TimeStmp(Timestamp lAST_T_TimeStmp) {
		LAST_T_TimeStmp = lAST_T_TimeStmp;
	}

	public Double getDis_cord() {
		return dis_cord;
	}

	public void setDis_cord(Double dis_cord) {
		this.dis_cord = dis_cord;
	}

	public Double getDis_loc() {
		return dis_loc;
	}

	public void setDis_loc(Double dis_loc) {
		this.dis_loc = dis_loc;
	}



	@Override
	public String toString() {
		return "EXT_IN [CASE_STATUS=" + CASE_STATUS + ", EM_NO=" + EM_NO + ", dis_cord=" + dis_cord + ", dis_loc="
				+ dis_loc + ", T_TimeStmp=" + T_TimeStmp + ", T_NO=" + T_NO + ", CASE_STATUS_TimeStmp="
				+ CASE_STATUS_TimeStmp + ", LAST_T_TimeStmp=" + LAST_T_TimeStmp + "]";
	}
    
	
	
    
    

}
