package com.tb.ddd.demo.interfaces.rpc;

import org.springframework.web.bind.annotation.RestController;

/**
 * Different from web controller, this controller may return just domain object rather than vo.
 * Because it's designed to be rpc for other microservice.
 * @return domain object
 */
@RestController
public class XXXController {
}
