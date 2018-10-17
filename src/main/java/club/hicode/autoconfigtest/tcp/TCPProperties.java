package club.hicode.autoconfigtest.tcp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/10/17
 */
@Data
@ConfigurationProperties(prefix = "mic.tcp.agent")
public class TCPProperties {

    private String ip = "127.0.0.1";

    private int port = 9088;
}
