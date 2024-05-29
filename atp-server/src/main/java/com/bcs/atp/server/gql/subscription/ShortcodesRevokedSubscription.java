package com.bcs.atp.server.gql.subscription;

import com.bcs.atp.server.gql.types.Shortcode;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsSubscription;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.UUID;

@Slf4j
@DgsComponent
public class ShortcodesRevokedSubscription {

    @DgsSubscription
    public Publisher<Shortcode> myShortcodesRevoked() {
        return Flux.interval(Duration.ofSeconds(30))
                .map(t -> new Shortcode(UUID.randomUUID().toString(), "myShortcodesRevoked", "application/json", OffsetDateTime.now()));
    }
}
