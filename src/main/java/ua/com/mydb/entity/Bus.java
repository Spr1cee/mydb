package ua.com.mydb.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "bus")
public class Bus {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String name;
        private String description;

        @OneToMany(mappedBy = "bus")
        private List<BusHasRoute> busHasRoutes;
        @OneToMany(mappedBy = "buses")
        private List<AttributeHasBus> attributeHasBusList;

}



