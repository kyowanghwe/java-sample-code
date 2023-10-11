package com.sample.model.nestedObject;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@Data
@DynamoDBDocument
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    @DynamoDBAttribute
    private String street;

    @DynamoDBAttribute
    private String district;

    @DynamoDBAttribute
    private String city;

    @DynamoDBAttribute
    private String country;

    @DynamoDBAttribute
    private String postalCode;

    @DynamoDBAttribute
    private String text;
}
