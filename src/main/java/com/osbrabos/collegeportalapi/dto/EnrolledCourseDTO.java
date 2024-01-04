package com.osbrabos.collegeportalapi.dto;

import java.time.LocalDateTime;
import java.util.List;

public record EnrolledCourseDTO(
        Long id, StudentDTO studentDTO, List<CourseDTO> courseDTOList, LocalDateTime createdAt
) {
}
