package co.com.poli.moviesservice.clientFeign;

import co.com.poli.moviesservice.helpers.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "bookings-service", fallback = BookingsClientImplHystrixFallBack.class)
public interface BookingsClient {
    @GetMapping("/store/api/v1/bookings/movie/{id}")
    Response validarMovieRegistrada(@PathVariable("id") Long id);
}