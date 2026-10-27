package org.raptorexpress.web.model;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private int id;
    private String name;
    private String status;
    private String category;
    private Double price;
    private int quantity;
}
