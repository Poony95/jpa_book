package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDAO;
import com.example.demo.vo.BookVO;

import lombok.Setter;

@Service
@Setter
public class BookService {
	@Autowired
	private BookDAO dao;
	public List<BookVO> findAll(String cname, String keyword){
		List<BookVO> list = null;
		if(keyword != null && !keyword.equals("")) {			
			switch(cname) {
				case "bookid": list=dao.findByBookid(Integer.parseInt(keyword));break;
				case "bookname":list =  dao.findByBooknameLikeOrderByPriceDesc("%"+keyword+"%");break;
				case "publisher":list = dao.findByPublisher(keyword);break;
				case "price":list = dao.findByPrice(Integer.parseInt(keyword));break;
			}			
		}else {
			list = dao.findAll();
		}
		
		return list;
		
		//return dao.selectAll();
		//return dao.findAllByOrderByBookname();
	}
	
	
	public void save(BookVO b) {
		dao.save(b);
	}
	
	public BookVO getOne(int bookid) {
		return dao.getOne(bookid);
	}
	
	public void deleteById(int bookid) {
		dao.deleteById(bookid);
	}
}








