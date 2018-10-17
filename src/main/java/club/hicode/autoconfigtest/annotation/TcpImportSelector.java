package club.hicode.autoconfigtest.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 通过selector的方式最灵活，因为可以根据需求注入多个bean
 *
 * @author LiuChunfu
 * @date 2018/10/17
 */
public class TcpImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"club.hicode.autoconfigtest.tcp.TCPAutoconfiguration"};
    }
}
