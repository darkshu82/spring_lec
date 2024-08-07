package com.tjoeun.database;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.tjoeun.beans.Mybatistbl;

public interface MapperInterface {
	
	// @Insert("sqldeveloper 에서 먼저 작성")
  @Insert("INSERT INTO MYBATISTBL VALUES(#{name}, #{id}, #{addr})")
  void insertData(Mybatistbl mybatistbl);
  
  @Select("SELECT * FROM MYBATISTBL")
  List<Mybatistbl> selectAll();
  
}
