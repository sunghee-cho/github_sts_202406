package db_jasypt;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

//복호화-자바 어플리케이션(스프링부트 실행 클래스x - @Controller @Mapper @Repo...

@Configuration   //bean설정클래스
@EnableEncryptableProperties //application.properties파일 ENC() 문자열 복호
public class JasyptDBConfig {
	@Autowired
	Environment environment;
	
	@Bean("jasyptEncryptor")//메소드실행후리턴객체 bean
	public 	StringEncryptor stringEncryptor() {
		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		config.setPoolSize(1);
		config.setPassword(environment.getProperty("jasypt.password"));
		StandardPBEStringEncryptor jasypt = new StandardPBEStringEncryptor();
		jasypt.setConfig(config);
		return jasypt;
	}


}
