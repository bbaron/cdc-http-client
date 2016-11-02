package com.example.loan;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.loan.model.Client;
import com.example.loan.model.LoanApplication;
import com.example.loan.model.LoanApplicationResult;
import com.example.loan.model.LoanApplicationStatus;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CdcHttpClientApplicationTests {
    @Autowired
    private LoanApplicationService service;

    @Test
    public void shouldBeRejectedDueToAbnormalLoanAmount() {
        // given:
        LoanApplication application = new LoanApplication(new Client("1234567890"),
                99999);
        // when:
        LoanApplicationResult loanApplication = service.loanApplication(application);
        // then:
        assertThat(loanApplication.getLoanApplicationStatus())
                .isEqualTo(LoanApplicationStatus.LOAN_APPLICATION_REJECTED);
        assertThat(loanApplication.getRejectionReason()).isEqualTo("Amount too high");
    }
}
