package ua.com.mydb.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Bus {

        private long id;
        private String name;
        private String description;

        private Route route;

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



