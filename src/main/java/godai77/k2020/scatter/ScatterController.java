package godai77.k2020.scatter;

import godai77.k2020.scatter.model.ScatterRequest;
import godai77.k2020.scatter.model.ScatterStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
    public String scatter(HttpServletRequest request, @PathVariable(name = "amount") Long amount, @PathVariable("memberCnt") Long memberCnt) {
        log.info("[scatter] user={}, room={}, amount={}, memberCnt={}", null, null, amount, memberCnt);
        return "scatter token";
    }

    @PostMapping("/pickup")
    public Integer pickup(HttpServletRequest request, @RequestBody String scatterId) {
        return 10;
    }

    @PostMapping("/status")
    public ScatterStatus status(HttpServletRequest request, @RequestBody String scatterId) {
        return null;
    }
}
