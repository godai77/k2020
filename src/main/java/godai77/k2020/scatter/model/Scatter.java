package godai77.k2020.scatter.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;

@ToString
@Getter
@Builder
@RedisHash("scatter")
public class Scatter {
    @Id
    String token;

    Long ownerUserId;
    String roomId;
    LocalDateTime createDt;
}
