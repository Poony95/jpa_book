package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.View_ListOrders;

@Repository
public interface View_ListOrdersDAO extends JpaRepository<View_ListOrders, Integer> {
	//고객명으로 검색
	//select * from view_listorders where name = '박지성'
	public List<View_ListOrders>
		findByName(String name);
	
	//도서명으로 검색
	//select * from view_listorders where bookname= '재미있는 자바'
	public List<View_ListOrders>
		findByBookname(String bookname);
		
		public List<View_ListOrders> findByNameOrderByOrderid(String name);
		public List<View_ListOrders> findByNameOrderByName(String name);
		public List<View_ListOrders> findByNameOrderByBookname(String name);
		public List<View_ListOrders> findByNameOrderByOrderdate(String name);
		public List<View_ListOrders> findByNameOrderBySaleprice(String name);
		public List<View_ListOrders> findByNameOrderByPrice(String name);
		
		public List<View_ListOrders> findByBooknameOrderByOrderid(String bookname);
		public List<View_ListOrders> findByBooknameOrderByName(String bookname);
		public List<View_ListOrders> findByBooknameOrderByBookname(String bookname);
		public List<View_ListOrders> findByBooknameOrderByOrderdate(String bookname);
		public List<View_ListOrders> findByBooknameOrderBySaleprice(String bookname);
		public List<View_ListOrders> findByBooknameOrderByPrice(String bookname);
			
		
		public List<View_ListOrders> findAllByOrderByOrderid();
		public List<View_ListOrders> findAllByOrderByName();
		public List<View_ListOrders> findAllByOrderByBookname();
		public List<View_ListOrders> findAllByOrderByOrderdate();
		public List<View_ListOrders> findAllByOrderBySaleprice();
		public List<View_ListOrders> findAllByOrderByPrice();
}




