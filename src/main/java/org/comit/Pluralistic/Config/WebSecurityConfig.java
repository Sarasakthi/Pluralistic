package org.comit.Pluralistic.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/*@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(requests -> requests.requestMatchers("/img/**","/create/**").permitAll()
            .anyRequest().authenticated())
			.formLogin(form -> form.loginPage("/login").permitAll())
			.logout(logout -> logout.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).permitAll())
			.csrf(csrf -> csrf.disable());

		return http.build();
	}

	
	@Bean
	PasswordEncoder passwordEncoder() {
		// return new Cu stomPasswordEncoder();
		return new BCryptPasswordEncoder();
	}
}*/
