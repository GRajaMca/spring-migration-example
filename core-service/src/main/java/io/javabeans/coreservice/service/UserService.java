package io.javabeans.coreservice.service;

import io.javabeans.corecontract.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {

  private Mono<User> getUserById(Long Id) {
    return Mono.just(User.builder().build());
  }
}
