package com.hyungwoo.realEstate.controller;

import com.hyungwoo.realEstate.dto.request.CheckidRequestDto;
import com.hyungwoo.realEstate.dto.response.CheckIdResponseDto;

public interface AuthController {
	CheckIdResponseDto checkId(CheckidRequestDto request);
}