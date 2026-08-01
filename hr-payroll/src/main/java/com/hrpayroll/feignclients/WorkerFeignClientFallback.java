package com.hrpayroll.feignclients;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.hrpayroll.entities.Worker;

@Component
public class WorkerFeignClientFallback implements WorkerFeignClient {

    @Override
    public ResponseEntity<Worker> findById(Long id) {
        Worker worker = new Worker(0L, "Worker indisponível", 0.0);
        return ResponseEntity.ok(worker);
    }
}
