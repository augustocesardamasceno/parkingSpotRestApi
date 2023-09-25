package com.api.parkingcontrol.models;

import com.api.parkingcontrol.dtos.ParkingSpotDto;
import com.api.parkingcontrol.dtos.ParkingSpotUpdateDto;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    @Column(nullable = false, length = 70)
    private String brandCar;
    @Column(nullable = false, length = 70)
    private String modelCar;
    @Column(nullable = false, length = 70)
    private String colorCar;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 130)
    private String ownerName;
    @Column(nullable = false, length = 30)
    private String apartment;
    @Column(nullable = false, length = 30)
    private String block;

    public ParkingSpotModel() {
    }

    public ParkingSpotModel(ParkingSpotDto parkingSpotDto) {
        this.parkingSpotNumber = parkingSpotDto.parkingSpotNumber();
        this.licensePlateCar = parkingSpotDto.licensePlateCar() ;
        this.brandCar = parkingSpotDto.brandCar();
        this.modelCar = parkingSpotDto.modelCar();
        this.colorCar = parkingSpotDto.colorCar();;
        this.ownerName = parkingSpotDto.ownerName();
        this.apartment = parkingSpotDto.apartment();
        this.block = parkingSpotDto.block();
    }

    public void updateInfo(ParkingSpotUpdateDto parkingSpotUpdateDto){
        if (parkingSpotUpdateDto.parkingSpotNumber() != null){
            this.parkingSpotNumber = parkingSpotUpdateDto.parkingSpotNumber();
        }
        if (parkingSpotUpdateDto.apartment() != null){
            this.apartment = parkingSpotUpdateDto.apartment();
        }
        if (parkingSpotUpdateDto.block() != null){
            this.block = parkingSpotUpdateDto.block();
        }
        if (parkingSpotUpdateDto.modelCar() != null){
            this.modelCar = parkingSpotUpdateDto.modelCar();
        }
        if (parkingSpotUpdateDto.licensePlateCar() != null){
            this.licensePlateCar = parkingSpotUpdateDto.licensePlateCar();
        }

        if (parkingSpotUpdateDto.ownerName() != null){
            this.ownerName = parkingSpotUpdateDto.ownerName();
        }
        if (parkingSpotUpdateDto.brandCar() != null){
            this.brandCar = parkingSpotUpdateDto.brandCar();
        }
        if (parkingSpotUpdateDto.colorCar() != null){
            this.colorCar = parkingSpotUpdateDto.colorCar();
        }
    }



}
