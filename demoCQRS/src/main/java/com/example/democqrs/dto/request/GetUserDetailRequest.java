package com.example.democqrs.dto.request;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetUserDetailRequest extends RequestData{

    private String id;

}
