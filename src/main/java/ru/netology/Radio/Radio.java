package ru.netology.Radio;

public class Radio {

    private int minRadioSt;
    private int maxRadioSt;
    private int currentRadioSt;
    private int minVolume;
    private int maxVolume;
    private int currentVolume;


    public Radio(int size) {
        minRadioSt = 0;
        maxRadioSt = size - 1;
        currentRadioSt = 0;

        minVolume = 0;
        maxVolume = 100;
        currentVolume = 10;
    }

    public Radio() {
        this(10);

    }

    public int getCurrentRadioSt() {
        return currentRadioSt;
    }

    public int getMinRadioSt() {
        return minRadioSt;
    }

    public int getMaxRadioSt() {
        return maxRadioSt;
    }

    public void setCurrentRadioSt(int newCurrentRadioSt) {
        if (newCurrentRadioSt > maxRadioSt) {
            return;
        }
        if (newCurrentRadioSt < minRadioSt) {
            return;
        }
        currentRadioSt = newCurrentRadioSt;
    }

    public void nextRadioSt() {
        if (currentRadioSt == maxRadioSt) {
            currentRadioSt = minRadioSt;
        } else {
            currentRadioSt = currentRadioSt + 1;
        }
    }

    public void prevRadioSt() {
        if (currentRadioSt == minRadioSt) {
            currentRadioSt = maxRadioSt;
        } else {
            currentRadioSt = currentRadioSt - 1;
        }
    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}
