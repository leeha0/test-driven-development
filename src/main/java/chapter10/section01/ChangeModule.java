package chapter10.section01;

public class ChangeModule {

    // chapter10.section01.VendingMachine 잔돈 상태에 영향을 받지 않도록 별도 모듈로 분리
    public CoinSet getChangeCoinSet(int changeAmount) {
        CoinSet coinSet = new CoinSet();
        int remainChangeAmount = changeAmount;

        for (Coin coin : Coin.values()) {
            remainChangeAmount = addCoinsToCoinSet(coinSet, remainChangeAmount, coin.value());
        }

        /*
        while (changeAmount >= 500) {
            changeAmount -= 500;
            coinSet.add(500);
        }

        while (changeAmount >= 100) {
            changeAmount -= 100;
            coinSet.add(100);
        }

        while (changeAmount >= 50) {
            changeAmount -= 50;
            coinSet.add(50);
        }

        while (changeAmount >= 10) {
            changeAmount -= 10;
            coinSet.add(10);
        }
        */

        return coinSet;
    }

    private int addCoinsToCoinSet(CoinSet coinSet, int changeAmount, int coinValue) {
        // TODO 좀 더 리팩토링할 게 남아 있는데, 그건 독자의 몫
        while (changeAmount >= coinValue) {
            changeAmount -= coinValue;
            coinSet.add(coinValue);
        }
        return changeAmount;
    }
}
