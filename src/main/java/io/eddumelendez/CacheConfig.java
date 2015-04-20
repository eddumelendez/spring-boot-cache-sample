package io.eddumelendez;

import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

	@Bean
	public Cache avengersCache() {
		return new ConcurrentMapCache("avengers");
	}

}
