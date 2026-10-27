package org.raptorexpress.web.service.impl;

import org.raptorexpress.web.model.Item;
import org.raptorexpress.web.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public List<Item> getAllItems() {
        return Arrays.asList(
                new Item(1, "Samsung 43\" Smart TV",
                        "43-inch Full HD smart television with Wi-Fi connectivity",
                        "Television", 125000.00, 5),
                new Item(2, "LG 260L Refrigerator",
                        "Double-door refrigerator with energy-efficient cooling",
                        "Refrigerator", 185000.00, 8),
                new Item(3, "Singer Washing Machine",
                        "7kg washing machine with multiple wash programs",
                        "Washing Machine", 95000.00, 10),
                new Item(4, "Panasonic Rice Cooker",
                        "1.8L electric rice cooker with automatic keep-warm function",
                        "Kitchen Appliance", 12500.00, 20),
                new Item(5, "Philips Electric Kettle",
                        "1.7L electric kettle with automatic shut-off protection",
                        "Kitchen Appliance", 6500.00, 25),
                new Item(6, "Samsung Microwave Oven",
                        "20L microwave oven suitable for heating and cooking food",
                        "Kitchen Appliance", 32000.00, 12),
                new Item(7, "Singer Ceiling Fan",
                        "56-inch ceiling fan designed for efficient air circulation",
                        "Fan", 15500.00, 15),
                new Item(8, "Abans Air Conditioner",
                        "12000 BTU split-type air conditioner for home cooling",
                        "Air Conditioner", 165000.00, 6),
                new Item(9, "Dell Inspiron Laptop",
                        "Intel Core i5 processor, 8GB RAM, and 512GB SSD",
                        "Computer", 245000.00, 4),
                new Item(10, "Logitech Wireless Mouse",
                        "Wireless optical mouse with a USB receiver",
                        "Computer Accessories", 4500.00, 30)
        );
    }
}
