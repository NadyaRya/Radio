
package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int actual = radio.getCurrentRadioStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNormalStationNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncorrectStationTen() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncorrectStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFirstStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetOneStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int actual = radio.getCurrentRadioStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldSwitchNextStationIfCurrentOnOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.nextRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSwitchNextStationIfCurrentOnNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSwitchPrevStationIfCurrentOnTwo() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);

        radio.prevRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStationIfCurrentOnZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);


        int actual = radio.getCurrentVolume();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeIncorrect() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);


        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldIncreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldIncreaseVolumeIncorrect() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldDecreaseVolumeIncorrect() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
}
