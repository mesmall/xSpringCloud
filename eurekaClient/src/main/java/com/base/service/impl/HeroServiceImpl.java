
package com.base.service.impl;

import com.base.dao.master.HeroDao;
import com.base.entity.Hero;
import com.base.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HeroServiceImpl implements HeroService {
	@Autowired
	private HeroDao heroDao;
	public Hero getHeroById(Integer id) {
		Hero hero = heroDao.findOne(id);
		return hero;
	}
	
	public List<Hero> getHeroList(){
		List<Hero> heroList = heroDao.findAll();
		return heroList;
	}

}
