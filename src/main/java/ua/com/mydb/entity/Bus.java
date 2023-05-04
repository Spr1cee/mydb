package ua.com.mydb.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ManyToAny;

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

        @ManyToOne
        @JoinColumn(name = "route_id")
        private Route routes;

        @OneToMany(mappedBy = "bus_id")
        private Interval intervals;


       /* public Bus() {
        }

        public Bus(long id, String name, String description) {
            this.id = id;
            this.name = name;
            this.description = description;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Bus{" +
                    "id=" + id +
                    ", name=" + name +
                    ", description='" + description + '\'' +
                    '}';
        } */
    }



