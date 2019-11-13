package com.example.bike.controllers;

import com.example.bike.models.Bike;
import com.example.bike.repositories.BikeRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BikesControllersTest {

    @InjectMocks
    BikesControllers bikesControllers;

    @Mock
    private BikeRepository bikeRepository;

    //-------------------getAllBikesTest--------------------------------------
    /**
     * Test of success case
     */
    @Test
    public void getAllBikesTest(){

        Bike bike_1 = new Bike("name_1", "email1.com", "111111111", "Model-1", "1-1-1-1-1-1", new BigDecimal("1500.00"), new Date(01-01-2001), true);
        Bike bike_2 = new Bike("name_2", "email2.com", "222222222", "Model-2", "2-2-2-2-2-2", new BigDecimal("2500.00"), new Date(02-02-2002), false);

        ArrayList<Bike> listOfBikes = new ArrayList<Bike>();
        listOfBikes.add(bike_1);
        listOfBikes.add(bike_2);

        when(bikeRepository.findAll()).thenReturn(listOfBikes);
        ArrayList<Bike> listOfBikesReslt = new ArrayList<Bike>();
        listOfBikesReslt = (ArrayList<Bike>) bikesControllers.getAllBikes();

        Assert.assertEquals(listOfBikes, listOfBikesReslt);
    }
}
