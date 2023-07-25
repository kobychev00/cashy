package domain;

import java.util.Set;

public interface CashyService {
    Set<Operation> getOperationByNumber(int number);

}
