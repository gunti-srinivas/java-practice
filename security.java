//package com.springsecurity.security;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.context.SecurityContextHolderFilter;
//import org.springframework.security.web.context.SecurityContextPersistenceFilter;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
////@SpringBootApplication
//public class SecurityApplication {
//    private static AuthenticationManager am = new SampleAuthenticationManager();
//	public static void main(String[] args) throws Exception {
//
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        int i = 0;
//		SecurityContext securityContext = SecurityContextHolder.createEmptyContext();
//		System.out.println("Initially ---> "+ securityContext.getClass());
//		while(i < 2){
//			System.out.println("please enter your username: ");
//			String name = in.readLine();
//			System.out.println("please enter your password:");
//			String password = in.readLine();
//			try{
//				Authentication request = new UsernamePasswordAuthenticationToken(name, password);
//				Authentication response = am.authenticate(request);
//				securityContext.setAuthentication(response);
//
//			}catch(AuthenticationException e){
//				System.out.println("Authentication failed: "+ e.getMessage());
//			}finally{
//				i++;
//				System.out.println("class------> "+ securityContext.getClass());
//				System.out.println("Successfully authenticated, Security Context contains: "+
//						securityContext.getAuthentication());
//
//			}
//		}
//
//	}
//}
//class SampleAuthenticationManager implements AuthenticationManager{
//	static final List<GrantedAuthority> AUTHORITIES = new ArrayList<GrantedAuthority>();
//
//	static{
//		AUTHORITIES.add(new SimpleGrantedAuthority("ROLE_USER"));
//	}
//	@Override
//	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//		if(authentication.getName().equals(authentication.getCredentials())){
//			return new UsernamePasswordAuthenticationToken(authentication.getName(), authentication.getCredentials(), AUTHORITIES);
//		}
//		throw new BadCredentialsException("Bad Credentials");
//	}
//
//
//}
