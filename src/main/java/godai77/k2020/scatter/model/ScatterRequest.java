package godai77.k2020.scatter.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@RequiredArgsConstructor
public class ScatterRequest {
    private Long amount;
    private Long memberCnt;
}
