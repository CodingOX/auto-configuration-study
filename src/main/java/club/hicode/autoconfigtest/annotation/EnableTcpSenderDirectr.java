package club.hicode.autoconfigtest.annotation;

import club.hicode.autoconfigtest.tcp.TCPAutoconfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/10/17
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({TCPAutoconfiguration.class})
public @interface EnableTcpSenderDirectr {
}
