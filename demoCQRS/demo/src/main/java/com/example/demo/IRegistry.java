package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public interface IRegistry <T extends RequestData> {
     Map<Class<? extends CommandRequest>, CommandHandler> COMMAND_HANDLER_MAP = new HashMap<>();
     Map<Class<? extends QueryRequest>, QueryHandler> QUERY_HANDLER_MAP = new HashMap<>();
     Handler getHandler1(T requestData);
}
