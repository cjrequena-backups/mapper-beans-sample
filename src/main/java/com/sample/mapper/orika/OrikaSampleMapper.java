
package com.sample.mapper.orika;

import com.sample.dto.SampleDTO;
import com.sample.entity.SampleEntity;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class OrikaSampleMapper extends OrikaAbstractMapper {

	private MapperFacade mapper;

	public OrikaSampleMapper() {
		final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
		mapperFactory.classMap(SampleDTO.class, SampleEntity.class)//
				.field("id", "idEntity") //
				.byDefault().register(); //
		mapper = mapperFactory.getMapperFacade();
	}

	public MapperFacade getMapper() {
		return mapper;
	}

	public SampleDTO mapEntityToDTO(final SampleEntity entity) {
		SampleDTO dto = map(entity, SampleDTO.class);
		return dto;
	}

	public SampleEntity mapDTOToEntity(final SampleDTO dto) {
		SampleEntity entity = getMapper().map(dto, SampleEntity.class);
		return entity;
	}

}
