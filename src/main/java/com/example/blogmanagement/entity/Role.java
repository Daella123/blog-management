package com.example.blogmanagement.entity;


public enum Role {
    /**
     * Regular user role. Users with this role can create, view, update,
     * and delete their own posts and comments.
     */
    USER,

    /**
     * Administrator role. Users with this role have full access to the system,
     * including the ability to delete any user, post, or comment regardless
     * of ownership.
     */
    ADMIN
}
