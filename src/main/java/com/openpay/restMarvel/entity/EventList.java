/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openpay.restMarvel.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author danya
 */
@Getter
@Setter
public class EventList {
    Integer available;
    Integer returned;
    String collectionURI;
    List<EventSummary> eventSummary = new ArrayList<>();
    
}
