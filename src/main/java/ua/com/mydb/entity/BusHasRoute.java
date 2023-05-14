package ua.com.mydb.entity;

import jakarta.persistence.*;
import lombok.*;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString


    @Entity
    @Table(name = "bus_has_route")
    public class BusHasRoute {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "bus_id")
        private Bus bus;

        private int quantity;


        public BusHasRoute(Bus bus, int quantity) {
            this.bus = bus;
            this.quantity = quantity;
        }
    }

