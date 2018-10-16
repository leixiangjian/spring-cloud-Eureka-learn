# spring-cloud-Eureka-learn  
# 一、了解  
spring cloud Eureka提供了服务器端服务注册管理与客户端服务注册和发现组件，并且服务器与客户端都是java编写，服务器与客户端基于Restful API的访问方式。  
# 二、服务注册中心  
1、服务器端  
<p>需要引入依赖:</p>  
<pre>
 <code>
   &lt;dependency&gt;
     &lt;groupId&gt;org.springframework.cloud&lt;/groupId&gt;
     &lt;artifactId&gt;spring-cloud-starter-netflix-eureka-server&lt;/artifactId&gt;
   &lt;/dependency&gt;
 </code>
</pre>  
<p>启动服务器注解:</p>
<pre>
 <code>@EnableEurekaServer</code>
</pre>
<p>服务器端的关键属性:</p>
<pre>
<code>
#由于该应用为注册中心，所以设置为 false, 代表不向注册中心注册自己
eureka.client.registerWithEureka=false
#由于注册中心的职责就是维护服务实例，它并不需要去检索服务， 所以也设置为 false
eureka.client.fetchRegistry=false
</code>
</pre>  
2、客户端  
<p>需要引入依赖:</p>
<pre>
	<code>
		&lt;dependency&gt;
			&lt;groupId&gt;org.springframework.cloud&lt;/groupId&gt;
			&lt;artifactId&gt;spring-cloud-starter-netflix-eureka-client&lt;/artifactId&gt;
		&lt;/dependency&gt;
 </code>
</pre>  
<p>启动服务发现注解:</p>
<pre>
 <code>@EnableDiscoveryClient</code>
</pre>

<p>客户端的关键属性:</p>
<pre>
<code>
#指定服务注册中心的地址
eureka.client.serviceUrl.defaultZone=http://127.0.0.1:8671/eureka/
</code>
</pre>  
# 三、Eureka高可用集群  
通过相互配置属性：eureka.client.serviceUrl.defaultZone，比如：http://127.0.0.1:1111/eureka/,http://127.0.0.1:1112/eureka/,http://127.0.0.1:1113/eureka/  
服务器端通过这样的方式相互复制，达到集群效果。客户端使用此方式达到多节点的效果。
