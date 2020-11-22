/*
 * Created by PabloCM on 22/11/2020 03:23 pm with IntelliJ IDEA
 * Project Coin
 */

package pcm.main;

import java.util.Arrays;

public class Coin {
    private double weight;
    private int position;

    public Coin(double weight, int position) {
        this.weight = weight;
        this.position = position;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
