package com.example.PrimeFaces;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Flight {

    @Id
    @GeneratedValue
    private Long id;

    private String airline;
    private String fromAirport;
    private String toAirport;

    private Date scheduledDateTime;
    private Date estimatedDateTime;
    private Date actualDateTime;

}