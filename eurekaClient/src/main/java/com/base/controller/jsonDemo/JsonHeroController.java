
package com.base.controller.jsonDemo;

import com.base.constants.ConstantsProperties;
import com.base.entity.Hero;
import com.base.service.SecondHeroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 */
@Controller
public class JsonHeroController {

	@Autowired
	private SecondHeroService secondHeroService;

	private static Logger logger = LoggerFactory.getLogger(JsonHeroController.class);

	@Autowired
	private ConstantsProperties constantsProperties;

	@RequestMapping(value="/getHeroListJson",method= RequestMethod.GET)
	@ResponseBody
	public List<Hero> getHeroListJson(){
		logger.info("############");
		List<Hero> heroList = secondHeroService.getHeroList();
		return heroList;
	}
	@RequestMapping(value="/helloJson",method= RequestMethod.GET)
	@ResponseBody
	public String helloJson(){
		logger.info("当前配置运行环境："+constantsProperties.getDev());
		logger.warn("############123");
		return "helloJson";
	}
	@RequestMapping(value="/getHeroJson",method= RequestMethod.GET)
	@ResponseBody
	public Hero getHeroJson(Integer id){
		Hero hero = secondHeroService.getHeroById(id);
		return hero;
	}

//	@RequestMapping(value="/getHeroObject",method=RequestMethod.GET)
//	@ResponseBody
//	public Hero getHeroJson(Hero o){
//		logger.warn("############Hero:"+o.toString());
//		Hero hero = secondHeroService.getHeroById(o.getId());
//		return hero;
//	}
}
