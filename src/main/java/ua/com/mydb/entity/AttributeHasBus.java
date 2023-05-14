package ua.com.mydb.entity;

import jakarta.persistence.*;
import lombok.*;

    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString

    @Entity
    @Table(name = "attribute_has_bus")
    public class AttributeHasBus {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "attribute_id")
        private Attribute attribute;

        @ManyToOne
        @JoinColumn(name = "productes_id")
        private Bus buses;
    }

