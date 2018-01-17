示例
一、添加依赖
        <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-hystrix-dashboard</artifactId>
		</dependency>
二、在启动类中添加Hystrix Dashboard支持
@EnableHystrix
@EnableHystrixDashboard

三、在浏览器中输入http://localhost:1301/hystrix/ (注意：端口号为具体服务对应的端口号而不是Eureka Server的端口号)
四、监控消费者地址 Consumer http://Consumerlocalhost:ConsumerPort/hystrix.stream
   本例填入： http://localhost:2102/hystrix.stream
五、使用说明
    http://blog.didispace.com/spring-cloud-starter-dalston-5-1/


Hystrix Dashboard简介

在微服务架构中为例保证程序的可用性，防止程序出错导致网络阻塞，出现了断路器模型。断路器的状况反应了一个程序的可用性和健壮性，
它是一个重要指标。Hystrix Dashboard是作为断路器状态的一个组件，提供了数据监控和友好的图形化界面。

