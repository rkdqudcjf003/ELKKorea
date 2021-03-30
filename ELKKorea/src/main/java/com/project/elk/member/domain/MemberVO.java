package com.project.elk.member.domain;

import java.sql.Timestamp;

public class MemberVO {
	private int			userNo;// int NOT NULL AUTO_INCREMENT,
	private String		id;// varchar(45) NOT NULL,
	private String		pwd;// varchar(45) NOT NULL,
	private String		hp;//` varchar(45) NOT NULL,
	private String  	email1;//` varchar(45) NOT NULL,
	private String  	email2;// varchar(45) NOT NULL,
	private String  	address1;// varchar(45) DEFAULT NULL,
	private String  	address2;//` varchar(45) DEFAULT NULL,
	private String  	zipcode;//` varchar(45) DEFAULT NULL,
	private Timestamp  	regDate;//` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
	private Timestamp  	outDate;//` timestamp NULL DEFAULT NULL,
	private String  	outUser;//` char(1) NOT NULL DEFAULT 'N',
	@Override
	public String toString() {
		return "MemberVO [userNo=" + userNo + ", id=" + id + ", pwd=" + pwd + ", hp=" + hp + ", email1=" + email1
				+ ", email2=" + email2 + ", address1=" + address1 + ", address2=" + address2 + ", zipcode=" + zipcode
				+ ", regDate=" + regDate + ", outDate=" + outDate + ", outUser=" + outUser + "]";
	}//멤버 수정수정
	
	
}
