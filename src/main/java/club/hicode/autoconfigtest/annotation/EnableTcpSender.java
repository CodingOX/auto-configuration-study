package club.hicode.autoconfigtest.annotation;

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
@Import({TcpImportSelector.class})
public @interface EnableTcpSender {
}
