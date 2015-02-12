package org.myola.demo.jpa.domain;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import org.myola.demo.jpa.domain.D.Type;

@Converter(autoApply = false)
public class TypeEnumConverter
        implements AttributeConverter<Type, String> {

    @Override
    public String convertToDatabaseColumn(Type d) {
        return d.toString();
    }

    @Override
    public Type convertToEntityAttribute(String s) {
        return Type.valueOf(s);
    }
}
