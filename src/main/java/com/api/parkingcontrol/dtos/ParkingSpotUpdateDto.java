package com.api.parkingcontrol.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

public record ParkingSpotUpdateDto(
        @NotNull
        UUID id,
        String parkingSpotNumber,
        String licensePlateCar,
        String brandCar,
        String modelCar,
        String colorCar,
        String ownerName,
        String apartment,
        String block) {
}
