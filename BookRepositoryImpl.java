package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;



@Repository
public interface BookRepositoryImpl extends JpaRepository <Book, Integer> {
	List<Book> findAll();
	Optional<Book> findById(Integer id);
	List<Book> findByPublisher2(String publisher);
	List<Book> findByPriceGreaterThanEqual(int price);
//	List<BookTitleOnly> findByPublisher(String publisher);


}

//@Repository
//public class BookRepositoryImpl implements BookRepository {
//	public List<Book> findAllColumn(){
//		return findAll();
//	};
//	public Optional<Book> findById(Integer id){
//		return findById(id);
//	};
//	public List<Book> findByPublisher(String publisher){
//		return findByPublisher(publisher);
//	};
//	public List<Book> findByPriceGreaterThanEqual(int price){
//		return findByPriceGreaterThanEqual(price);
//	}
//	@Override
//	public List<Book> findAll() {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	@Override
//	public List<Book> findAll(Sort sort) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	@Override
//	public List<Book> findAllById(Iterable<Integer> ids) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	@Override
//	public <S extends Book> List<S> saveAll(Iterable<S> entities) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	@Override
//	public void flush() {
//		// TODO 自動生成されたメソッド・スタブ
//
//	}
//	@Override
//	public <S extends Book> S saveAndFlush(S entity) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	@Override
//	public void deleteInBatch(Iterable<Book> entities) {
//		// TODO 自動生成されたメソッド・スタブ
//
//	}
//	@Override
//	public void deleteAllInBatch() {
//		// TODO 自動生成されたメソッド・スタブ
//
//	}
//	@Override
//	public Book getOne(Integer id) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	@Override
//	public <S extends Book> List<S> findAll(Example<S> example) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	@Override
//	public <S extends Book> List<S> findAll(Example<S> example, Sort sort) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	@Override
//	public Page<Book> findAll(Pageable pageable) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	@Override
//	public <S extends Book> S save(S entity) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	@Override
//	public boolean existsById(Integer id) {
//		// TODO 自動生成されたメソッド・スタブ
//		return false;
//	}
//	@Override
//	public long count() {
//		// TODO 自動生成されたメソッド・スタブ
//		return 0;
//	}
//	@Override
//	public void deleteById(Integer id) {
//		// TODO 自動生成されたメソッド・スタブ
//
//	}
//	@Override
//	public void delete(Book entity) {
//		// TODO 自動生成されたメソッド・スタブ
//
//	}
//	@Override
//	public void deleteAll(Iterable<? extends Book> entities) {
//		// TODO 自動生成されたメソッド・スタブ
//
//	}
//	@Override
//	public void deleteAll() {
//		// TODO 自動生成されたメソッド・スタブ
//
//	}
//	@Override
//	public <S extends Book> Optional<S> findOne(Example<S> example) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	@Override
//	public <S extends Book> Page<S> findAll(Example<S> example, Pageable pageable) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	@Override
//	public <S extends Book> long count(Example<S> example) {
//		// TODO 自動生成されたメソッド・スタブ
//		return 0;
//	}
//	@Override
//	public <S extends Book> boolean exists(Example<S> example) {
//		// TODO 自動生成されたメソッド・スタブ
//		return false;
//	};
//	List<BookTitleOnly> findAll();

//	public List<BookTitleOnly> findOnly(){
//		List<BookTitleOnly> result = findAll();
//	};

//}
