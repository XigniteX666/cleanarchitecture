package com.xignitex.cleanarchitecture.demo.model;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;

@Value
@Builder
public class Player {
    @Id
    String id;
    String firstName;
    String lastName;
}
