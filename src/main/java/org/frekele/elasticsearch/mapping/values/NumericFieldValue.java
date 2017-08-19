package org.frekele.elasticsearch.mapping.values;

import org.frekele.elasticsearch.mapping.annotations.values.BoolValue;
import org.frekele.elasticsearch.mapping.enums.FieldType;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public class NumericFieldValue {

    private FieldType type;

    private String suffixName;

    private BoolValue coerce;

    private float boost;

    private BoolValue docValues;

    private BoolValue ignoreMalformed;

    private BoolValue index;

    private String nullValue;

    private BoolValue store;

    private int scalingFactor;

    public NumericFieldValue() {
    }

    public NumericFieldValue(FieldType type, String suffixName, BoolValue coerce, float boost, BoolValue docValues, BoolValue ignoreMalformed,
                             BoolValue index, String nullValue, BoolValue store, int scalingFactor) {
        this.type = type;
        this.suffixName = suffixName;
        this.coerce = coerce;
        this.boost = boost;
        this.docValues = docValues;
        this.ignoreMalformed = ignoreMalformed;
        this.index = index;
        this.nullValue = nullValue;
        this.store = store;
        this.scalingFactor = scalingFactor;
    }

    public FieldType getType() {
        return type;
    }

    public void setType(FieldType type) {
        this.type = type;
    }

    public String getSuffixName() {
        return suffixName;
    }

    public void setSuffixName(String suffixName) {
        this.suffixName = suffixName;
    }

    public BoolValue getCoerce() {
        return coerce;
    }

    public void setCoerce(BoolValue coerce) {
        this.coerce = coerce;
    }

    public float getBoost() {
        return boost;
    }

    public void setBoost(float boost) {
        this.boost = boost;
    }

    public BoolValue getDocValues() {
        return docValues;
    }

    public void setDocValues(BoolValue docValues) {
        this.docValues = docValues;
    }

    public BoolValue getIgnoreMalformed() {
        return ignoreMalformed;
    }

    public void setIgnoreMalformed(BoolValue ignoreMalformed) {
        this.ignoreMalformed = ignoreMalformed;
    }

    public BoolValue getIndex() {
        return index;
    }

    public void setIndex(BoolValue index) {
        this.index = index;
    }

    public String getNullValue() {
        return nullValue;
    }

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }

    public BoolValue getStore() {
        return store;
    }

    public void setStore(BoolValue store) {
        this.store = store;
    }

    public int getScalingFactor() {
        return scalingFactor;
    }

    public void setScalingFactor(int scalingFactor) {
        this.scalingFactor = scalingFactor;
    }
}
