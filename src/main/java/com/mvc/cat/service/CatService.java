package com.mvc.cat.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.cat.dao.CatDAO;
import com.mvc.cat.dto.CatDTO;

@Service

public class CatService {
   
   private Logger logger = LoggerFactory.getLogger(this.getClass());

   @Autowired CatDAO catdao;

public ArrayList<CatDTO> list() {
	logger.info("리스트쿼리 요청");
	return catdao.list();
}

public void add(HashMap<String, String> params) {
	int row = catdao.add(params);
	logger.info("redirect:/");
	
}

public void del(String cat_id) {
	int complete = catdao.del(cat_id);
	logger.info("고양이 삭제: " + complete );	
}

public void edit(HashMap<String, String> params) {
	int row = catdao.edit(params);
	logger.info("수정:{}",row);
	
}
   
   
   
   
   
   
   
   
   
   
   
   
}
   
   