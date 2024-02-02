package com.example.fevouritecity.sevice;

import java.util.List;

import com.example.fevouritecity.model.Wishlist;

public interface WishlistService {

//	void addCityToWishlist(String username,Long cityId);
//	List<Wishlist> getFavoriteCities(String username);
//	void removeCityFromWishlist(String username,Long cityId);

//	List<Wishlist> getFavCitiesByUser(Long userId);
//	void addFavCityToWishlist(Long userId,String city);
//	void deleteFavCityFromWishlist(Long wishlistId);
	
	List<Wishlist> findAllWishlists();
	List<Wishlist> findWishlistByUsername(String username);
	Wishlist addWishlist(Wishlist wishlist);
	Wishlist deleteWishlist(Long id);
}
