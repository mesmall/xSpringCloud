
package com.base.service.impl;

import com.base.dao.second.SecondHeroDao;
import com.base.entity.Hero;
import com.base.service.SecondHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SecondHeroServiceImpl implements SecondHeroService {
	@Autowired
	private SecondHeroDao secondHeroDao;
	public Hero getHeroById(Integer id) {
		Hero hero = secondHeroDao.findOne(id);
		return hero;
	}
	
	public List<Hero> getHeroList(){
		List<Hero> heroList = secondHeroDao.findAll();
		return heroList;
	}

}
