package com.sample.mapper.mapstruct;

import com.sample.dto.SampleDTO;
import com.sample.entity.SampleEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by crequena on 13/09/2016.
 */
public class MapStructSampleMapperTest {

    @Test
    public void testSampleEntityToSampleDTO() throws Exception {
        //given
        SampleEntity sampleEntity = new SampleEntity();
        sampleEntity.setIdEntity(1);
        sampleEntity.setFirstName("FirstName");
        sampleEntity.setLastName("LastName");
        sampleEntity.setEmail("email@email.com");
        //when     //when
        SampleDTO sampleDTO = MapStructSampleMapper.INSTANCE.sampleEntityToSampleDTO(sampleEntity);
        //then
        assertTrue(sampleDTO!=null);

    }

    @Test
    public void testSampleDTOToSampleEntity() throws Exception {

    }
}
