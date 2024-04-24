package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setRadioSt() {
        Radio radio = new Radio();

        radio.setCurrentRadioSt(5);

        int expected = 5;
        int actual = radio.getCurrentRadioSt();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioSt(10);

        int expected = 0;
        int actual = radio.getCurrentRadioSt();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStLessMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioSt(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioSt();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStLessMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioSt(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioSt();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStMoreMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioSt(2);
        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentRadioSt();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioSt(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioSt();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevRadioStAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioSt(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioSt();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);

        int expected = 30;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();

        radio.increaseVolume();


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.reduceVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMaxLimit() {
        int initialVol = 20;
        Radio radio = new Radio();
        radio.setCurrentVolume(initialVol);
        radio.setCurrentVolume(150);

        int expected = 20;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolumeMinLimit() {
        int initialVol = 20;
        Radio radio = new Radio();
        radio.setCurrentVolume(initialVol);
        radio.setCurrentVolume(-1);

        int expected = 20;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
