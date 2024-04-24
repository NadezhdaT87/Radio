package ru.netology.Radio;

public class Radio {
    private int currentRadioSt;

    public int getCurrentRadioSt() {
        return currentRadioSt;
    }

    public void setCurrentRadioSt(int newCurrentRadioSt) {
        if (newCurrentRadioSt > 9) {
            return;
        }
        if (newCurrentRadioSt < 0) {
            return;
        }
        currentRadioSt = newCurrentRadioSt;
    }

    public void next() {
        if (currentRadioSt == 9) {
            currentRadioSt = 0;
        } else {
            currentRadioSt = currentRadioSt + 1;

        }
    }

    public void prev() {
        if (currentRadioSt == 0) {
            currentRadioSt = 9;
        } else {
            currentRadioSt = currentRadioSt - 1;

        }
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;

        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
