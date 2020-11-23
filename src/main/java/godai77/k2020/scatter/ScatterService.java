package godai77.k2020.scatter;

import godai77.k2020.scatter.model.ScatterResponse;
import godai77.k2020.scatter.model.ScatterStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class ScatterService {

    public ScatterResponse<String> scatter(Long userId, String roomId, Long amount, Integer memberCnt) {

        // 스캐터를 생성하고 토큰을 반환

//        뿌릴 금액, 뿌릴 인원을 요청값으로 받습니다.
//        뿌리기 요청건에 대한 고유 token을 발급하고 응답값으로 내려줍니다.
//        뿌릴 금액을 인원수에 맞게 분배하여 저장합니다. (분배 로직은 자유롭게 구현해 주세요.)
//        token은 3자리 문자열로 구성되며 예측이 불가능해야 합니다.

        // 알고리즘
        // 1. 토큰을 랜덤 생성한다. (3자리 문자열
        // 2. 해당 토큰의 기존 뿌리기가 있는지 검색한다.
        //

        String scatterToken = "";

        return new ScatterResponse<>(scatterToken, HttpStatus.OK) ;
    }

    public ScatterResponse<Integer> pickup(Long userId, String roomId, String scatterToken) {

//        뿌리기 시 발급된 token을 요청값으로 받습니다.
//        token에 해당하는 뿌리기 건 중 아직 누구에게도 할당되지 않은 분배건 하나를
//        API를 호출한 사용자에게 할당하고, 그 금액을 응답값으로 내려줍니다.
//        뿌리기 당 한 사용자는 한번만 받을 수 있습니다.
//        자신이 뿌리기한 건은 자신이 받을 수 없습니다.
//        뿌린기가 호출된 대화방과 동일한 대화방에 속한 사용자만이 받을 수 있습니다.
//        뿌린 건은 10분간만 유효합니다. 뿌린지 10분이 지난 요청에 대해서는 받기 실패 응답이 내려가야 합니다.

        // 검증
        // 1. 존재하는 뿌리기 토큰인가
        // 2. 호출자가 생성자인가
        // 3. 10분 유효한가
        // 4. 남은 분배건이 있는가

        // 검증을 다 통과하면

        Integer pickedAmount = 0;

        return new ScatterResponse<>(pickedAmount, HttpStatus.OK);
    }

    public ScatterResponse<ScatterStatus> status(Long userId, String roomId, String scatterToken) {
//        뿌리기 시 발급된 token을 요청값으로 받습니다.
//        token에 해당하는 뿌리기 건의 현재 상태를 응답값으로 내려줍니다. 현재 상태는 다음의 정보를 포함합니다.
//        뿌린 시각, 뿌린 금액, 받기 완료된 금액, 받기 완료된 정보 ([받은 금액, 받은 사용자 아이디] 리스트)
//        뿌린 사람 자신만 조회를 할 수 있습니다. 다른사람의 뿌리기건이나 유효하지 않은 token에 대해서는 조회 실패 응답이 내려가야 합니다.
//        뿌린 건에 대한 조회는 7일 동안 할 수 있습니다.

        // 검증
        // 1. 뿌리기의 생성자가 요청자인가
        //

        ScatterStatus scatterStatus = new ScatterStatus();

        return new ScatterResponse<>(scatterStatus, HttpStatus.OK);
    }
}
