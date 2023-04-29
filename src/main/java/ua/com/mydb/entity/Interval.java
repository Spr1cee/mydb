package ua.com.mydb.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Interval {

        private long id;
        private double time;

        private Route route;

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


