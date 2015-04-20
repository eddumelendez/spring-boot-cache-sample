package io.eddumelendez;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cache")
public class CacheController {

	@Autowired
	private AvengersService avengersService;

	@RequestMapping("stats")
	public void get() {
		System.out.println(avengersService.getAvengers());
	}
}
