
package com.base.service;

import com.base.entity.Hero;

import java.util.List;

public interface HeroService {
	Hero getHeroById(Integer id);
	
	List<Hero> getHeroList();
}
