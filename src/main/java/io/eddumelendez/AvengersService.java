package io.eddumelendez;

import org.apache.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AvengersService {

	private static Logger LOGGER = Logger.getLogger(AvengersService.class);

	@Cacheable("avengers")
	public List<String> getAvengers() {
		LOGGER.info("Loading avengers");
		return Arrays.asList("Captain America", "Hulk", "Iron Man", "Thor");
	}

}
