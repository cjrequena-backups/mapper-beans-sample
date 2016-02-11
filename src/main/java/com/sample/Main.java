package com.sample;

import com.sample.dto.SampleDTO;
import com.sample.entity.SampleEntity;
import com.sample.mapper.orika.OrikaSampleMap;

public class Main {

	public static void main(String[] args) {
		SampleDTO sampleDTO = new SampleDTO();
		sampleDTO.setEmail("email");
		sampleDTO.setFirstName("firstName");
		sampleDTO.setLastName("lastName");
		sampleDTO.setId(1);
		
		OrikaSampleMap orikaSampleMap = new OrikaSampleMap();
		SampleEntity entity = orikaSampleMap.mapDTOToEntity(sampleDTO);
		System.out.println(entity.getEmail());
		System.out.println(entity.getIdEntity());

		
		SampleDTO sampleDTO2 = orikaSampleMap.mapEntityToDTO(entity);
		System.out.println(sampleDTO2.getFirstName());

	}

}
