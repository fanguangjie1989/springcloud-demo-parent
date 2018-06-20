# springcloud-demo-parent
spring cloud demo

*****
## springcloud-demo-consumer-feign-hystrix-dashboard
hystrix dashboard demo
##### attention: with default the status of hystrix is not exposed at /health 
>> * 1.endpoints.health.sensitive=false
>> * 2.management.security.enabled=false

*****
## springcloud-demo-hystrix-turbine
turbine demo
>> * 功能：聚合hystrix 监控多个微服务
>> * 聚合方式：
>> * 1.Turbine pull metrics from all the distributed Hystrix commands
>> * 2.Let Hystrix commands push metrics to Turbine 
*****