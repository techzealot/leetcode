## 注意事项:

### spock-report依赖以下相关groovy包，需如下配置:

```xml
<!--    spock-reports dependencies start -->
    <dependency>
      <groupId>com.athaydes</groupId>
      <artifactId>spock-reports</artifactId>
      <version>2.0.1-RC3</version>
      <scope>test</scope>
      <!-- this avoids affecting your version of Groovy/Spock -->
      <exclusions>
        <exclusion>
          <groupId>*</groupId>
          <artifactId>*</artifactId>
        </exclusion>
      </exclusions>
    </dependency>
    <dependency>
      <groupId>org.codehaus.groovy</groupId>
      <artifactId>groovy-xml</artifactId>
      <version>${groovy.version}</version>
    </dependency>
    <dependency>
      <groupId>org.codehaus.groovy</groupId>
      <artifactId>groovy-json</artifactId>
      <version>${groovy.version}</version>
    </dependency>
    <dependency>
      <groupId>org.codehaus.groovy</groupId>
      <artifactId>groovy-templates</artifactId>
      <version>${groovy.version}</version>
    </dependency>

    <!-- // if you don't already have slf4j-api and an implementation of it in the classpath, add this! -->
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-api</artifactId>
      <version>1.7.30</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-simple</artifactId>
      <version>1.7.30</version>
      <scope>test</scope>
    </dependency>
    <!--    spock-reports dependencies end-->
```

### spock-report的自定义配置文件

spock-report的配置文件需要放在如下目录:

**src/test/resources/SpockConfig.groovy**


不能放在**src/test/java**下，否则会被编译为class文件，而不是以groovy文件形式存在