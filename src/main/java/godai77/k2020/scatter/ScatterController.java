package godai77.k2020.scatter;

import godai77.k2020.scatter.model.ScatterStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
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
    public String scatter(HttpServletRequest request, @PathVariable(name = "amount") Long amount, @PathVariable("memberCnt") Long memberCnt) {
        log.info("[scatter] user={}, room={}, amount={}, memberCnt={}", null, null, amount, memberCnt);
        return "scatter Token";
    }

    @GetMapping("/pickup/{scatterToken}")
    public Integer pickup(HttpServletRequest request, @PathVariable(name = "scatterToken") String scatterToken) {
        log.info("[pickup] user={}, room={}, scatterToken={}", null, null, scatterToken);
        return 10;
    }

    @GetMapping("/status/{scatterToken}")
    public ScatterStatus status(HttpServletRequest request, @PathVariable(name = "scatterToken") String scatterToken) {
        log.info("[status] user={}, room={}, scatterToken={}", null, null, scatterToken);
        return null;
    }
}
