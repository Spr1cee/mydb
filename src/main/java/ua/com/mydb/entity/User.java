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
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user_id")
    private List<Route> routes;

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
