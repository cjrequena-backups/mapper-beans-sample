package com.sample.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SampleDTO implements Serializable {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
}
