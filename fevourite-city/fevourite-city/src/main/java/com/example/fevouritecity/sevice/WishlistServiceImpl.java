package com.example.fevouritecity.sevice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fevouritecity.exception.CityAlreadyInWishlistException;
import com.example.fevouritecity.exception.CityNotFoundException;
import com.example.fevouritecity.exception.WishlistNotFoundException;
//import com.example.fevouritecity.model.City;
import com.example.fevouritecity.model.Wishlist;
//import com.example.fevouritecity.repository.CityRepository;
import com.example.fevouritecity.repository.UserRepository;
import com.example.fevouritecity.repository.WishlistRepository;

@Service
public class WishlistServiceImpl implements WishlistService {
//	@Autowired
//	private UserRepository userRepository;
	@Autowired
	private WishlistRepository wishlistRepository;

	@Override
	public List<Wishlist> findAllWishlists() {
		// TODO Auto-generated method stub
		return wishlistRepository.findAll();
	}

	@Override
	public List<Wishlist> findWishlistByUsername(String username) {
		// TODO Auto-generated method stub
		return wishlistRepository.findAllByUsername(username);
	}

	@Override
	public Wishlist addWishlist(Wishlist wishlist) {
		// TODO Auto-generated method stub
		return wishlistRepository.save(wishlist);
	}

	@Override
	public Wishlist deleteWishlist(Long id) {
		// TODO Auto-generated method stub
		
		Wishlist wishlist=wishlistRepository.findById(id).orElse(null);
		wishlistRepository.delete(wishlist);
		return wishlist;
		
	}
	
	
	
	
//	@Override
//	public void addCityToWishlist(String username, Long cityId) {
//		// TODO Auto-generated method stub
//		
//		if(wishlistRepository.existsByUsernameAndCityId(username, cityId)) {
//			throw new CityAlreadyInWishlistException("City is already in wishlist");
//		}
//		City city=cityRepository.getCityById(cityId);
//		Wishlist wishlist=new Wishlist(username, cityId, city);
//		wishlistRepository.save(wishlist);
//		
//	}
//	@Override
//	public List<City> getFavoriteCities(String username) {
//		// TODO Auto-generated method stub
//		List<Wishlist> wishlists=wishlistRepository.findAllByUsername(username);
//		List<City> cities=new ArrayList<City>();
//		for(Wishlist wishlist:wishlists) {
//			cities.add(wishlist.getCity());
//		}
//		return cities;
//	}
//	@Override
//	public void removeCityFromWishlist(String username, Long cityId) {
//		// TODO Auto-generated method stub
//		wishlistRepository.deleteByUsernameAndCityId(username, cityId);
//		
//	}

//	@Override
//	public void saveCityToWishlist(String userName, Long cityId) {
//		// TODO Auto-generated method stub

//		City city=cityRepository.findById(cityId).orElseThrow(()->new CityNotFoundException(cityId));
//	
//		Wishlist wishlist=wishRepository.findByUserName(userName);
//		
//		if(wishlist==null) {
//			wishlist=new Wishlist(userName, new HashSet<City>());
//		}
//		wishlist.getCities().add(city);
//		wishRepository.save(wishlist);
//	}
//
//	@Override
//	public List<City> getWishlistCities(String userName) {
//		// TODO Auto-generated method stub
//		Wishlist wishlist=wishRepository.findByUserName(userName);
//		if(wishlist==null) {
//			return new ArrayList<City>();
//		}
//		return new ArrayList<>(wishlist.getCities());
//	}
//
//	@Override
//	public void deleteCityFromWishlist(String userName, Long cityId) {
//		// TODO Auto-generated method stub
//		
//		Wishlist wishlist=wishRepository.findByUserName(userName);
//		
//		if(wishlist==null) {
//			throw new WishlistNotFoundException(userName);
//		}
//		
//		City city=cityRepository.findById(cityId).orElseThrow(()->new CityNotFoundException(cityId));
//		wishlist.getCities().remove(city);
//		wishRepository.save(wishlist);
//
//	}

}
