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
@Table(name = "route")
public class Route {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String name;

        @OneToMany(mappedBy = "route_id")
        private List<Bus> buses;

        @ManyToOne
        @JoinColumn(name = "bus_id")
        private Bus bus;
     /*   public Route() {
        }

        public Route(long id, String name, Bus bus) {
            this.id = id;
            this.name = name;
            this.bus = bus;
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

        public Bus getBus() {
            return bus;
        }

        public void setBus(Bus bus) {
            this.bus = bus;
        }

        public Interval getInterval() {
            return interval;
        }

        public void setInterval(Interval interval) {
            this.interval = interval;
        }

        @Override
        public String toString() {
            return "Route{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", bus=" + bus +
                    '}';
        } */
    }

