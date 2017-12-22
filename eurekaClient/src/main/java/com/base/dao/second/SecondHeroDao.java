package com.base.dao.second;

import com.base.entity.Hero;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondHeroDao {
	/**
	 * 描述：按照id查找hero
	 * @param id
	 * @return
	 */
	Hero findOne(Integer id);
	/**
	 * 描述：查找所有的hero
	 * @return
	 */
	List<Hero> findAll();
}
