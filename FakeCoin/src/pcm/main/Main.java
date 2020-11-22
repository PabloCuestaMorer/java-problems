package pcm.main;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Coin[] coins = new Coin[5];
        for (int i = 0; i < coins.length; i++) {
            Coin coin = new Coin(random.nextDouble(), i);
            coins[i] = coin;
        }

        for (Coin coin :coins) {
            System.out.print(coin.getWeight()+ " ");
        }

        System.out.println(findFakeCoin(coins));

    }


    public static int findFakeCoin(Coin[] coins) {

        if (coins != null && coins.length > 1) {
            boolean oddCoins = coins.length % 2 == 1;
            int third = coins.length / 3;
            Coin[] coinsLeft = Arrays.copyOfRange(coins, 0, third);
            Coin[] coinsMiddle = Arrays.copyOfRange(coins, third, (2*third));
            Coin[] coinsRight = Arrays.copyOfRange(coins, (2*third), coins.length);
            int result = compareCoins(coinsLeft, coinsMiddle);

            if (result == -1){
                System.out.println("Searching from "+ coinsLeft[0].getPosition()+ " to "+ coinsMiddle[coinsMiddle.length-1].getPosition());
                return findFakeCoin(coinsMiddle);
            } else if (result == 1){
                System.out.println("Searching from "+ coinsLeft[0].getPosition()+ " to "+ coinsMiddle[coinsMiddle.length-1].getPosition());
                return findFakeCoin(coinsLeft);
            } else if (oddCoins){
                return coins[coins.length-1].getPosition();
            }


        }

        return 0;
    }

    private static int compareCoins(Coin[] left, Coin[] right) {
        //Sum both piles weight
        double leftCoinsWeight = 0.0;
        for (Coin coin : left) {
            leftCoinsWeight += coin.getWeight();
        }
        double rightCoinsWeight = 0.0;
        for (Coin coin : right) {
            rightCoinsWeight += coin.getWeight();
        }
        //Check the heaviest pile
        if (leftCoinsWeight > rightCoinsWeight) {
            return -1;
        } else if (rightCoinsWeight > leftCoinsWeight) {
            return 1;
        } else {
            //The coins are equals
            return 0;
        }
    }
}
