package com.openpay.restMarvel;

import com.openpay.restMarvel.entity.ConsultaTbl;
import com.openpay.restMarvel.repository.ConsultaTblRepository;
import com.openpay.restMarvel.service.ConsultaTblServiceImpl;
import com.openpay.restMarvel.service.RestApiService;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import com.openpay.restMarvel.repository.ConsultaTblRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.BDDMockito.given;

@SpringBootTest
class RestMarvelApplicationTests {
        @Autowired
        ConsultaTblServiceImpl consultaService;
        ConsultaTbl rowInicial;
        
        @Mock
        ConsultaTblRepository consultaTblRepository;
        
        @InjectMocks
        private ConsultaTblServiceImpl consultaServiceMock;
        
        private RestApiService restApiService;
                
	@Test
	void contextLoads() {
	}
        
        @BeforeEach
        void setup(){
            rowInicial =ConsultaTbl.builder().hora("1234").build();
        }
        
        /**
         * Test para prueba de inserts de nuevos ts de consulta de api
         */
        @DisplayName("Test POST row en tabla consultas")
        @Test
        void saveRowTable() {
            ConsultaTbl row = ConsultaTbl.builder().hora("1234").build();
            
            ConsultaTbl guardado = consultaService.createRow(row);
            Assertions.assertNotNull(guardado);
            Assertions.assertTrue(guardado.getId()!=0);
        }
        /**
         * Test para probar la obtención de todos los registros insertados en la tabla ts
         */
        @DisplayName("Test GET all tabla consultas")
        @Test
        void getAllTable() {
            consultaService.createRow(rowInicial);
            consultaService.createRow(rowInicial);
            List <ConsultaTbl> guardado = consultaService.getAllRows();
            Assertions.assertNotNull(guardado);
            Assertions.assertTrue(!guardado.isEmpty());
        }
        
        /**
         * Test para probar reposotory
         */
        @Test
        void getById(){
            //given(restApiService.getByIdService("123")).willReturn(Optional.empty());
        }

}
