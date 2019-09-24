package com.qetch.springcloud.service;

import com.qetch.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {

	public boolean add(Dept dept);
	
	public Dept get(long id);
	
	public List<Dept> list();
}
