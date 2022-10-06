package com.example.democqrs.dto.response.user;

import com.example.democqrs.dto.response.base.ResponseData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUserDetailResponse extends ResponseData {
    private String result;
}
