<h1>CadastroProfessores</h1>
<h2>Curso Udemy Api RestFul JAXRS</h2>

Projeto atualizado com tecnologias nas versões atuais com Html5, css3, javascript, Booostrap 5.1 e AngularJS 1.7.9), no Back-end (Java 12,JPA 2.2, Hibernate, CDI 2.0, Webservice(JAXRS) usando nova implementação jakarta RESTFUL WebService e tambem na persistencia, WildFly 22, MySQl 8.1).
Todos os recursos nativos do java e fornecidos junto com o eclipse  2021-03 no backEnd. O plugin jboss tolls  foi instalado facilitando ai a integração com o servidor de aplicação wildfly. 



<h3>Configuração do banco de dados gerenciado pelo servidor arquivo standalone.xml<h3>

  <datasources>
                <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true" statistics-enabled="${wildfly.datasources.statistics-enabled:${wildfly.statistics-enabled:false}}">
                    <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
                    <driver>h2</driver>
                    <security>
                        <user-name>sa</user-name>
                        <password>sa</password>
                    </security>
                </datasource>
                <datasource jndi-name="java:jboss/datasources/WebsystemDS" pool-name="WebsystemDS" enabled="true" use-java-context="true" statistics-enabled="${wildfly.datasources.statistics-enabled:${wildfly.statistics-enabled:false}}">
                    <connection-url>jdbc:mysql://localhost:3306/websystemdb?useTimezone=true&amp;serverTimezone=UTC</connection-url>
                    <driver>mysql</driver>
                    <security>
                        <user-name>root</user-name>
                    </security>
                </datasource>
                <drivers>
                    <driver name="h2" module="com.h2database.h2">
                        <xa-datasource-class>org.h2.jdbcx.JdbcDataSource</xa-datasource-class>
                    </driver>
                    <driver name="mysql" module="com.mysql">
                        <xa-datasource-class>com.mysql.cj.jdbc.MysqlXADataSource</xa-datasource-class>
                    </driver>
                </drivers>
            </datasources>

<h3>Patch do driver mysql(anexar driver n local) <h3>

<module name="com.mysql" xmlns="urn:jboss:module:1.5">

    <resources>
        <resource-root path="mysql-connector-java-8.0.17.jar"/>
    </resources>
    <dependencies>
        <module name="javax.api"/>
        <module name="javax.transaction.api"/>
        <module name="javax.servlet.api" optional="true"/>
        <module name="org.slf4j"/>
    </dependencies>
</module>
