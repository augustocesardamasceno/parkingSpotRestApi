package com.api.parkingcontrol.dtos;

import com.api.parkingcontrol.models.ParkingSpotModel;

import java.util.UUID;

public record ParkingSpotDetailDto(UUID id, String parkingSpotNumber, String licensePlateCar, String brandCar, String modelCar, String colorCar, String ownerName, String apartment, String block) {
    public ParkingSpotDetailDto(ParkingSpotModel parkingSpot) {
        this(parkingSpot.getId(), parkingSpot.getParkingSpotNumber(), parkingSpot.getBrandCar(), parkingSpot.getModelCar(), parkingSpot.getColorCar(), parkingSpot.getLicensePlateCar(), parkingSpot.getApartment(), parkingSpot.getBlock(), parkingSpot.getOwnerName());
    }

}
