package com.example.test;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "tests")
public class Test {
    private String testId;
    private String name;
    private String address;

}
