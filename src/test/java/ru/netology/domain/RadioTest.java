
package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void trueStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int actual = radio.getCurrentRadioStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void normalStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void secondStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int actual = radio.getCurrentRadioStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.nextRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStationOver() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);

        radio.prevRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    // @Test
    // public void increaseVolume() {
    //   Radio radio = new Radio();

    // radio.increaseVolume(9);

    // radio.currentVolume();
    //  int actual = radio.increaseVolume();
    // int expected = 10;

    // Assertions.assertEquals(expected, actual);
    //  }


    // @Test

}
