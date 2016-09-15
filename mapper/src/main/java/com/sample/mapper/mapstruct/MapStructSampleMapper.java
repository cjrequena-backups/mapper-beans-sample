package com.sample.mapper.mapstruct;

import com.sample.dto.SampleDTO;
import com.sample.entity.SampleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by crequena on 13/09/2016.
 */
@Mapper
public interface  MapStructSampleMapper {

    MapStructSampleMapper INSTANCE = Mappers.getMapper(MapStructSampleMapper.class);

    @Mapping(source = "idEntity", target = "id")
    SampleDTO sampleEntityToSampleDTO(SampleEntity sampleEntity);

    @Mapping(source = "id", target = "idEntity")
    SampleEntity sampleDTOToSampleEntity(SampleDTO sampleDTO);
}
