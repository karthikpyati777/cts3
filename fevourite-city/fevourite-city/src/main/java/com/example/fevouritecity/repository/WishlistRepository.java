package com.example.fevouritecity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fevouritecity.model.Wishlist;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Long>{

	// Wishlist findByUserName(String userName);
	
	List<Wishlist> findAllByUsername(String username);

}
