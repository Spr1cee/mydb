package ua.com.mydb.entity;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Route {

        private long id;
        private String name;

        private Bus bus;

        //private Interval interval;

        private List<Bus> busList;

        private User user;

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

