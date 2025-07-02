package com.test.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class SecurityConfig {


//    @Bean
//    SecurityFilterChain security(HttpSecurity http) throws Exception {
//        http
//                .cors(Customizer.withDefaults())   // << active la config CORS ci-dessus
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
//                        .anyRequest().authenticated()
//                );
//        return http.build();
//    }

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/user/login", "/user/register").permitAll()
//                        .anyRequest().authenticated()
//                );
//
//        return http.build();
//    }

}


