package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/api/personas") // Ruta del microservicio que quieres permitir
      .allowedOrigins("http://localhost:4200") // Dominio del cliente Angular
      .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos HTTP permitidos
      .allowCredentials(true); // Permitir envío de credenciales (cookies, headers de autorización, etc.)
  }
}