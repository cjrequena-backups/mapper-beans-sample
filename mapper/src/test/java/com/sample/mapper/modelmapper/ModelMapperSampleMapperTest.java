package com.sample.mapper.modelmapper;

import com.sample.dto.SampleDTO;
import com.sample.entity.SampleEntity;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by crequena on 13/09/2016.
 */
public class ModelMapperSampleMapperTest {

    @Test
    public void testMapEntityToDTO() throws Exception {
        //given
        SampleEntity sampleEntity = new SampleEntity();
        sampleEntity.setIdEntity(1);
        sampleEntity.setFirstName("FirstName");
        sampleEntity.setLastName("LastName");
        sampleEntity.setEmail("email@email.com");
        //when
        ModelMapperSampleMapper modelMapperSampleMapper = new ModelMapperSampleMapper();
        SampleDTO sampleDTO = modelMapperSampleMapper.mapEntityToDTO(sampleEntity);
        //then
        assertTrue(sampleDTO != null);
    }

    @Test
    public void testMapDTOToEntity() throws Exception {
        //given
        SampleDTO sampleDTO = new SampleDTO();
        sampleDTO.setId(1);
        sampleDTO.setFirstName("FirstName");
        sampleDTO.setLastName("LastName");
        sampleDTO.setEmail("email@email.com");
        //when
        ModelMapperSampleMapper modelMapperSampleMapper = new ModelMapperSampleMapper();
        SampleEntity sampleEntity = new SampleEntity();
        modelMapperSampleMapper.mapDTOToEntity(sampleDTO, sampleEntity);
        //then
        assertTrue(sampleEntity != null);
    }
}
