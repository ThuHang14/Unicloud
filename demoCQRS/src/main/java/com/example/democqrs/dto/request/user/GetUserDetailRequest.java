package com.example.democqrs.dto.request.user;

import com.example.democqrs.dto.request.base.RequestData;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetUserDetailRequest extends RequestData {

    private String id;

}
