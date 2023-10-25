package org.acme.Producer;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pulsar")

public class ProducerResouce {
    

    @Channel("requests")
    Emitter<String> emitter;
    
    


    @GET
    @Path("/produce")
    @Produces(MediaType.TEXT_PLAIN)
    public String produceMessage(){
        emitter.send("Hello Pulsar");
        
        return "messages produced";
    }

}
