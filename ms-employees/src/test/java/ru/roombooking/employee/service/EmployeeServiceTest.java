package ru.roombooking.employee.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import ru.roombooking.employee.EmployeeApplication;
import ru.roombooking.employee.model.dto.EmployeeDTO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ContextConfiguration(classes = {EmployeeApplication.class})
class EmployeeServiceTest {

    /*@Autowired
    private EmployeeService employeeService;*/

    @Autowired
    private TestEntityManager testEntityManager;

    private List<EmployeeDTO> employeeDTOList;

    @BeforeEach
    void init() {
        /*employeeDTOList = new ArrayList<>();
        employeeDTOList.add(EmployeeDTO.builder()
                .id(1L)
                .surname("Sidorov")
                .name("Valera")
                .middleName("Vladimirovich")
                .phone("222222")
                .email("zzz@mail.ru")
                .isActive(true)
                .profileId(1L)
                .departmentId(1L)
                .build());

        initDb();*/
    }

    @Test
    void save() {
        /*EmployeeDTO employee = EmployeeDTO.builder()
                .id(4L)
                .surname("Sidortov")
                .name("Alex")
                .middleName("Alexeevich")
                .phone("444444")
                .email("vvv@mail.ru")
                .isActive(true)
                .profileId(4L)
                .departmentId(2L)
                .build();
        assertEquals(employee, employeeService.save(employee));*/
    }

    private void initDb() {
        testEntityManager.persist(EmployeeDTO.builder()
                .surname("Sidorov")
                .name("Valera")
                .middleName("Vladimirovich")
                .phone("222222")
                .email("zzz@mail.ru")
                .isActive(true)
                .profileId(1L)
                .departmentId(1L)
                .build());
    }
}