package org.self.learn.controller;

import java.util.Map;

import org.self.learn.dto.NavigationMenu;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(description = "iOS Navigation Service")
public class NavigationMenuController {

	@ApiOperation(
			value = "Get navigation menu for iOS app",
			response = NavigationMenu.class,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE,
			protocols = "http"
			)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 512, message = "Failed to communicate with another service"),
			@ApiResponse(code = 513, message = "Failed to communicate with distributed cache")
			})
	@RequestMapping(path = "/navigation/menu", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<NavigationMenu> navigationMenu(
			@ApiParam(value="Biz token", required=true) @RequestHeader String bizToken,
			@ApiParam(value="oAuth2 token", required=true) @RequestHeader("Authorization") String authorization,
			@ApiParam(value="Channel id (Example MOB)", required=true) @RequestHeader String channelId,
			@ApiParam(value="App Id", required=true) @RequestHeader String appId,
			@ApiParam(value="Navigation request body", required=false) @RequestBody Map<String, String> deviceInfo) {

		return new ResponseEntity<>(new NavigationMenu(), HttpStatus.OK);
	}
}