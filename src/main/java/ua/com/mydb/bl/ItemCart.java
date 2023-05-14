package ua.com.mydb.bl;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ItemCart {
    private Product product;
    private int quantity;

}