package com.SystemDesign.LowLevelDesign.RateLimiter;

public enum RateLimitType {
    FIXED_WINDOW,
    SLIDING_WINDOW,
    LEAKY_BUCKET,
    TOKEN_BUCKET
}
