package com.mvc.cat.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.mvc.cat.dto.CatDTO;

public interface CatDAO {

	ArrayList<CatDTO> list();

	int add(HashMap<String, String> params);

	int del(String cat_id);

	int edit(HashMap<String, String> params);

	

	

}
