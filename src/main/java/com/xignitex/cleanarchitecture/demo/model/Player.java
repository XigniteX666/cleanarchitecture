package com.xignitex.cleanarchitecture.demo.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Player {
    String firstName;
    String lastName;
}
