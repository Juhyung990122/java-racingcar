package racingcar.dto;

import racingcar.domain.Car;

import java.util.Objects;

public class CarDto {
    private final String carName;
    private final int distance;

    public CarDto(String carName, int distance) {
        this.carName = carName;
        this.distance = distance;
    }

    public static CarDto toDto(Car car) {
        return new CarDto(car.getCarName(), car.getDistance());
    }

    public String carName() {
        return carName;
    }

    public int distance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDto carDto = (CarDto) o;
        return distance == carDto.distance && Objects.equals(carName, carDto.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, distance);
    }

}
