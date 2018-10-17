package club.hicode.autoconfigtest.tcp;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/10/17
 */
@Configuration
@EnableConfigurationProperties(TCPProperties.class)
public class TCPAutoconfiguration {

    @Bean
    public TCPSender tcpSender(TCPProperties tcpProperties) {
        return new TCPSender(tcpProperties);
    }

}
