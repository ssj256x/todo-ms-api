package com.todoapp.todo.entity.converters;

import com.todoapp.todo.entity.Priority;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class PriorityEnumConverter implements AttributeConverter<Priority, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Priority attribute) {
        if(attribute == null) return null;
        return attribute.getPriorityCode();
    }

    @Override
    public Priority convertToEntityAttribute(Integer dbData) {
        if(dbData == null) return null;
        return Stream
                .of(Priority.values())
                .filter(priority -> priority.getPriorityCode().equals(dbData))
                .findFirst()
                .orElseThrow(IllegalAccessError::new);
    }
}
