package godai77.k2020.scatter;

import godai77.k2020.scatter.model.ScatterResponse;
import godai77.k2020.scatter.model.ScatterStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@RequiredArgsConstructor
@RestController
public class ScatterController {

    private final ScatterService scatterService;

    @GetMapping("/hello")
    public String hello() {
        return "world!";
    }

    @GetMapping("/scatter/{amount}/{memberCnt}")
    public ScatterResponse<String> scatter(HttpServletRequest request, @PathVariable(name = "amount") Long amount, @PathVariable("memberCnt") Integer memberCnt) {
        Long userId;
        String roomId;

        try {
            userId = Long.parseLong(request.getHeader("X-USER-ID"));
            roomId = request.getHeader("X-ROOM-ID");
        }
        catch (Exception e) {
            return new ScatterResponse<>(null, HttpStatus.BAD_REQUEST, "Invalid request header(s)!");
        }

        log.info("[scatter] userId={}, room={}, amount={}, memberCnt={}", userId, roomId, amount, memberCnt);

        return scatterService.scatter(userId, roomId, amount, memberCnt) ;
    }

    @GetMapping("/pickup/{scatterToken}")
    public ScatterResponse<Integer> pickup(HttpServletRequest request, @PathVariable(name = "scatterToken") String scatterToken) {
        Long userId;
        String roomId;

        try {
            userId = Long.parseLong(request.getHeader("X-USER-ID"));
            roomId = request.getHeader("X-ROOM-ID");
        }
        catch (Exception e) {
            return new ScatterResponse<>(null, HttpStatus.BAD_REQUEST, "Invalid request header(s)!");
        }

        log.info("[pickup] X-USER-ID={}, room={}, scatterToken={}", userId, roomId, scatterToken);

        return scatterService.pickup(userId, roomId, scatterToken);
    }

    @GetMapping("/status/{scatterToken}")
    public ScatterResponse<ScatterStatus> status(HttpServletRequest request, @PathVariable(name = "scatterToken") String scatterToken) {
        Long userId;
        String roomId;

        try {
            userId = Long.parseLong(request.getHeader("X-USER-ID"));
            roomId = request.getHeader("X-ROOM-ID");
        }
        catch (Exception e) {
            return new ScatterResponse<>(null, HttpStatus.BAD_REQUEST, "Invalid request header(s)!");
        }

        log.info("[status] X-USER-ID={}, room={}, scatterToken={}", userId, roomId, scatterToken);


        return scatterService.status(userId, roomId, scatterToken);
    }
}
