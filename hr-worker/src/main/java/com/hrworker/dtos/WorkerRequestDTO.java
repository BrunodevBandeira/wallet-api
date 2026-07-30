package com.hrworker.dtos;

public record WorkerRequestDTO(
          Long id,
          String name,
          Double dailyIncome
) {
}
