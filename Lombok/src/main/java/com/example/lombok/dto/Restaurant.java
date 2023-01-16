package com.example.lombok.dto;

import java.net.URI;
import java.time.LocalTime;
import java.util.ArrayList;

public class Restaurant 
{
    private int restaurantId;
    private String name;
    private URI imageUrl;
    private Double latitude;
    private Double longitude;
    private ArrayList<String> attributes;
    private LocalTime opensAt;
    private LocalTime closeAt;
}
