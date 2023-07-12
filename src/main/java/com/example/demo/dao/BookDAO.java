package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.BookVO;

@Repository
public interface BookDAO extends JpaRepository<BookVO, Integer> {
//	public List<BookVO> findAllOrderByBookname();
	
	@Query("select b from BookVO b order by b.bookname")
	public List<BookVO> selectAll();
	
	public List<BookVO> findAllByOrderByBookname();
	
	//도서명으로 검색
	public List<BookVO> 
	findByBooknameLikeOrderByPriceDesc(String bookname);
	
	//도서번호로 검색
	public List<BookVO>
	findByBookid(int bookid);
	
	//출판사로 검색
	public List<BookVO>
	findByPublisher(String publisher);
	
	//가격으로 검색
	public List<BookVO>
	findByPrice(int price);
	
	
}







