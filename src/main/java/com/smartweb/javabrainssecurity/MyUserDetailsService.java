package com.smartweb.javabrainssecurity;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.smartweb.javabrainssecurity.model.MyUserDetails;
import com.smartweb.javabrainssecurity.model.User;
import com.smartweb.javabrainssecurity.repository.UserRepository;



@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUsername(username);
		
		user.orElseThrow(()-> new UsernameNotFoundException("Not found: " + username ));
		return user.map(MyUserDetails::new).get();
	}

}
