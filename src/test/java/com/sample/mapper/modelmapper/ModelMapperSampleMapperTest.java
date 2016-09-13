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
        SampleEntity sampleEntity = new SampleEntity(1, "FirstName", "LastName", "sample@email.com");
        //when
        ModelMapperSampleMapper modelMapperSampleMapper = new ModelMapperSampleMapper();
        SampleDTO sampleDTO = modelMapperSampleMapper.mapEntityToDTO(sampleEntity);
        //then
        assertTrue(sampleDTO != null);
    }

    @Test
    public void testMapDTOToEntity() throws Exception {
        //given
        SampleDTO sampleDTO = new SampleDTO(1, "FirstName", "LastName", "sample@email.com");
        //when
        ModelMapperSampleMapper modelMapperSampleMapper = new ModelMapperSampleMapper();
        SampleEntity sampleEntity = new SampleEntity();
        modelMapperSampleMapper.mapDTOToEntity(sampleDTO, sampleEntity);
        //then
        assertTrue(sampleEntity != null);
    }
}
