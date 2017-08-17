package org.frekele.elasticsearch.mapping.annotations.values;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ElasticFielddataFrequencyFilter {

    boolean actived() default false;

    int min() default -1;

    int max() default -1;

    int minSegmentSize() default -1;

}
