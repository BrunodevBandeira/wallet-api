package com.hrworker.dtos;

public record WorkerResponseDTO(
        Long id,
        String name,
        Double dailyIncome
) {
}
