package ua.com.mydb.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "interval")

public class Interval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private double time;

    @OneToMany(mappedBy = "interval_id")
    private List<Bus> buses;

    }


