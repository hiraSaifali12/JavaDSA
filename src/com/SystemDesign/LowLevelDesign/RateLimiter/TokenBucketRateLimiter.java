package com.SystemDesign.LowLevelDesign.RateLimiter;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class TokenBucketRateLimiter extends  RateLimiter {
   // private  RateLimitConfig rateLimitConfig;
    Map<String, Integer> tokens=new ConcurrentHashMap<>();
    Map<String, Long> lastRefillTime=new HashMap<>();
    public TokenBucketRateLimiter(RateLimitConfig rateLimitConfig) {
       super( RateLimitType.TOKEN_BUCKET,rateLimitConfig);
    }

    @Override
    public boolean allowRequest(String userId) {
        AtomicBoolean allowed=new AtomicBoolean();
        return false;
    }
}
