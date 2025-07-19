package listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class DebugConsumer {

//    @RabbitListener(queues = "${spring.rabbitmq.queue}")
//    public void receive(Message message) {
//        String s = new String(message.getBody());
//        System.out.println("🌟 Message received: " + s);
//    }
}