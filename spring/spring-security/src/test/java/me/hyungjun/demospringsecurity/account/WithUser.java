package me.hyungjun.demospringsecurity.account;

import org.springframework.security.test.context.support.WithMockUser;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@WithMockUser(username = "hyungjun", roles = "USER")
public @interface WithUser {
}
