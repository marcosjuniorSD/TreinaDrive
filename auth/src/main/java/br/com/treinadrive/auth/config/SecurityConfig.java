package br.com.treinadrive.auth.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    private static final String INSTRUCTOR_ROUTE = "/instructor/**";
    private static final String STUDENT_ROUTE = "/student/**";
    private static final String PUBLIC_ROUTE = "/public/**";

    private static final String INSTRUCTOR = "INSTRUCTOR";
    private static final String STUDENT = "STUDENT";

    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers(PUBLIC_ROUTE).permitAll()
                .requestMatchers(INSTRUCTOR_ROUTE).hasRole(INSTRUCTOR)
                .requestMatchers(STUDENT_ROUTE).hasRole(STUDENT)
                .anyRequest().authenticated()
        ).oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);

        return http.build();
    }
}
