package com.example.democqrs.dto.response.user;

import com.example.democqrs.dto.response.base.ResponseData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUsersResponse extends ResponseData {

    private List<String> result;

}
