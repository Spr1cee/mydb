package ua.com.mydb.entity;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {

    private Long id;

    private List<Route> routeList;

    /*public class Main {

        public static void main(String[] args) {

            Bus bus = new Bus();
            bus.setId(20156);
            bus.setName("Bogdan");
            bus.setDescription("Yellow");

            System.out.println(bus);

            Route route = new Route();
            route.setId(545);
            route.setName("Darnistia-Kharkivske shose");
            route.setBus(bus);

            System.out.println(route);

            Interval interval = new Interval();
            interval.setId(1);
            interval.setTime(7.30);
            interval.setRoute(route);


            System.out.println(interval);
        }
    } */

}
