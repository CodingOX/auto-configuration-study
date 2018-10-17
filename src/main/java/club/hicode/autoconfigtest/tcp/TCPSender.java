package club.hicode.autoconfigtest.tcp;

import cn.hutool.core.util.StrUtil;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/10/17
 */
public class TCPSender {

    TCPProperties tcpProperties;

    public TCPSender(TCPProperties tcpProperties) {
        this.tcpProperties = tcpProperties;
    }

    public void send(String content) {
        String template = "通过定义：{}发送了内容：{}";
        String format = StrUtil.format(template, tcpProperties, content);
        System.out.println(format);
    }
}
