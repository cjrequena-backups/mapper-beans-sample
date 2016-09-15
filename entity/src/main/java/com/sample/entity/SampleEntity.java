package com.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SampleEntity implements Serializable {

    private Integer idEntity;
    private String firstName;
    private String lastName;
    private String email;

}
