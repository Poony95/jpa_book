package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.vo.CustomerVO;

import lombok.Setter;

@Service
@Setter
public class CustomerService {
	@Autowired
	private CustomerDAO dao;
	
	//모든 레코드를 검색
	public List<CustomerVO> findAll(){
		return dao.findAll();
	}
	
	//pk해당하는 레코드 하나를 검색
	public CustomerVO getOne(int custid) {
		return dao.getOne(custid);
	}
	
	//pk에 해당하는 레코드 삭제
	public void deletById(int custid) {
		dao.deleteById(custid);
	}
	
	//레코드를 추가하거나, 수정하는 메소드
	//엔티티 객체에 담긴 pk가 이미 테이블에 있으면 수정하고 
	//없으면 레코드를 추가
	public void save(CustomerVO c) {
		dao.save(c);
	}
}





















