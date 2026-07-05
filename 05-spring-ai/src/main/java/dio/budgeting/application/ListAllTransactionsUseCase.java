package dio.budgeting.application;

import dio.budgeting.application.output.TransactionOutput;
import dio.budgeting.domain.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListAllTransactionsUseCase {

    private final TransactionRepository transactionRepository;

    public ListAllTransactionsUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<TransactionOutput> execute() {
        return transactionRepository.findAll()
                .stream()
                .map(TransactionOutput::from)
                .toList();
    }
}
