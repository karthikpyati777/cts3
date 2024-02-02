package com.example.fevouritecity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fevouritecity.model.User;
import com.example.fevouritecity.model.Wishlist;
import com.example.fevouritecity.sevice.UserService;
import com.example.fevouritecity.sevice.WishlistService;

@RestController
@RequestMapping("/cities")
public class WishlistController {

	@Autowired
	private WishlistService wishlistService;
	
	@Autowired
	private UserService userService;

	@PostMapping("wishlist")
	public Wishlist addWishlist(@RequestBody Wishlist wishlist) {
		User user=userService.findUserByUsername(wishlist.getUsername());
		wishlist.setUser(user);
		return wishlistService.addWishlist(wishlist);
	}
	
	@GetMapping("/wishlists")
	public List<Wishlist> findAllWishlists(){
		return wishlistService.findAllWishlists();
	}
	
	@GetMapping("wishlists/{username}")
	public List<Wishlist> findWishlistsByUsername(@PathVariable String username){
		return wishlistService.findWishlistByUsername(username);
	}
	
	@DeleteMapping("wishlist/{id}")
	public Wishlist deletWishlist(@PathVariable Long id) {
		return wishlistService.deleteWishlist(id);
	}
}
