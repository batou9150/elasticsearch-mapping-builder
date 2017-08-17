package org.frekele.elasticsearch.mapping.annotations;

import org.frekele.elasticsearch.mapping.enums.FieldType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Boolean fields accept JSON true and false values, but can also accept strings and numbers which are interpreted as either true or false:
 * - False values    false, "false", "off", "no", "0", "" (empty string), 0, 0.0
 *
 * @author frekele - Leandro Kersting de Freitas
 * @see <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/boolean.html">elasticsearch boolean field</a>
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ElasticBooleanField {

    FieldType type = FieldType.BOOLEAN;

    String suffixName() default "boolean";

    float boost() default 1.0f;

    boolean docValues() default false;

    boolean index() default true;

    String nullValue() default "";

    boolean store() default false;
}
