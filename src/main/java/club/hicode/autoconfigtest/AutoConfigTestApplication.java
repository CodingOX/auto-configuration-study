package club.hicode.autoconfigtest;

import club.hicode.autoconfigtest.annotation.EnableTcpSenderDirectr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableTcpSender
@EnableTcpSenderDirectr
public class AutoConfigTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoConfigTestApplication.class, args);
	}
}
