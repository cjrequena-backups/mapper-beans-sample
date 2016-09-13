
package com.sample.mapper.modelmapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import com.sample.dto.SampleDTO;
import com.sample.entity.SampleEntity;

/**
 * @author crequena
 * 
 *         Mapping between entity beans and dto beans.
 */

public class ModelMapperSampleMapper extends ModelMapperAbstractMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;

	/**
	 * Constructor.
	 */
	public ModelMapperSampleMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'Entity' to 'DTO'
	 * 
	 * @param entity
	 */
	public SampleDTO mapEntityToDTO(SampleEntity entity) {
		if (entity == null) {
			return null;
		}

		// --- Generic mapping
		SampleDTO dto = map(entity, SampleDTO.class);

		return dto;
	}

	/**
	 * Mapping from 'DTO' to 'Entity'
	 * 
	 * @param dto
	 * @param entity
	 */
	public void mapDTOToEntity(SampleDTO dto, SampleEntity entity) {
		if (dto == null) {
			return;
		}

		// --- Generic mapping
		map(dto, entity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ModelMapper getModelMapper() {
		return modelMapper;
	}

	protected void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

}
