# spring-cloud-Eureka-learn  
# 一、了解  
spring cloud Eureka提供了服务器端服务注册管理与客户端服务注册和发现组件，并且服务器与客户端都是java编写，服务器与客户端基于Restful API的访问方式。  
# 二、服务注册中心  
<p>需要引入依赖:</p>  
<pre>
 <code>
   &lt;dependency&gt;
     &lt;groupId&gt;org.springframework.cloud&lt;/groupId&gt;
     &lt;artifactId&gt;spring-cloud-starter-eureka-server&lt;/artifactId&gt;
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
eureka.client.register-with-eureka:由于该应用为注册中心，所以设置为false，代表不向注册中心注册自己
eureka.client.fetch-registry:由于注册中心的职责就是维护服务实例，它并不需要去检索服务，所以也设置为false
</code>
</pre>