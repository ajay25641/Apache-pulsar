package consumer;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@Slf4j
public class PulsarConsumer {
    

    @Incoming("requests")
    public void consumeMessages(String msg){
        log.info("consumed messages "+ msg);
    }
}
