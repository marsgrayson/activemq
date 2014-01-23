/**
 * 
 */
package com.activemq;

/**
 * @author zhengyi
 * 2014年1月22日
 */
import java.util.Date;
import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;


@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class })
@ContextConfiguration(locations = { "classpath:/spring/applicationContext.xml" })
@DirtiesContext(classMode = ClassMode.AFTER_CLASS)
public class TestSomeService {


	@Resource  
    private JmsTemplate jmsTempalte;  
      
    @Test  
    public void test() {  
        jmsTempalte.send(new MessageCreator() {  
            public Message createMessage(Session session) throws JMSException {  
               // return session.createTextMessage(UUID.randomUUID().toString());  
                return session.createTextMessage(new Date().toString());  
            }  
        });  
    }  
 
}
