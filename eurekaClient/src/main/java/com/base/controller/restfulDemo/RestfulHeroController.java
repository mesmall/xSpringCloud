
package com.base.controller.restfulDemo;

import com.base.constants.ConstantsProperties;
import com.base.entity.Hero;
import com.base.service.HeroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */
@RestController
public class RestfulHeroController {
	@Autowired
	private HeroService heroService;

	private static Logger logger = LoggerFactory.getLogger(RestfulHeroController.class);

	@Autowired
	private ConstantsProperties constantsProperties;

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value="/hero",method= RequestMethod.GET)
	public List<Hero> getHeroList(){
		logger.info("############");
		List<Hero> heroList = heroService.getHeroList();
		return heroList;
	}
	@RequestMapping(value="/",method= RequestMethod.GET)
	public String hello(){
		ServiceInstance instance = discoveryClient.getLocalServiceInstance();
		Integer r = 3;
		logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);

		logger.info("当前配置运行环境："+constantsProperties.getDev());
		logger.warn("############123");
		return "hi";
	}
	@RequestMapping(value="/hero/{id}",method= RequestMethod.GET)
	public Hero getHero(@PathVariable("id") Integer id){
		Hero hero = heroService.getHeroById(id);
		return hero;
	}
	
}
