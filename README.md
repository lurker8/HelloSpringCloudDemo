# HelloSpringCloudDemo
springboot+springcloud simple project demo

项目目录和功能简介：
hello-spring-cloud-dependencies  父级依赖（统一依赖管理）
hello-spring-cloud-eureka  服务注册与发现
hello-spring-cloud-service-admin 创建服务提供者

hello-spring-cloud-web-ribbon 
创建服务消费者（Ribbon）
使用熔断器防止服务雪崩（ribbon实现）

hello-spring-cloud-web-admin-feign 
创建服务消费者（feign）、
使用熔断器防止服务雪崩（feign实现）、
使用熔断器仪表盘监控（Hystrix 仪表盘功能）

hello-spring-cloud-zuul 
使用路由网关统一访问接口
使用路由网关的服务过滤功能

hello-spring-cloud-zipkin
服务链路追踪

hello-spring-cloud-admin 监控管理 服务端
hello-spring-cloud-admin-client 监控管理 测试客户端
同时hello-spring-cloud-web-admin-feign也加入到了监控管理




