package com.routes.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Accident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    int Id;
    @Column
    String Raisons;
    @Column
    int accidents;
    @Column
    int morts;
    @Column
    int blesses;
}
