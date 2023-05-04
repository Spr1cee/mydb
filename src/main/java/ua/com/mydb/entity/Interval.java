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

    @ManyToOne
    @JoinColumn(name = "interval_id")
    private List<Bus> buses;

    /*      public Interval() {
        }

        public Interval(long id, double time) {
            this.id = id;
            this.time = time;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public double getTime() {
            return time;
        }

        public void setTime(double time) {
            this.time = time;
        }

        public Route getRoute() {
            return route;
        }

        public void setRoute(Route route) {
            this.route = route;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "id=" + id +
                    ", time=" + time +
                    ", route=" + route +
                    '}';
        } */
    }


