package com.hkjc.alleyoop.cicd.demo2;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DemoResponse implements Serializable{
    private String msg;
    private String code;
}