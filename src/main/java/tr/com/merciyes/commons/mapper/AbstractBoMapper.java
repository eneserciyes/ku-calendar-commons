package tr.com.merciyes.commons.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.MappingTarget;
import tr.com.merciyes.commons.entity.AbstractEntity;
import tr.com.merciyes.commons.model.AbstractBo;
import tr.com.merciyes.commons.model.Metadata;
import tr.com.merciyes.commons.util.ListUtils;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractBoMapper<I extends AbstractBo, O extends AbstractEntity> {

    public abstract I convert(O entity);

    public abstract O convert(I model);

    public List<I> convert(List<O> entities) {
        return ListUtils.emptyIfNull(entities).stream().map(this::convert).collect(Collectors.toList());
    }

    @AfterMapping
    public void fillEntityMeta(I model, @MappingTarget O entity) {
        if (model.getMetadata() == null) {
            return;
        }
        entity.setCreatedAt(model.getMetadata().getCreatedAt());
        entity.setCreatedBy(model.getMetadata().getCreatedBy());
        entity.setUpdatedAt(model.getMetadata().getUpdatedAt());
        entity.setUpdatedBy(model.getMetadata().getUpdatedBy());
    }

    @AfterMapping
    public void fillModelMeta(O entity, @MappingTarget I model) {
        if (model.getMetadata() == null) {
            model.setMetadata(new Metadata());
        }
        model.getMetadata().setCreatedAt(entity.getCreatedAt());
        model.getMetadata().setCreatedBy(entity.getCreatedBy());
        model.getMetadata().setUpdatedAt(entity.getUpdatedAt());
        model.getMetadata().setUpdatedBy(entity.getUpdatedBy());
    }
}