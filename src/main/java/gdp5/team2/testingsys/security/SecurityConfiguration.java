package gdp5.team2.testingsys.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter implements WebMvcConfigurer{
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();
		http.authorizeRequests()//
		.antMatchers(HttpMethod.GET, "/questions/view-list").permitAll()//
		.antMatchers(HttpMethod.POST, "/questions/create").permitAll()//
		.antMatchers(HttpMethod.GET, "/questions/update").permitAll()//
		.antMatchers(HttpMethod.GET, "/questions/**").permitAll()//
		.antMatchers(HttpMethod.DELETE, "/user/delete/**").permitAll();
}
	@Override
	public void configure(WebSecurity web) throws Exception {
		// Allow swagger to be accessed without authentication
		web.ignoring().antMatchers("/v2/api-docs")//
				.antMatchers("/swagger-resources/**")//
				.antMatchers("/swagger-ui.html")//
				.antMatchers("/configuration/**")
				.antMatchers("/webjars/**")//
				.antMatchers("/public");//
	}

}
