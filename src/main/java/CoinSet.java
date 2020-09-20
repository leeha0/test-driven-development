import java.util.ArrayList;
import java.util.List;

// 잔돈 코인을 담기 위해 사용하는 코인 컨테이너
public class CoinSet {

    private List<Integer> coinSets = new ArrayList<>();

    public void add(int coin) {
        this.coinSets.add(coin);
    }


    @Override
    // CoinSet끼리 동치비교를 위해 equals 재정의
    public boolean equals(Object coinSet) {
        if (!(coinSet instanceof CoinSet)) {
            return false;
        }

        return this.toString().equals(coinSet.toString());
    }


    @Override
    // 코인을 일렬로 늘어놓는 문자열을 만든다.
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Integer coin : coinSets) {
            builder.append(coin);
        }

        return builder.toString();
    }
}
