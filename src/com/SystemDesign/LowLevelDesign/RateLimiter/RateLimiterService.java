package com.SystemDesign.LowLevelDesign.RateLimiter;

import java.util.HashMap;

public class RateLimiterService {
    /*HashMap<UserType,RateLimiter> rateLimit=new HashMap<>();
    public RateLimiterService(){
        rateLimit.put(UserType.FREE,RateLimitFactory.createRateLimiter(RateLimitType.FIXED_WINDOW,new RateLimitConfig(10,60)));
        rateLimit.put(UserType.PREMIUM,RateLimitFactory.createRateLimiter(RateLimitType.TOKEN_BUCKET,new RateLimitConfig(100,60)));
    }
public boolean  allowRequest(User user){
        RateLimiter limit=rateLimit.get(user.getUserType());
        if(limit==null){
            throw new IllegalArgumentException("no limit config for this");
        }
        return limit.allowRequest(user.getUserId());
}*/
}
