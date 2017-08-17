package org.frekele.elasticsearch.mapping.annotations;

import org.frekele.elasticsearch.mapping.enums.FieldType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A range of double-precision 64-bit IEEE 754 floating point values.
 *
 * @see <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/range.html">elasticsearch double range field</a>
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ElasticDoubleRangeField {

    FieldType type = FieldType.DOUBLE_RANGE;

    String suffixName() default "doubleRange";

    boolean coerce() default true;

    float boost() default 1.0f;

    boolean index() default true;

    boolean store() default false;

}