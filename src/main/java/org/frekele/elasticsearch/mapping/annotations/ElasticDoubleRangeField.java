package org.frekele.elasticsearch.mapping.annotations;

import org.frekele.elasticsearch.mapping.annotations.values.BoolValue;
import org.frekele.elasticsearch.mapping.enums.FieldType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A range of double-precision 64-bit IEEE 754 floating point values.
 *
 * @author frekele - Leandro Kersting de Freitas
 * @see <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/range.html">elasticsearch double range field</a>
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ElasticDoubleRangeField {

    FieldType type = FieldType.DOUBLE_RANGE;

    String suffixName() default "doubleRange";

    BoolValue coerce() default @BoolValue(ignore = true);

    @Deprecated
    float boost() default 1.0f;

    BoolValue index() default @BoolValue(ignore = true);

    BoolValue store() default @BoolValue(ignore = true);

}
