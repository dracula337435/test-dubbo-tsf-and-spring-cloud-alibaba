# 试验dubbo，在tsf中，借助spring-cloud-alibaba实现两个技术栈互通

似乎关键点在于```com.alibaba.cloud.dubbo.service.DubboMetadataService```

访问```consul```前端可知，```dubbo```的```url```用```consul```中的```tags```存储，形如：
```
secure=false
dubbo.metadata-service.urls=[ "dubbo://192.168.3.14:20880/com.alibaba.cloud.dubbo.service.DubboMetadataService?anyhost=true&application=test-dubbo-tsf-alibaba-provider&bind.ip=192.168.3.14&bind.port=20880&deprecated=false&dubbo=2.0.2&dynamic=true&generic=false&group=test-dubbo-tsf-alibaba-provider&interface=com.alibaba.cloud.dubbo.service.DubboMetadataService&methods=getAllServiceKeys,getServiceRestMetadata,getExportedURLs,getAllExportedURLs&pid=14804&qos.enable=false&register=true&release=2.7.3&revision=2.1.0.RELEASE&side=provider&timestamp=1585131504055&version=1.0.0" ]
dubbo.protocols.dubbo.port=20880
```

而且，如果想直接访问的话，不能使用```DubboMetadataService```接口，而是直接使用提供服务的接口，可见```TestMeta```

此外，具体看了```feign```，用```jdk动态代理```实现，可见```ReflectiveFeign```的静态内部类```FeignInvocationHandler```

```spring-cloud-alibaba-dubbo```用的是```DubboInvocationHandler```把```feign```接口变成了```dubbo```，它在```TargeterInvocationHandler```中被用到