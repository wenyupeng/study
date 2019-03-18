package com.wen.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;

/**
 * Created by wen on 2018/12/19.
 */
@Configuration
/**
 * 注解ConditionalOnProperty能够控制某个configuration是否生效。
 * 具体操作是通过其两个属性name以及havingValue来实现的，其中name用来从application.properties中读取某个属性值，如果该值为空，则返回false;
 *                          如果值不为空，则将该值与havingValue指定的值进行比较，如果一样则返回true;否则返回false。
 *                          如果返回值为false，则该configuration不生效；为true则生效。
 */
@ConditionalOnProperty(name = "swagger.enabled",matchIfMissing = true)
/**
 *类似spring配置中的导入bean的功能
 */
@Import({
        Swagger2DocumentationConfiguration.class
})
public class Swagger2Configuration {

}
