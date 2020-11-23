package godai77.k2020.scatter.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.util.MultiValueMap;

@Getter
@Setter
public class ScatterResponse<T> extends ResponseEntity<T> {

    private String msg;

    public ScatterResponse(HttpStatus status) {
        super(status);
    }

    public ScatterResponse(@Nullable T body, HttpStatus status) {
        super(body, status);
    }

    public ScatterResponse(@Nullable T body, HttpStatus status, String msg) {
        super(body, status);
        this.msg = msg;
    }

    public ScatterResponse(MultiValueMap<String, String> headers, HttpStatus status) {
        super(headers, status);
    }

    public ScatterResponse(@Nullable T body, @Nullable MultiValueMap<String, String> headers, HttpStatus status) {
        super(body, headers, status);
    }
}
