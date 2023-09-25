package com.api.parkingcontrol.dtos;

import com.api.parkingcontrol.models.ParkingSpotModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

public record ParkingSpotDto(

        @NotBlank
        String parkingSpotNumber,
        @NotBlank
        @Size(max = 7)
        String licensePlateCar,
        @NotBlank
        String brandCar,
        @NotBlank
        String modelCar,
        @NotBlank
        String colorCar,
        @NotBlank
        String ownerName,
        @NotBlank
        String apartment,
        @NotBlank
        String block) {


}
