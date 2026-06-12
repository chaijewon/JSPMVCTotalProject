package com.sist.vo;

import lombok.Data;

/*
 *   NO      NOT NULL NUMBER         
     TITLE   NOT NULL VARCHAR2(200)  
     POSTER  NOT NULL VARCHAR2(500)  
     MSG     NOT NULL VARCHAR2(4000) 
     ADDRESS NOT NULL VARCHAR2(300)  
     HIT              NUMBER
     MyBatis는 반드시 컬럼명과 일치 
 */
@Data
public class SeoulVO {
   private int no,hit;
   private String title,poster,msg,address;
}
