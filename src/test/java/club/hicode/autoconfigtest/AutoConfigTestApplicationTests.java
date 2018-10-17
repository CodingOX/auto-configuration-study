package club.hicode.autoconfigtest;

import club.hicode.autoconfigtest.tcp.TCPSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutoConfigTestApplicationTests {

    @Autowired
    private TCPSender tcpSender;

    @Test
    public void contextLoads() {
        tcpSender.send("i love manman");
    }

}
