package listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void receiveMessage(Message message) {
        String s = new String(message.getBody());

        System.out.println("Received message: " + s);
        // Process the received message
    }
}
